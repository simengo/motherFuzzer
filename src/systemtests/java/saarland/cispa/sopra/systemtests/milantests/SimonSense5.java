package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense5 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map5 = InitTests.sense1();
        String brain8 = "brain \"stan11dby\" {" +
            "\nsense right foe else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";


        String brain9 = "brain \"stan11dby\" {" +
            "\nsense left foe else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain10 = "brain \"stan11dby\" {" +
            "\nsense ahead foe else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\njump 0" +
            "\n}";


        String brain11 = "brain \"stan11dby\" {" +
            "\nsense here foe else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        WorldInfo welt80 = gameInfo.simulate(2, 1, map5, brain8, brain8);
        WorldInfo welt90 = gameInfo.simulate(2, 1, map5, brain9, brain9);
        WorldInfo welt100 = gameInfo.simulate(2, 1, map5, brain10, brain10);
        WorldInfo welt110 = gameInfo.simulate(2, 1, map5, brain11, brain11);

        if (!"west".equals(welt80.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung1");
        }
        if (!"west".equals(welt90.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung2");
        }
        if (!"northeast".equals(welt100.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung3");
        }
        if (!"northeast".equals(welt110.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung4");
        }

    }
}
