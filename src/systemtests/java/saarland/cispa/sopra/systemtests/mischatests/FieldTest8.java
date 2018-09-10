package saarland.cispa.sopra.systemtests.mischatests;


// wrong FieldSyntax

import saarland.cispa.sopra.systemtests.GameInfo;

public class FieldTest8 extends BaseTest{


    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n2\n"+
            ".#\n" +
            "2.";

        String brain = "brain \"sample\" {\n jump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map,brain,brain));


        String map1 = "2\n2\n"+
            ".A\n" +
            "..";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map1,brain,brain));


        String map2 = "2\n2\n"+
            "..\n" +
            ".B";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map2,brain,brain));


        String map3 = "2\n2\n"+
            ".B\n" +
            "C.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map3,brain,brain));



        String map4 = "2\n2\n"+
            ".A\n" +
            "C.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map4,brain,brain));


        String map5 = "2\n2\n"+
            "BA\n" +
            "Z.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map5,brain,brain));


        String map6 = "2\n2\n"+
            "BA\n" +
            "10.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map6,brain,brain));


        String map7 = "2\n2\n"+
            "BA\n" +
            "0.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map7,brain,brain));

        String map8 = "2\n2\n"+
            "BA\n" +
            "-1.";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map8,brain,brain));


    }


}
