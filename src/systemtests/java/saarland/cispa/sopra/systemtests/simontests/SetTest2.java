package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\nunset 0\ntest 0 else 0\nturn right\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";


        WorldInfo world = gameInfo.simulate(3, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("0 was not setted so ant did not turn");
        }


    }
}

