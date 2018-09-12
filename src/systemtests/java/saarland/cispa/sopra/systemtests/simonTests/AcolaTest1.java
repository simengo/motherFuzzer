package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class AcolaTest1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //direction with wrong parameter1
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\ndirection weast else 0\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));

        //direction with wrong parameter2
        String brain0 = "brain \"sample\" {\ndirection west else 9\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain0, brain0));



    }
}
