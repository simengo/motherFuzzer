package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class Suicide extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map1 = InitTests.selfmurk();
        String map2 = InitTests.selfmurkTP();

        String brain = "brain \"stan11dby\" {" +
            "\nmove else 0" +
            "\nunset 0" +
            "\njump 0\n}";

        WorldInfo welt = gameInfo.simulate(1, 2, map1, brain, brain, brain);
        WorldInfo welt2 = gameInfo.simulate(1, 2, map2, brain, brain);

        if (welt.getScore('A') != 0 || welt.getScore('B') != 0 || welt.getScore('C') != 0) {
            fail("Jemand hat Punkte bekommen");
        }

        if (welt2.getScore('A') != 0 || welt2.getScore('B') != 0) {
            fail("Jemand hat Punkte bekommen");
        }


    }
}
