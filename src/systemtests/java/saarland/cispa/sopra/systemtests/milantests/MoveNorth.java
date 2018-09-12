package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveNorth extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String karteOST = InitTests.moveMapEAST();
        String ameiseNorth = "brain \"No1rth\" {" +
            "\nturn right" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo worldNorth = gameInfo.simulate(3, 42, karteOST, ameiseNorth, ameiseNorth);

        if (!worldNorth.getFieldAt(9, 9).getAnt().isPresent() && worldNorth.getAnts().size() == 2) {
            fail("Move wird falsch ausgefuehrt");
        }

    }
}
