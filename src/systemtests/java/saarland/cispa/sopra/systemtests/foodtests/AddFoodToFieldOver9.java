package saarland.cispa.sopra.systemtests.foodtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class AddFoodToFieldOver9 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "AAA.\n" +
            "A9A.\n" +
            "AAB.\n" +
            "....";

        String brain1 = "brain " +
            "\"collision\" {\nturn left\nturn left\nturn left\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"collision\" {\nmove else 0\nturn left\nturn left\nturn left\nturn left\njump 0\n}";

        WorldInfo world = gameInfo.simulate(2, 42, map, brain1, brain2);

        if (world.getFieldAt(1, 1).getFood() != 12) {
            fail("dropped food counted incorrectly");
        }
    }
}
