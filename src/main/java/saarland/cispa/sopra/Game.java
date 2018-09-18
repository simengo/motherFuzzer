package saarland.cispa.sopra;


import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.util.HashMap;


public class Game implements GameInfo {

    private LoggerInfo logger = new NOPLogger(); // TODO soll eig in Main mit setLogger gemacht werden aber Systemtests auf game
    private World world;


    public void setLogger(String path) {
        if (path == null) {
            logger = new NOPLogger();
        } else {
            File loggerFile = new File(path);
            logger = new JSONLogger(loggerFile);
        }

    }

    @Override
    public WorldInfo simulate(int rounds, long seed, File world1, File... brains) {

        return null;
    }

    @Override
    public WorldInfo simulate(int rounds, long seed, String worldstring, String... brains) {

        return null;
    }

    public WorldInfo simulate(int rounds, long seed, String worldstring, Instruction[]... brains) {

        if (rounds < 0) throw new IllegalArgumentException("Illegal Number of Rounds");
        initialize(seed, worldstring, brains);
        for (int i = 0; i < rounds; i++) {
            simulateOnce();
        }
        return world;


    }


    private void initialize(long seed, String worldstring, Instruction[]... brains) {

        if (brains.length != 2) throw new IllegalArgumentException("Number of Brains has to be 2 for testing");
        HashMap<Character, Swarm> swarms = initializeSwarms(brains);
        world = WorldParser.parseMap(worldstring, seed, swarms);
        world.setSwarms(swarms);
    }

    private HashMap<Character, Swarm> initializeSwarms(Instruction[]... brains) {

        HashMap<Character, Swarm> swarms = new HashMap<>();
        char counter = 'A';
        for (Instruction[] brain : brains) {
            String swarmname = "Swarm " + counter;
            Swarm swarm = new Swarm(counter, brain, swarmname);
            swarms.put(counter, swarm);
            counter++;
        }
        return swarms;
    }


    private void simulateOnce() {

        for (AntInfo ant : world.getAnts()) {
            oneAnt((Ant) ant);
        }

    }

    private void oneAnt(Ant ant) {

        if (ant.getRestTime() == 0 && !ant.isDead()) {
            ant.getNextInstruction().execute(world, ant);
        } else {
            ant.decreaseResttime();
        }
    }


}
