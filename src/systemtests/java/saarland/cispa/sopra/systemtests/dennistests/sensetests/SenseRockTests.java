package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseRockTests extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" + "BA\n" + "#A";
        String brain = "brain \"sample\" {\nsense ahead rock else 2\njump 1\njump 2\n}";

        WorldInfo world =  gameInfo.simulate(1, 42, map, brain,brain);

        if(world.getAnt(1).getPc() != 1){fail("Sense Ant 1 rock did not work correctly");}
        if(world.getAnt(2).getPc() != 2){fail("Sense Ant 2 rock did not work correctly");}


    }
}
