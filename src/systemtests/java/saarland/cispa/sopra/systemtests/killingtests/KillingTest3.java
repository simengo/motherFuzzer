package saarland.cispa.sopra.systemtests.killingtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KillingTest3 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map3 = "4\n4\n" +
            ".AA.\n" +
            ".BA.\n" +
            "....\n" +
            "..C.\n";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"sample\" {\nmove else 1\nturn left\nturn left\nturn left\njump 0\n}";

        WorldInfo world3 = gameInfo.simulate(1, 42, map3, brain, brain, brain2);

        if (!world3.getFieldAt(1, 1).getAnt().isPresent()) {
            fail("Ant died when only 4 enemies present");
        }
    }
}
