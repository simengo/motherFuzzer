package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MarkTest10 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n2\n" +
            ".A.B\n" +
            "....";
        String brainA = "brain \"sample\" {\nmark 0\nturn left\nmove else 0\nmove else 0\njump 0\n}";
        String brainB = "brain \"sample\" {\nturn left\nmove else 0\nmove else 0\nmark 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(31, 42, map, brainA, brainB);
        boolean[] arrB = world.getFieldAt(1, 0).getMarkers().get('B');
        boolean[] arrA = world.getFieldAt(1, 0).getMarkers().get('A');

        if (!arrA[0]) {
            fail("0 marked A");
        }
        if (!arrB[0]) {
            fail("0 not marked B");

        }
    }
}


