package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class TooMuchFoodTests extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
    String map = "4\n4\n" +
        ".AA.\n" +
        "A7A.\n" +
        ".AB.\n" +
        "....";

    String brainSimple = "brain \"sample\" {\nturn right\njump 1\n}";
    String brainStirbt = "brain \"sample\" {\nmove else 1\njump 1\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brainSimple, brainStirbt);
if(world.getFieldAt(1,1).getFood() != 10){fail("Wrong number of food on field 1,1");}



    }
}
