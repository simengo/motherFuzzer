package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class WrongMapTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                "6\n6\n"+
                "..AA\n"+
                "....\n"+
                "....\n"+
                "..BB";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,42,map,brain,brain));

        String map0 =
            "4\n4\n"+
                "...A\n"+
                ".*.B\n"+
                "....\n"+
                "....";
        String brain0 = "brain \"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () ->gameInfo.simulate(1,42,map0,brain0,brain0));

        String map1 = "2\n2\n" +
            ".A\n" +
            "B .";
        String brain1 ="brain \"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,42,map1,brain1,brain1));

        String map2 = "4\n4\n"+
            "..AA\n"+
            ".....\n"+
            "....\n"+
            "..BB";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map2,brain,brain));




    }
}
