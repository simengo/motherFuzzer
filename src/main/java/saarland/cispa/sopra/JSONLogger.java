package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.AntInfo;

import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.json.*;


//TODO
// brauche toString() Methoden der Instruktionen // wenn alle runden gespielt wurden muss nochmal der Logger aufgerufen werden zum schreiben

public class JSONLogger implements Logger {

    File output;
    private JsonObject initialObject;
    private JsonArrayBuilder stepsArraybuilder = Json.createArrayBuilder();
    private int numOfSwarms;


    public JSONLogger(File protocol){

        this.output = protocol;


    }







    @Override
    public void addInitialRound(Field[][] map, Map<Character,Swarm> swarms) {


       int height = map.length;
       int width = map[0].length;

       this.numOfSwarms = swarms.keySet().size();


       JsonObjectBuilder jsO = Json.createObjectBuilder();

       jsO.add("width",width);
       jsO.add("height",height);
       jsO.add("brains",createJsBrain(swarms));
       jsO.add("fields",createInitialFieldsArray(map));

       JsonObject jsOb = jsO.build();

       this.initialObject = jsOb;






    }








    @Override
    public void addRoundInfo(List<Field> changes,Map<Character, Integer> points, Map<Character,Integer> numOfAntsInSwarm) {

            JsonObjectBuilder jsOB = Json.createObjectBuilder();

            jsOB.add("standings",createJsStandingsArray(points,numOfAntsInSwarm));
            jsOB.add("fields",createJsChangedFieldsArray(changes));

            JsonObject jsO = jsOB.build();
            this.stepsArraybuilder.add(jsO);


    }







    @Override
    public void writeToFile() {


        // baue das Endprodukt zusammen

        JsonObjectBuilder jsOB = Json.createObjectBuilder();
        JsonArray stepsArray = this.stepsArraybuilder.build();

        jsOB.add("init",this.initialObject);
        jsOB.add("steps",stepsArray);

        JsonObject endObject = jsOB.build();






             //  write JsonObbject to File

        try {

            FileWriter fWriter = new FileWriter(this.output);
            JsonWriter jsonWriter = Json.createWriter(fWriter);
            jsonWriter.writeObject(endObject);
            jsonWriter.close();
            fWriter.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

        return;
    }








    private JsonArray createInitialFieldsArray (Field[][] fields){


        JsonArrayBuilder arrBuild = Json.createArrayBuilder();


        int height = fields.length;
        int width = fields[0].length;

        for(int y = 0 ; y < height; y++){

            for(int x = 0; x < width; x++){

                Field field = fields[x][y];
                JsonObjectBuilder jsOb = Json.createObjectBuilder();

                jsOb.add("x",x);
                jsOb.add("y",y);
                jsOb.add("markers",createMarkerArray(field));
                jsOb.add("type", field.getType());

                if(field.getFood()!= 0){

                    jsOb.add("food",field.getFood());
                }

                if(field.getAnt().isPresent()){

                    AntInfo ant = field.getAnt().get();
                    jsOb.add("ant",createAntJsObject(ant));

                }


                arrBuild.add(jsOb.build());

                }
            }


            return arrBuild.build();


        }













        private JsonArray createMarkerArray(Field field){


            boolean breakout = false;
            JsonArrayBuilder jsArr = Json.createArrayBuilder(); // am Ende ausgegebener markers Array


            Map<Character,boolean[]> marker = field.getMarkers();
            int keySize = marker.keySet().size();
            this.numOfSwarms = keySize;

            for(int i = 0; i < keySize; i++){

                char swarmId = 'A';
                boolean[] marks = marker.get(swarmId);


                // falls alle marker false soll kein JsonObject erzeugt werden
                for(int h = 0; h < 7 ; h++){
                    if(marks[h]){
                        break;
                    }
                    else if(h == 6){
                        breakout = true;
                    }
                }

                if(breakout){
                    continue;
                }




                JsonArrayBuilder jsAHelp = Json.createArrayBuilder();  ////////wird tatsächlich jedes Mal ein neuer ArrayBuilder erzeugt oder nicht??? !!!
                JsonObjectBuilder jBuilder = Json.createObjectBuilder(); // Objekt das im markers Array gespeichert wird

                for(int j = 0; j < 7 ; j++){

                    jsAHelp.add(marks[j]);

                }

                jBuilder.add("swarm_id",swarmId);
                jBuilder.add("values",jsAHelp);
                JsonObject obj = jBuilder.build();
                jsArr.add(obj);

                swarmId += 1;  // naechster Ascii-Buchstabe
            }

            JsonArray array = jsArr.build();
            return array;

        }





        private JsonObject createAntJsObject(AntInfo antI){
            JsonObjectBuilder jsBuilder = Json.createObjectBuilder();
            int id = antI.getId();
            int pc = antI.getPc();
            int swarm_id = antI.getSwarm();
            boolean carries_food = antI.hasFood();
            String direction = antI.getDirection();
            int rest_time = antI.getRestTime();


            jsBuilder.add("id",id);
            jsBuilder.add("pc",pc);
            jsBuilder.add("swarm_id",swarm_id);
            jsBuilder.add("carries_food",carries_food);
            jsBuilder.add("direction",direction);
            jsBuilder.add("rest_time",rest_time);
            jsBuilder.add("register",createJsRegister(antI.getRegister()));


            return jsBuilder.build();

        }






        private JsonArray createJsRegister(boolean[] reg){

            JsonArrayBuilder jsABuilder = Json.createArrayBuilder();

            for(int i = 0; i < 6 ; i++){

                if(reg[i]){
                    jsABuilder.add(true);
                }
                else{
                    jsABuilder.add(false);
                }
            }

            return jsABuilder.build();
        }




        private JsonArray createJsBrain( Map<Character,Swarm> swarms){

        JsonArrayBuilder jAB = Json.createArrayBuilder();


        int keySize = swarms.keySet().size();

        for(int i = 0; i< keySize; i++){

            char swarmId = 'A';
            JsonObjectBuilder jsB = Json.createObjectBuilder();
            jsB.add("name", swarms.get(swarmId).getSwarmName());
            jsB.add("swarm_id",swarmId);
            jsB.add("instructions",createJsInstructions(swarms.get(swarmId))); // soll SwarmObject zurueckgeben



            JsonObject jobj = jsB.build();
            jAB.add(jobj);

         swarmId += 1;
        }

            return jAB.build();
        }



        private JsonArray createJsInstructions(Swarm swarm){


        JsonArrayBuilder jsA = Json.createArrayBuilder();



        Instruction[] instr = swarm.getInstruction();

        for(int i = 0; i < instr.length; i++){

            jsA.add(instr[i].toString());
        }

        return jsA.build();
        }










        public JsonArray createJsStandingsArray(Map<Character, Integer> points, Map<Character,Integer> numOfAntsInSwarm){

        JsonArrayBuilder jsAB = Json.createArrayBuilder();

        char recentSwarm = 'A';

        for(int i = 0; i < this.numOfSwarms; i++){

            JsonObjectBuilder jsOB = Json.createObjectBuilder();
            jsOB.add("swarm_id", recentSwarm);
            jsOB.add("score",points.get(recentSwarm));
            jsOB.add("ants",numOfAntsInSwarm.get(recentSwarm));

            JsonObject  jsO = jsOB.build();

            jsAB.add(jsO);

            recentSwarm += 1;

        }


        return jsAB.build();

        }





        public JsonArray createJsChangedFieldsArray(List<Field> changes){


            JsonArrayBuilder arrBuild = Json.createArrayBuilder();


            int len = changes.size();

            Iterator<Field> it = changes.iterator();

            for(int i = 0 ; i < len; i++){



                    Field field = it.next();
                    JsonObjectBuilder jsO = Json.createObjectBuilder();

                    jsO.add("x",field.getX());
                    jsO.add("y",field.getY());
                    jsO.add("markers",createMarkerArray(field));
                    jsO.add("type", field.getType());

                    if(field.getFood()!= 0){

                        jsO.add("food",field.getFood());
                    }

                    if(field.getAnt().isPresent()){

                        AntInfo ant = field.getAnt().get();
                        jsO.add("ant",createAntJsObject(ant));

                    }


                    arrBuild.add(jsO.build());

                }



            return arrBuild.build();




        }



}
