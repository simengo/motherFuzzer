package saarland.cispa.sopra;

import com.ibm.icu.impl.IllegalIcuArgumentException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WorldParser {
    public static World parseMap(File mapFile, long seed, Map<Character, Swarm> swarms) throws IOException {

        int iPMDleanger = 0;
        int jPMDlaenger = 0;
        Field[][] fields;

        try (BufferedReader bReader = new BufferedReader(new FileReader(mapFile))) {
            String line;
            int width = bReader.readLine().toCharArray()[0];
            int broadth = bReader.readLine().toCharArray()[0];

            fields = new Field[width][broadth];
            while ((line = bReader.readLine()) != null) {
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
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[0].length; j++) {
                Character type = fields[i][j].getType();
                if (type != '.' && type != '=' && type != '#') {
                    if (swarms.get(type).getIdent() != fields[i][j].getType()) {
                        throw new IllegalIcuArgumentException("wrong swarm");
                    }
                    Ant ant = new Ant(swarms.get(type), ants.size(), fields[i][j]);
                    ants.put(ants.size(), ant);
                }
            }
        }
        return ants;
    }
}
