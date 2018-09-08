package saarland.cispa.sopra.systemtests;

/* Test Rock Moves */
public class ComplexMoves1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

//test 1 rock

        String map = "6\n6\n" +
            "..A...\n" +
            ".#####\n" +
            ".#####\n" +
            "B.....\n" +
            "......\n" +
            "......";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n turn right \n move else 2 \n jump 2\n}";

        WorldInfo winfo = gameInfo.simulate(3, 1, map, brainA, brainB);

        testAntField(winfo,2,0,0,3);


//test 2 test rock no sleep

    map = "6\n6\n" +
        "......\n" +
        ".#####\n" +
        ".#####\n" +
        "...AB.\n" +
        "......\n" +
        "......";

    brainA = "brain \"sample\" {\n move else 1 \n turn right \n  jump 2\n}";
    brainB = "brain \"sample\" {\n move else 1 \n  turn left \n jump 2\n}";

    WorldInfo winfo2 = gameInfo.simulate(2, 4, map, brainA, brainB);

    testAntField(winfo2,3,3,4,3);

    String dir1 = winfo2.getAnt(0).getDirection();
    String dir2 = winfo2.getAnt(1).getDirection();

    if(!("northeast".equals(dir1))){
        fail(String.format("Direction of Ant 0 is %s but has to be northeast! (Sleep Fail Rock)", dir1));
    }

    if(!("west".equals(dir2))){
        fail(String.format("Direction of Ant 0 is %s but has to be west! (Sleep Fail Rock)", dir2));
    }



    //test 3 rock SideTeleport

        map = "6\n6\n" +
            ".#....\n" +
            ".#####\n" +
            "#####A\n" +
            "......\n" +
            "......\n" +
            ".B....";

        brainA = "brain \"sample\" {\n turn right \n turn right \n  move else 3 \n jump 3\n}";
        brainB = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n jump 3\n}";

        WorldInfo winfo3 = gameInfo.simulate(3,14,map,brainA,brainB);
        testAntField(winfo3,5,2,1,5);
    }

}
