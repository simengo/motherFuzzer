package saarland.cispa.sopra.systemtests.mischatests;

// Schlüsselwort als Namen

import saarland.cispa.sopra.systemtests.GameInfo;

public class BrainTest1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            "A1\n" +
            "#B";

        String brain = "brain \"jump 0\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map,brain,brain));


        String brain1 = "brain sample {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map,brain1,brain1));


        String brain2 = "brain \"sample\" {\n jump 1\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(0,267,map,brain2,brain2));

        String brainHelp = "brain \"sample\" {\n jump -1\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,267,map,brainHelp,brainHelp));


        String brain3 = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n mark 7 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,267,map,brain3,brainB));



        String brainB1 = "brain \"sample\" {\n mark 6 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, brain3, brainB1);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(mark 6)");
        }



        String brainB2 = "brain \"sample\" {\n mark 0 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, brain3, brainB2);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(mark 0)");
        }



        String brainB3 = "brain \"sample\" {\n mark -1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,267,map,brain3,brainB3));


        String brainB4 = "brain \"sample\" {\n unmark 6 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, brain3, brainB4);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(unmark 6)");
        }



        String brainB5 = "brain \"sample\" {\n unmark 0 \n jump 0\n}";

        try {
            gameInfo.simulate(1, 23, map, brain3, brainB5);
        } catch (IllegalArgumentException e) {
            fail("Brain was ok but simulate threw Exception!)(unmark 0)");
        }



        String brainB6 = "brain \"sample\" {\n unmark 7 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,267,map,brain3,brainB6));


        String brainB7 = "brain \"sample\" {\n unmark -1 \n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,267,map,brain3,brainB7));

    }
}
