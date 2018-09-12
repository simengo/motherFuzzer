package saarland.cispa.sopra.systemtests.movedirectiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "..B.\n" +
            "....";

        String brain = "brain " +
            "\"collision\" {\nmove else 1\nturn left\nmove else 0\nturn left\njump 3\n}";

        WorldInfo world = gameInfo.simulate(0, 42, map, brain, brain);
        WorldInfo world1 = gameInfo.simulate(1, 42, map, brain, brain);

        if (!"northwest".equals(world.getAnt(1).getDirection())) {
            fail("ant B faces wrong destination");
        }
        if (!"northwest".equals(world1.getAnt(1).getDirection())) {
            fail("ant B faces wrong destination after move");
        }
    }
}
