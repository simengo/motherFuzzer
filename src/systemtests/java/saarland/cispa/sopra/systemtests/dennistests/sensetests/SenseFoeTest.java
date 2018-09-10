package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseFoeTest extends OberklasseTests {

    @Override
    protected void test(GameInfo gameInfo) {


        String map = "4\n4\n" + "....\n" + "..C.\n" + ".BA.\n" + "...." ;

        String brain = "brain \"sample\" {\nsense left foe else 2\njump 1\njump 2\n}";
        String brain1 = "brain \"sample\" {\nsense right foe else 2\njump 1\njump 2\n}";


        WorldInfo world1 =  gameInfo.simulate(1, 42, map, brain,brain1,brain);
        WorldInfo world2 =  gameInfo.simulate(1, 42, map, brain1,brain,brain1);

        if(world1.getAnt(2).getPc() != 1){fail("Sense Ant 2 foe did not find foe");}
        if(world2.getAnt(2).getPc() != 1){fail("Sense Ant 2 foe did not find foe");}
        if(world1.getAnt(1).getPc() != 2){fail("Sense Ant 1 foe found foe but should not");}
        if(world2.getAnt(1).getPc() != 2){fail("Sense Ant 1 foe found foe but should not");}
    }
}

