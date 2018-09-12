package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MarkTest12 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n2\n" +
            ".A.B\n" +
            "....";
        String brainA = "brain \"sample\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\nunmark 0\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        WorldInfo world = gameInfo.simulate(9, 42, map, brainA, brainB);
        boolean[] arr = world.getFieldAt(1, 0).getMarkers().get('A');
        if (arr[0] || !arr[1] || !arr[2] || !arr[3] || !arr[4] || !arr[5] || !arr[6]) {
            fail("0 is not setted, 1,2,3,4,5,6 are setted");
        }

    }
}

