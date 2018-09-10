package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseFoeHomeTests extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {


        String map = "2\n2\n" + ".A\n" + ".B";
        String brain = "brain \"sample\" {\nsense ahead foehome else 2\njump 1\njump 2\n}";

        WorldInfo world =  gameInfo.simulate(1, 42, map, brain,brain);

        if(world.getAnt(1).getPc() != 1){fail("Sense Ant 1 foehome did not find foehome");}
        if(world.getAnt(0).getPc() != 2){fail("Sense Ant 2 foehome found foehome but should not");}


        String map1 = "2\n2\n" + "AB\n" + ".B";
        String brain1 = "brain \"sample\" {\nsense ahead foehome else 2\njump 1\njump 2\n}";

        WorldInfo world1 =  gameInfo.simulate(1, 42, map1, brain1,brain1);

        if(world1.getAnt(0).getPc() != 1){fail("Sense Ant 0 foehome did not find foehome");}
        if(world1.getAnt(1).getPc() != 2){fail("Sense Ant 1 foehome found foehome but should not");}
        if(world1.getAnt(2).getPc() != 2){fail("Sense Ant 2 foehome found foehome but should not");}

    }
}
