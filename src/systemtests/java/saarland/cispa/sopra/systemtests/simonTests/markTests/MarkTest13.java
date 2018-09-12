package saarland.cispa.sopra.systemtests.simontests.marktests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MarkTest13 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n2\n" +
            ".A.B\n" +
            "....";
        String brainA = "brain \"sample\" {\nsense here marker 0 else 4\nset 0\turn right\nturn right\nturn right\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2, 42, map, brainA, brainB);
        String dir = "northeast";
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("sense was not right so else 4 and ant turned");
        }

    }
}

