package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveWest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String karteWEST = InitTests.moveMapWEST();
        String ameiseWest = "brain \"West\" {" +
            "\nturn left" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo worldWest = gameInfo.simulate(3, 42, karteWEST, ameiseWest, ameiseWest);
        if (!(worldWest.getFieldAt(9, 0).getAnt().isPresent() && worldWest.getAnts().size() == 2)) {
            fail("Move wird falsch ausgefuehrt");
        }
    }
}
