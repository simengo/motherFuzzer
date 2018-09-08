package saarland.cispa.sopra.systemtests;

public class FieldTest13 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "...A\n" +
            "#C.#\n" +
            "#B.Z\n" +
            "####\n";


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain,brain,brain));



    }

}
