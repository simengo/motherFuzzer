package saarland.cispa.sopra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    public String convertFile(File file) {

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

    @Override
    public WorldInfo simulate(int rounds, long seed, File world1, File... brains) {

        String[] brainstrings = new String[brains.length];

        for (int i = 0; i < brains.length; i++) {

            brainstrings[i] = convertFile(brains[i]);
            if (brainstrings[i].isEmpty()) {
                throw new IllegalArgumentException("Game could not be simulated: Empty File");
            }

        }

        String world = convertFile(world1);

        return simulate(rounds, seed, world, brainstrings);
    }

    @Override
    public WorldInfo simulate(int rounds, long seed, String worldstring, String... brains) {

        if (rounds < 0) {
            throw new IllegalArgumentException("Illegal Number of Rounds");
        }

        initialize(seed, worldstring, brains);

        for (int i = 0; i < rounds; i++) {
            simulateOnce();
        }

        logger.writeToFile();
        logPoints();
        return world;

    }


    private void logPoints() {

        int winnerpoints = 0;
        char winnerident = 'A';
        ArrayList<Character> drawidents = new ArrayList<>();
        boolean draw = false;
        boolean win = false;

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> pair : world.getPoints().entrySet()) {

            if (pair.getValue() > winnerpoints) {
                win = true;
                draw = false;
                winnerpoints = pair.getValue();
                winnerident = pair.getKey();
            } else {
                if (pair.getValue() == winnerpoints) {
                    if (world.getNumOfAntsInSwarm().get(pair.getKey()) > world.getNumOfAntsInSwarm().get(winnerident)) {
                        win = true;
                        draw = false;
                        winnerpoints = pair.getValue();
                        winnerident = pair.getKey();
                    } else {
                        if (world.getNumOfAntsInSwarm().get(pair.getKey()) == world.getNumOfAntsInSwarm().get(winnerident)) {
                            win = false;
                            draw = true;
                            drawidents.add(pair.getKey());
                        }

                    }
                }
            }

            result.append(pair.getKey());
            result.append(": ");
            result.append(world.getPoints().get(pair.getKey()));
            result.append('/');
            result.append(world.getNumOfAntsInSwarm().get(pair.getKey()));
            result.append('\n');

        }

        if (win) {
            result.append("Winner: ");
            result.append(winnerident);
        } else {
            if (draw) {
                result.append("Draw: ");
                for (char ident : drawidents) {
                    result.append(ident);
                    result.append(' ');
                }
            }
        }

        Logger logger = LoggerFactory.getLogger("results");
        logger.info(result.toString());


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

    private void initialize(long seed, String world1, String[] brains) {

        Map<Character, Swarm> swarms = BrainParser.parse(brains);
        world = WorldParser.parseMap(world1, seed, swarms);
        logger.addInitialRound(world.getFields(), swarms);


    }
}
