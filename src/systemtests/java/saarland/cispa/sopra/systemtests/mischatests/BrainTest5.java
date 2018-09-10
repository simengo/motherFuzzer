package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class BrainTest5 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n4\n" +
            "AA\n" +
            "..\n" +
            "..\n" +
            ".B";


        String stdBrain = "brain \"sample\" {\n jump 0\n}";


        String brainf = "brain \"a\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brainf));


        String brainf2 = "Brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 11, map, stdBrain, brainf2));


        String brainf3 = "brain \"sample\" {jump 0}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brainf3));


        String brainf4 = "brain \"sample {\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brainf4));


        String brainf5 = "brain \"sample\" {\n jump 0 \n turn right \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brainf5));

        String brainf6 = "brain \"sample\" {\n jump 0 \n turn right left \n jump 2 \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brainf6));

        String brainf7 = "brain \"sample\" {\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(20,11,map,stdBrain,brainf7));

        String brainf8 = "";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(20,11,map,stdBrain,brainf8));


        String brainf9 = "brain \"sample\" {\n sense right marker else 0\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(20,11,map,stdBrain,brainf9));



        String brainf10 = "brain \"sample\" {\n sense right rock\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(20,11,map,stdBrain,brainf10));


        String brainf11 = "brain \"sample\" {\n jump 0}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(20,11,brainf11 ,brainf11));

    }

}
