package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FightTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map2 = "6\n6\n" +
            "######\n" +
            "#AA###\n" +
            "#ABA##\n" +
            "#.B###\n" +
            "##B###\n" +
            "######";
        String brain2 = "brain \"sample\" {\nmove else 0\njump 0\n}";
        WorldInfo world2 = gameInfo.simulate(1, 42, map2, brain2, brain2);
        if (world2.getFieldAt(2, 2).getAnt().get().getSwarm() != 'B') {
            fail("Expected ant to be alive but it is not!");
        }
        if (world2.getScore('B') != 0) {
            fail("Expected B to have 0 points");
        }
    }
}
