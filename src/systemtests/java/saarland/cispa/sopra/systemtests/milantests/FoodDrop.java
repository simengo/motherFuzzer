package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class FoodDrop extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 = "brain \"stan11dby\" {" +
            "\nmove else 0" +
            "\npickup else 5" +
            "\nturn left" +
            "\nturn left" +
            "\nturn left" +
            "\nmove else 0" +
            "\ndrop else 1" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 1" +
            "\n}";

        String map = InitTests.swarmCheck();

        WorldInfo welt = gameInfo.simulate(23,1,map,brain1,brain1,brain1,brain1);

        if(welt.getScore('A')!=0 || welt.getScore('B')!=0 || welt.getScore('C')!=0 || welt.getScore('D')!=0 ){
            fail("Falscher Score");
        }

        expect(IllegalArgumentException.class, ()->welt.getScore('F'));

    }
}
