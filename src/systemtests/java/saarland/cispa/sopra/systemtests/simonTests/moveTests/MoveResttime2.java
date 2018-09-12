package saarland.cispa.sopra.systemtests.simontests.movetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveResttime2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
            "4\n4\n"+
                "....\n" +
                "....\n" +
                "...A\n" +
                "...B";
        String brain = "brain \"sample\"{\nmove else 0\nmove else 0\njump 0\n}";
        String brain0 ="brain \"sample\"{\njump 0\n}";

        WorldInfo world = gameInfo.simulate(13,42,map,brain,brain0);
        if(world.getAnt(0).getField().getX() != 2 || world.getAnt(0).getField().getY() !=1){
            fail(String.format("Expected x to be 2 not %d and y to be 1 not %d",world.getAnt(0).getField().getX(),world.getAnt(0).getField().getY()));
        }

    }
}
