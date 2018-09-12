package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MultipleMarkers extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.markMap();

        String brain = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nmark 2" +
            "\nmark 3" +
            "\nsense left marker 1 else 1" +
            "\nturn left" +
            "\nsense ahead marker 2 else 1" +
            "\nturn left" +
            "\nsense right marker 3 else 1" +
            "\nturn left" +
            "\nset 1" +
            "\nset 2" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(10, 1, map, brain, brain);
        if (!"southeast".equals(welt.getFieldAt(2, 3).getAnt().get().getDirection())) {

            fail("Mehrere Marker nicht erkannt");
        }
    }
}
