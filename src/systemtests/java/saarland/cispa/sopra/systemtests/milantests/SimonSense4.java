package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SimonSense4 extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.senseFood();
        String hallo = "brain \"stan11dby\" {" +
            "\nsense ahead food else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String ciao = "brain \"stan11dby\" {" +
            "\nsense left food else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String food = "brain \"stan11dby\" {" +
            "\nsense right food else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String toast = "brain \"stan11dby\" {" +
            "\nsense here food else 2" +
            "\nturn left" +
            "\nturn right" +
            "\nturn left" +
            "\nset 3" +
            "\nset 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        WorldInfo hallowelt = gameInfo.simulate(2, 1, map, hallo, hallo);
        WorldInfo ciaowelt = gameInfo.simulate(2, 1, map, ciao, ciao);
        WorldInfo foodwelt = gameInfo.simulate(2, 1, map, food, food);
        WorldInfo toastwelt = gameInfo.simulate(2, 1, map, toast, toast);

        if (!"northeast".equals(hallowelt.getAnt(0).getDirection())) {
            fail("Falsche RIchtung 1");
        }
        if (!"west".equals(ciaowelt.getAnt(0).getDirection())) {
            fail("Falsche RIchtung 2");
        }
        if (!"northeast".equals(foodwelt.getAnt(0).getDirection())) {
            fail("Falsche RIchtung 3");
        }
        if (!"northeast".equals(toastwelt.getAnt(0).getDirection())) {
            fail("Falsche RIchtung 4");
        }
    }

}
