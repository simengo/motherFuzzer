package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class IllegalMaps extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map =
            "AAA#\n" +
                "CB##\n" +
                "DDD.\n" +
                "....";
        String map1 = "";

        String brain = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nunset 0" +
            "\ntest 0 else 6" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 2, map, brain, brain, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 2, map1, brain, brain, brain, brain));

    }
}
