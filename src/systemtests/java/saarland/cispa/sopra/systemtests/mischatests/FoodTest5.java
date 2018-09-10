package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest5 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "...2\n" +
            "...B";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 1 \n pickup else 2 \n pickup else 3\n move else 4 \n drop else 5 \n drop else 6 \n move else 7\n jump 7\n}";

        WorldInfo winfo = gameInfo.simulate(50, 4, map, brainA, brainB);

        int food = winfo.getFieldAt(2,1).getFood();
        int food2 = winfo.getFieldAt(3,2).getFood();

        if (food != 1){
            fail(String.format("Expected 1 food on field (2,1), but is: %d (double drop)",food));
        }

        if (food2 != 1){
            fail(String.format("Expected 1 food on field (3,2), but is: %d (double pickup)",food2));
        }



    }







}
