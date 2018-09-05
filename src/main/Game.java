import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Game implements GameInfo {

    World world1;
    Logger logger;


    public Game() {

    }

    public Game(String logname, String rounds, String seed, String world, ArrayList<String> brains) {

    }

    @Override
    public WorldInfo simulate(int rounds, long seed, File world, File... brains) {

        initialize(seed, world, brains);

        logger.addInitialRound(world1.getFields());

        for (int i = 0; i < rounds; i++) {
            simulateOnce();
        }

        return (WorldInfo) world1;

    }

    @Override
    public WorldInfo simulate(int rounds, long seed, String world, String... brains) {

        ArrayList<File> files = new ArrayList<File>();

        for (String brain : brains) {
            File file = new File(brain);

            if (!file.exists()) {
                try {
                    throw new Exception("invalid path");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else files.add(file);

        }

        return simulate(rounds, seed, new File(world), (File[]) files.toArray());
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
