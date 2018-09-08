package saarland.cispa.sopra.systemtests;

// wrong Chars in Field +

public class FieldTest9 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            ".'\n" +
            "AB";

        String brain = "brain \"sample\" {\n jump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5, 23, map, brain, brain));


        String map2 = "2\n2\n" +
            ".$\n" +
            "AB";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5, 23, map2, brain, brain));




        String map3 = "2\n2\n" +
            "!.\n" +
            "AB";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5, 23, map3, brain, brain));



        String map4 = "2\n2\n" +
            "..\n" +
            "ab";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5, 23, map4, brain, brain));

        String map5 = "4\n4\n" +
            ".AA.\n" +
            "A...\n" +
            "....\n" +
            ".B..\n";

        try {
            gameInfo.simulate(5, 23, map5, brain, brain);
        } catch (IllegalArgumentException e) {
            fail("Map is ok but threw IllegalArgumentException!");
        }


        String map7 = "4\n4\n" +
            ".AA.\n" +
            "...\n" +
            "A....\n" +
            ".B..";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5, 23, map7, brain, brain));


        String map8 = "4\n4\n" +
            ".AAA\n" +
            "...A\n" +
            "A...\n" +
            ".B..";

        try {
            gameInfo.simulate(5, 23, map8, brain, brain);
        } catch (IllegalArgumentException e) {
            fail("Map is ok but threw IllegalArgumentException!(SideSwitch Base)");
        }


    }


}
