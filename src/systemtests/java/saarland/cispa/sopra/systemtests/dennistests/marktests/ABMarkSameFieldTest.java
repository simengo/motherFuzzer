package saarland.cispa.sopra.systemtests.dennistests.marktests;

import saarland.cispa.sopra.systemtests.GameInfo;

import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;



public class ABMarkSameFieldTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ".A\n" + ".B";
        String brain = "brain \"sample\" {\nmark 0\njump 1\n}";
        String brain2 = "brain \"sample1\" {\njump 0\n}";





        WorldInfo world = gameInfo.simulate(6, 42, map, brain,brain2);
        if(world.getFieldAt(1,0).getMarkers().get('B') [0]){fail("Mark marked for the wrong swarm");}

    }
}
