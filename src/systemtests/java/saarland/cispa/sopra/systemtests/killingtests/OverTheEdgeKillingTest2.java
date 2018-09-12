package saarland.cispa.sopra.systemtests.killingtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class OverTheEdgeKillingTest2 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            "AB\n" +
            "CD\n";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\njump 1\n}";

        String brain1 = "brain " +
            "\"sample\" {\nmove else 1\nturn left\nturn left\nturn left\njump 1\n}";

        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain, brain, brain1);

        if (world.getFieldAt(0, 0).getAnt().isPresent()) {
            fail("Ant didn't die when ants present on the other side of the edge");
        }
    }
}
