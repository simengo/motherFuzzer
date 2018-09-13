package saarland.cispa.sopra;


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


    public static World finishing(String[] splittedlines, Field[][] fields, int width, int height, long seed, Map<Character, Swarm> swarms) {

        WorldParser.spawnMap(splittedlines, fields, width, height, swarms);
        Map<Integer, Ant> ants = WorldParser.spawnAnts(swarms, fields);
        WorldParser.checkSwarmConsistency(swarms);
        World welt = new World(fields, seed, ants, swarms);
        checkBaseConsistency(welt, swarms);
        welt.setAntlion();
        return welt;

    }

    public static String[] convertMap(String map) {

        String[] splittedmap = map.split("(?=\r\n|\n)");
        String[] cleanedmap = new String[splittedmap.length];
        int counter = 0;
        for (String line : splittedmap) {
            if ("\r".equals(line)) {
                continue;
            }
            cleanedmap[counter] = line.replaceAll("(\r\n|\n)", "");
            counter++;

        }
        return cleanedmap;
    }
}
