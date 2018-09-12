package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveNW extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String karteWEST = InitTests.moveMapWEST();
        String ameiseNW = "brain \"Nor1dwest\" {" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo worldNW = gameInfo.simulate(1, 42, karteWEST, ameiseNW, ameiseNW);
        if (!(worldNW.getFieldAt(9, 9).getAnt().isPresent() && worldNW.getAnts().size() == 2)) {
            fail("Move wird falsch ausgefuehrt");
        }
    }
}
