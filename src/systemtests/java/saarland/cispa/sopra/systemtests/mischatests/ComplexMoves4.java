package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

/* Ant on rock + Ant on Ant + FieldTypes */
public class ComplexMoves4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        String map = "2\n2\n" +
            "A#\n" +
            "BB";

        String brainA = "brain \"sample\" {\n turn right \n turn right \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n jump 1 \n jump 2 \n  move else 3 \n jump 3\n}";


        WorldInfo winfo = gameInfo.simulate(3,2,map,brainA,brainB);

        testAntField(winfo,0,0,0,1);

        testFieldType(winfo, 0, 0, 'A');
        testFieldType(winfo, 1, 0, '#');
        testFieldType(winfo, 0, 1, 'B');
        testFieldType(winfo, 1, 1, 'B');


    }
}
