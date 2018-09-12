package saarland.cispa.sopra.systemtests.simontests.directiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirTest4 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\ndirection east else 0\nturn right\njump 0\n}";
        String dir = "southeast";

        WorldInfo world = gameInfo.simulate(7, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("ant was pointing E");
        }
        brain = "brain \"sample\" {\nturn left\nturn left\ndirection east else 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(5, 42, map, brain, brain);
        if (dir.equals(world.getAnt(0).getDirection())) {
            fail("ant was not pointing E");
        }


    }
}

