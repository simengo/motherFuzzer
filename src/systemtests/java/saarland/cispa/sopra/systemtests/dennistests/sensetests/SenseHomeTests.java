package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class SenseHomeTests extends OberklasseTests {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" + "BA\n" + ".A";
        String brain = "brain \"sample\" {\nsense ahead home else 2\njump 1\njump 2\n}";

        WorldInfo world =  gameInfo.simulate(1, 42, map, brain,brain);

        if(world.getAnt(2).getPc() != 1) {fail("sense home Ant 2 did not sense home");}
        if(world.getAnt(1).getPc() != 2) {fail("sense home Ant 1 sensed home but should not have");}
        if(world.getAnt(0).getPc() != 2) {fail("sense home Ant 1 sensed home but should not have");}

    }
}
