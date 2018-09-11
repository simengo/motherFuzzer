package saarland.cispa.sopra.systemtests.secrettests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class SecretBrainWhitespaces  extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".AA.\n" +
            "....\n" +
            "....\n" +
            ".BB.";

        String brain = "brain " +
            "\"sample\" {\n turn      left\njump 0 \n}";
        try {
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException x){
            fail("multiple whitespaces in acola programs are allowed");
        }
    }
}
