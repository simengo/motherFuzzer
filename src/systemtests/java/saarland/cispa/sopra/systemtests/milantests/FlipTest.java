package saarland.cispa.sopra.systemtests.milantests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FlipTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nset 2" +
            "\nset 3" +
            "\nflip 0 else 1" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        WorldInfo infos = gameInfo.simulate(6, 2, map, brain, brain);

        if (!"west".equals(infos.getAnt(0).getDirection())) {
            fail("Flip funktioniert falsch");
        }
    }


}

