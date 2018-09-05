import saarland.cispa.sopra.systemtests.AntInfo;

import java.io.File;


import java.util.List;
import java.util.Map;
import javax.json.*;

public class JSONLogger implements Logger {

    File output;


    public JSONLogger(File protocol){

        this.output = protocol;


    }



    @Override
    public void addInitialRound(Field[][] map, Map<Character, Integer> points) {


        JsonObject model = Json.createObjectBuilder()
            .add("firstName", "Duke")
            .add("lastName", "Java")
            .add("age", 18)
            .add("streetAddress", "100 Internet Dr")
            .add("city", "JavaTown")
            .add("state", "JA")
            .add("postalCode", "12345")
            .add("phoneNumbers", Json.createArrayBuilder()
                .add(Json.createObjectBuilder()
                    .add("type", "mobile")
                    .add("number", "111-111-1111"))
                .add(Json.createObjectBuilder()
                    .add("type", "home")
                    .add("number", "222-222-2222")))
            .build();



    }



    @Override
    public void addRoundInfo(List<Field> changes,Map<Character, Integer> points) {




    }

//TODO
    private JsonArray createInitialFieldsArray (Field[][] fields,JsonArray marker){


        JsonArrayBuilder arrBuild = Json.createArrayBuilder();


        int height = fields.length;
        int width = fields[0].length;

        for(int y = 0 ; y < height; y++){

            for(int x = 0; x < width; x++){




            }
        }

    }












    private JsonArray createMarkerArray(Field field){


        boolean breakout = false;
        JsonArrayBuilder jsArr = Json.createArrayBuilder(); // am Ende ausgegebener merkers Array

        Map<Character,boolean[]> marker = field.getMarkers();
        int keySize = marker.keySet().size();


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
            jBuilder.add("values",jsA);
            JsonObject obj = jBuilder.build();
            jsArr.add(obj);

            swarmId += 1;  // naechster Ascii-Buchstabe
        }

        JsonArray array = jsArr.build();
        return array;

    }



    private JsonObject createAntJsObject(AntInfo antI,JsonArray register){
        JsonObjectBuilder jsBuilder = Json.createObjectBuilder();
        int id = antI.getId();
        int pc = antI.getPc();
        int swarm_id = antI.getSwarm();
        boolean carries_food = antI.hasFood();
        String direction = antI.getDirection();
        int rest_time = antI.getRestTime();

        //register dran denken Todo!

    }









    @Override
    public void writeToFile() {


    }



}
