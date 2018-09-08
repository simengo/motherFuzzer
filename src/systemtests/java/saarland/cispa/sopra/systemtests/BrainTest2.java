package saarland.cispa.sopra.systemtests;

public class BrainTest2 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            "A1\n" +
            "#B";


        String brain = "brain \"sample\" {\n set -1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,brain,brain));

        String brain1 = "brain \"sample\" {\n set 6 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,brain1,brain1));

        String brain2 = "brain \"sample\" {\n unset -1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,brain2,brain2));

        String brain3 = "brain \"sample\" {\n unset 6 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,11,map,brain3,brain3));


        String stdBrain = "brain \"sample\" {\n jump 0\n}";
        String brain4 = "brain \"sample\" {\n set 0 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain4);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(set 0)");
        }

        String brain5 = "brain \"sample\" {\n set 5 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain5);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(set 5)");
        }



        String brain6 = "brain \"sample\" {\n unset 0 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain6);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(unset 0)");
        }



        String brain7 = "brain \"sample\" {\n unset 5 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, stdBrain, brain7);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(unset 5)");
        }



    }



}
