package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FlipTest1 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map1 = "2\n2\n" + "AB\n" + "..";

        String brainFlip1 = "brain \"sample\" {\nflip 5 else 2\nturn left\nturn left\nturn left\nturn left\njump 1\n}";
        String brainFlip2 = "brain \"sample\" {\nflip 5 else 2\nturn left\nturn left\nturn left\nturn left\njump 1\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map1,brainFlip1,brainFlip1);
        WorldInfo world2 = gameInfo.simulate(1, 42, map1,brainFlip2,brainFlip2);

        if(world.getAnt(0).getPc() != world2.getAnt(0).getPc()){fail("Pc of Ants was not identical after using flip");}
    }
}
