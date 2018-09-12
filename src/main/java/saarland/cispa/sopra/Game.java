package saarland.cispa.sopra;

import org.slf4j.LoggerFactory;
import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.io.IOException;
import java.util.Map;


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
        if (rounds < 0 ) {
            throw new IllegalArgumentException("Illegal Number of Rounds");
        }
        initialize(seed, world1, brains);
        for (int count = 0; count < rounds; count++) {
            simulateOnce();
        }
        LoggerFactory.getLogger(world.getPoints().toString());
        logger.writeToFile();
        return world;
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

        for (AntInfo ant : world.getAnts()) {
            oneAnt((Ant) ant);
        }

        logger.addRoundInfo(world.logChanges(), world.getPoints(), world.getNumOfAntsInSwarm());
    }

    private void oneAnt(Ant ant) {

        if (ant.getRestTime() == 0 && !ant.isDead()) {
            ant.getNextInstruction().execute(world, ant);
        } else {
            ant.decreaseResttime();
        }
    }

    private void initialize(long seed, File world1, File[] brains) {

        Map<Character, Swarm> swarms;
        try {
            swarms = BrainParser.parse(brains);
            world = WorldParser.parseMap(world1, seed, swarms);
            logger.addInitialRound(world.getFields(), swarms);
        } catch (IOException e) {
            LoggerFactory.getLogger("Brain could not be parsed correctly");
        }
     /*   Instruction[] brainB = new Instruction[2];
        brainB[0] = new Turn(TurnDirection.left);
        brainB[1] = new Move(0);
        Swarm swarmA = new Swarm('A', brainB, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
       swarms.put('B', swarmB);
       */


    }
}
