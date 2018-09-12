package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.sense1();
        String brain2 = "brain \"stan11dby\" {" +
            "\nsense right foehome else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";


        String brain1 = "brain \"stan11dby\" {" +
            "\nsense left foehome else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain = "brain \"stan11dby\" {" +
            "\nsense ahead foehome else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\njump 0" +
            "\n}";


        String brain3 = "brain \"stan11dby\" {" +
            "\nsense here foehome else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn right" +
            "\njump 0" +
            "\njump 1" +
            "\n}";

        WorldInfo welt11 = gameInfo.simulate(2, 1, map, brain, brain);
        WorldInfo welt22 = gameInfo.simulate(2, 1, map, brain1, brain1);
        WorldInfo welt33 = gameInfo.simulate(2, 1, map, brain2, brain2);
        WorldInfo welt44 = gameInfo.simulate(2, 1, map, brain3, brain3);

        if (!"northeast".equals(welt11.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung1");
        }
        if (!"west".equals(welt22.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung2");
        }
        if (!"west".equals(welt33.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung3");
        }
        if (!"northeast".equals(welt44.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung4");
        }


    }
}
