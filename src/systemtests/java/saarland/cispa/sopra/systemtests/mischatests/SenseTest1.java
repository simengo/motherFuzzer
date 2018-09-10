package saarland.cispa.sopra.systemtests.mischatests;

// foehome home friend rock

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTest1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "A#..\n" +
            "..BC\n" +
            "...C\n" +
            "....";

        String brainA = "brain \"sample\" {\n turn right \n sense right rock else 5 \n turn right \n sense here home else 5 \n turn right \n jump 5\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n sense ahead foehome else 4 \n turn right \n jump 4\n}";
        String brainC = "brain \"sample\" {\n turn left \n turn left \n sense ahead friend else 4 \n turn left \n jump 4\n}";

        // A southeast
        // B southeast
        // C southeast
        // C2 southwest

        WorldInfo winfo = gameInfo.simulate(5,13,map,brainA,brainB,brainC);

        String dir0 = winfo.getAnt(0).getDirection();
        String dir1 = winfo.getAnt(1).getDirection();
        String dir2 = winfo.getAnt(2).getDirection();
        String dir3 = winfo.getAnt(3).getDirection();


        if(!("southeast".equals(dir0))){
            fail("Wrong Sense!");
        }

        if(!("southeast".equals(dir1))){
            fail("Wrong sense foehome!");
        }

        if(!("southeast".equals(dir2))){
            fail("Wrong sense friend!");
        }

        if(!("southwest".equals(dir3))){
            fail("Wrong sense friend!");
        }






    }





}
