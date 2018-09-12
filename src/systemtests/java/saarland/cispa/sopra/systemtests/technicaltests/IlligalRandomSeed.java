package saarland.cispa.sopra.systemtests.technicaltests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class IlligalRandomSeed extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map1 = "2\n2\n" +
            "AB\n" +
            "..\n";

        String brain = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        try {
            gameInfo.simulate(1, -1, map1, brain, brain);
        } catch (IllegalArgumentException x) {
            fail("Kacke verdammte");
        }

            expect(IllegalArgumentException.class, () -> gameInfo.simulate(-1, 1, map1, brain, brain));



    }


}
