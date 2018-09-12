package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FlipTest1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nflip 42 else 2\njump 0\nturn right\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);

        WorldInfo world1 = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(world.getAnt(0).getDirection().equals(world1.getAnt(0).getDirection()))) {
            fail("flip at same seed performs same action");
        }
    }
}

