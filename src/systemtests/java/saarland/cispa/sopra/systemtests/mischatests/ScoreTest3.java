package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class ScoreTest3 extends BaseTest {





    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "BBB.\n" +
            "BAB.\n" +
            "BBB.\n" +
            "....";

        String brainA = "brain \"sample\" {\n move else 1  \n jump 1\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1,1248,map,brainA,brainB);
        int scA = winfo.getScore('A');
        int scB = winfo.getScore('B');

        if(scB != 0){
            fail("Wrong score for B!");
        }


        if(scA != 3){
            fail("Wrong score for A!");
        }


    }


}
