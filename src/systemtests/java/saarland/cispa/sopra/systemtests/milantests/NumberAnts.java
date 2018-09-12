package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class NumberAnts extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nturn right" +
            "\nturn right" +
            "\nsense ahead marker 1 else 1" +
            "\nturn left" +
            "\nset 1" +
            "\njump 0" +
            "\n}";

        String map = InitTests.fullMap();

        WorldInfo infos = gameInfo.simulate(1, 1, map, brain, brain);

        if (infos.getAnts().size() != 36) {

            fail("List der Ameisen nicht richtig gefüllt");

        }

        String map2 = InitTests.illegalMap();

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map2, brain, brain));
    }
}
