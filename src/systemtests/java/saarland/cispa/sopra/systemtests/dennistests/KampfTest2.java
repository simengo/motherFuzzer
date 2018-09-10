package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KampfTest2 extends OberklasseTests {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "AB\n" +
            "BB";

        String brainA = "brain \"sample\" {\nmove else 1\njump 1\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brainA, brainA);
        if(world.getScore('A') != 3){fail("Ant did not die");}

    }
}
