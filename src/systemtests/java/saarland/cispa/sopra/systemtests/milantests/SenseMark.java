package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SenseMark extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

      String brain =  "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\nmark 1" +
            "\nsense here marker 1 else 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

      String map = InitTests.markMap();

      WorldInfo infos = gameInfo.simulate(17,2,map,brain,brain);

      if(!"northeast".equals(infos.getAnt(2).getDirection())){
          fail("Marker nicht erkannt");
      }



    }
}
