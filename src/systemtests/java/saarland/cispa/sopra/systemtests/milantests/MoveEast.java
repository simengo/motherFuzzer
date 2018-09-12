package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveEast extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String karteOST = InitTests.moveMapEAST();
        String ameiseEast = "brain \"Eas1t\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo worldEast = gameInfo.simulate(5, 42, karteOST, ameiseEast, ameiseEast);
        if (!(worldEast.getFieldAt(0, 0).getAnt().isPresent() && worldEast.getAnts().size() == 2)) {
            fail("Move wird falsch ausgefuehrt");
        }
    }
}





