package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
import java.util.NoSuchElementException;

public class FightTest2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String kampfkarte2 = InitTests.fightMap2();
        String brain = "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";

        WorldInfo kampfwelt2 = gameInfo.simulate(15, 42, kampfkarte2, brain, brain);

        expect(NoSuchElementException.class, () -> kampfwelt2.getAnt(3));

        if (kampfwelt2.getFieldAt(2, 2).getFood() != 0) {

            fail("Essen noch am Start");

        }

        if (kampfwelt2.getScore('B') != 3) {

            fail("B zu wenig Punkte");
        }

        if (kampfwelt2.getScore('A') != 0) {

            fail("A zu viele Punkte");
        }

        if (kampfwelt2.getFieldAt(0, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(1, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(2, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(3, 0).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(0, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(1, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(2, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(3, 1).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(0, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(1, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(0, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(3, 2).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(1, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }
        if (kampfwelt2.getFieldAt(2, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }

        if (kampfwelt2.getFieldAt(3, 3).getFood() != 0) {
            fail("Falsch gedroppt");
        }

    }
}
