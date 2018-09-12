package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseHalucinationsTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "....\n" +
            ".B..\n" +
            "....\n"+
            ".A..";

        senseAnt(gameInfo, map, "foe");
        senseAnt(gameInfo, map, "foehome");
        senseAnt(gameInfo, map, "friend");
        senseAnt(gameInfo, map, "rock");
        senseAnt(gameInfo, map, "home");
        senseAnt(gameInfo, map, "food");
        senseAnt(gameInfo, map, "marker 0");
        senseAnt(gameInfo, map, "marker 1");
        senseAnt(gameInfo, map, "marker 2");
        senseAnt(gameInfo, map, "marker 3");
        senseAnt(gameInfo, map, "marker 4");
        senseAnt(gameInfo, map, "marker 5");
        senseAnt(gameInfo, map, "marker 6");
    }

    private void senseAnt(GameInfo gameInfo, String map, String hallucination) {
        String brain = "brain " +
            "\"collision\" {\nsense left "+ hallucination +" else 2\nset 0\nsense ahead "+ hallucination +" else 4\nset 1\nsense right "+ hallucination +" else 6\nset 2\nturn left\njump 6\n}";
        WorldInfo world = gameInfo.simulate(7, 42, map, brain, brain);
        if (world.getAnt(0).getRegister()[0]) {
            fail("ant sensed" + hallucination + " even thou there was nothing there");
        }
        if (world.getAnt(0).getRegister()[1]) {
            fail("ant sensed" + hallucination + " even thou there was nothing there");
        }
        if (world.getAnt(0).getRegister()[2]) {
            fail("ant sensed" + hallucination + " even thou there was nothing there");
        }
    }
}
