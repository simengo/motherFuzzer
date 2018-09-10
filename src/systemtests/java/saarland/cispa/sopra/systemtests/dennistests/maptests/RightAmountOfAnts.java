package saarland.cispa.sopra.systemtests.dennistests.maptests;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;



public class RightAmountOfAnts extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map1 = "2\n2\n" + "AB\n" + "..";

        String brainNix = "brain \"sample\" {\njump 0\njump 1\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map1, brainNix,brainNix);

            if(world.getAnts().size() != 2){fail("Wrong number of Ants spawned");}
    }
}
