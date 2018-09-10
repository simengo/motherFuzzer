package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class FieldTest12 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "...A\n" +
            "#..#\n" +
            "#B .#\n" +
            "####\n";


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain));



    }


}
