package saarland.cispa.sopra;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public final class WorldParser {

    private WorldParser() {

    }

    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) throws IOException {

        int iPMDleanger = 0;
        int jPMDlaenger = 0;

        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()))) {
            String x = bReader.readLine();
            String y = bReader.readLine();
            if (x == null | y == null) {
                throw new IllegalArgumentException("x or y was null");
            }
            if (x.length() != 1 | y.length() != 1) {
                throw new IllegalArgumentException("val for x was " + x + " and wal for y was " + y);
            }
            int counter = 0;
            Field[][] fields = new Field[x.charAt(0)][y.charAt(0)];

            while (true) {
                String line = bReader.readLine();

                if (line == null) {
                    if (counter % 2 != 0 || counter == 0) {
                        throw new IllegalArgumentException();
                    }
                    break;
                }

                char[] row = line.toCharArray();
                for (Character chara : row) {
                    switch (chara) {
                        case '.':
                            fields[iPMDleanger][jPMDlaenger] = new Normal(iPMDleanger, jPMDlaenger, 0);
                            break;

                        case '=':
                            fields[iPMDleanger][jPMDlaenger] = new Antlion(iPMDleanger, jPMDlaenger);
                            break;

                        case '#':
                            fields[iPMDleanger][jPMDlaenger] = new Rock(iPMDleanger, jPMDlaenger);
                            break;

                        default:
                            fields[iPMDleanger][jPMDlaenger] = new Base(chara, iPMDleanger, jPMDlaenger);
                            break;
                    }
                    jPMDlaenger++;
                }
                jPMDlaenger = 0;
                iPMDleanger++;
                counter++;
            }
            Map<Integer, Ant> ants = spawnAnts(swarms, fields);
            return new World(fields, seed, ants, swarms);
        }
    }

    private static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) {
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (Field[] fieldh : fields) {
            for (Field field : fieldh) {
                Character type = field.getType();
                if (type != '.' && type != '=' && type != '#') {
                    if (swarms.get(type).getIdent() != field.getType()) {
                        throw new IllegalArgumentException("wrong swarm");
                    }
                    Ant ant = new Ant(swarms.get(type), ants.size(), field);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }
}
