package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest5 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\nset 0\nset 1\nset 2\nset 3\nset 4\nset 5\njump 0\n}";
        String brainB = "brain \"sample\" {\nturn right\nturn right\nunset 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(7, 42, map, brainA, brainB);
        boolean[] arrA = world.getAnt(0).getRegister();
        boolean[] arrB = world.getAnt(1).getRegister();

        if (!arrA[0] || !arrA[1] || !arrA[2] || !arrA[3] || !arrA[4] || !arrA[5]) {
            fail("0,1,2,3,4 and 5 were setted");
        }

        if (arrB[0] || arrB[1] || arrB[2] || arrB[3] || arrB[4] || arrB[5]) {
            fail("0,1,2,3,4 and 5 were setted");
        }



    }
}

