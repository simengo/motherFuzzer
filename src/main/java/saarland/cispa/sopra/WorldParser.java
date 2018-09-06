package saarland.cispa.sopra;

import com.ibm.icu.impl.IllegalIcuArgumentException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WorldParser {
    public static World parseMap(File mapFile, long seed, HashMap<Character, Swarm> swarms) throws IOException {

        int i = 0;
        int j = 0;
        Field[][] fields;

        try (BufferedReader br = new BufferedReader(new FileReader(mapFile))) {
            String line;
            int width = br.readLine().toCharArray()[0];
            int broadth = br.readLine().toCharArray()[0];

            fields = new Field[width][broadth];
            while ((line = br.readLine()) != null) {
                char[] row = line.toCharArray();
                for (Character c : row) {
                    switch (c) {
                        case '.': {
                            fields[i][j] = new Normal(i, j, 0);
                            break;
                        }
                        case '=': {
                            fields[i][j] = new Antlion(i, j);
                            break;
                        }
                        case '#': {
                            fields[i][j] = new Rock(i, j);
                            break;
                        }
                        default: {
                            fields[i][j] = new Base(c, i, j);
                        }
                    }
                    j++;
                }
                j = 0;
                i++;
            }

            HashMap<Integer, Ant> ants = spawnAnts(swarms, fields);
            return new World(fields, seed, ants);
        }
    }

    private static HashMap<Integer, Ant> spawnAnts(Map<Character, Swarm> swarms, Field[][] fields) throws IllegalArgumentException {
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; i < fields[0].length; i++) {
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
