package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest7 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        "A...\n"+
                        "1...\n"+
                        "B...\n"+
                        "....";
        String brain = "brain \"sample\" {\npickup else 1\ndrop else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(3,42,map,brain,brain);
        if(world.getScore('A') != 0){
            fail("dropped food on usual field so score is still 0");
        }
    }
}
