package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.senseRock();
        String brain3 = "brain \"stan11dby\" {" +
            "\nsense right rock else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain1 = "brain \"stan11dby\" {" +
            "\nsense ahead rock else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nsense left rock else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain4 = "brain \"stan11dby\" {" +
            "\nsense here rock else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        WorldInfo welt15 = gameInfo.simulate(2, 1, map, brain1, brain1);
        WorldInfo welt25 = gameInfo.simulate(2, 1, map, brain2, brain2);
        WorldInfo welt35 = gameInfo.simulate(2, 1, map, brain3, brain3);
        WorldInfo welt45 = gameInfo.simulate(2, 1, map, brain4, brain4);

        if (!"northeast".equals(welt15.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Richtung1");
        }
        if (!"west".equals(welt25.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Richtung2");
        }
        if (!"northeast".equals(welt35.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Richtung2");
        }
        if (!"northeast".equals(welt45.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Richtung2");
        }


    }
}
