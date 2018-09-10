package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "...2\n" +
            "...B";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 4 \n pickup else 4 \n pickup else 4 \n move else 4 \n jump 4\n}";

        WorldInfo winfo = gameInfo.simulate(18,4,map,brainA,brainB);
        int food = winfo.getFieldAt(3,2).getFood();
        if (food != 1){
            fail("Ant picked up 2 food from Field!");
        }






    }





}
