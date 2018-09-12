package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongMap2 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String map5 = "3\n2\n" +
            "#AA\n" +
            "#BB";


        String brain69 = "brain \"stan11dby\" {" +
            "\nsense ahead home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map5, brain69, brain69));
    }
}
