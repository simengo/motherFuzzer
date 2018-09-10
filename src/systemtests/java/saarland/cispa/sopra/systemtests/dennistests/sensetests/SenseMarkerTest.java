package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class SenseMarkerTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            ".A\n" +
            "BC";


        String brain1 = "brain \"sample\" {\nmark 0\nsense here marker 0 else 3\njump 2\njump 3\n}";
        String brain2 = "brain \"sample\" {\nsense here marker 0 else 2\njump 1\njump 2\n}";
        String brain3 = "brain \"sample\" {\nsense ahead marker 0 else 2\njump 1\njump 2\n}";

        WorldInfo world = gameInfo.simulate(4, 42, map, brain1,brain2,brain3);

        if(world.getAnt(0).getPc() != 2){fail("Ant 0 did not sense marker 0");}

        if(world.getAnt(1).getPc() != 2){fail("Ant 1 did sense marker 0 but should not have");}

        if(world.getAnt(2).getPc() != 2){fail("Ant 1 did sense marker 0 but should not have");}

    }
}
