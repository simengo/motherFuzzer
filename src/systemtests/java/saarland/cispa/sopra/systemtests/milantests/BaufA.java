package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class BaufA extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.baufA();
        String brain = "brain \"stan11dby\" {" +
            "\nturn right" +
            "\nset 1" +
            "\nmove else 1" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nmove else 1" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(4, 1, map, brain, brain2);

        if (welt.getScore('A') != 3) {
            fail("Punkte nicht bekommen");
        }
    }
}
