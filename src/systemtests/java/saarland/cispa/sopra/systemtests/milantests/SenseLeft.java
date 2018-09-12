package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseLeft extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.senseMap();

        String brain = "brain \"stan11dby\" {" +
            "\nsense left friend else 1\n" +
            "turn left\n" +
            "jump 0\n}";

        WorldInfo infos = gameInfo.simulate(2, 1, map, brain, brain);

        if (!"west".equals(infos.getFieldAt(0, 1).getAnt().get().getDirection())) {

            fail("Freund nicht erkannt");

        }


    }
}

