package saarland.cispa.sopra.systemtests.dennistests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;

import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;



public class GradTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" + ".A\n" + ".B";

      String brain = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\njump 7\n}";

        WorldInfo world = gameInfo.simulate(10, 42, map, brain, brain);
        if(!("northeast".equals(world.getAnt(0).getDirection()))){fail("Wrong direction");}

    }
}
