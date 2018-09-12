package saarland.cispa.sopra.systemtests.simontests.movetests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SuccessfulMoveTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //erfolgreicher move
        String map =
                "6\n6\n" +
                "######\n" +
                "...A..\n" +
                "......\n" +
                "......\n" +
                "..BB..\n" +
                "######";
        String brain = "brain \"sample\" {\nturn left\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(3, 42, map, brain, brain);
        AntInfo ant = world.getAnt(0);
        if (ant.getField().getX() != 2) {
            fail(String.format("Expected x to be 2 but was %d", ant.getField().getX()));
        }
        if (ant.getField().getY() != 1) {
            fail(String.format("Expected y to be 1 but was %d", ant.getField().getY()));
        }
    }
}
