package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FoodTest2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String hinweg = "brain \"halldiekass\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nmove else 0" +
            "\npickup else 1" +
            "\njump 0" +
            "\n}";

        String fightmap = InitTests.foodMap1();
        WorldInfo informationenhin = gameInfo.simulate(19, 42, fightmap, hinweg, hinweg);

        if (informationenhin.getFieldAt(1, 1).getFood() != 0 || !informationenhin.getFieldAt(1, 1).getAnt().isPresent() || !informationenhin.getFieldAt(1, 1).getAnt().get().hasFood()) {
            fail("Foodfehler");
        }


    }
}
