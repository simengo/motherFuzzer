package saarland.cispa.sopra;


import java.util.*;

public final class WorldParser {

    private WorldParser() {

    }


    public static World parseMap(String mapFile, long seed, Map<Character, Swarm> swarms) {

        int minsize = 4;

        String[] splittedlines = WorldParserAssistant.convertMap(mapFile);

        if (splittedlines.length < minsize) {
            throw new IllegalArgumentException("Map could not be parsed correctly: too small");
        }

        int width = checkNumber(splittedlines[0].toCharArray());
        int height = checkNumber(splittedlines[1].toCharArray());

        checkSize(width, height);

        if (splittedlines.length > (height + 2) || ((splittedlines.length - 2) % 2) != 0 || splittedlines.length - 2 > 128) {
            throw new IllegalArgumentException("Map could not be parsed correctly");
        }

        Field[][] fields = new Field[width][height];

        return WorldParserAssistant.finishing(splittedlines, fields, width, height, seed, swarms);
    }


    private static void checkSize(int width, int height) {

        if (width < 2 || width > 128 || width % 2 != 0) {
            throw new IllegalArgumentException("Illegal width");
        }

        if (height < 2 || height > 128 || height % 2 != 0) {
            throw new IllegalArgumentException("Illegal height");
        }
    }

    public static void spawnMap(String[] splittedlines, Field[][] fields, int width, int height, Map<Character, Swarm> swarms) {

        if (splittedlines.length - 2 != height) {
            throw new IllegalArgumentException("Real height doesnt match the header");
        }
        for (int i = 2; i < splittedlines.length; i++) {

            char[] actualLine = splittedlines[i].toCharArray();

            if (actualLine.length % 2 != 0 || actualLine.length > 128 || actualLine.length != width || i - 2 >= height) {
                throw new IllegalArgumentException("Invalid width of line");
            }

            int x = 0;

            for (char actualChar : actualLine) {
                checkLetter(actualChar, fields, x, i - 2, swarms);
                x++;
            }
        }


    }

    private static Base spawnBase(char fieldType, Map<Character, Swarm> swarms, int x, int y) {

        if (swarms.containsKey(fieldType)) {
            return new Base(fieldType, x, y);

        } else {
            throw new IllegalArgumentException(String.format("Map could not be parsed correctly: Swarm of Field x:%d y:%d doesnt exist", x, y));
        }

    }

    private static void checkLetter(char fieldType, Field[][] fields, int x, int y, Map<Character, Swarm> swarms) {

        char antLion = '=';
        char normal = '.';
        char rock = '#';

        if (fieldType >= 65 && fieldType <= 90) {
            fields[x][y] = spawnBase(fieldType, swarms, x, y);
            return;
        } else {
            if (fieldType >= 49 && fieldType <= 57) {
                fields[x][y] = new Normal(x, y, fieldType - 48);
                return;
            } else {

                if (fieldType == normal) {
                    fields[x][y] = new Normal(x, y, 0);
                    return;
                } else {
                    if (fieldType == antLion) {
                        fields[x][y] = new Antlion(x, y);
                        return;
                    } else {
                        if (fieldType == rock) {
                            fields[x][y] = new Rock(x, y);
                            return;
                        } else {
                            throw new IllegalArgumentException("Map could not be parsed correctly (Invalid Character)");
                        }
                    }
                }
            }
        }

    }


    public static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) {
        int height = fields[0].length;
        int width = fields.length;
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Field field = fields[x][y];
                field.setMarker(spawnMarker(swarms));
                if (field instanceof Base) {
                    Ant ant = new Ant(swarms.get(field.getType()), ants.size(), field);
                    field.setAnt(ant);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }

    private static Map<Character, boolean[]> spawnMarker(Map<Character, Swarm> swarms) {

        HashMap<Character, boolean[]> result = new HashMap<>();
        for (Character identifier : swarms.keySet()) {
            result.put(identifier, new boolean[7]);
        }
        return result;
    }

    public static void checkSwarmConsistency(Map<Character, Swarm> swarms) {

        Iterator<Swarm> swarmIterator = swarms.values().iterator();

        char start = 'A';

        char ende = 'Z';
        while (swarmIterator.hasNext()) {

            if (start > ende) {
                throw new IllegalArgumentException("Too many swarms");
            }
            Swarm actualSwarm = swarmIterator.next();
            if (actualSwarm.getIdent() == start) {
                start++;
            } else {
                throw new IllegalArgumentException("Swarm-Ident Inconsitency");
            }
        }

        char minimum = 'C';
        if (start < minimum) {
            throw new IllegalArgumentException("Too many swarms");
        }
    }

    private static int checkNumber(char[] number) {

        int result = 0;
        for (char digit : number) {
            if (digit < 48 || digit > 57) {
                throw new IllegalArgumentException("Map could not be parsed correctly : Illegal Header");
            } else {
                result = result * 10 + digit - 48;
            }
        }
        return result;
    }

    public static List<Field> getNeighboursOfSwarm(Field field, World world) {

        ArrayList<Field> neighboursOfSwarm = new ArrayList<>();
        ArrayList<Field> foundNeighbours = new ArrayList<>();
        foundNeighbours.add(field);

        while (!foundNeighbours.isEmpty()) {
            Field neighbour = foundNeighbours.get(0);
            if (!neighboursOfSwarm.contains(neighbour)) {
                neighboursOfSwarm.add(neighbour);
            }
            foundNeighbours.remove(neighbour);
            for (Field suspect : world.getNeighbours(neighbour)) {
                if (suspect.getType() == neighbour.getType() && !neighboursOfSwarm.contains(suspect) && !foundNeighbours.contains(suspect)) {
                    foundNeighbours.add(suspect);
                }
            }
        }

        return neighboursOfSwarm;
    }

}

