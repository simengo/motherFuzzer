package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseFoehome extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan111dby\" {" +
            "\nsense ahead foehome else 1" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String map = InitTests.senseMap();

        WorldInfo info = gameInfo.simulate(2,1,map,brain,brain);

        if(!"northeast".equals(info.getFieldAt(3,2).getAnt().get().getDirection())){
            fail("Foehome nicht ekannt");
        }

    }
}
