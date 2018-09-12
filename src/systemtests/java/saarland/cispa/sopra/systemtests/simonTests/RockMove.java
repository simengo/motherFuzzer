package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class RockMove extends MapTest {
    @Override
    public void test(GameInfo gameInfo) {
        //gegen Felsen laufen
        String map =
            "6\n6\n" +
            "######\n" +
            "...A..\n" +
            "......\n" +
            "......\n" +
            "..BB..\n" +
            "######";
        String brain0 = "brain \"sample\"{\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain0, brain0);
        AntInfo ant0 = world.getAnt(0);
        if (ant0.getField().getX() != 3) {
            fail(String.format("Expected x to be 2 but was %d", ant0.getField().getX()));
        }
        if (ant0.getField().getY() != 1) {
            fail(String.format("Expected y to be 1 but was %d", ant0.getField().getY()));
        }


    }
}
