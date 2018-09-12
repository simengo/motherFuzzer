package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongMapTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
            "4\n4\n"+
                "...-1\n"+
                "...A\n"+
                "...B\n"+
                "...#";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,42,map,brain,brain));
    }
}
