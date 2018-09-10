package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class ComplexMoves7 extends BaseTest {

    /* Move on BaseField */
    @Override
    public void test(GameInfo gameInfo){

        String map = "2\n2\n" +
            "A.\n"+
            "B.";

        String brainA = "brain \"sample\" {\n turn left  \n move else 2\n jump 2\n}";
        String brainB = "brain \"sample\" {\n jump 1 \n  move else 2\n jump 2\n}";

        WorldInfo winfo = gameInfo.simulate(2,4,map,brainA,brainB);

        testFieldType(winfo,0,0,'A');

    }
}
