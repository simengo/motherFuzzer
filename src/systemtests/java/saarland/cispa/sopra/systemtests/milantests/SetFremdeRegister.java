package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SetFremdeRegister extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brainA = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nset 1" +
            "\nset 2" +
            "\nset 3" +
            "\nset 4" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String brainB = "brain \"stan11dby\" {" +
            "\njump 1" +
            "\ntest 0 else 4" +
            "\njump 2" +
            "\njump 3" +
            "\nturn left" +
            "\njump 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        WorldInfo welt = gameInfo.simulate(4, 2, map, brainA, brainB);

        if (!"west".equals(welt.getAnt(2).getDirection())) {
            fail("Fremder Marker wurde erkannt");
        }

        for (int i = 0; i < 6; i++) {
            if (welt.getAnt(2).getRegister()[i]) {
                fail("Fremder Marker hat register auf true gesetzt");
            }
        }


    }
}
