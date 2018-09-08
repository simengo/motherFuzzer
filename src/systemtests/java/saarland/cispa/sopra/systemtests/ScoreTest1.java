package saarland.cispa.sopra.systemtests;

public class ScoreTest1 extends BaseTest {



    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "..7A\n" +
            ".#C#\n" +
            ".9D1\n" +
            "B1..";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n jump 0 \n}";

        WorldInfo winfo = gameInfo.simulate(10,3,map,brainA,brainB,brainB,brainB);
        int scoreA = winfo.getScore('A');
        int scoreB = winfo.getScore('B');
        int scoreC = winfo.getScore('C');
        int scoreD = winfo.getScore('D');

        if( scoreA != 0){
            fail(String.format("Wrong Score fo Team A : expected 0, but is: %d",scoreA));
        }



        if( scoreB != 0){
            fail(String.format("Wrong Score fo Team B : expected 0, but is: %d",scoreB));
        }



        if( scoreC != 0){
            fail(String.format("Wrong Score fo Team C : expected 0, but is: %d",scoreC));
        }



        if( scoreD != 0){
            fail(String.format("Wrong Score fo Team D : expected 0, but is: %d",scoreD));
        }





    }


}
