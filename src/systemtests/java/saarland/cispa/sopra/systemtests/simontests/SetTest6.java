package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest6 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\nset 0\nunset 0\ntest 0 else 4\nturn right\nturn left\njump 0\n}";
        String brainB = "brain \"sample\" {\nturn right\nturn right\nunset 0\njump 0\n}";
        String dir = "west";

        WorldInfo world = gameInfo.simulate(7, 42, map, brainA, brainB);
        if (!(dir.equals(world.getAnt(0).getDirection()))){
            fail(String.format("0 was unset so ant0 turned left but is %s",world.getAnt(0).getDirection()));
        }



    }
}

