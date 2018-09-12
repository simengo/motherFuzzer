package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        ".A..\n"+
                        "1...\n"+
                        "B...\n"+
                        "....";
        String brain = "brain \"sample\" {\nturn left\nturn left\nmove else 0\npickup else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(18,42,map,brain,brain);
        if(!(world.getAnt(0).hasFood())){
            fail("ant didnt pickup food");
        }
        if(world.getFieldAt(0,1).getFood() != 0){
            fail(String.format("food should be zero but is %d",world.getFieldAt(0,1).getFood()));
        }
    }
}
