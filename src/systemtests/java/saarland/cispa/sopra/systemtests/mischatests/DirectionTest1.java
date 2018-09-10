package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest1 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "....\n" +
            ".A..\n" +
            "....\n" +
            ".B..";

        String brainA = "brain \"sample\" {\n turn left \n turn right \n turn right \n turn right \n turn right \n turn right \n turn right \n turn right \n jump 8\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";

        WorldInfo winfo = gameInfo.simulate(0,2,map,brainA,brainB);
        WorldInfo winfo1 = gameInfo.simulate(1,2,map,brainA,brainB);
        WorldInfo winfo2 = gameInfo.simulate(2,2,map,brainA,brainB);
        WorldInfo winfo3 = gameInfo.simulate(3,2,map,brainA,brainB);
        WorldInfo winfo4 = gameInfo.simulate(4,2,map,brainA,brainB);
        WorldInfo winfo5 = gameInfo.simulate(5,2,map,brainA,brainB);
        WorldInfo winfo6 = gameInfo.simulate(6,2,map,brainA,brainB);
        WorldInfo winfo7 = gameInfo.simulate(7,2,map,brainA,brainB);
        WorldInfo winfo8 = gameInfo.simulate(8,2,map,brainA,brainB);

        String dir = winfo.getAnt(0).getDirection();
        String dir1 = winfo1.getAnt(0).getDirection();
        String dir2 = winfo2.getAnt(0).getDirection();
        String dir3 = winfo3.getAnt(0).getDirection();
        String dir4 = winfo4.getAnt(0).getDirection();
        String dir5 = winfo5.getAnt(0).getDirection();
        String dir6 = winfo6.getAnt(0).getDirection();
        String dir7 = winfo7.getAnt(0).getDirection();
        String dir8 = winfo8.getAnt(0).getDirection();

        if (!"northwest".equals(dir)){
            fail("Wrong dir0!");
        }


        if (!"west".equals(dir1)){
            fail("Wrong dir1!");
        }


        if (!"northwest".equals(dir2)){
            fail("Wrong dir2!");
        }


        if (!"northeast".equals(dir3)){
            fail("Wrong dir3!");
        }


        if (!"east".equals(dir4)){
            fail("Wrong dir4!");
        }


        if (!"southeast".equals(dir5)){
            fail("Wrong dir5!");
        }


        if (!"southwest".equals(dir6)){
            fail("Wrong dir6!");
        }


        if (!"west".equals(dir7)){
            fail("Wrong dir7!");
        }



        if (!"northwest".equals(dir8)){
            fail("Wrong dir8!");
        }



    }


}
