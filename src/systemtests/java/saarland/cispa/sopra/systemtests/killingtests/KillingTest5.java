package saarland.cispa.sopra.systemtests.killingtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KillingTest5 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            ".AAA\n" +
            ".AAA\n" +
            "...A\n" +
            ".B..\n";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"sample\" {\nmove else 1\nturn left\nturn left\nturn left\njump 0\n}";

        WorldInfo world2 = gameInfo.simulate(2, 42, map, brain, brain2);
        if (!world2.getFieldAt(2, 1).getAnt().isPresent()) {
            fail("Ant didn't die in world 5");
        }
    }
}
