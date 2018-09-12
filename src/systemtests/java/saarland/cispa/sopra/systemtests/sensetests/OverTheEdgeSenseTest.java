package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class OverTheEdgeSenseTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map1 = "2\n2\n" +
            ".A\n" +
            "B.\n";

        String map2 = "2\n2\n" +
            ".A\n" +
            "B.\n";

        String map3 = "2\n2\n" +
            ".A\n" +
            "1B\n";

        String map4 = "2\n2\n" +
            ".A\n" +
            "#B\n";

        String map5 = "2\n2\n" +
            ".A\n" +
            "AB\n";

        checkOverTheEdgeSensing(gameInfo, map1, "foe");
        checkOverTheEdgeSensing(gameInfo, map2, "foehome");
        checkOverTheEdgeSensing(gameInfo, map3, "food");
        checkOverTheEdgeSensing(gameInfo, map4, "rock");
        checkOverTheEdgeSensing(gameInfo, map5, "home");
    }

    private void checkOverTheEdgeSensing(GameInfo gameInfo, String map, String target) {

        String brain = "brain " +
            "\"collision\" {\nsense ahead " + target + " else 2\nset 0\nturn left\njump 2\n}";

        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!world.getAnt(0).getRegister()[0]) {
            fail("ant didn't sense " + target);
        }
    }
}
