package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest4 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\nset 0\nset 1\nset 2\nset 3\nset 4\nset 5\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";

        WorldInfo world = gameInfo.simulate(7, 42, map, brainA, brainB);
        boolean[] arr = world.getAnt(0).getRegister();
        if (!arr[0] || !arr[1] || !arr[2] || !arr[3] || !arr[4] || !arr[5]) {
            fail("0,1,2,3,4 and 5 were setted");
        }
        brainA = "brain \"sample\" {\nset 0\nset 1\nset 2\nset 3\nset 4\nset 5\nunset 0\nunset 1\nunset 2\nunset 3\nunset 4\nunset 5\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";

        world = gameInfo.simulate(13, 42, map, brainA, brainB);
        arr = world.getAnt(0).getRegister();
        if (arr[0] || arr[1] || arr[2] || arr[3] || arr[4] || arr[5]) {
            fail("B 0,1,2,3,4 and 5 were unsetted");
        }

        brainA = "brain \"sample\" {\nset 0\nset 1\nset 2\nset 3\nset 4\nset 5\nunset 0\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";

        world = gameInfo.simulate(8, 42, map, brainA, brainB);
        arr = world.getAnt(0).getRegister();
        if (arr[0] || !arr[1] || !arr[2] || !arr[3] || !arr[4] || !arr[5]) {
            fail("A 0,1,2,3,4 and 5 were unsetted");
        }




    }
}

