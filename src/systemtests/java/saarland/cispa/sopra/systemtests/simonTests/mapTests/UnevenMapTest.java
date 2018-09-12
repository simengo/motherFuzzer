package saarland.cispa.sopra.systemtests.simontests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class UnevenMapTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String brain = "brain \"sample\"{\njump 0\n}";
        //unevenMap
        String unevenMap = "5\n5\n" + "A....\n" + ".....\n" + ".....\n" + ".....\n" + "....B";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, unevenMap, brain, brain));

    }
}
