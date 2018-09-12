package saarland.cispa.sopra.systemtests.sensetests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class UnmarkTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n" +
            "....";

        unmarkTest(0, gameInfo, map);
        unmarkTest(1, gameInfo, map);
        unmarkTest(2, gameInfo, map);
        unmarkTest(3, gameInfo, map);
        unmarkTest(4, gameInfo, map);
        unmarkTest(5, gameInfo, map);
        unmarkTest(6, gameInfo, map);
    }

    private void unmarkTest(int num, GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nmark " + num + "\nunmark " + num + "\nsense here marker 0 else 4\nset 0\nturn left\njump 4\n}";
        WorldInfo world = gameInfo.simulate(5, 42, map, brain, brain);
        if (world.getFieldAt(2, 2).getMarkers().get('A')[num]) {
            fail("marking then unmarking a field doesn't work for marker " + num);
        }
        if (world.getAnt(1).getRegister()[0]){
            fail("ant sensed already unmarked marker");
        }
    }
}
