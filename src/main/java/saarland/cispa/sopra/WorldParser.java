package saarland.cispa.sopra;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class WorldParser {
    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) throws IOException {

        int iPMDleanger = 0;
        int jPMDlaenger = 0;
        Field[][] fields;

        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()))) {
            String line;
            int width = bReader.readLine().toCharArray()[0];
            int broadth = bReader.readLine().toCharArray()[0];

            fields = new Field[width][broadth];
            while (bReader.readLine() != null) {
                line = bReader.readLine();
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
            }

            Map<Integer, Ant> ants = spawnAnts(swarms, fields);
            return new World(fields, seed, ants);
        }
    }

    private static Map<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) throws IllegalArgumentException {
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
