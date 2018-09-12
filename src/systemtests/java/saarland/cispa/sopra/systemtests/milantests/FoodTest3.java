package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FoodTest3 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String rueckweg = "brain \"halldiekass\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nmove else 0" +
            "\npickup else 1" +
            "\nturn left" +
            "\nturn left" +
            "\nturn left" +
            "\nmove else 0" +
            "\ndrop else 1" +
            "\npickup else 0" +
            "\njump 0" +
            "\n}";

        String fightmap = InitTests.foodMap1();
        WorldInfo informationenzurueck = gameInfo.simulate(36, 42, fightmap, rueckweg, rueckweg);

        if (informationenzurueck.getFieldAt(0, 0).getFood() != 0 || !informationenzurueck.getFieldAt(0, 0).getAnt().isPresent() || informationenzurueck.getFieldAt(0, 0).getAnt().get().hasFood()) {
            fail("Foodfehler");
        }

        if (informationenzurueck.getScore('A') != 2 || informationenzurueck.getScore('B') != 0) {
            fail("Scorefehler");
        }
    }
}
