package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseAhead extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String brain = "brain \"stan11dby\" {" +
            "\nsense ahead rock else 1" +
            "\nturn left" +
            "\njump 0" +
            "\n}";

        String map = InitTests.senseMap();

        WorldInfo infos = gameInfo.simulate(2,1,map,brain,brain);

        if(!"west".equals(infos.getFieldAt(2,3).getAnt().get().getDirection())){

            fail("Rock nicht erkannt");
        }


    }
}
