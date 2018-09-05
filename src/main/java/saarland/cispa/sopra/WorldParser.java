package saarland.cispa.sopra;

import com.ibm.icu.impl.IllegalIcuArgumentException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WorldParser {
    public World parseMap(File mapFile, long seed, HashMap<Character, Swarm> swarms, Logger logger) throws IOException {

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
                        }
                        case '=': {
                            fields[i][j] = new Antlion(i, j);
                        }
                        case '#': {
                            fields[i][j] = new Rock(i, j);
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
            return new World(fields, seed, ants, logger, swarms);
        }
    }

    private HashMap<Integer, Ant> spawnAnts(HashMap<Character, Swarm> swarms, Field[][] fields) throws IllegalArgumentException {
        HashMap<Integer, Ant> ants = new HashMap<>();
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; i < fields[0].length; i++) {
                Character type = fields[i][j].getType();
                if (type != '.' && type != '=' && type != '#') {
                    if (swarms.get(type).getSwarm() != fields[i][j].getType()) {
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
