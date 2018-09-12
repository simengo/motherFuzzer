package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MultipleMarkers2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nmark 2" +
            "\nmark 3" +
            "\nmark 4" +
            "\nmark 5" +
            "\nmark 6" +
            "\nmark 0" +
            "\nsense left marker 0 else 0" +
            "\nset 0" +
            "\nsense left marker 1 else 0" +
            "\nset 1" +
            "\nsense left marker 2 else 0" +
            "\nset 2" +
            "\nsense left marker 3 else 0" +
            "\nset 3" +
            "\nsense left marker 4 else 0" +
            "\nset 4" +
            "\nsense left marker 5 else 0" +
            "\nset 5" +
            "\nsense left marker 6 else 0" +
            "\nturn left" +
            "\njump 0" +
            "\n}";

        String map = InitTests.markMap();

        WorldInfo welt = gameInfo.simulate(30, 2, map, brain, brain);

        for (int i = 0; i < 6; i++) {
            if (!welt.getAnt(2).getRegister()[i]) {
                fail("Register auf false/Marker nicht erkannt");
            }
        }

        if (!"west".equals(welt.getAnt(2).getDirection())) {
            fail("Nicht alle Marker erkannt (Hat sich nicht gedreht)");
        }

    }
}
