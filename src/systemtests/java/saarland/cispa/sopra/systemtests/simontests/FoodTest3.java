package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        ".A..\n"+
                        "1...\n"+
                        "..B.\n"+
                        "....";
        String brain =  "brain \"sample\" {\nturn left\nturn left\nmove else 0\npickup else 0\nturn right\nturn right\nturn right\nmove else 0\ndrop else 0\njump 0\n}";
        String brain0 = "brain \"sample\" {\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(37,42,map,brain,brain0);
        if(world.getAnt(0).hasFood()){
            fail("ant didn't drop food");
        }
        if(world.getScore('A') != 1){
            fail(String.format("score should be 1 but is %d",world.getScore('A')));
        }
        if(world.getFieldAt(1,0).getFood() != 0){
            fail("there can not be food on base");
        }
    }
}
