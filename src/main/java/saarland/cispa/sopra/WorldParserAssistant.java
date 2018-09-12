package saarland.cispa.sopra;

import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public final class WorldParserAssistant {

    private WorldParserAssistant() {

    }

    public static void checkBaseConsistency(World world, Map<Character, Swarm> swarms) {

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
                        List<Field> swarmmember = WorldParser.getNeighboursOfSwarm(field, world);
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


    public static World finishing(String[] splittedlines, Field[][] fields, int width, long seed, Map<Character, Swarm> swarms) {

        WorldParser.spawnMap(splittedlines, fields, width, swarms);
        Map<Integer, Ant> ants = WorldParser.spawnAnts(swarms, fields);
        WorldParser.checkSwarmConsistency(swarms);
        World welt = new World(fields, seed, ants, swarms);
        checkBaseConsistency(welt, swarms);
        welt.setAntlion();
        return welt;

    }

    public static String[] convertMap(File mapFile) {

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
}
