package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest1 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".1..\n" +
            ".A9.\n" +
            "...B\n" +
            "....";

        String brainA = "brain \"sample\" {\n move else 3 \n pickup else 3 \n move else 3\n jump 3\n}";
        String brainB = "brain \"sample\" {\n move else 3\n pickup else 3 \n move else 3 \n jump 3\n}";

        WorldInfo winfo = gameInfo.simulate(30,4,map,brainA,brainB);
        int food0 = winfo.getFieldAt(1,0).getFood();
        int food1 = winfo.getFieldAt(2,1).getFood();

        if (food0 != 0){
            fail(String.format("Food on field (1,0) should be 0 but is: %d",food0));
        }

        if (food1 != 8){
            fail(String.format("Food on field (1,0) should be 8 but is: %d",food1));
        }

        testFieldType(winfo,2,0,'.');
        testFieldType(winfo,1,0,'.');






    }



}
