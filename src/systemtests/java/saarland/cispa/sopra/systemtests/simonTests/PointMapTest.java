package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class PointMapTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....\n";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map));


        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map));


    }
}
