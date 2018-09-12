package saarland.cispa.sopra.systemtests.simontests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class TooSmallMapTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String brain = "brain \"sample\"{\njump 0\n}";

        //tooSmall map
        String tooSmall = "0\n0\n" + " ";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, tooSmall, brain, brain));

        String evenSmallerMap = "-2\n-2\n" +
            ".A\n" +
            "B.";
        expect(IllegalArgumentException.class,()-> gameInfo.simulate(1,42,evenSmallerMap,brain,brain));
    }

}
