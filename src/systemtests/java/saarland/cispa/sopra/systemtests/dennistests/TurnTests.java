package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class TurnTests extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map =
            "4\n4\n" +
                "...A\n" +
                "..B.\n" +
                "....\n" +
                "....";

        String brain1 = "brain \"sample1\" {\nturn right\njump 1\n}";
        String brain2 = "brain \"sample2\" {\nturn left\njump 1\n}";


        WorldInfo world = gameInfo.simulate(1, 42, map, brain1, brain2);

        if(!("northeast".equals(world.getAnt(0).getDirection()))){fail("ant did not turn right");}
        if(!("west".equals(world.getAnt(1).getDirection()))){fail("ant did not turn left");}
        if(world.getAnt(0).getPc() !=1) {fail("Pc was incremented wrong");}

        if(world.getAnt(0).getField().getX() != 3 || world.getAnt(0).getField().getY() != 0){
            fail("Ant moved to the wrong place");}

        if(world.getAnt(1).getField().getX() != 2 || world.getAnt(1).getField().getY() != 1){
            fail("Ant moved to the wrong place");}
    }
}
