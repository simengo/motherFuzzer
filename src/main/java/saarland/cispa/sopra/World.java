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
    private final Field[][] fields;
    private final Map<Character, Integer> points;
    private final Map<Integer, Ant> ants;
    private final Random randGen;
    private final Map<Character, Integer> numOfAntsInSwarm;
    //private Logger logger;
    //private final Map<Character,Swarm> swarms;


    public World(Field[][] fields, long seed, Map<Integer, Ant> ants, Map<Character,Swarm> swarms) {


        this.width = fields.length;
        this.height = fields[0].length;
        this.fields = new Field[width][height];

        for(int i=0; i<fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                this.fields[i][j] = fields[i][j];
            }
        }

        this.points = new HashMap<>();
        this.ants = ants;

        this.numOfAntsInSwarm = new HashMap<>();

        int swarmCount = swarms.size();

        int[] numOfAnts = new int[swarmCount];

        for(Ant recentAnt : ants.values()){
            char antSwarm = recentAnt.getSwarm();
            int help = Character.getNumericValue(antSwarm) - 10; // A hat den Wert 10
            numOfAnts[help] += 1;
        }
        char recentChar = 'A';
        for(int i = 0; i < swarmCount; i++){
            this.numOfAntsInSwarm.put(recentChar,numOfAnts[i]);
            recentChar += 1;
        }

        //this.logger = logger;

        this.seed = seed;
        randGen = new Random(this.seed);
        //this.swarms = swarms;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public Map<Character,Integer> getNumOfAntsInSwarm(){

        return this.numOfAntsInSwarm;
    }

    public Field[][] getFields() {

        Field[][] copiedFields = new Field[width][height];

        for(int i=0; i<fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                copiedFields[i][j] = fields[i][j];
            }
        }
        return copiedFields;
    }


    public long getSeed() {

        return seed;
    }

    public Random getRandGen() {

        return randGen;
    }

    @Override
    public FieldInfo getFieldAt(int x, int y) {

        return (FieldInfo) fields[x][y];
    }


    public Field getFieldInDirection(Field hereField, String direction) {

        int x = hereField.getX();
        int y = hereField.getY();

        boolean uneven = y % 2 != 0;

        switch (direction) {

            case "northwest":

                return getFieldInNorthwest(uneven, x,  y);


            case "northeast":

               return getFieldInNortheast(uneven, x, y);


            case "east":
                x += 1;
                if (x == this.width) {
                    x = 0;
                }
                return fields[x][y];

            case "southeast":

               return getFieldInSoutheast(uneven, x,  y);

            case "southwest":

               return getFieldInSouthwest(uneven,x, y);

            case "west":
                x -= 1;
                if (x < 0) {
                    x = this.width - 1;
                }
                return fields[x][y];

            default:
                assert false;
                return null;
        }


    }



    //Hilfsmethoden, da sonst zu lange getFieldInDirection Methodes

    private Field getFieldInNorthwest(boolean uneven,int x, int y){

        int xCoord = x;
        int yCoord = y;

        if (uneven) {
            return fields[xCoord][yCoord - 1];
        } else {

            if (yCoord == 0) {
                yCoord = this.height - 1;
                if (xCoord == 0) {
                    xCoord = this.width - 1;
                } else {
                    xCoord -= 1;
                }
            } else {

                yCoord -= 1;

                if (xCoord == 0) {
                    xCoord = this.width - 1;
                } else {
                    xCoord -= 1;
                }
            }
            return fields[xCoord][yCoord];
        }
    }

    private Field getFieldInNortheast(boolean uneven,int x, int y){

        int xCoord = x;
        int yCoord = y;

        if (uneven) {
            yCoord -= 1;
            if (xCoord == this.width - 1) {
                xCoord = 0;
            } else {
                xCoord += 1;
            }
            return fields[xCoord][yCoord];

        } else {

            if (yCoord == 0) {

                yCoord = this.height - 1;
            } else {
                yCoord -= 1;
            }

            return fields[xCoord][yCoord];

        }

    }

    private Field getFieldInSouthwest(boolean uneven,int x, int y){

        int xCoord = x;
        int yCoord = y;
        if (uneven) {

            if (yCoord == this.height - 1) {
                yCoord = 0;
            } else {
                yCoord += 1;
            }
            return fields[xCoord][yCoord];
        } else {

            yCoord += 1;
            if (xCoord == 0) {
                xCoord = this.width - 1;
            } else {
                xCoord -= 1;
            }

            return fields[xCoord][yCoord];
        }
    }

    private Field getFieldInSoutheast(boolean uneven,int x, int y){

        int xCoord = x;
        int yCoord = y;
        if (uneven) {
            if (yCoord == this.height - 1) {
                yCoord = 0;

                if (xCoord == this.width - 1) {
                    xCoord = 0;
                } else {
                    xCoord += 1;
                }
            } else {

                yCoord += 1;

                if (xCoord == this.width - 1) {
                    xCoord = 0;
                } else {
                    xCoord += 1;
                }
            }
            return fields[xCoord][yCoord];
        } else {
            return fields[xCoord][yCoord + 1];
        }

    }

    @Override
     public Ant getAnt(int id){

        return ants.get(id);
    }

    @Override
    public List<AntInfo> getAnts(){

        return new ArrayList<>(ants.values());
    }

    @Override
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

        char antLion = '=';

        for(int y = 0; y<height; y++) {

            for (int x = 0; x < width; x++) {


                Field field = fields[x][y];
                if(field.getType() == antLion){

                    Field[] neighbours = getNeighbours(field);

                    for(int i = 0; i < 6; i++ ){
                        neighbours[i].setNextToAntlion(true);
                    }

                }
            }

        }






    }





}
