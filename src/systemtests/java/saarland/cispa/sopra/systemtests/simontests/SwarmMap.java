package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class SwarmMap extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "C.";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));

    }
}
