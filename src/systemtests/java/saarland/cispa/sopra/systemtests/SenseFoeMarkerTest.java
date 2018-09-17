package saarland.cispa.sopra.systemtests;

public class SenseFoeMarkerTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "111.\n" +
            "AAA.\n";

        String brainA = "brain \"sample\" {\nmove else 3 \n turn right \n move else 3 \n mark 3 \n turn right\n turn right \n turn right \n move else 0 \n jump 8\n}";
        String brainB = "brain \"sample\" {\njump 1\n jump 2\n jump 3\n jump 4\n jump 5\n jump 6\n jump 7\n jump 8\n jump 9\n jump 10\n jump 11\n jump 12\n jump 13\n jump 14\n jump 15\n jump 16\n jump 17\n jump 18\n jump 19\n jump 20\n jump 21\n jump 22\n jump 23\n jump 24\n jump 25\n jump 26\n jump 27\n jump 28\n jump 29\n jump 30\n jump 31\n jump 32\n turn right\n turn right\n turn right\n sense ahead foemarker else 37 \n turn right \n jump 37\n}";
        WorldInfo world = gameInfo.simulate(100, 4, map, brainB, brainA);
        AntInfo ant = world.getAnt(0);
        if(!"southwest".equals(ant.getDirection())){
            fail("sense foemarker is wrong!");
        }


    }



}
