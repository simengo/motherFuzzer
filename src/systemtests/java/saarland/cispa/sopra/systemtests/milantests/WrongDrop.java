package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class WrongDrop extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\ndrop else 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 1" +
            "\n}";

        String map = InitTests.fullMap();

        WorldInfo welt = gameInfo.simulate(1, 1, map, brain, brain);

        if (welt.getScore('A') != 0 || welt.getScore('B') != 0) {
            fail("Leerer drop hat Score erhöht");
        }


    }


}
