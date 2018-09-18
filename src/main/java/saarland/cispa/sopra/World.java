package saarland.cispa.sopra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    //private LoggerInfo logger;
    private Map<Character, Swarm> swarms;

    public World(Field[][] fields, long seed, Map<Integer, Ant> ants, Map<Character, Swarm> swarms) {


        this.width = fields.length;
        this.height = fields[0].length;
        this.fields = new Field[width][height];
        int swarmCount = swarms.size(); // hilfsvariable

        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                this.fields[i][j] = fields[i][j];
            }
        }

        this.points = new HashMap<>(swarmCount);


        char recentChar2 = 'A';
        for (int i = 0; i < swarmCount; i++) {
            this.points.put(recentChar2, 0);
            recentChar2 += 1;
        }

        this.ants = ants;

        this.numOfAntsInSwarm = new HashMap<>(swarmCount);


        int[] numOfAnts = new int[swarmCount];

        for (Ant recentAnt : ants.values()) {
            char antSwarm = recentAnt.getSwarm();
            if (antSwarm > 'Z' || antSwarm < 'A') {
                throw new IllegalArgumentException();
            }
            int help = Character.getNumericValue(antSwarm) - 10; // A hat den Wert 10
            numOfAnts[help] += 1;
        }
        char recentChar = 'A';
        for (int i = 0; i < swarmCount; i++) {
            this.numOfAntsInSwarm.put(recentChar, numOfAnts[i]);
            recentChar += 1;
        }

        //this.logger = logger;

        this.seed = seed;
        randGen = new Random(this.seed);
        //this.swarms = swarms;
    }

    public Map<Character, Swarm> getSwarms() {
        return swarms;
    }

    public void setSwarms(Map<Character, Swarm> swarms) {
        this.swarms = swarms;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    public Map<Character, Integer> getNumOfAntsInSwarm() {

        return this.numOfAntsInSwarm;
    }


    public Field[][] getFields() {

        Field[][] copiedFields = new Field[width][height];

        for (int i = 0; i < fields.length; i++) {
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

        if (x < 0 || y < 0 || x >= width || y >= height) {
            throw new NoSuchElementException();
        }
        return (FieldInfo) fields[x][y];
    }


    public Field getFieldInDirection(Field hereField, String direction) {

        int x = hereField.getX();
        int y = hereField.getY();

        boolean uneven = y % 2 != 0;

        switch (direction) {

            case "northwest":

                return getFieldInNorthwest(uneven, x, y);


            case "northeast":

                return getFieldInNortheast(uneven, x, y);


            case "east":
                x += 1;
                if (x == this.width) {
                    x = 0;
                }
                return fields[x][y];

            case "southeast":

                return getFieldInSoutheast(uneven, x, y);

            case "southwest":

                return getFieldInSouthwest(uneven, x, y);

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

    private Field getFieldInNorthwest(boolean uneven, int x, int y) {

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

    private Field getFieldInNortheast(boolean uneven, int x, int y) {

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

    private Field getFieldInSouthwest(boolean uneven, int x, int y) {

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

    private Field getFieldInSoutheast(boolean uneven, int x, int y) {

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

    public void increaseNumOfAntsInSwarm(char swarm) {

        int count = this.numOfAntsInSwarm.get(swarm);
        count += 1;
        this.numOfAntsInSwarm.put(swarm, count);
    }

    public void decreaseNumOfAntsInSwarm(char swarm) {

        int count = this.numOfAntsInSwarm.get(swarm);
        count -= 1;
        this.numOfAntsInSwarm.put(swarm, count);
    }


    @Override
    public Ant getAnt(int id) {

        if (id >= ants.size() || id < 0) {
            throw new NoSuchElementException();
        }


        Ant antH = ants.get(id);

        return antH;
    }

    @Override
    public List<AntInfo> getAnts() {

        List<AntInfo> antIL = new ArrayList<>();
        for (Ant ant : ants.values()) {
            if (!ant.isDead()) {
                antIL.add(ant);
            }
        }
        return antIL;

    }

    public List<AntInfo> getAllAnts() {

        return new ArrayList<>(ants.values());
    }

    @Override
    public int getScore(char swarm) {

        if (points.get(swarm) == null) {
            throw new IllegalArgumentException();
        } else {
            return points.get(swarm);

        }
    }

    public Map<Character, Integer> getPoints() {

        return points;
    }

    public HashMap<Integer, Instruction[]> getBrainPoints(char identifier) {

        HashMap<Integer, Instruction[]> result = new HashMap<>();
        int points = getPoints().get(identifier);
        Instruction[] brain = getSwarms().get(identifier).getBrain();
        result.put(points, brain);

        return result;
    }

    public void increasePoints(char swarm, int plus) {

        int pointsSwarm = points.get(swarm);
        pointsSwarm += plus;
        points.put(swarm, pointsSwarm);
    }


    public Field[] getNeighbours(Field field) {

        Field[] surrFields = new Field[6];

        surrFields[0] = getFieldInDirection(field, "northwest");
        surrFields[1] = getFieldInDirection(field, "northeast");
        surrFields[2] = getFieldInDirection(field, "east");
        surrFields[3] = getFieldInDirection(field, "southeast");
        surrFields[4] = getFieldInDirection(field, "southwest");
        surrFields[5] = getFieldInDirection(field, "west");

        return surrFields;
    }


    // creates a random number between 0 and max-1  ?? richtig so ??

    public int getRand(int max) {

        return randGen.nextInt(max);
    }


    //iterates over the fields and reads the changed field -> when changed -> add to Array

    public List<Field> logChanges() {

        List<Field> changedFields = new ArrayList<Field>();

        for (int y = 0; y < height; y++) {

            for (int x = 0; x < width; x++) {

                Field field = fields[x][y];

                if (field.getChanged()) {
                    changedFields.add(field);
                }


            }
        }

        return changedFields;
    }


// initially sets the isNextToAntlion Flag in the fields

    public void setAntlion() {

        char antLion = '=';

        for (int y = 0; y < height; y++) {

            for (int x = 0; x < width; x++) {


                Field field = fields[x][y];
                if (field.getType() == antLion) {

                    Field[] neighbours = getNeighbours(field);

                    for (int i = 0; i < 6; i++) {
                        neighbours[i].setNextToAntlion(true);
                    }

                }
            }

        }


    }


    public void addAnt(Ant ant) {

        ants.put(ants.size(), ant);
    }


    public void printMap() {

        StringBuilder strB = new StringBuilder();
        strB.append('\n');
        Logger printSth = LoggerFactory.getLogger("World.class");
        for (int i = 0; i < height; i++) {
            for (int x = 0; x < width; x++) {

                Field field = fields[x][i];

                strB.append(field.getType());

            }
            strB.append('\n');
        }

        printSth.info(strB.toString());

    }


}
