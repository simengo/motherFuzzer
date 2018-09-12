package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BadMapTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "..A.\n" +
            ".0..\n" +
            "....\n" +
            "..B.";

        String map1 = "4\n4\n" +
            "..A.\n" +
            ".!..\n" +
            "....\n" +
            "..B.";

        String map2 = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "....\n" +
            "..C.";

        String map3 = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "....\n" +
            "..b.";

        String map4 = "-4\n-4\n" +
            ".AA.\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map1, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map2, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map3, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map4, brain, brain));
    }
}
