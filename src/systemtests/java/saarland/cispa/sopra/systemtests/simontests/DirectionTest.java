package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain0 = "brain \"sample\" {\nturn left\njump 0\n}";
        WorldInfo world0 = gameInfo.simulate(2, 42, map, brain0, brain0);
        String dir0 = world0.getAnt(0).getDirection();
        if (!"west".equals(dir0)) {
            fail(String.format("Ant 0 faces %s instead of west!", dir0));
        }
        String brain1 = "brain \"sample\" {\nturn left\nturn left\njump 0\n}";
        WorldInfo world1 = gameInfo.simulate(3, 42, map, brain1, brain1);
        String dir1 = world1.getAnt(0).getDirection();
        if (!"southwest".equals(dir1)) {
            fail(String.format("Ant 0 faces %s instead of southwest !", dir1));
        }
        String brain2 = "brain \"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world2 = gameInfo.simulate(4, 42, map, brain2, brain2);
        String dir2 = world2.getAnt(0).getDirection();
        if (!"southeast".equals(dir2)) {
            fail(String.format("Ant 0 faces %s instead of southeast!", dir2));
        }

    }
}
