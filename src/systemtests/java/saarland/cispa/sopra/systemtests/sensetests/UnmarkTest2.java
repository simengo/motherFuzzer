package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class UnmarkTest2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".A..\n" +
            ".B..\n" +
            "....\n" +
            "....";

        String brain1 = "brain " +
            "\"collision\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\nmove else 8\njump 0\n}";
        String brain2 = "brain " +
            "\"collision\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\nunmark 0\nmove else 8\njump 0\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brain1, brain2);
        for (int i = 1; i < 7; i++) {
            if (!world.getFieldAt(1, 0).getMarkers().get('A')[i]) {
                fail("all markers for A should be set except 0");
            }
            if (!world.getFieldAt(1, 0).getMarkers().get('B')[i]) {
                fail("all markers for B should be set except 0");
            }
        }
            if (!world.getFieldAt(1, 0).getMarkers().get('A')[0]) {
                fail("marker 0 for A should be set");
            }
            if (world.getFieldAt(1, 0).getMarkers().get('B')[0]) {
                fail("marker 0 for B shouldn't be set");
            }
    }
}
