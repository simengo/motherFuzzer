package saarland.cispa.sopra.systemtests.technicaltests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

import java.io.File;

public class GameSimulateFromFileTest extends SystemTest { //TODO should work but does'n

    @Override
    public void test(GameInfo gameInfo) {
/*
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";
*/

        File fileMap = new File("brain.txt");
        File fileBrain = new File("map.txt");

        try {
            gameInfo.simulate(1, 42, fileMap, fileBrain, fileBrain);
        } catch (IllegalArgumentException x) {
            fail("legal input was rejected");
        }
    }
}
