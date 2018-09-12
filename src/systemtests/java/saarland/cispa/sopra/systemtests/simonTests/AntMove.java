package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class AntMove extends MapTest {
    @Override
    public void test(GameInfo gameInfo) {
        //gegen Ameise laufen
        String map = createSimpleMap();
        String brain = "brain \"sample\"{\nturn right\nturn right\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(3, 42, map, brain, brain);
        AntInfo ant = world.getAnt(0);
        if (ant.getField().getX() != 2) {
            fail(String.format("Expected x to be 2 but was indeed %d", ant.getField().getX()));
        }
        if (ant.getField().getY() != 1) {
            fail(String.format("Expected y to be 1 but was %d", ant.getField().getY()));
        }

    }
}
