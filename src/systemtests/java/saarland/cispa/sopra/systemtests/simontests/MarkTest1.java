package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MarkTest1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "A.\n" +
            "B.";
        String brain = "brain \"sample\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\njump 0\n}";

        WorldInfo world = gameInfo.simulate(8, 42, map, brain, brain);
        boolean[] arr = world.getFieldAt(0, 0).getMarkers().get('A');
        if (!arr[0] || !arr[1] || !arr[2] || !arr[3] || !arr[4] || !arr[5] || !arr[6]){
            fail("all markers need to be true");
        }
    }
    }

