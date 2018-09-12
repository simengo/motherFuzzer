package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class BadMapSize extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map1 = "6\n6\n" +
            ".AA.\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String map2 = "4\n4\n" +
            ".AA.\n" +
            "..\n" +
            ".BB.";

        String map3 = "4\n6\n" +
            ".AA.\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String map4 = "4\n4\n" +
            ".AA.\n" +
            "....\n" +
            ".BB.\n" +
            ".AA.";

        String map5 = "4\n4\n" +
            ".AA...\n" +
            "......\n" +
            ".BB...\n" +
            "......\n" +
            "......\n" +
            "......";

        String map6 = "4\n4\n" +
            ".AA.\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String map7 = "3\n3\n" +
            ".AA\n" +
            "...\n" +
            ".BB";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map1, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map2, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map5, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map7, brain, brain));

        try {
            gameInfo.simulate(1, 42, map3, brain, brain);
        } catch (IllegalArgumentException x) {
            fail("legal mp not accepted (not quadratic)");
        }

        try {
            gameInfo.simulate(1, 42, map4, brain, brain);
        } catch (IllegalArgumentException x) {
            fail("legal mp not accepted (base)");
        }
        WorldInfo world = gameInfo.simulate(1, 42, map6, brain, brain);
        if (world.getHeight() != 4 && world.getWidth() != 4) {
            fail("height / width saved incorrectly in world");
        }
    }
}
