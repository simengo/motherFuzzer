package saarland.cispa.sopra.systemtests.dennistests.marktests;

import saarland.cispa.sopra.systemtests.GameInfo;

import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class MarkTestGegner extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ".A\n" + ".B";
        String brain = "brain \"sample\" {\nmark 0\njump 1\n}";
        String brain2 = "brain \"sample1\" {\njump 1\nsense ahead marker 0 else 3\njump 2\n jump 3\n}";



        WorldInfo world = gameInfo.simulate(6, 42, map, brain,brain2);
        if(world.getAnt(1).getPc() != 3){fail("Should not sense");}

    }
}
