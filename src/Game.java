import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game implements GameInfo {

    World world;
    File loggerpath;

    public Game() {

    }

    public Game(String path) {
        loggerpath = new File(path);
        if (!loggerpath.exists()) {
            try {
                throw new Exception("Invalid Loggerpath");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    @Override
    public WorldInfo simulate(int rounds, long seed, File world, File... brains) {
        initialize(seed, world, brains);
        logger.addInitialRound();
        for (int i = 0; i < rounds; i++) {
            simulateOnce();
        }
        return (WorldInfo) world;
    }

    @Override
    public WorldInfo simulate(int rounds, long seed, String world, String... brains) {
        ArrayList<File> files = new ArrayList<>();
        for (int i = 0; i < brains.length; i++) {
            files.add(new File(brains[i]));
        }
        File[] brainFiles = new File[brains.length - 1];
        for (int i = 0; i < files.size(); i++) {
            brainFiles[i] = files.get(i);
        }
        return simulate(rounds, seed, new File(world), brainFiles);
    }

    private void simulateOnce() {
        List<AntInfo> ants = world.getAnts();
        for (AntInfo ant : ants) {
            oneAnt(ant);
        }
        world.logChanges();
    }

    private void oneAnt(Ant ant) {

        if (ant.getRestTime() == 0) {

            ant.getNextInstruction().execute(world, ant);

        } else {
            ant.decreaseResttime();
        }
    }

    private void initialize(long seed, File world1, File[] brains) {

        Logger logger = new JSONLogger(loggerpath);

        HashMap<Character, Swarm> swarms = BrainParser.parse(brains);

        try {
            world = WorldParser.parseMap(world1, seed, swarms, logger);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
