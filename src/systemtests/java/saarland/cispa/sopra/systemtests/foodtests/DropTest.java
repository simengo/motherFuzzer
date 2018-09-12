package saarland.cispa.sopra.systemtests.foodtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DropTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "...A\n" +
            ".9..\n" +
            "..B.\n" +
            "....";

        String brain = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"collision\" {\nmove else 6\npickup else 6\nturn left\nmove else 6\ndrop else 6\ndrop else 10\ndrop else 6\ndrop else 6\nturn left\njump 6\nmark 0\njump 10\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brain, brain2);

        if (world.getFieldAt(0, 1).getFood() != 1) {
            fail("ant did not drop food correctly");
        }
        if (!world.getFieldAt(0, 1).getMarkers().get('B')[0]) {
            fail("second drop didn't fail");
        }
    }
}
