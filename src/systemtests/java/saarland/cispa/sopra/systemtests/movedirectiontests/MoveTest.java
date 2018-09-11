package saarland.cispa.sopra.systemtests.movedirectiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "A...\n" +
            "....\n" +
            "..B.\n" +
            "....";


        String brain1 = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"collision\" {\nmove else 1\nturn left\nmove else 3\nturn left\njump 3\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brain1, brain2);

        if (!world.getFieldAt(0, 1).getAnt().isPresent()) {
            fail("ant B didn't reach its destination");
        }
        if (world.getFieldAt(2, 2).getAnt().isPresent() || world.getFieldAt(1, 1).getAnt().isPresent()) {
            fail("ant B didn't reach its destination");
        }
    }
}
