package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FightTest3 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String kampfkarte3 = InitTests.fightMapUeberRand();
        String brain = "brain \"S111tandby\" {" +
            "\nmove else 1" +
            "\nset 1" +
            "\nset 2" +
            "\njump 0" +
            "\n}";



        WorldInfo kampfwelt3 = gameInfo.simulate(15, 42, kampfkarte3, brain, brain);

        if (!kampfwelt3.getFieldAt(1, 0).getAnt().isPresent() || kampfwelt3.getFieldAt(1, 0).getFood() != 0
            || kampfwelt3.getScore('B') != 3 || kampfwelt3.getScore('A') != 0) {
            fail("Ist nicht gestorben // Gedroppte Futterzahl stimmt nicht");
        }
    }
}
