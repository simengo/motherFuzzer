package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\nturn left\ndirection southwest else 0\nturn right\njump 0\n}";
        String dir = "west";

        WorldInfo world = gameInfo.simulate(5, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("ant was pointing SW");
        }
        brain = "brain \"sample\" {\ndirection southwest else 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(3, 42, map, brain, brain);
        if (dir.equals(world.getAnt(0).getDirection())) {
            fail("ant was not pointing SW");
        }


    }
}

