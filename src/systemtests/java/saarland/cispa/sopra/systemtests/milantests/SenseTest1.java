package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseTest1 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nsense ahead marker 0 else 1\n"+
            "set 1\n" +
            "jump 0\n}";

        WorldInfo weltinfos = gameInfo.simulate(1,1,InitTests.senseMap(),brain,brain);

        if(weltinfos.getAnt(0).getId()!=0){

            fail("Falsche ID");
        }
    }
}
