package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class StartTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        WorldInfo welt = gameInfo.simulate(0, 2, map, brain, brain);

        if (welt.getScore('A') != 0 || welt.getScore('B') != 0) {
            fail("Initiale Punktzahl != 0");
        }

        expect(IllegalArgumentException.class, () -> welt.getScore('C'));



    }
}
