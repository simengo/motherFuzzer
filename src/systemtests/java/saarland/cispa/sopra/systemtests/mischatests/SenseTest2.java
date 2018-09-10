package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTest2 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "A5..\n" +
            "#...\n" +
            "C...\n" +
            "B#..";

        String brainA = "brain \"sample\" {\n sense here home else 14 \n sense here foehome else 3 \n jump 14 \n sense here food else 5 \n jump 14 \n sense here foe else 7\n jump 14 \n sense here rock else 9 \n jump 14 \n sense here marker 4 else 11\n jump 14 \n sense here friend else 14 \n turn right \n turn right \n jump 14\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n sense right food else 5  \n turn right \n turn right \n jump 5\n}";
        String brainC = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(14,5,map,brainA,brainB, brainC);

        String dir = winfo.getAnt(0).getDirection();
        String dir1 = winfo.getAnt(2).getDirection();

        if(!"east".equals(dir)){
            fail("Wrong Senses1!");
        }


        if(!"southwest".equals(dir1)){
            fail("Wrong Senses!");
        }






    }

}

