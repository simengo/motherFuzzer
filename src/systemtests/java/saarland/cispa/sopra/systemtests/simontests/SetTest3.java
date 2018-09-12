package saarland.cispa.sopra.systemtests.simontests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SetTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brainA = "brain \"sample\" {\ntest 0 else 0\nturn right\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";


        WorldInfo world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("0 was not setted so ant did not turn");
        }

        brainA = "brain \"sample\" {\ntest 1 else 0\nturn right\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";
        dir = "northeast";


        world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("1 was not setted so ant did not turn");
        }

        brainA = "brain \"sample\" {\ntest 2 else 0\nturn right\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";
        dir = "northeast";


        world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("2 was not setted so ant did not turn");
        }

        brainA = "brain \"sample\" {\ntest 3 else 0\nturn right\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";
        dir = "northeast";


        world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("3 was not setted so ant did not turn");
        }

        brainA = "brain \"sample\" {\ntest 4 else 0\nturn right\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";
        dir = "northeast";


        world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("4 was not setted so ant did not turn");
        }

        brainA = "brain \"sample\" {\ntest 5 else 0\nturn right\njump 0\n}";
        brainB = "brain \"sample\" {\njump 0\n}";
        dir = "northeast";


        world = gameInfo.simulate(2, 42, map, brainA, brainB);
        if(dir.equals(world.getAnt(0).getDirection())){
            fail("5 was not setted so ant did not turn");
        }




    }
}

