package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest6 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        ".A..\n"+
                        "2...\n"+
                        "B...\n"+
                        "....";
        String brain = "brain \"sample\" {\ndrop else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(2,42,map,brain,brain);
        if(world.getFieldAt(1,0).getFood() != 0 || world.getScore('A') != 0 || world.getAnt(0).hasFood()){
            fail("cant drop without having food");
        }
    }
}
