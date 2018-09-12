package saarland.cispa.sopra.systemtests.simontests.sensetests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestFood extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "1A\n" +
            "B.";
        String brain = "brain \"sample\" {\nsense left food else 0\nturn right\njump 0\n}";
        String brain0 = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";

       WorldInfo world =  gameInfo.simulate(2,42,map,brain,brain0);
       AntInfo ant = world.getAnt(0);
       if(!(dir.equals(ant.getDirection()))){
           fail("food was left so ant did turn");
       }

       brain = "brain \"sample\" {\nsense right food else 0\nturn right\njump 0\n}";
       world =  gameInfo.simulate(2,42,map,brain,brain0);
       ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("food was not right so ant did not turn");
        }

        brain = "brain \"sample\" {\nsense ahead food else 0\nturn right\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("food was not ahead so ant did not turn");
        }

        brain = "brain \"sample\" {\nsense here food else 0\nmove else 0\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("here  not food  so ant did not turn");
        }




    }
}

