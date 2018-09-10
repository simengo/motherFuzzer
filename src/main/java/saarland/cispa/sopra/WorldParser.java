package saarland.cispa.sopra;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class WorldParser {

    private WorldParser() {

    }

    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) throws IOException {

        Field[][] fields = null;
        int width = 0;
        int height = 0;

        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()))) {

            String line = bReader.readLine();

            if (line == null) {
                throw new IllegalArgumentException("Map could not be parsed correctly : Propably empty file");
            }

            String[] splittedlines = line.split("\\\\n");

            width = checkNumber(splittedlines[0].toCharArray());
            height = checkNumber(splittedlines[1].toCharArray());

            if (splittedlines.length > height + 2 || (splittedlines.length - 2)%2 != 0 || splittedlines.length - 2 > 128) {
                throw new IllegalArgumentException("Map could not be parsed correctly");
            }

            fields = new Field[width][height];

            for (int i = 2; i < splittedlines.length; i++) {

                char[] actualLine = splittedlines[i].toCharArray();

                if (actualLine.length % 2 != 0 || actualLine.length > 128) {
                    throw new IllegalArgumentException("Invalid width of line");
                }

                int x = 0;

                for (char actualChar : actualLine) {
                    checkLetter(actualChar, fields, x, i - 2);
                    x++;
                }
            }

        }

        Map<Integer, Ant> ants = spawnAnts(swarms, fields);
        World welt = new World(fields, seed, ants, swarms);
        welt.setAntlion();
        return welt;
    }


    private static void checkLetter(char fieldType, Field[][] fields, int x, int y) {

        char antLion = '=';
        char normal = '.';

        if (fieldType >= 65 && fieldType <= 90 || fieldType >= 97 && fieldType <= 122) {
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
                        throw new IllegalArgumentException("Map could not be parsed correctly (Invalid Character)");
                    }
                }
            }
        }

    }

    private static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) {
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (Field[] fieldh : fields) {
            for (Field field : fieldh) {
                Character type = field.getType();
                if (type != '.' && type != '=' && type != '#') {
                    if (swarms.get(type).getIdent() != type) {
                        throw new IllegalArgumentException("wrong swarm");
                    }
                    Ant ant = new Ant(swarms.get(type), ants.size(), field);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }

    private static void checkSwarmConsistency(World world, Map<Character, Swarm> swarms) {

        Iterator<Swarm> swarmIterator = swarms.values().iterator();

        char Start = 'A';
        char Ende = 'Z';
        while (swarmIterator.hasNext()) {

            if (Start > Ende) {
                throw new IllegalArgumentException("Too many swarms");
            }
            Swarm actualSwarm = swarmIterator.next();
            if (actualSwarm.getIdent() != Start) {
                throw new IllegalArgumentException("Swarm-Ident Inconsitency");
            } else {
                Start++;
            }
        }

        if(Start<'B'){
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
}
