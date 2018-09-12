package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MarkTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "A.\n" +
            "B.";
        String brain0 = "brain \"sample\" {\nturn left\njump 0\n}";
        String brain = "brain \"sample\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\nunmark 0\nunmark 1\nunmark 2\nunmark 3\nunmark 4\nunmark 5\nunmark 6\njump 0\n}";

        WorldInfo world = gameInfo.simulate(14, 42, map, brain, brain0);
        boolean[] arr = world.getFieldAt(0, 0).getMarkers().get('A');
        if (arr[0] || arr[1] || arr[2] || arr[3] || arr[4] || arr[5] || arr[6]){
            fail("all markers need to be true due to marking and unmarking");
        }
    }
    }

