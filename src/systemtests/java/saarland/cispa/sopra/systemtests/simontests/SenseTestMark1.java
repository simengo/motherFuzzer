package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestMark1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\nmove else 0\nmark 1\nmove else 0\nturn right\nsense left marker 1 else 1\nturn right\njump 0\n}";
        String brain0 = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";

       WorldInfo world =  gameInfo.simulate(34,42,map,brain,brain0);
       AntInfo ant = world.getAnt(0);
       if(!(dir.equals(ant.getDirection()))){
           fail("mark 1 was left so ant did turn");
       }

       brain = "brain \"sample\" {\nturn left\nmove else 0\nmark 1\nmove else 0\nturn right\nsense right marker 1 else 1\nturn right\njump 0\n}";
       world =  gameInfo.simulate(34,42,map,brain,brain0);
       ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("mark 1 was not right so ant did not turn");
        }

        brain = "brain \"sample\" {\nturn left\nmove else 0\nmark 1\nmove else 0\nturn right\nsense ahead marker 1 else 1\nturn right\njump 0\n}";
        world =  gameInfo.simulate(34,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("mark 1 was not ahead so ant did not turn");
        }

        brain = "brain \"sample\" {\nturn left\nmove else 0\nmark 1\nmove else 0\nturn right\nsense here marker 1 else 1\nturn right\njump 0\n}";
        world =  gameInfo.simulate(34,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("here  not mark 1  so ant did not turn");
        }




    }
}

