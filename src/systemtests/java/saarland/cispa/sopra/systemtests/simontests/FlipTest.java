package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FlipTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nflip 0 else 2\njump 0\nturn right\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2,42,map,brain,brain);
        String dir = "northeast";
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("flip 0 always returns 0 so turn right is performed");
        }

        brain = "brain \"sample\" {\nflip 1 else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2,42,map,brain,brain);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("flip 1 always returns 0 so turn right is performed");
        }
    }
    }

