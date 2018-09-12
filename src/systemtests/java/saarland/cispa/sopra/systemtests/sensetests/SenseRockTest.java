package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseRockTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".#..\n" +
            ".A..\n" +
            "....\n"+
            ".B..";

        senseAnt(gameInfo, map);
    }


    private void senseAnt(GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nsense ahead rock else 2\nset 0\nturn left\njump 2\n}";
        WorldInfo world = gameInfo.simulate(3, 42, map, brain, brain);
        if (!world.getAnt(0).getRegister()[0]) {
            fail("ant doesn't sense rock");
        }
    }
}
