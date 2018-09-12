package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseRight extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.senseMap();
        String brain = "brain \"stan11dby\" {" +
            "\nturn left\n" +
            "sense right foe else 0" +
            "\nturn left\njump 0\n}";

        WorldInfo infos = gameInfo.simulate(3, 1, map, brain,brain);

        if (!"southwest".equals(infos.getFieldAt(3, 2).getAnt().get().getDirection())) {

            fail("Gegner nicht erkannt");

        }

    }
}
