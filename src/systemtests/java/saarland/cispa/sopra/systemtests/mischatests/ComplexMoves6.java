package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class ComplexMoves6 extends BaseTest {

    /*  More Ants move in themselves and in each other  */
    @Override
    public void test(GameInfo gameInfo){

        String map = "4\n6\n" +
            "....\n" +
            ".AA.\n" +
            ".AA.\n" +
            ".B..\n" +
            "BBBB\n" +
            "....";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n turn right \n jump 2 \n  move else 3 \n jump 3\n}";

        WorldInfo winfo = gameInfo.simulate(4,4,map,brainA,brainB);

        testAntField(winfo,0,1,1);
        testAntField(winfo,2,0,3);
        testAntField(winfo,3,2,2);
        testAntField(winfo,4,1,3);
        testAntField(winfo,6,1,4);
        testAntField(winfo,8,3,3);
        testFieldType(winfo,1,2,'A');
    }
}
