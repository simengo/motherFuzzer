package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class EmptyBoardTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map1 = "0\n0\n" +
            "\n";
        String map2 = "0\n0\n";

        String map3 =
            "....\n" + "....\n" + "....\n" + "....\n";


        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map1));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map2));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map3));

    }
}
