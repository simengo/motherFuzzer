package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class DropOutOfBase extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.miniMarkerFood();
        String brain = "brain \"stan11dby\" {" +
            "\nmove else 0" +
            "\npickup else 5" +
            "\ndrop else 5" +
            "\njump 0" +
            "\n}";

        WorldInfo infos = gameInfo.simulate(16, 2, map, brain, brain);

        if (infos.getScore('A') != 0 || infos.getScore('B') != 0) {
            fail("Falscher Score");
        }
    }
}
