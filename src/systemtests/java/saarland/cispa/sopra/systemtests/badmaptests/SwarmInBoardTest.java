package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class SwarmInBoardTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map1 = "2\n2\n" +
            "AC\n" +
            "..\n";

        String brain = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map1, brain, brain, brain));
    }
}
