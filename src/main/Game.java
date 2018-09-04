import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Game implements GameInfo {

    World world;
    Logger logger;

    public Game() {

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
            oneAnt((Ant) ant);
        }
        logger.
    }

    private void oneAnt(Ant ant) {

    }

    private void initialize(long seed, File world, File[] brains) {

    }
}
