package saarland.cispa.sopra;


import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public final class WorldParser {

    private WorldParser() {

    }

    private static String[] convertMap(File mapFile) {

        ArrayList<String> result = new ArrayList<>();
        if (mapFile.isFile()) {

            try {
                BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()));
                String line = bReader.readLine();
                if (line == null) {
                    throw new IllegalArgumentException("Map could not be parsed correctly : Propably empty file");
                }
                StringBuilder builder = new StringBuilder(line);
                while (true) {
                    line = bReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        builder.append('\n');
                        builder.append(line);
                    }
                }
                String[] splittedlines = builder.toString().split("[\\\\r\\\\n\n]+");
                for (String substring : splittedlines) {
                    result.add(substring);
                }

                bReader.close();

            } catch (IOException e) {
                LoggerFactory.getLogger("Invalid File");
            }

        } else {

            String[] splittedLines = mapFile.toString().split("[\\\\r\\\\n\n]+");
            result.addAll(Arrays.asList(splittedLines));
        }

        String[] builder = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {

            builder[i] = result.get(i);

        }

        return builder;
    }

    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) {

        int minsize = 4;

        String[] splittedlines = convertMap(mapFile);

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

        spawnMap(splittedlines, fields, width);

        Map<Integer, Ant> ants = spawnAnts(swarms, fields);
        checkSwarmConsistency(swarms);
        World welt = new World(fields, seed, ants, swarms);
        checkBaseConsistency(welt, swarms);
        welt.setAntlion();
        return welt;
    }

    private static void checkSize(int width, int height) {

        if (width < 2 || width > 128 || width % 2 != 0) {
            throw new IllegalArgumentException("Illegal width");
        }

        if (height < 2 || height > 128 || height % 2 != 0) {
            throw new IllegalArgumentException("Illegal height");
        }
    }

    private static void spawnMap(String[] splittedlines, Field[][] fields, int width) {
        for (int i = 2; i < splittedlines.length; i++) {

            char[] actualLine = splittedlines[i].toCharArray();

            if (actualLine.length % 2 != 0 || actualLine.length > 128 || actualLine.length != width) {
                throw new IllegalArgumentException("Invalid width of line");
            }

            int x = 0;

            for (char actualChar : actualLine) {
                checkLetter(actualChar, fields, x, i - 2);
                x++;
            }
        }
    }


    private static void checkLetter(char fieldType, Field[][] fields, int x, int y) {

        char antLion = '=';
        char normal = '.';
        char rock = '#';

        if (fieldType >= 65 && fieldType <= 90) {
            fields[x][y] = new Base(fieldType, x, y);
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

    private static void checkBaseConsistency(World world, Map<Character, Swarm> swarms) {

        Field[][] fields = world.getFields();
        Map<Character, List<Field>> consistentFields = new HashMap<>(26);
        ArrayList<Character> visitedSwarms = new ArrayList<>();
        for (Swarm swarm : swarms.values()) {
            consistentFields.put(swarm.getIdent(), new ArrayList<>(26));
        }

        for (Field[] line : fields) {

            for (Field field : line) {

                if (field instanceof Base) {

                    if (!visitedSwarms.contains(field.getType())) {
                        visitedSwarms.add(field.getType());
                    }

                    if (consistentFields.get(field.getType()).isEmpty()) {
                        List<Field> swarmmember = getNeighboursOfSwarm(field, world);
                        consistentFields.put(field.getType(), swarmmember);
                    } else {
                        if (!consistentFields.get(field.getType()).contains(field)) {
                            throw new IllegalArgumentException("Bases aren't consistent");
                        }
                    }

                }

            }

        }

        if (visitedSwarms.size() != swarms.size()) {
            throw new IllegalArgumentException("Number of different Base Fields doesn't match the number of different Swarms ");
        }
    }

    private static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) {
        HashMap<Integer, Ant> ants = new HashMap<>();
        Map<Character, boolean[]> marker = spawnMarker(swarms);
        for (Field[] line : fields) {
            for (Field field : line) {
                if (field instanceof Base) {
                    Ant ant = new Ant(swarms.get(field.getType()), ants.size(), field);
                    field.setAnt(ant);
                    field.setMarker(marker);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }

    private static Map<Character, boolean[]> spawnMarker(Map<Character, Swarm> swarms) {

        boolean[] marker = new boolean[7];
        HashMap<Character, boolean[]> result = new HashMap<>();
        for (Character identifier : swarms.keySet()) {
            result.put(identifier, marker);
        }
        return result;
    }

    private static void checkSwarmConsistency(Map<Character, Swarm> swarms) {

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

    private static List<Field> getNeighboursOfSwarm(Field field, World world) {

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

