package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongMap1 extends SystemTest {





    @Override
    protected void test(GameInfo gameInfo) {

        String map4 = "2\n3\n" +
            "##\n" +
            "#A\n" +
            "#B";

        String brain69 = "brain \"stan11dby\" {" +
            "\nsense ahead home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map4, brain69, brain69));



    }
}
