package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class TestTest extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nset 1" +
            "\ntest 0 else 6" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        WorldInfo welt = gameInfo.simulate(4, 2, map, brain, brain);

        if (!"west".equals(welt.getAnt(0).getDirection())) {
            fail("Set 0 nicht erkannt");
        }
    }
}
