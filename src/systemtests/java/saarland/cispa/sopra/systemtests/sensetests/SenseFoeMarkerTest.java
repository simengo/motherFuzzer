package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseFoeMarkerTest extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n" +
            "....";

        senseFoeMarker(0, gameInfo, map);
        senseFoeMarker(1, gameInfo, map);
        senseFoeMarker(2, gameInfo, map);
        senseFoeMarker(3, gameInfo, map);
        senseFoeMarker(4, gameInfo, map);
        senseFoeMarker(5, gameInfo, map);
        senseFoeMarker(6, gameInfo, map);
    }

    private void senseFoeMarker(int num, GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nmark " + num + "\njump 2\nsense ahead marker " + num + " else 4\nset 0\nturn left\njump 4\n}";
        WorldInfo world = gameInfo.simulate(5, 42, map, brain, brain);
        if (world.getAnt(2).getRegister()[0]) {
            fail("ant sensed enemy marker");
        }
    }
}
