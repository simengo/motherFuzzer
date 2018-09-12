package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveAtEdge extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //move über Grenzen hinaus
        String map =
                "4\n4\n" +
                "A...\n" +
                "....\n"+
                ".B..\n"+
                "....";
        String oppBrain = "brain \"sample\" {\njump 0\n}";
        String brain0 = "brain \"sample\" {\nmove else 0\njump 0\n}";

        WorldInfo world0 = gameInfo.simulate(3, 42, map, brain0,oppBrain);
        AntInfo ant = world0.getAnt(0);
        if (ant.getField().getX() != 3 || ant.getField().getY() != 3) {
            fail(String.format("1Expected x to be 3 not %d and y to be 3 not %d", ant.getField().getX(), ant.getField().getY()));
        }

        String brain1 = "brain \"sample\" {\nturn right\nmove else 0\njump 0\n}";

        WorldInfo world1 = gameInfo.simulate(3, 42, map, brain1,oppBrain);
        AntInfo ant1 = world1.getAnt(0);
        if (ant1.getField().getX() != 0 || ant1.getField().getY() != 3) {
            fail(String.format("2Expected x to be 0 not %d and y to be 3 not %d", ant1.getField().getX(), ant1.getField().getY()));
        }

        String brain2 = "brain \"sample\" {\nturn left\nmove else 0\njump 0\n}";

        WorldInfo world2 = gameInfo.simulate(3, 42, map, brain2,oppBrain);
        AntInfo ant2 = world2.getAnt(0);
        if (ant2.getField().getX() != 3 || ant2.getField().getY() != 0) {
            fail(String.format("3Expected x to be 3 not %d and y to be 0 not %d", ant2.getField().getX(), ant2.getField().getY()));
        }

        String brain3 = "brain \"sample\" {\nturn left\nturn left\nmove else 0\njump 0\n}";

        WorldInfo world3 = gameInfo.simulate(4, 42, map, brain3,oppBrain);
        AntInfo ant3 = world3.getAnt(0);
        if (ant3.getField().getX() != 3 || ant3.getField().getY() != 1) {
            fail(String.format("4Expected x to be 3 not %d and y to be 1 not %d", ant3.getField().getX(), ant3.getField().getY()));
        }


        String map1 =     "4\n4\n" +
                          "....\n" +
                          "..A.\n"+
                          "....\n"+
                          "...B";
        String brain4 = "brain \"sample\" {\nturn right\nmove else 0\njump 0\n}";

        WorldInfo world4 = gameInfo.simulate(3, 42, map1, oppBrain,brain4);
        AntInfo ant4 = world4.getAnt(1);
        if (ant4.getField().getX() != 0 || ant4.getField().getY() != 2) {
            fail(String.format("5Expected x to be 0 not %d and y to be 2 not %d", ant4.getField().getX(), ant4.getField().getY()));
        }

        String brain5 = "brain \"sample\" {\nturn right\nturn right\nmove else 0\njump 0\n}";

        WorldInfo world5 = gameInfo.simulate(4, 42, map1, oppBrain,brain5);
        AntInfo ant5 = world5.getAnt(1);
        if (ant5.getField().getX() != 0 || ant5.getField().getY() != 3) {
            fail(String.format("6Expected x to be 0 not %d and y to be 3 not %d", ant5.getField().getX(), ant5.getField().getY()));
        }

        String brain6 = "brain \"sample\" {\nturn right\nturn right\nturn right\nmove else 0\njump 0\n}";

        WorldInfo world6 = gameInfo.simulate(5, 42, map1, oppBrain,brain6);
        AntInfo ant6 = world6.getAnt(1);
        if (ant6.getField().getX() != 0 || ant6.getField().getY() != 0) {
            fail(String.format("7Expected x to be 0 not %d and y to be 0 not %d", ant6.getField().getX(), ant6.getField().getY()));
        }

        String brain7 = "brain \"sample\" {\nturn right\nturn right\nturn right\nturn right\nmove else 0\njump 0\n}";

        WorldInfo world7 = gameInfo.simulate(6, 42, map1, oppBrain,brain7);
        AntInfo ant7 = world7.getAnt(1);
        if (ant7.getField().getX() != 3 || ant7.getField().getY() != 0) {
            fail(String.format("8Expected x to be 3 not %d and y to be 0 not %d", ant7.getField().getX(), ant7.getField().getY()));
        }




    }
}
