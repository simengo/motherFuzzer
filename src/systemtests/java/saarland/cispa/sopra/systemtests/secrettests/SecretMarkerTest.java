package saarland.cispa.sopra.systemtests.secrettests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SecretMarkerTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            ".A..\n" +
            "....\n" +
            "....";

        String brain1 = "brain " +
            "\"collision\" {\nmark 1\nmove else 3\nmark 1\nturn left\njump 3\n}";
        String brain2 = "brain " +
            "\"collision\" {\nmark 0\nmove else 3\nmark 0\nturn left\njump 3\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brain1, brain2);
        if (world.getFieldAt(1, 0).getMarkers().get('A')[0]) {
            fail("getMarkers()['A'] returns markers set by different swarm");
        }
        if (world.getFieldAt(1, 0).getMarkers().get('B')[1]) {
            fail("getMarkers()['B'] returns markers set by different swarm");
        }
    }
}


