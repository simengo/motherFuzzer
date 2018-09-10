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

        int x = 0;
        int y = 0;

        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(mapFile.getPath()))) {
            int counter = 0;
            int width = Integer.parseInt(bReader.readLine());
            int height = Integer.parseInt(bReader.readLine());

            Field[][] fields = new Field[width][height];

            while (true) {
                String line = bReader.readLine();

                if (line == null) {
                    if (counter % 2 != 0 || counter == 0 || counter != height) {
                        throw new IllegalArgumentException();
                    }
                    break;
                }

                char[] row = line.toCharArray();

                if (row.length != width) {
                    throw new IllegalArgumentException("Width doesnt match header");
                }
                for (Character fieldType : row) {
                    switch (fieldType) {
                        case '.':
                            fields[x][y] = new Normal(x, y, 0);
                            break;

                        case '=':
                            fields[x][y] = new Antlion(x, y);
                            break;

                        case '#':
                            fields[x][y] = new Rock(x, y);
                            break;

                        default:
                            checkLetter(fieldType,fields,x,y);
                            break;
                    }
                    y++;
                }
                y = 0;
                x++;
                counter += 1;
            }
            Map<Integer, Ant> ants = spawnAnts(swarms, fields);
            World welt = new World(fields, seed, ants, swarms);
            welt.setAntlion();
            return welt;
        }
    }

    private static void checkLetter(char fieldType,Field[][] fields,int x, int y){
        boolean bool = true;
        if (fieldType >= 65 && fieldType <= 90 || fieldType >= 97 && fieldType <= 122) {
            fields[x][y] = new Base(fieldType, x, y);
            bool = false;

        }
        if (fieldType >= 49 && fieldType <= 57) {
            fields[x][y] = new Normal(x, y, fieldType - 48);
            bool = false;
        }
        if(bool){
                throw new IllegalArgumentException("Map could not be parsed correctly (Invalid Character)");
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
}
