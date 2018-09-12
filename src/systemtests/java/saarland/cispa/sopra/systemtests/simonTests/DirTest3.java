package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\ndirection southeast else 0\nturn right\njump 0\n}";
        String dir = "southwest";

        WorldInfo world = gameInfo.simulate(6, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("ant was pointing SE");
        }
        brain = "brain \"sample\" {\ndirection southeast else 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(4, 42, map, brain, brain);
        if (dir.equals(world.getAnt(0).getDirection())) {
            fail("ant was not pointing SE");
        }


    }
}

