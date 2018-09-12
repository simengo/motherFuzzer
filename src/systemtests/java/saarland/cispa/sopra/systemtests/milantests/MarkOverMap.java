package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MarkOverMap extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.markMap();

        String brain = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nturn left" +
            "\nturn left" +
            "\nsense ahead marker 1 else 5" +
            "\nturn left" +
            "\nset 2" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(5, 2, map, brain, brain);

        if (!"southeast".equals(welt.getFieldAt(2, 3).getAnt().get().getDirection())) {

            fail("Eigner Marker wurde nicht erkannt");
        }
    }

}
