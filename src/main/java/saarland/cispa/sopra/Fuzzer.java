package saarland.cispa.sopra;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Fuzzer {

    private ArrayList<String> maps = new ArrayList<>();
    private ArrayList<String> brains = new ArrayList<>();

    public void fuzz(File... brainFiles) {


        ArrayList<String> brains = new ArrayList<>();

        for (File brainFile : brainFiles) {
            brains.add(Utils.convertFile(brainFile));
        }

        HashMap<Character, Swarm> swarms = (HashMap<Character, Swarm>) BrainParser.parse((String[]) brains.toArray());

        ArrayList<Instruction[]> finishedBrains = Utils.swarmsToBrainList(swarms);

        Matchmaker.makeMatch(finishedBrains);


    }
}
