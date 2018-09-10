package saarland.cispa.sopra.systemtests.mischatests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

/* Test Switch Moves */
public class SimpleMoves2 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){
        //test 3

        String map = "4\n4\n" +
            "...A\n" +
            ".##.\n" +
            ".##.\n" +
            "B...";

        String brain = "brain \"sample\" {\n turn right \n turn right \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n turn right \n move else 7 \n  turn right \n move else 7 \n jump 7 \n}";

        WorldInfo winfo3 = gameInfo.simulate(35, 56, map, brain, brainB);

        testAntField(winfo3, 0, 0, 3, 2);





    }


}
