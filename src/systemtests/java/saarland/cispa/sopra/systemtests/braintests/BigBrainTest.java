package saarland.cispa.sopra.systemtests.braintests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BigBrainTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "..B.\n" +
            "....";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 2499; i++) {
            builder.append("turn left\n");
        }

        String brain = "brain " +
            "\"collision\" {\n" + builder + "jump 0\n}";

        try {
            gameInfo.simulate(3, 42, map, brain, brain);
        } catch (IllegalArgumentException x){
            fail("HUUGE brain was rejected");
        }
    }
}
