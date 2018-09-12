package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseBase extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n"+
            "....";

        senseAnt(gameInfo, map);
    }


    private void senseAnt(GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nsense left home else 2\nset 0\nsense ahead foehome else 4\nset 1\nturn left\njump 4\n}";
        WorldInfo world = gameInfo.simulate(7, 42, map, brain, brain);
        if (!world.getAnt(2).getRegister()[0]) {
            fail("ant doesn't sense home");
        }
        if (!world.getAnt(2).getRegister()[1]) {
            fail("ant doesn't sense foehome");
        }
    }
}
