package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SetUnset extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {


        String brain = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nunset 0" +
            "\ntest 0 else 4" +
            "\nturn left" +
            "\nturn right" +
            "\njump 0\n}";

        WorldInfo welt = gameInfo.simulate(4,2,InitTests.miniMarker(),brain,brain);
        if(!"northeast".equals(welt.getAnt(0).getDirection())){
            fail("Richtung falsch");
        }

    }
}
