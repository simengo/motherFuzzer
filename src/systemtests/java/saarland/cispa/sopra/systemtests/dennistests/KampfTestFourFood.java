package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KampfTestFourFood extends OberklasseTests{
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "8\n6\n" +
            ".AA.....\n" +
            "AB1.....\n" +
            ".A......\n" +
            "..C.....\n" +
            "........\n" +
            "........";

        String brainA = "brain \"sample\" {\nturn right\njump 1\n}";
        String brainB = "brain \"sample\" {\nturn right\nturn right\nmove else 0\npickup else 0\nturn left\nturn left\nturn left\nmove else 0\njump 8\n}";
        String brainC = "brain \"sample\" {\njump 1\njump 2\njump 3\njump 4\nmove else 1\njump 1\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brainA,brainB,brainC);
        if(world.getScore('B') !=4){fail("wrong number of points");}
    }
}
