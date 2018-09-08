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

        int iPMDlaenger = 0;
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
            Field[][] fields = new Field[Integer.parseInt( String.valueOf(x) )][Integer.parseInt( String.valueOf(y) )];

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
                            fields[iPMDlaenger][jPMDlaenger] = new Normal(iPMDlaenger, jPMDlaenger, 0);
                            break;

                        case '=':
                            fields[iPMDlaenger][jPMDlaenger] = new Antlion(iPMDlaenger, jPMDlaenger);
                            break;

                        case '#':
                            fields[iPMDlaenger][jPMDlaenger] = new Rock(iPMDlaenger, jPMDlaenger);
                            break;

                        default:
                            fields[iPMDlaenger][jPMDlaenger] = new Base(chara, iPMDlaenger, jPMDlaenger);
                            break;
                    }
                    iPMDlaenger++;
                }
                iPMDlaenger = 0;
                jPMDlaenger++;
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
