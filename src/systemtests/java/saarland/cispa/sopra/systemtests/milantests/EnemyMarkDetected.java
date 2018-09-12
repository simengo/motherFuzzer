package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class EnemyMarkDetected extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 = "brain \"stan11dby\" {" +
            "\nmark 1" +
            "\nturn left" +
            "\nturn left" +
            "\nmove else 1" +
            "\nturn right" +
            "\nturn right" +
            "\nturn right" +
            "\nsense ahead marker 1 else 2" +
            "\nturn left" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nsense left marker 1 else 4" +
            "\nturn left" +
            "\nturn left" +
            "\nmove else 1" +
            "\nturn right" +
            "\nturn right" +
            "\nturn right" +
            "\nsense ahead marker 1 else 2" +
            "\nturn left" +
            "\njump 0" +
            "\n}";

        String map = InitTests.miniMarker();

        WorldInfo infos = gameInfo.simulate(2, 2, map, brain1, brain2);

        if (!"northeast".equals(infos.getAnt(1).getDirection())) {
            fail("Gegnerische Marke erkannt");
        }

    }
}
