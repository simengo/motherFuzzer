package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class MapTests3 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String mapA1 = "2\n2\n" +
            ".A" +
            "..";

        String mapAB = "2\n1\n" +
            ".A" +
            "B.";

        String mapAB2 = "1\n2\n" +
            ".A" +
            "B.";

        String mapA2 = "4\n4\n" +
            "...A\n" +
            "..B.\n" +
            "..A.\n" +
            "....\n";

        String mapPunkt = "2\n2\n" +
            ".." +
            "..";

        String mapFull = "6\n6\n" +
            "ABCDEF\n" +
            "GHIJKL\n" +
            "MNOPQR\n" +
            "STUVWX\n" +
            "YZ....\n" +
            "......";



        String brain = "brain \"sample\" {\njump 0\n}";

        try{gameInfo.simulate(1, 42, mapFull, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain, brain,brain);}
        catch(IllegalArgumentException error){ fail("Max Map failed");}

        expect(Exception.class, ()-> gameInfo.simulate(1, 42, mapA1,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, mapA2,brain,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, mapPunkt));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, mapAB,brain,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, mapAB2,brain,brain));




        // WorldInfo world = gameInfo.simulate(1, 42, mapAB, brain,brain);

       /* if(world.getFieldAt(1,0).getAnt().isPresent()){
            fail("No Ant found on baseField");*/
        }
    }

