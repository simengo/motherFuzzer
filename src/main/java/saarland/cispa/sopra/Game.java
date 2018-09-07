package saarland.cispa.sopra;

import saarland.cispa.sopra.BrainParser;
import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game implements GameInfo {

    private final JSONLogger logger;
    private World world;

    public Game(String path) {

        File loggerpath = new File(path);
        if (!loggerpath.exists()) {
            try {
                throw new FileNotFoundException("Invalid Loggerpath");
            } catch (FileNotFoundException e) {
                e.notifyAll();
            }
        }

        logger = new JSONLogger(loggerpath);
    }


    @Override
    public WorldInfo simulate(int rounds, long seed, File world1, File... brains) {
        initialize(seed, world1, brains);
        for (int count = 0; count< rounds; count++) {
            simulateOnce();
        }

        logger.writeToFile();
        return (WorldInfo) world;
    }

    @Override
    public WorldInfo simulate(int rounds, long seed, String world, String... brains) {

        File[] filearray = new File[brains.length];
        int count = 0;
        for (String brain : brains) {
            filearray[count] = new File(brain);
            count++;
        }
        File worldfile = new File(world);

        return simulate(rounds, seed, worldfile, filearray);

    }

    private void simulateOnce() {

        List<AntInfo> ants = world.getAnts();
        for (AntInfo ant : ants) {
            oneAnt((Ant) ant);
        }

        logger.addRoundInfo(world.logChanges(),world.getPoints(),world.getNumOfAntsInSwarm());
    }

    private void oneAnt(Ant ant) {

        if (ant.getRestTime() == 0 && !ant.isDead()) {
            ant.getNextInstruction().execute(world, ant);
        } else {
            ant.decreaseResttime();
        }
    }

    private void initialize(long seed, File world1, File[] brains) {

        HashMap<Character, Swarm> swarms = new HashMap<>();
        try {
            swarms = BrainParser.parse(brains);
            world = WorldParser.parseMap(world1, seed, swarms);
        } catch (IOException e) {
            e.notifyAll();
        }
        logger.addInitialRound(world.getFields(), swarms);

    }
}
