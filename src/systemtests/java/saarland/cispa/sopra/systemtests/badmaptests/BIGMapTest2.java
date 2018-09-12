package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BIGMapTest2 extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        StringBuilder builder = new StringBuilder();
        builder.append("128\n128\n");
        for (int i = 0; i < 127; i++) {
            for (int j = 0; j < 128; j++) {
                builder.append('.');
            }
            builder.append('\n');
        }
        for (int j = 0; j < 126; j++) {
            builder.append('.');
        }
        builder.append("AB");
        String map = builder.toString();
        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";

        try{
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException x){
            fail("legal map was rejected (128x128)");
        }
    }
}
