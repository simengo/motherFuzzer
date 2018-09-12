package saarland.cispa.sopra.systemtests.technicaltests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MapInitialisation extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "####\n" +
            "AA..\n" +
            "..BB\n" +
            "1289";

        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        if (world.getFieldAt(0, 0).getType() != '#') {
            fail("map incorrectly initialized");
        }
        if (world.getFieldAt(0, 1).getType() != 'A') {
            fail("map incorrectly initialized");
        }
        if (world.getFieldAt(0, 2).getType() != '.') {
            fail("map incorrectly initialized");
        }
        if (world.getFieldAt(0, 3).getType() != '.') {
            fail("map incorrectly initialized");
        }
    }
}
