package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class BrainTest3 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n4\n" +
            "AA\n" +
            "..\n"+
            "..\n"+
            ".B";


        String stdBrain = "brain \"sample\" {\n jump 0\n}";

        String brain = "\"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brain));

        String brain2 = " brain \"sample\" \n jump 0\n";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brain2));

        String brain3 = " brain \"sample\" \n jump 0\n";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brain3));

        String brain4 = " brain \"sample\" {\n mark 0 jump 0}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brain4));

        String brain5 = " brain \"sample\" {\n mark 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 11, map, stdBrain, brain5));

        String brain6 = " brain \"sample\" {\n move \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brain6));




    }
}
