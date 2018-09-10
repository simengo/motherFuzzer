package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SimpleMoves3 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        //test4 wait after Move

        String map = "4\n4\n" +
            "...A\n" +
            ".##.\n" +
            "....\n" +
            "B...";

        String brain = "brain \"sample\" {\n turn right \n move else 3 \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n  jump 3 \n}";


        WorldInfo winfo4 = gameInfo.simulate(15, 8, map, brain, brainB);
        WorldInfo winfo5 = gameInfo.simulate(16, 7, map, brain, brainB);

        testAntField(winfo4, 3, 3, 0, 0);
        testAntField(winfo5, 0, 2, 0, 0);


    }

}


