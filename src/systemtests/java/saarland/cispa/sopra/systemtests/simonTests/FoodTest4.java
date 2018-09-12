package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest4 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        ".A..\n"+
                        "19..\n"+
                        "B...\n"+
                        "....";
        String brain = "brain \"sample\" {\nturn left\nturn left\nmove else 1\npickup else 0\nturn left\nturn left\nmove else 0\ndrop else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(36,42,map,brain,brain);
        if(world.getAnt(0).hasFood()){
            fail("ant didnt drop food");
        }
        if(world.getFieldAt(1,1).getFood() != 10){
            fail(String.format("should be 10 food but it is %d",world.getFieldAt(1,1).getFood()));
        }
    }
}
