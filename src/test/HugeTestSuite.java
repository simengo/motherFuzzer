import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.WorldInfo;


import java.io.File;
import java.util.HashMap;
import java.util.NoSuchElementException;

import static com.ibm.icu.impl.Assert.fail;

public class HugeTestSuite {

    @Test
    public void testRegex() {

        String map = "2\n2\nAB\n..\n\n";
        String brainZuTest1 = "brain \"sample\" {\nset 0\ntest 0 else 3\njump 2\njump 3\n}";
        Game game = new Game();
        game.simulate(1, 1, map, brainZuTest1, brainZuTest1);


    }

    @Test
    public void testChanges() {

        String map = String.format("2%n2%n.A%n.B");

        String brainZuTest1 = "brain \"sample\" {\nset 0\ntest 0 else 3\njump 2\njump 3\n}";
        Game game = new Game();
        game.simulate(1, 1, map, brainZuTest1, brainZuTest1);

    }

    @Test
    public void testBackslashN() {

        String map = String.format("4%n4%n....%nAAAA%n====%nBBBB%n....");
        String brainZuTest1 = "brain \"sample\" {\nset 0\ntest 0 else 3\njump 2\njump 3\n}";
        Game game = new Game();
        game.simulate(1, 1, map, brainZuTest1, brainZuTest1);

    }

    @Test
    public void Test1Test() {


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

        Game gameInfo = new Game();

//        gameInfo.simulate(5, 42, map, kapBrain1, brainZuTest1);
//        gameInfo.simulate(5, 42, map, kapBrain2, brainZuTest1);
//        gameInfo.simulate(5, 42, map, kapBrain12, brainZuTest1);
//        gameInfo.simulate(5, 42, map, kapBrain23, brainZuTest1);


        WorldInfo world = gameInfo.simulate(2, 42, map, brainZuTest1, brainZuTest2);
        WorldInfo world2 = gameInfo.simulate(2, 42, map, kbrainZuTest1, brainZuTest2);

        if (world.getAnt(0).getPc() != 2) {
            fail("test 0 should have found true");
        }
        if (world.getAnt(1).getPc() != 2) {
            fail("test 0 should have found true");
        }

        if (world2.getAnt(0).getPc() != 2) {
            fail("test 0 should not have found true");
        }


    }

    @Test
    public void Illegal3Food() {
        String map =
            "4\n4\n" +
                ".A..\n" +
                "1...\n" +
                "..B.\n" +
                "....";
        Game gameInfo = new Game();
        String brain = "brain \"sample\" {\nturn left\nturn left\nmove else 0\npickup else 0\nturn right\nturn right\nturn right\nmove else 0\ndrop else 0\njump 0\n}";
        String brain0 = "brain \"sample\" {\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(37, 42, map, brain, brain0);
        if (world.getAnt(0).hasFood()) {
            fail("ant didn't drop food");
        }
        if (world.getScore('A') != 1) {
            fail(String.format("score should be 1 but is %d", world.getScore('A')));
        }
        if (world.getFieldAt(1, 0).getFood() != 0) {
            fail("there can not be food on base");
        }
    }

    @Test
    public void Illegal2Stuff() {


        String map = "2\n2\n" +
            "11\n" +
            "AB";
        String brain = "brain \"stan11dby\" {\nset -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain1 = "brain \"stan11dby\" {" +
            "\nset 6\npickup else 2\ndrop else 2\njump 0\n}";
        String brain2 = "brain \"stan11dby\" {" +
            "\nmark -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain3 = "brain \"stan11dby\" {" +
            "\nmark 8\npickup else 2\ndrop else 2\njump 0\n}";
        String brain4 = "brain \"stan11dby\" {\nunset 6\npickup else 2\ndrop else 2\njump 0\n}";
        String brain5 = "brain \"stan11dby\" {" +
            "\nunset -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain6 = "brain \"stan11dby\" {" +
            "\ntest -1 else 1\npickup else 2\ndrop else 2\njump 2\n}";
        String brain7 = "brain \"stan11dby\" {" +
            "\ntest 6 else 1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain8 = "brain \"stan11dby\" {" +
            "\nsett 17\npickup else 2\ndrop else 2\njump 0\n}";
        String brain9 = "brain \"stan11dby\" {" +
            "\nahead else 2" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        String brain10 = "brain \"stan11dby\" {" +
            "\nsense back ahead else 2" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";
        String brain11 = "brain \"stan11dby\" {" +
            "\nflip 1,3" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        String brain12 = "brain \"stan11dby\" {" +
            "\nflip -1" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\njump 0" +
            "\n}";

        String brain13 = "brain \"stan11dby\" {" +
            "\nturn north\npickup else 2\ndrop else 2\njump 0\n}";

        String brain14 = "brain \"stan11dby\" {\nfriend\npickup else 2\ndrop else 2\njump 0\n}";
        String brain15 = "brain \"stan11dby\" {" +
            "\nnorth\npickup else 2\ndrop else 2\njump 0\n}";
        Game gameInfo = new Game();
        try {
            gameInfo.simulate(2, 1, map, brain, brain);
            gameInfo.simulate(2, 1, map, brain1, brain1);
            gameInfo.simulate(2, 1, map, brain2, brain2);
            gameInfo.simulate(2, 1, map, brain3, brain3);
            gameInfo.simulate(2, 1, map, brain4, brain4);
            gameInfo.simulate(2, 1, map, brain5, brain5);
            gameInfo.simulate(2, 1, map, brain6, brain6);
            gameInfo.simulate(2, 1, map, brain7, brain7);
            gameInfo.simulate(2, 1, map, brain8, brain8);
            gameInfo.simulate(2, 1, map, brain9, brain9);
            gameInfo.simulate(2, 1, map, brain14, brain14);
            gameInfo.simulate(2, 1, map, brain15, brain15);
            gameInfo.simulate(2, 1, map, brain10, brain10);
            gameInfo.simulate(2, 1, map, brain11, brain11);
            gameInfo.simulate(2, 1, map, brain12, brain12);
            gameInfo.simulate(2, 1, map, brain13, brain13);
        } catch (IllegalArgumentException x) {
            x.printStackTrace();
        }
    }

    @Test
    public void Init3Test() {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        String wBrain = "bra in \"sample\" {\nturn left\njump 0\n}";
        String wrBrain = "brain \"sa mple\" {\nturn left\njump 0\n}";
        Game gameInfo = new Game();
        try {
            gameInfo.simulate(1, 42, map, brain, brain, brain);
            gameInfo.simulate(1, 42, map, brain);
            gameInfo.simulate(1, 42, map, wBrain, wBrain);
            gameInfo.simulate(1, 42, map, wrBrain, wrBrain);
            gameInfo.simulate(1, 42, map, brain, brain);
            WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
            if (world.getFieldAt(0, 0).getFood() != 0 || world.getFieldAt(1, 0).getFood() != 0) {
                fail("initial food is 0!");
            }

        } catch (IllegalArgumentException x) {
            x.notifyAll();
        }
    }

    @Test
    public void Acola1Test() {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\ndirection weast else 0\njump 0\n}";
        Game game = new Game();
        game.simulate(1, 42, map, brain, brain);

        //direction with wrong parameter2
        String brain0 = "brain \"sample\" {\ndirection west else 9\njump 0\n}";
        game.simulate(1, 42, map, brain0, brain0);
    }

    @Test
    public void Acola2Test() {

        //direction with wrong parameter1
        String map = "2\n2\n" +
            "#A\n" +
            "B#";
        Game gameInfo = new Game();
        String brain = "brain \"sample\" {\nmove else 2\njump 0\nturn right\njump 0\n}";
        String dir = "northeast";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction move");
        }

        brain = "brain \"sample\" {\nsense here marker 0 else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction sense");
        }

        brain = "brain \"sample\" {\ntest 0 else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction test");
        }

        brain = "brain \"sample\" {\npickup else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction pickup");
        }

        brain = "brain \"sample\" {\ndrop else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction drop");
        }

        brain = "brain \"sample\" {\ndirection east else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction direction");
        }
    }

    @Test
    public void testNullPointer() {

        Game game = new Game();
        String map = "4\n4\nA...\n.B..\n";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        game.simulate(1, 1, new File(""), new File(""), new File(""));


    }

    @Test
    public void testIllegalMap() {
        String map = "4\n4\nA...\n.B..\n";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        Game game = new Game();
        game.simulate(1, 1, map, brain, brain);

    }

    @Test
    public void Acola3Test() {

        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        Game gameInfo = new Game();
        try {
            gameInfo.simulate(-1, 42, map, brain, brain);
            fail("Simulating with -1 rounds worked");
        } catch (IllegalArgumentException x) {
            x.notifyAll();
        }
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        try {
            world.getAnt(-1);
            fail("Getting Ant with ID -1 worked");
        } catch (NoSuchElementException x) {
            x.notify();
        }
        if (world.getAnt(0).getRestTime() != 0) {
            fail("at the beginning resttime is 0");
        }

        String aBrain = "brain \"sample\" {\nturn rechts\njump 0\n}";
        try {
            gameInfo.simulate(1, 42, map, aBrain, aBrain);
            fail("Wrong direction accepted");
        } catch (IllegalArgumentException x) {
            x.notifyAll();
        }
        String bBrain = "brain \"sample\" {\nflip -8\njump 0\n}";
        try {
            gameInfo.simulate(1, 42, map, bBrain, bBrain);

        } catch (IllegalArgumentException x) {
            x.notifyAll();
        }

        String cBrain = "brain \"sample\" {\nturn left\njump -1\n}";
        String dBrain = "brain \"sample\" {\nset 8\njump 0\n}";
        String eBrain = "brain \"sample\" {\nsense here marker else 0\njump 0\n}";
        String fBrain = "brain \"sample\" {\ntest 7\njump 0\n}";
        String gBrain = "brain \"sample\" {\nmark 8\njump 0\n}";
        String map1 = "...." +
            "AA..\n" +
            "BB..\n" +
            "....\n" +
            "....";
        try {
            gameInfo.simulate(1, 42, map, cBrain, cBrain);
            gameInfo.simulate(1, 42, map, dBrain, dBrain);
            gameInfo.simulate(1, 42, map, eBrain, eBrain);
            gameInfo.simulate(1, 42, map, fBrain, fBrain);
            gameInfo.simulate(1, 42, map, gBrain, gBrain);
            gameInfo.simulate(1, 42, map1, brain, brain);
        } catch (IllegalArgumentException x) {
            x.notifyAll();
        }
    }


    @Test
    public void DennisTestWorldParser() {
        String map2 = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "....\n" +
            "..C.";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";

        Game game = new Game();

        try {
            game.simulate(1, 1, map2, brain, brain);
        } catch (IllegalArgumentException x) {

        }
    }

    @Test
    public void illegalMap() {


        String map = "6\n6\n..##..\n####..\n.....A\n.3##..\n......\n.B..#.";

        Instruction[] brain = new Instruction[2];
        brain[0] = new Move(1);
        brain[1] = new Jump(0);


        Swarm swarmA = new Swarm('A', brain, "brainA");
        Swarm swarmB = new Swarm('B', brain, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        WorldParser.parseMap(map, 2, swarms);

    }

    @Test
    public void illegalSeedRound() {
        String map1 = "2\n2\n" +
            "AB\n" +
            "..\n";

        String brain = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        Game game = new Game();
        game.simulate(1, -1, map1, brain, brain);
        try {
            game.simulate(-1, 1, map1, brain, brain);
        } catch (IllegalArgumentException x) {

        }
    }

    @Test
    public void FoodTest3() {

        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "...1\n" +
            "...B";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n pickup  else 1 \n drop else 2 \n jump 2\n}";

        Game game = new Game();
        WorldInfo winfo = game.simulate(1, 4, map, brainA, brainB);


        if (winfo.getAnt(1).hasFood()) {
            fail("Ant1 shouldnt pick up the food");
        }

        WorldInfo winfo2 = game.simulate(2, 4, map, brainA, brainB);

        if (winfo2.getFieldAt(3, 3).getFood() != 0) {
            fail("There shouldnt be Food on Field (3,3) !");
        }


    }


}
