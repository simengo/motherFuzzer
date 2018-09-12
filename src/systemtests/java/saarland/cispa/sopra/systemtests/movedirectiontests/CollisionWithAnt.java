package saarland.cispa.sopra.systemtests.movedirectiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class CollisionWithAnt extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "..#.\n" +
            "..A.\n" +
            "...B\n" +
            "....";

        String map2 = "4\n4\n" +
            "..#.\n" +
            "..A.\n" +
            "...A\n" +
            "..B.";

        String brain = "brain " +
            "\"collision\" {\nmove else 3\nturn left\njump 1\nmark 0\njump 3\n}";

        WorldInfo world = gameInfo.simulate(20, 42, map, brain, brain);
        WorldInfo world2 = gameInfo.simulate(20, 42, map2, brain, brain);

        checkPosition(world, 2, 1, "rock");
        checkPosition(world, 3, 2, "another ant");

        checkPosition(world2, 2, 1, "rock");
        checkPosition(world2, 3, 2, "another ant");
    }

    private void checkPosition(WorldInfo world, int x, int y, String obstacle) {
        if (world.getFieldAt(x, y).getMarkers().isEmpty()) {
            fail("Ant moved into " + obstacle);
        }
    }
}
