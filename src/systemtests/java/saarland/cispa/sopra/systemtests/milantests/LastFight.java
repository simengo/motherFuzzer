package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class LastFight extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.kill();
        String brain = "brain \"halldiekass\" {" +
            "\nmove else 1" +
            "\nturn right" +
            "\nmove else 0" +
            "\npickup else 1" +
            "\njump 0" +
            "\n}";
        WorldInfo welt = gameInfo.simulate(2,1,map,brain,brain,brain,brain);

        if(welt.getFieldAt(1,1).getFood()!=0){
            fail("asdasd");
        }

        if(welt.getScore('C')!=3 || welt.getScore('B')!=0){
            fail("Punkte");
        }





    }
}
