package saarland.cispa.sopra;

import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Utils {

    private static Random generator = new Random();

    public static String convertFile(File file) {

        StringBuilder builder = new StringBuilder();
        if (file.isFile()) {
            try {
                BufferedReader bReader = Files.newBufferedReader(Paths.get(file.getPath()));
                String line = bReader.readLine();
                if (line == null) {
                    throw new IllegalArgumentException("Given path is empty");
                } else {
                    builder.append(line);
                    builder.append('\n');
                }
                while (true) {

                    line = bReader.readLine();
                    if (line == null) {
                        bReader.close();
                        break;
                    } else {
                        builder.append(line);
                        builder.append('\n');
                    }

                }
            } catch (IOException e) {
                LoggerFactory.getLogger("Invalid File");
            }
        } else {

            return file.toString();
        }

        return builder.toString();
    }

    public static ArrayList<Brain> swarmsToBrainList(HashMap<Character, Swarm> swarms) {

        ArrayList<Brain> brainList = new ArrayList<>();

        int counter = 0;
        for (Swarm swarm : swarms.values()) {
            brainList.add(new Brain(swarm.getBrain(), counter));
            counter++;
        }

        return brainList;

    }

    public static ArrayList<Integer> makeMatchup(Integer... ids) {

        ArrayList<Integer> foundIDs = new ArrayList<>();

        for (int i = 0; i < ids.length; i++) {
            int number = generator.nextInt(ids.length);
            while (foundIDs.contains(number)) {
                number = generator.nextInt(ids.length);
            }
            foundIDs.add(number);

        }

        return foundIDs;

    }

    public static Brain matchBrain(ArrayList<Brain> brains, Instruction[] treasure) {

        Brain result = null;
        for (Brain brain : brains) {
            if (Arrays.equals(brain.getBrain(), treasure)) {
                result = brain;
                break;
            }
        }
        return result;
    }

    public static void clearPoints(ArrayList<Brain> brains) {

        for (Brain brain : brains) {
            brain.setPoints(0);
        }
    }
}
