package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BadMapBase extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "A.A.\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String map1 = "4\n4\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map1));
    }
}
