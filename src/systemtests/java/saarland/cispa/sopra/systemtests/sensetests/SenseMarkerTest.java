package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseMarkerTest extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n" +
            "....";

        senseMarkerTest(0, gameInfo, map);
        senseMarkerTest(1, gameInfo, map);
        senseMarkerTest(2, gameInfo, map);
        senseMarkerTest(3, gameInfo, map);
        senseMarkerTest(4, gameInfo, map);
        senseMarkerTest(5, gameInfo, map);
        senseMarkerTest(6, gameInfo, map);
    }

    private void senseMarkerTest(int num, GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nmark " + num + "\njump 2\nsense left marker " + num + " else 4\nset 0\nsense right marker " + num + " else 6\nset 1\nsense ahead marker " + num + " else 8\nset 2\nsense here marker " + num + " else 10\nset 3\nturn left\njump 9\n}";
        WorldInfo world = gameInfo.simulate(11, 42, map, brain, brain);
        if (world.getFieldAt(2, 2).getAnt().isPresent()) {
            AntInfo ant = world.getFieldAt(2, 2).getAnt().get();
            if (!ant.getRegister()[0] || !ant.getRegister()[1] || !ant.getRegister()[2] || !ant.getRegister()[3]) {
                fail("ant did not find marking " + num);
            }
        }
    }
}
