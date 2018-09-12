package saarland.cispa.sopra.systemtests.simontests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class MapTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        if(gameInfo == null){
            fail("fail");
        }
    }

    public static String createSimpleMap() {
        return "6\n6\n" + "######\n" + "..AA..\n" + "......\n" + "......\n" + "..BB..\n" + "######";
    }
}
