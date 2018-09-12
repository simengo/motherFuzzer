package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class IllegalMoveWartezeit extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.markMap();
        String brain = "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\nturn right" +
            "\nsense ahead marker 1 else 1" +
            "\nturn left" +
            "\nset 1" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(12,1,map,brain,brain);
        if(!"northwest".equals(welt.getFieldAt(1,2).getAnt().get().getDirection())){
            fail("Wartezeit ignoriert");
        }


    }
}
