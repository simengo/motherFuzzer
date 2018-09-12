package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense6 extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map100 = InitTests.sense6();

        String brain100 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nsense left marker 1 else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain101 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nsense ahead marker 1 else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain102 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nsense right marker 1 else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain103 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nsense here marker 1 else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain87 = "brain \"stan11dby\" {" +
            "\nturn left" +
            "\nsense here marker 1 else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        WorldInfo welt100 = gameInfo.simulate(3, 1, map100, brain100, brain87);
        WorldInfo welt101 = gameInfo.simulate(3, 1, map100, brain101, brain87);
        WorldInfo welt102 = gameInfo.simulate(3, 1, map100, brain102, brain87);
        WorldInfo welt103 = gameInfo.simulate(3, 1, map100, brain103, brain87);

        if (!"west".equals(welt100.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 1");
        }
        if (!"west".equals(welt101.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 2");
        }
        if (!"west".equals(welt102.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 3");
        }
        if (!"west".equals(welt103.getFieldAt(0, 0).getAnt().get().getDirection())) {
            fail("Falsche Richtung 4");
        }
    }
}
