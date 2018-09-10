package saarland.cispa.sopra.systemtests.dennistests.settests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class TestTest1 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {


        String map = "2\n2\n" +
            ".A\n" +
            "B.";


        String brainZuTest1 = "brain \"sample\" {\nset 0\ntest 0 else 3\njump 2\njump 3\n}";
        String brainZuTest2 = "brain \"sample\" {\nset 5\ntest 5 else 3\njump 2\n jump 3\n}";
        String kbrainZuTest1 = "brain \"sample\" {\ntest 2 else 2\njump 1\njump 2\n}";

        String kapBrain1 = "brain \"sample\" {\nset 0\ntest -1 else 3\njump 2\njump 3\n}";
        String kapBrain2 = "brain \"sample\" {\nset 0\ntest 7 else 3\njump 2\njump 3\n}";

        String kapBrain12 = "brain \"sample\" {\nset 0\ntest 0 else -1\njump 2\njump 3\n}";
        String kapBrain23 = "brain \"sample\" {\nset 0\ntest 0 else 4\njump 2\njump 3\n}";

        expect(Exception.class, ()-> gameInfo.simulate(5, 42, map, kapBrain1,brainZuTest1));
        expect(Exception.class, ()-> gameInfo.simulate(5, 42, map, kapBrain2,brainZuTest1));
        expect(Exception.class, ()-> gameInfo.simulate(5, 42, map, kapBrain12,brainZuTest1));
        expect(Exception.class, ()-> gameInfo.simulate(5, 42, map, kapBrain23,brainZuTest1));


        WorldInfo world =  gameInfo.simulate(2, 42, map, brainZuTest1,brainZuTest2);
        WorldInfo world2 =  gameInfo.simulate(2, 42, map, kbrainZuTest1,brainZuTest2);

        if(world.getAnt(0).getPc() != 2) {fail("test 0 should have found true");}
        if(world.getAnt(1).getPc() != 2) {fail("test 0 should have found true");}

        if(world2.getAnt(0).getPc() != 2) {fail("test 0 should not have found true");}



    }
}
