package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\ndirection northwest else 0\nturn right\njump 0\n}";
        String dir = "northeast";

        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("ant was pointing NW");
        }
        brain = "brain \"sample\" {\nturn left\ndirection northwest else 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (dir.equals(world.getAnt(0).getDirection())) {
            fail("ant was not pointing NW");
        }


    }
}

