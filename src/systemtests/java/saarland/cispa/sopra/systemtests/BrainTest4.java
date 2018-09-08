package saarland.cispa.sopra.systemtests;

public class BrainTest4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n4\n" +
            "AA\n" +
            "..\n" +
            "..\n" +
            ".B";


        String stdBrain = "brain \"sample\" {\n jump 0\n}";


        String brain = "brain \"sample\" {\n test -1 else 1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brain));


        String brain2 = "brain \"sample\" {\n test 6 else 1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,stdBrain,brain2));




        String brain3 = "brain \"sample\" {\n test 0 else 1 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain3);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(test 0 else 1)");
        }



        String brain4 = "brain \"sample\" {\n test 5 else 1 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain4);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(test 5 else 1)");
        }



    }

}
