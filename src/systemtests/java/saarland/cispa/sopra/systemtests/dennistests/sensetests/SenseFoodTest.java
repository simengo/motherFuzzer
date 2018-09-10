package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseFoodTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {


        String map = "2\n2\n" + "BA\n" + "1A";
        String brain = "brain \"sample\" {\nsense ahead food else 2\njump 1\njump 2\n}";

        WorldInfo world =  gameInfo.simulate(1, 42, map, brain,brain);

        if(world.getAnt(1).getPc() != 1){fail("Sense Ant 1 food did not work correctly");}
        if(world.getAnt(2).getPc() != 2){fail("Sense Ant 2 food did not work correctly");}




    }
}
