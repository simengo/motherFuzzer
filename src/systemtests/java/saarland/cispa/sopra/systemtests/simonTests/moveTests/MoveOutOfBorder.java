package saarland.cispa.sopra.systemtests.simontests.movetests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveOutOfBorder extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //move über Grenzen hinaus
        String map1 =
                "4\n4\n" +
                "A...\n" +
                "....\n"+
                "B...\n"+
                "....";
        String brain0 = "brain \"sample\" {\njump 0\n}";
        String brain1 = "brain \"sample\" {\nmove else 0\njump 0\n}";

        WorldInfo world1 = gameInfo.simulate(3, 42, map1, brain1,brain0);
        AntInfo ant = world1.getAnt(0);
        if (ant.getField().getX() != 3 || ant.getField().getY() != 3) {
            fail(String.format("Expected x to be 3 not %d and y to be 3 not %d", ant.getField().getX(), ant.getField().getY()));
        }

    }
}
