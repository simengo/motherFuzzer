package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class ConsecutiveSwarms extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "AA.A\n" +
            "....\n" +
            "....\n" +
            "AABB";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        try {
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException x) {
            fail("Bases can connect over the edge");
        }
    }
}
