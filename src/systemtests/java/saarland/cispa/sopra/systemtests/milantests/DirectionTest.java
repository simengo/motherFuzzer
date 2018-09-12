package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class DirectionTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

       String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection east else 0" +
            "\nturn right" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

       String map = "4\n4\n" +
            "#...\n" +
            "AA.B\n" +
            "....\n" +
            "....";

       WorldInfo welt = gameInfo.simulate(18,2,map,brain,brain);
       WorldInfo welt2 = gameInfo.simulate(18,2,map,brain2,brain2);

       if(!"southwest".equals(welt.getFieldAt(1,0).getAnt().get().getDirection())){
           fail("Direction wurde nicht erkannt");
       }

       if(!"northwest".equals(welt.getFieldAt(0,1).getAnt().get().getDirection())){
           fail("Ameise 0 hat sich bewegt");
       }

       if(!"west".equals(welt2.getAnt(1).getDirection())){
           fail("Ameise 1 hat sich trotz falscher Direction bewegt");
       }
    }
}
