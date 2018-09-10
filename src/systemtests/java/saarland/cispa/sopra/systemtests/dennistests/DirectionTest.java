package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            ".A\n" +
            ".B";
        String brain = "brain \"sample\" {\ndirection northwest else 2\njump 1\njump 2\n}";
        String brainK = "brain \"sample\" {\ndirection west else 2\njump 1\njump 2\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brainK);

        if(world.getAnt(0).getPc() != 1) {fail("direction was false");}
        if(world.getAnt(1).getPc() != 2) {fail("direction was true");}




    }
}
