package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveSouth extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String karteOST = InitTests.moveMapEAST();
        String ameiseSouth = "brain \"So1uth\" {" +

            "\nturn left" +
            "\nturn left" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";

        WorldInfo worldSouth = gameInfo.simulate(4, 42, karteOST, ameiseSouth, ameiseSouth);

        if (!worldSouth.getFieldAt(6, 0).getAnt().isPresent() || worldSouth.getAnts().size() != 2) {
            fail("Move wird falsch ausgefuehrt");
        }

    }
}
