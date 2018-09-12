package saarland.cispa.sopra.systemtests.badmaptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class ManySwarmsTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n8\n" +
            "ABCD\n" +
            "EFGH\n" +
            "IJKL\n" +
            "MNOP\n" +
            "QRST\n" +
            "UVWX\n" +
            "YZ..\n" +
            "....";


        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";
        try {
            gameInfo.simulate(1, 42, map, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain, brain);
        } catch (IllegalArgumentException x) {
            fail("legal map was rejected");
        }
    }

}

