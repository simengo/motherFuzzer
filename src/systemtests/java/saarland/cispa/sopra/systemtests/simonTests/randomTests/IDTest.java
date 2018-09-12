package saarland.cispa.sopra.systemtests.simontests.randomtests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class IDTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "....\n" +
            ".AA.\n" +
            "....\n" +
            ".BB.";
        String brain = "brain \"sample\" {\nturn left\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);
        if(world.getAnt(0).getField().getX() != 0 || world.getAnt(0).getField().getY() != 1){
            fail("ant0 didnt move");
        }
        if(world.getAnt(1).getField().getX() != 1 || world.getAnt(1).getField().getY() != 1){
            fail("ant1 didnt move");
        }
    }
    }

