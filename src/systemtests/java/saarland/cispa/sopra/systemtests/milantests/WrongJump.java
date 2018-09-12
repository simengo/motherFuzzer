package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongJump extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump -19" +
            "\n}";

        String map = InitTests.fullMap();

        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain1));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain2));

    }
}
