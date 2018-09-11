package saarland.cispa.sopra.systemtests.foodtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class NoFoodLeftTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "....\n" +
            ".1..\n" +
            "..A.\n" +
            "..B.";

        String brain1 = "brain " +
            "\"collision\" {\nmove else 0\npickup else 1\njump 0\n}";

        String brain2 = "brain " +
            "\"collision\" {\nmove else 6\njump 2\njump 3\njump 4\nmove else 6\npickup else 7\nmark 0\nturn left\njump 7\n}";


        WorldInfo world1 = gameInfo.simulate(40, 42, map, brain1, brain2);

        if (!world1.getAnt(0).hasFood()) {
            fail("ant didn't pick up food");
        }
        if (world1.getAnt(1).hasFood()) {
            fail("points for swarm B were not counted");
        }
        if (world1.getFieldAt(1, 1).getFood() != 0) {
            fail("food != 0 after being picked up twice");
        }
        if(world1.getFieldAt(1,1).getMarkers().get('B')[0]){
            fail("something went wrong in the test ? -_-");
        }
    }
}

