package saarland.cispa.sopra.systemtests.simontests.randomtests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class PCTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\nturn left\njump 7\nturn left\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        if(world.getAnt(0).getPc() != 1){
            fail("after 1 round pc is expected to be 1");
        }
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if(world.getAnt(0).getPc() != 2){
            fail("PC is 2");
        }

        world = gameInfo.simulate(3, 42, map, brain, brain);
        if(world.getAnt(0).getPc() != 7){
            fail("jumped to 7");
        }

    }
    }

