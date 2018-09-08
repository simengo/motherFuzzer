package saarland.cispa.sopra.systemtests;

public class ScoreTest5 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".B1A\n" +
            "BBB.\n" +
            ".B.#\n" +
            "####";

        String brainA = "brain \"sample\" {\n turn left \n move else 5 \n pickup else 5 \n turn left \n move else 5 \n jump 5\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n turn right \n move else 4 \n jump 4\n}";

        WorldInfo world = gameInfo.simulate(18, 27, map, brainA, brainB);
        int sc0 = world.getScore('A');
        int sc1 = world.getScore('B');


        if(sc1 != 4){
            fail("Wrong Points1");
        }


        if(sc0 != 0){
            fail("Wrong Points0");
        }


    }
}
