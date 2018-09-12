package saarland.cispa.sopra.systemtests.movedirectiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class RotationTest extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain1 = "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\nturn left\nturn left\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        String brain2 = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\njump 0\n}";

        rotTest(gameInfo, 0, "northwest", brain1, map);
        rotTest(gameInfo, 1, "west", brain1, map);
        rotTest(gameInfo, 2, "southwest", brain1, map);
        rotTest(gameInfo, 3, "southeast", brain1, map);
        rotTest(gameInfo, 4, "east", brain1, map);
        rotTest(gameInfo, 5, "northeast", brain1, map);
        rotTest(gameInfo, 6, "northwest", brain1, map);

        rotTest(gameInfo, 0, "northwest", brain2, map);
        rotTest(gameInfo, 1, "northeast", brain2, map);
        rotTest(gameInfo, 2, "east", brain2, map);
        rotTest(gameInfo, 3, "southeast", brain2, map);
        rotTest(gameInfo, 4, "southwest", brain2, map);
        rotTest(gameInfo, 5, "west", brain2, map);
        rotTest(gameInfo, 6, "northwest", brain2, map);
    }

    private void rotTest(GameInfo gameInfo, int numOfRots, String direction, String brain, String map) {
        WorldInfo world = gameInfo.simulate(numOfRots, 42, map, brain, brain);
        String dir0 = world.getAnt(0).getDirection();
        if (!direction.equals(dir0)) {
            fail(String.format("Ant 0 faces %s instead of " + direction + "!", dir0));
        }
        String dir1 = world.getAnt(1).getDirection();
        if (!direction.equals(dir1)) {
            fail(String.format("Ant 1 faces %s instead of " + direction + "!", dir1));
        }
    }
}
