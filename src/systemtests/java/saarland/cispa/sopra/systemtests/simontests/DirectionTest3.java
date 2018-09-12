package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class DirectionTest3 extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain3 = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\njump 0\n}";
        WorldInfo world3 = gameInfo.simulate(5, 42, map, brain3, brain3);
        String dir3 = world3.getAnt(0).getDirection();
        if (!"southwest".equals(dir3)) {
            fail(String.format("Ant 0 faces %s instead of southwest!", dir3));
        }
        String brain4 = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\nturn right\njump 0\n}";
        WorldInfo world4 = gameInfo.simulate(6, 42, map, brain4, brain4);
        String dir4 = world4.getAnt(0).getDirection();
        if (!"west".equals(dir4)) {
            fail(String.format("Ant 0 faces %s instead of west!", dir4));
        }
        String brain5 = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\nturn right\nturn right\njump 0\n}";
        WorldInfo world5 = gameInfo.simulate(7, 42, map, brain5, brain5);
        String dir5 = world5.getAnt(0).getDirection();
        if (!"northwest".equals(dir5)) {
            fail(String.format("Ant 0 faces %s instead of northwest!", dir5));
        }
    }
}
