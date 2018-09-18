package saarland.cispa.sopra;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Fuzzer {

    private ArrayList<String> maps = new ArrayList<>();
    private ArrayList<String> brains = new ArrayList<>();


    public void initializeMaps(File... mapfiles) {

        for (File map : mapfiles) {
            maps.add(Utils.convertFile(map));
        }
    }

    public void initializeBrains(File... brainfiles) {

        for (File brain : brainfiles) {
            brains.add(Utils.convertFile(brain));
        }
    }

    public void fuzz() {

        String[] convertedBrains = brains.toArray(new String[brains.size()]);

        HashMap<Character, Swarm> swarms = (HashMap<Character, Swarm>) BrainParser.parse(convertedBrains);

        ArrayList<Brain> finishedBrains = Utils.swarmsToBrainList(swarms);

        int counter = 0;

        while (true) {
            finishedBrains = Matchmaker.makeMatch(finishedBrains, maps);
            counter++;
            if (counter % 1000 == 0) {
                for (Brain brain : finishedBrains) {
                    System.out.println(brain.toString());
                    System.out.println(" ");
                }
            }
        }

    }
}
