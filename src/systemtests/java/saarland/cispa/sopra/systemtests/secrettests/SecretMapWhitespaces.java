package saarland.cispa.sopra.systemtests.secrettests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class SecretMapWhitespaces extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ". AA.\n" +
            "....\n" +
            ".... \n" +
            ".BB.";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));
    }
}
