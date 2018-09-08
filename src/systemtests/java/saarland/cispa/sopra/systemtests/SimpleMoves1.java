package saarland.cispa.sopra.systemtests;


/* Initiale Ausrichtung + easy StandartMoves + sleep after Move*/
public class SimpleMoves1 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


// test 0

        String map = "4\n4\n" +
            "....\n" +
            ".#AB\n" +
            ".##.\n" +
            "....";

        String brain = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 1\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1, 11, map, brain, brainB);


        String initDir0 = winfo.getAnt(0).getDirection();

        if (!"northwest".equals(initDir0)) {

            fail(String.format("Ant 0 does not initial face northwest! Faces %s instead!", initDir0));
        }


        String initDir1 = winfo.getAnt(1).getDirection();

        if (!"northwest".equals(initDir1)) {

            fail(String.format("Ant 1 does not initial face northwest! Faces %s instead!", initDir1));
        }


        testAntField(winfo, 2, 1, 3, 0);


// test 1

        map = "4\n4\n" +
            "..A.\n" +
            ".##.\n" +
            ".##.\n" +
            "B...";

        brain = "brain \"sample\" {\n jump 0\n}";
        brainB = "brain \"sample\" {\n move else 1\n jump 0\n}";

        WorldInfo winfot = gameInfo.simulate(1, 11, map, brain, brainB);


        initDir0 = winfot.getAnt(0).getDirection();

        if (!"northwest".equals(initDir0)) {

            fail(String.format("Ant 0 does not initialy face northwest! Faces %s instead!", initDir0));
        }


        initDir1 = winfot.getAnt(1).getDirection();

        if (!"northwest".equals(initDir1)) {

            fail(String.format("Ant 1 does not initial face northwest! Faces %s instead!", initDir1));
        }


        testAntField(winfot, 1, 0, 2);


// test 2
// map gleich

        brain = "brain \"sample\" {\n turn right \n turn right \n move else 3 \n jump 0\n}";
        brainB = "brain \"sample\" {\n turn left \n move else 2 \n jump 2 \n jump 0\n}";
        WorldInfo winfo2 = gameInfo.simulate(3, 151, map, brain, brainB);


        testAntField(winfo2, 3, 0, 3, 3);


}


}
