package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FightFood extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.fightFood();
        String brainA = "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";

        String brainB = "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\npickup else 0" +
            "\nmove else 2" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(31,1,map,brainA,brainB);

        

        if(welt.getFieldAt(3,2).getFood()!=4){
            fail("nicht ausreichend food fallen gelassen");
        }
    }
}
