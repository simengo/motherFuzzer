package saarland.cispa.sopra.systemtests;

public class SimpleMoves4 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

        //test4 wait after Move

        String map = "4\n4\n" +
            "...A\n" +
            "....\n" +
            "....\n" +
            "B...";

        String brain = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 1 \n  jump 1 \n}";

        WorldInfo winfo = gameInfo.simulate(5,42,map,brain,brainB);

        int time = winfo.getAnt(1).getRestTime();

        if (time != 9){
            fail("Wrong RestTime!");
        }




    }

}
