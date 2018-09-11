package saarland.cispa.sopra.systemtests.movedirectiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FieldMoveTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "AAA.\n" +
            "....\n" +
            "BBB.\n" +
            "....";


        String brain = "brain " +
            "\"collision\" {\nmove else 3\nturn left\njump 1\nmark 0\njump 3\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        checkField(world, 2, 0, 1, 3);
        checkField(world, 0, 0, 3, 3);
        checkField(world, 2, 2, 1, 1);
    }

    private void checkField(WorldInfo world, int oldX, int oldY, int newX, int newY) {
        if (world.getFieldAt(oldX, oldY).getAnt().isPresent()) {
            fail("Ant moved but still present on old position");
        }
        if (!world.getFieldAt(newX, newY).getAnt().isPresent()) {
            fail("Ant should have moved");
        }
    }
}
