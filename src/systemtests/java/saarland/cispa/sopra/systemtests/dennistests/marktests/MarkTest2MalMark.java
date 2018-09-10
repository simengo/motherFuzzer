package saarland.cispa.sopra.systemtests.dennistests.marktests;

import saarland.cispa.sopra.systemtests.GameInfo;

import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class MarkTest2MalMark extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ".A\n" + "B.";
        String brain = "brain \"sample\" {\nmark 0\nmark 0\njump 0\n}";
        String brain2 = "brain \"sample\" {\nmark 6\nunmark 6\nunmark 6\n jump 0\n}";



        WorldInfo world = gameInfo.simulate(3, 42, map, brain,brain2);
        if(!(world.getFieldAt(1,0).getMarkers().get('A')) [0]){fail("Field 1,0 is not marked");}
        if(world.getFieldAt(0,1).getMarkers().get('B') [6]){fail("Field 0,1 is marked");}

    }
}
