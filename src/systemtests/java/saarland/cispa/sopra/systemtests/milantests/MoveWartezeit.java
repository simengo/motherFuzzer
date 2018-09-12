package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveWartezeit extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"sample\" {" +
            "\nmove else 1\n" +
            "set 0\n" +
            "jump 0\n}";

        String brain1 = "brain \"sample\" {" +
            "\nmove else 1\n" +
            "set 0\n" +
            "jump 0\n}";

        WorldInfo test = gameInfo.simulate(1, 42, InitTests.foodMap1(), brain, brain);
        if (test.getAnt(0).getRestTime() != 13) {
            fail("Wartezeit falsch (!=13");
        }

        WorldInfo test1 = gameInfo.simulate(1, 2, InitTests.warteMap(), brain, brain);

        if (test1.getAnt(0).getRestTime() != 0) {

            fail("Wartezeit!=0");
        }

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.brokenMap(), brain1, brain1));

    }
}
