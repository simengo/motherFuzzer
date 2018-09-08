package saarland.cispa.sopra.systemtests;

/* move on food and then ant */
public class ComplexMoves3 extends BaseTest {

        @Override
        public void test(GameInfo gameInfo){

            String map = "4\n4\n" +
                "....\n" +
                "..A.\n" +
                "..1.\n" +
                "..B.";

            String brainA = "brain \"sample\" {\n turn left \n turn left \n  move else 3 \n jump 3\n}";
            String brainB = "brain \"sample\" {\n move else 1 \n jump 1\n}";

            WorldInfo winfo = gameInfo.simulate(4,153,map,brainA,brainB);
            testAntField(winfo,2,1,2,2);
        }


}
