package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class SenseFriendTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {


        String map = "2\n2\n" + "BA\n" + ".A";
        String mapFoe = "2\n2\n" + ".A\n" + "BA";
        String brain = "brain \"sample\" {\nsense ahead friend else 2\njump 1\njump 2\n}";

        WorldInfo world =  gameInfo.simulate(1, 42, map, brain,brain);
        WorldInfo worldFoe =  gameInfo.simulate(1, 42, mapFoe, brain,brain);

        if(world.getAnt(0).getPc() != 2){fail("Sense Ant 0 friend did not work correctly");}
        if(world.getAnt(2).getPc() != 1){fail("Sense Ant 1 friend did not work correctly");}
        if(worldFoe.getAnt(0).getPc() != 2){fail("Ant 1 sensed Foe as Friend");}



    }
}
