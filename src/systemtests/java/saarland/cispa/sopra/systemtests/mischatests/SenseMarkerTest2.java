package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseMarkerTest2 extends BaseTest {



    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            "..A.\n" +
            ".B..";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n sense ahead marker 0 else 4 \n jump 10 \n sense ahead marker 1 else 6 \n jump 10\n turn right \n turn right \n sense left foe else 10 \n turn right \n jump 10\n}";
        String brainB = "brain \"sample\" {\n mark 0 \n mark 6 \n mark 1 \n move else 4 \n turn right \n turn right \n sense right marker 6 else 8\n turn right \n jump 8\n}";


        WorldInfo winfo = gameInfo.simulate(30,36,map, brainA,brainB);
        String dir = winfo.getAnt(0).getDirection();
        String dir1 = winfo.getAnt(1).getDirection();

        if (!"northeast".equals(dir)){
            fail("Wrong marks read! (Ant0)");
        }


        if (!"southeast".equals(dir1)){
            fail("Wrong marks read! (Ant1)");
        }


    }

}
