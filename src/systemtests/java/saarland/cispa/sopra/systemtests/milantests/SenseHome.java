package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseHome extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nsense left home else 1\n" +
            "turn right\njump 0\n}";

        String map = InitTests.senseMap();

        WorldInfo welt = gameInfo.simulate(2, 1, map, brain, brain);

        if (!"northeast".equals(welt.getFieldAt(2, 3).getAnt().get().getDirection())) {

            fail("home nicht erkannt");
        }


    }
}
