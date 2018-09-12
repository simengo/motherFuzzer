package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FoodCheck extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\"{" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.swarmCheck();

        WorldInfo welt = gameInfo.simulate(1, 1, map, brain, brain, brain, brain);

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {

                if (welt.getFieldAt(x, y).getFood() != 0) {
                    fail("Zu viel Food auf Feld");
                }
            }

        }
    }
}
