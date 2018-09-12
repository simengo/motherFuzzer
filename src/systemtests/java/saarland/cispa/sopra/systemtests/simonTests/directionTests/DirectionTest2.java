package saarland.cispa.sopra.systemtests.simontests.directiontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest2 extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";

        String brain0 = "brain \"sample\" {\nturn right\njump 0\n}";
        WorldInfo world0 = gameInfo.simulate(2,42,map,brain0,brain0);
        String dir0 = world0.getAnt(0).getDirection();
        if (!"northeast".equals(dir0)) {
            fail(String.format("Ant 0 faces %s instead of northeast!", dir0));
        }
        String brain1 = "brain \"sample\" {\nturn right\nturn right\njump 0\n}";
        WorldInfo world1 = gameInfo.simulate(3,42,map,brain1,brain1);
        String dir1 = world1.getAnt(0).getDirection();
        if (!"east".equals(dir1)) {
            fail(String.format("Ant 0 faces %s instead of east!", dir1));
        }
        String brain2 = "brain \"sample\" {\nturn right\nturn right\nturn right\njump 0\n}";
        WorldInfo world2 = gameInfo.simulate(4,42,map,brain2,brain2);
        String dir2 = world2.getAnt(0).getDirection();
        if (!"southeast".equals(dir2)) {
            fail(String.format("Ant 0 faces %s instead of southeast!", dir2));
        }


    }
}
