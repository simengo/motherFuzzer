package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class StartBlickrichtung extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.fullMap();
        String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(0,1,map,brain,brain);

        for(int x=0;x<6;x++){
            for(int y=0;y<6;y++){
                if(!"northwest".equals(welt.getFieldAt(x,y).getAnt().get().getDirection())){
                    fail("Initiale Blickrichtung ungleich NW");
                }
            }
        }

    }
}
