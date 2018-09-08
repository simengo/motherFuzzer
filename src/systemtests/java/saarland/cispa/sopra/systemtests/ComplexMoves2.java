package saarland.cispa.sopra.systemtests;


/* Move on food */

public class ComplexMoves2 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo){

        String map = "6\n6\n" +
            ".#....\n" +
            ".#####\n" +
            "#####A\n" +
            ".....9\n" +
            ".1....\n" +
            ".B....";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n  turn left \n move else 4 \n jump 4\n}";
        String brainB = "brain \"sample\" {\n move else 1 \n jump 1\n}";

        WorldInfo winfo = gameInfo.simulate(4,124,map,brainA,brainB);
        testAntField(winfo,5,3,1,4);
    }




}
