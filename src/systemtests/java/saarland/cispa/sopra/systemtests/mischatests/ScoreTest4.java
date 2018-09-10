package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class ScoreTest4 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".BA.\n" +
            "BBB.\n" +
            ".B.#\n" +
            "####";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n jump 3 \n jump 4 \n move else 5 \n jump 5\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n turn right \n move else 4 \n jump 4\n}";

        WorldInfo world = gameInfo.simulate(50, 27, map, brainA,brainB);
        int sc0 = world.getScore('A');
        int sc1 = world.getScore('B');


        if(sc1 != 3){
            fail("Wrong Points1");
        }


        if(sc0 != 0){
            fail("Wrong Points0");
        }




    }



}
