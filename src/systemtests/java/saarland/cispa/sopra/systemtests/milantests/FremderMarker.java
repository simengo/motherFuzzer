package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FremderMarker extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 = "brain \"stan11dby\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nsense ahead marker 1 else 1" +
            "\nturn left" +
            "\nset 1" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\njump 1" +
            "\njump 0" +
            "\n}";

        String map = InitTests.markMap();

        WorldInfo welt = gameInfo.simulate(4, 2, map, brain1, brain2);

        if (!"southeast".equals(welt.getFieldAt(2, 3).getAnt().get().getDirection())) {
            fail("Feindlicher Marker erkannt");
        }

    }
}
