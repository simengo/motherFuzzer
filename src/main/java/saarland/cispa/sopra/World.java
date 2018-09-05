package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.*;


// removeAnt()/ logger mit funktionen ...//
public class World implements WorldInfo {


    final private int width;
    final private int height;
    final private long seed;
    private Field[][] fields;
    private Map<Character, Integer> points;
    private Map<Integer, Ant> ants;
    private Random randGen;
    private Map<Character, Integer> numOfAntsInSwarm;
    private Logger logger;


    public World(Field[][] fields, long seed, Map<Integer, Ant> ants, Logger logger,  HashMap<Character, Swarm> swarms) {
        this.fields = fields;
        this.width = fields.length;
        this.height = fields[0].length;
        this.points = new HashMap<Character, Integer>();
        this.ants = ants;
        this.logger = logger;
        this.numOfAntsInSwarm = new HashMap<Character, Integer>();
        this.seed = seed;
        randGen = new Random(this.seed);
    }


    public int getWidth() {
        return this.width;
    }


    public int getHeight() {
        return this.height;
    }


    public Field[][] getFields() {

        return this.fields;
    }


    public long getSeed() {

        return seed;
    }

    public Random getRandGen() {

        return randGen;
    }


    public FieldInfo getFieldAt(int x, int y) {

        return (FieldInfo) fields[x][y];
    }


    public Field getFieldInDirection(Field hereField, String direction) {

        int x = hereField.getX();
        int y = hereField.getY();

        boolean even = y % 2 == 0;


        if ("northwest".equals(direction)) {


            if (!even) {
                return fields[x][y - 1];
            } else {

                if (y == 0) {
                    y = this.height - 1;
                    if (x == 0) {
                        x = this.width - 1;
                    } else {
                        x -= 1;
                    }
                } else {

                    y -= 1;

                    if (x == 0) {
                        x = this.width - 1;
                    } else {
                        x -= 1;
                    }
                }
                return fields[x][y];
            }




        }


        else if ("northeast".equals(direction)) {

            if (!even) {
                y -= 1;
                if (x == this.width - 1) {
                    x = 0;
                } else {
                    x += 1;
                }
                return fields[x][y];

            } else {

                if (y == 0) {

                    y = this.height - 1;
                } else {
                    y -= 1;
                }

                return fields[x][y];

            }




        } else if ("east".equals(direction)) {
            x += 1;
            if (x == this.width) {
                x = 0;
            }
            return fields[x][y];

        }





        else if ("southeast".equals(direction)) {

            if (!even) {
                if (y == this.height - 1) {
                    y = 0;

                    if (x == this.width - 1) {
                        x = 0;
                    } else {
                        x += 1;
                    }
                } else {

                    y += 1;

                    if (x == this.width - 1) {
                        x = 0;
                    } else {
                        x += 1;
                    }
                }
                return fields[x][y];
            } else {
                return fields[x][y + 1];
            }


        }


        else if ("southwest".equals(direction)) {

            if (!even) {

                if (y == this.height - 1) {
                    y = 0;
                } else {
                    y += 1;
                }
                return fields[x][y];
            } else {

                y += 1;
                if (x == 0) {
                    x = this.width - 1;
                } else {
                    x -= 1;
                }

                return fields[x][y];
            }

        }




        else if ("west".equals(direction)) {
            x -= 1;
            if (x < 0) {
                x = this.width - 1;
            }
            return fields[x][y];

        }

        assert(false);
        return null;
    }







    public Ant getAnt(int id){

        return ants.get(id);
    }

    public List<AntInfo> getAnts(){

        List<AntInfo> antList = new ArrayList<AntInfo>(ants.values());

        return antList;
    }


    public int getScore(char swarm){

        return points.get(swarm);
    }

    public Map<Character,Integer> getPoints(){

        return points;
    }


    public void increasePoints(char swarm,int plus){

        int pointsSwarm = points.get(swarm);
        pointsSwarm += plus;
        points.put(swarm,pointsSwarm);
    }





    public Field[] getNeighbours(Field field){

        Field[] surrFields = new Field[6];

        surrFields[0] = getFieldInDirection(field,"northwest");
        surrFields[1] = getFieldInDirection(field,"northeast");
        surrFields[2] = getFieldInDirection(field,"east");
        surrFields[3] = getFieldInDirection(field,"southeast");
        surrFields[4] = getFieldInDirection(field,"southwest");
        surrFields[5] = getFieldInDirection(field,"west");

        return surrFields;
    }




    // creates a random number between 0 and max-1  ?? richtig so ??

    public int getRand(int max){

        return randGen.nextInt(max);
    }



    //iterates over the fields and reads the changed field -> when changed -> add to Array

    public List<Field> logChanges(){

        List<Field> changedFields = new ArrayList<Field>();

        for(int y = 0; y<height; y++){

            for(int x = 0; x < width; x++){

                Field field = fields[x][y];

                if (field.getChanged()){
                    changedFields.add(field);
                }


            }
        }

        return changedFields;
    }



// initially sets the isNextToAntlion Flag in the fields

    private void setAntlion(){

        for(int y = 0; y<height; y++) {

            for (int x = 0; x < width; x++) {


                Field field = fields[x][y];
                if(field.getType() == '='){

                    Field[] neighbours = getNeighbours(field);

                    for(int i = 0; i < 6; i++ ){
                        neighbours[i].setNextToAntlion(true);
                    }

                }
            }

        }






    }





}
