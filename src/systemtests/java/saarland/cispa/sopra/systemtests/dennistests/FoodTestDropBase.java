package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTestDropBase extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "..2.\n" +
            "..A.\n" +
            ".B..\n" +
            "....";
        String brain = "brain \"sample\" {\njump 0\n}";
        String brainPickup = "brain \"sample\" {\nmove else 7\npickup else 7\nturn right\nturn right\nturn right\nmove else 7\ndrop else 7\njump 7\n}";
        WorldInfo world = gameInfo.simulate(42, 42, map, brainPickup, brain);

        if(world.getScore('A') != 1){fail("Wrong points");}

}
}
