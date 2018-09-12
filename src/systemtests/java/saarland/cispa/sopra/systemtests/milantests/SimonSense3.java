package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense3 extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.sense3();
        String brain1 = "brain \"stan11dby\" {" +
            "\nsense ahead home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain4 = "brain \"stan11dby\" {" +
            "\nsense here home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain3 = "brain \"stan11dby\" {" +
            "\nsense right home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn right" +
            "\njump 0" +
            "\n}";
        String brain2 = "brain \"stan11dby\" {" +
            "\nsense left home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn right" +
            "\njump 0" +
            "\n}";


        WorldInfo welt19 = gameInfo.simulate(2, 1, map, brain1, brain1);
        WorldInfo welt29 = gameInfo.simulate(2, 1, map, brain2, brain2);
        WorldInfo welt39 = gameInfo.simulate(2, 1, map, brain3, brain3);
        WorldInfo welt49 = gameInfo.simulate(2, 1, map, brain4, brain4);

        if (!"northeast".equals(welt19.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 1");
        }
        if (!"west".equals(welt29.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 1");
        }
        if (!"northeast".equals(welt39.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 1");
        }
        if (!"west".equals(welt49.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 1");
        }
    }
}
