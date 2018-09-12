package saarland.cispa.sopra.systemtests.foodtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class PickUpTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "..A.\n" +
            ".9..\n" +
            "..B.\n" +
            "....";

        String brain1 = "brain " +
            "\"collision\" {\nmove else 4\nsense here food else 4\npickup else 4\nturn left\nturn left\njump 4\n}";

        String brain2 = "brain " +
            "\"collision\" {\nmove else 9\nsense here food else 9\npickup else 9\nturn left\nturn left\nturn left\nmove else 9\nsense here home else 9\ndrop else 9\nturn left\njump 9\n}";


        WorldInfo world1 = gameInfo.simulate(20, 42, map, brain1, brain1);
        WorldInfo world2 = gameInfo.simulate(40, 42, map, brain2, brain2);

        if (!world1.getAnt(1).hasFood()) {
            fail("ant didn't pick up food");
        }
        if (world2.getAnt(1).hasFood()){
            fail("drop food didn't work");
        }
        if (world2.getScore('B') != 1) {
            fail("points for swarm B were not counted");
        }
        if (world2.getScore('A') != 0) {
            fail("A has points even thou it shouldn't");
        }
    }
}

