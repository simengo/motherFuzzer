package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveNE extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String karteOST = InitTests.moveMapEAST();
        String ameiseNE = "brain \"Nor1dost\" {" +
            "\nturn right" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo worldNE = gameInfo.simulate(3, 42, karteOST, ameiseNE, ameiseNE);

        if (!(worldNE.getFieldAt(9, 9).getAnt().isPresent() && worldNE.getAnts().size() == 2)) {
            fail("Move wird falsch ausgefuehrt");
        }


    }
}
