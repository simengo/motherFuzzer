package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class SimonSense7 extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {


        String map1 = InitTests.createMap(200,200);

        String map2 = InitTests.createMap(4,200);
        String map3 = "-2\n8\n";

        String brain69 = "brain \"stan11dby\" {" +
            "\nsense ahead home else 2" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map1, brain69, brain69, brain69));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map2, brain69, brain69, brain69));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map3, brain69, brain69, brain69));

    }
}
