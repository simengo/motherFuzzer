package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class WrongMarkDetected extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nmove else 1" +
            "\nturn left" +
            "\nturn left" +
            "\nturn left" +
            "\nsense ahead marker 1 else 0" +
            "\nturn left" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nturn left" +
            "\nmove else 0" +
            "\nunmark 1" +
            "\njump 0" +
            "\n}";

        String map = InitTests.miniMarker();

        WorldInfo welt = gameInfo.simulate(21, 1, map, brain1, brain2);

        if (!"east".equals(welt.getAnt(0).getDirection())) {
            fail("Gegner hat Marke entfernt");
        }

    }
}
