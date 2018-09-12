package saarland.cispa.sopra.systemtests.testcommandtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class TestCommandTest3 extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "A.\n" +
            "B.";

        String brain = "brain " +
            "\"sample\" {\ntest 0 else 2\nmark 0\njump 3\nturn left\njump 2\n}";

        WorldInfo world = gameInfo.simulate(3, 42, map, brain, brain);

        if (world.getFieldAt(0, 0).getMarkers().get('A')[0]) {
            fail("test for register failed and jumped");
        }
    }
}
