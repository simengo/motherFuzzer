package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class FieldTest14 extends BaseTest {



    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "...B\n" +
            "#C.#\n" +
            "#D.#\n" +
            "####\n";


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain,brain));


        String map1 = "4\n4\n" +
            "...A\n" +
            "#B.#\n" +
            "#C.#\n" +
            "####\n";


        String brain1 = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map1,brain1,brain1));



        String map2 = "4\n4\n" +
            "...A\n" +
            "#B.#\n" +
            "#C.#\n" +
            "####\n";


        String brain2 = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map2,brain2,brain2,brain2,brain2));


        String map3 = "4\n4\n" +
            "...A\n" +
            "#..#\n" +
            "#B.#\n" +
            "####\n";


        String brain3 = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map3, map3,brain3));



        String map4 = "4\n4\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....\n";



        expect(IllegalArgumentException.class, () -> gameInfo.simulate(0,23,map4));



        String map5 = "4\n4\n" +
            "...A\n" +
            "#.0#\n" +
            "#B.#\n" +
            "####\n";


        String brain5 = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(0,23,map5,brain5));


    }


}
