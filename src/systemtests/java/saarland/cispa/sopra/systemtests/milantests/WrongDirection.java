package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongDirection extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection weste else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 2, map, brain, brain));


    }
}
