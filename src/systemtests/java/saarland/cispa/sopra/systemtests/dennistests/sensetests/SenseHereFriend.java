package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseHereFriend extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + "BA\n" + ".A";
        String brain1 = "brain \"sample\" {\nsense here friend else 2\njump 1\njump 2\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brain1,brain1);

        if(world.getAnt(0).getPc() != 1){fail("Ant did not sense itself as Friend");}
    }
}
