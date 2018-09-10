package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest3 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "...1\n" +
            "...B";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n pickup  else 1 \n drop else 2 \n jump 2\n}";

        WorldInfo winfo = gameInfo.simulate(1,4,map,brainA,brainB);


        if(winfo.getAnt(1).hasFood()){
            fail("Ant1 shouldnt pick up the food");
        }

        WorldInfo winfo2 = gameInfo.simulate(2,4,map,brainA,brainB);

        if (winfo2.getFieldAt(3,3).getFood() != 0){
            fail("There shouldnt be Food on Field (3,3) !");
        }








    }



}
