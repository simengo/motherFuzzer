package saarland.cispa.sopra.systemtests;

public class AntTest5 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "....\n" +
            ".A..\n" +
            "..B.\n" +
            "....";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        String brainB = "brain \"sample\" {\n move else 1\n jump 1\n}";

        WorldInfo winfo = gameInfo.simulate(1,87, map , brainA,brainB);
        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);

        if( 'A' != ant0.getSwarm()){
            fail("Ant 0 is in the wrong Swarm!");
        }

        if ( 'B' != ant1.getSwarm()){
            fail("Ant 0 is in the wrong Swarm!");
        }

    }

}
