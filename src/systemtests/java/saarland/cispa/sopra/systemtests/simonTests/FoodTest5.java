package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest5 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                        "4\n4\n"+
                        "#A##\n"+
                        "2###\n"+
                        "##B#\n"+
                        "####";
        String brain = "brain \"sample\" {\nturn left\nturn left\nmove else 1\npickup else 0\npickup else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(20,42,map,brain,brain);
        if(!(world.getAnt(0).hasFood()) || world.getFieldAt(0,1).getFood() != 1){
            fail("ant cant pick up 2 food");
        }
    }
}
