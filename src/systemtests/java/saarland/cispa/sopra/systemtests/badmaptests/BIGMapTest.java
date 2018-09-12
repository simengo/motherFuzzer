package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BIGMapTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        StringBuilder builder = new StringBuilder();
        builder.append("129\n129\n");
        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < 129; j++) {
                builder.append('.');
            }
        builder.append('\n');
        }
        for (int j = 0; j < 127; j++) {
            builder.append('.');
        }
        builder.append("AB");
        String map = builder.toString();
        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));
    }
}
