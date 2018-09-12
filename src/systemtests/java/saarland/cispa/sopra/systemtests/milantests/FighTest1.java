package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FighTest1 extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String kampfkarte1 = InitTests.fightMap1();
        String brain = "brain \"Standby\" {" +
            "\nmove else 1" +
            "\nset 1" +
            "\njump 0\n}";
        WorldInfo kampfwelt1 = gameInfo.simulate(15, 42, kampfkarte1, brain, brain);

        if (!kampfwelt1.getFieldAt(2, 2).getAnt().isPresent() || kampfwelt1.getFieldAt(2, 2).getFood() == 3) {
            fail("Haette nicht sterben duerfen // Hat Food abgegeben");
        }

        if (kampfwelt1.getFieldAt(0, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }

        if (kampfwelt1.getFieldAt(1, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(2, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(3, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(0, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(1, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(2, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(3, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(0, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(1, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(2, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(3, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(0, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(1, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt1.getFieldAt(2, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }

        if (kampfwelt1.getFieldAt(3, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }

    }
}
