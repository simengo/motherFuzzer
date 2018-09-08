package saarland.cispa.sopra.systemtests;

/* Ant on Food FieldType */
public class ComplexMoves5 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        String map = "6\n6\n" +
            "...A..\n" +
            "......\n" +
            "......\n" +
            "......\n" +
            "...9..\n" +
            "...B..";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 1\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(2,4,map,brainA,brainB);

        testAntField(winfo,1,3,4);
        testFieldType(winfo,3,4,'.');
    }
}
