package saarland.cispa.sopra.systemtests.dennistests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class GuessItsSkipped2 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map1 = "2\n2\n" + "AB\n" + ".d";
        String map2 = "2\n2\n" + "AB\n" + ".0";
        String map3 = "2\n2\n" + "AB\n" + ".";
        String map4 = "6\n6\n" +
            "ABCDEF\n" +
            "GHIJKL\n" +
            "MNOPQR\n" +
            "STUVWX\n" +
            "YZÜ...\n" +
            "......";

        String braintests = "brain \"sample\" {\njump 0\njump 1\n}";



        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map1, braintests,braintests));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map2, braintests,braintests));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map3, braintests,braintests));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map4, braintests,braintests));

    }
}
