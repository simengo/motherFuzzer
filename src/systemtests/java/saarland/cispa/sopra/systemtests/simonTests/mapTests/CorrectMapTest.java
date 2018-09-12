package saarland.cispa.sopra.systemtests.simontests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class CorrectMapTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String brain = "brain \"sample\" {\njump 0\n}";

        //correct map
        String map = "50\n10\n" +
            "A#1...............................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            "..................................................\n" +
            ".................................................B";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        if (world.getHeight() != 10 || world.getWidth() != 50) {
            fail(String.format("Either height or width is not 50! height is %d and width is %d",world.getHeight(),world.getWidth()));
        }
        if (world.getFieldAt(0, 0).getType() != 'A') {
            fail("at(0,0) is base A");
        }
        if (world.getFieldAt(1, 0).getType() != '#') {
            fail("at (1,0) is a rock #");
        }
        if (world.getFieldAt(2, 0).getFood() != 1) {
            fail("at (2,0) is 1 food");

        }
    }
}
