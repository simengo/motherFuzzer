package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class Attack5 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "A1..\n" +
            "2...\n" +
            "B...\n" +
            "....";

        String brainA = "brain \"sample\" {\n turn right \n turn right \n move else 3 \n pickup else 4 \n move else 5 \n turn right \n turn right \n move else 8 \n drop else 9 \n move else 10 \n jump 10\n}";
        String brainB = "brain \"sample\" {\n turn right \n move else 2 \n pickup else 3 \n turn right \n move else 5 \n drop else 6 \n move else 7 \n jump 7 \n}";


        WorldInfo winfo = gameInfo.simulate(100,345,map,brainA,brainB);
        int food = winfo.getFieldAt(1,0).getFood(); //0
        int food1 = winfo.getFieldAt(0,1).getFood(); //1
        int food2 = winfo.getFieldAt(1,1).getFood(); //2

        if(food != 0){
            fail(String.format("Expected 0 food on field (1,0), but is: %d",food));
        }



        if(food1 != 1){
            fail(String.format("Expected 1 food on field (0,1), but is: %d",food1));
        }


        if(food2 != 2){
            fail(String.format("Expected 2 food on field (1,1), but is: %d (two drops on free field)",food2));
        }



    }






}

