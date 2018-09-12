package saarland.cispa.sopra.systemtests.simontests.settests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\nset 0\ntest 0 else 0\nturn right\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";

        WorldInfo world = gameInfo.simulate(3, 42, map, brainA, brainB);
        if(!(dir.equals(world.getAnt(0).getDirection()))){
            fail("0 was setted so ant did turn");
        }


    }
}

