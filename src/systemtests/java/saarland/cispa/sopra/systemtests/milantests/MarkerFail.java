package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class MarkerFail extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain1 =  "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\nmark 15" +
            "\nsense here marker 1 else 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String brain2 =  "brain \"stan11dby\" {" +
            "\nmove else 1" +
            "\nmark -1" +
            "\nsense here marker 1 else 4" +
            "\nturn right" +
            "\njump 0" +
            "\n}";

        String map = InitTests.markMap();

        expect(IllegalArgumentException.class, ()->gameInfo.simulate(30,2,map,brain1,brain1));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(30,2,map,brain2,brain2));


    }
}
