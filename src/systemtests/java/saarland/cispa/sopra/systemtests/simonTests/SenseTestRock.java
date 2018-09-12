package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestRock extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "#A\n" +
            "B.";
        String brain = "brain \"sample\" {\nsense left rock else 0\nturn right\njump 0\n}";
        String brain0 = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";

       WorldInfo world =  gameInfo.simulate(2,42,map,brain,brain0);
       AntInfo ant = world.getAnt(0);
       if(!(dir.equals(ant.getDirection()))){
           fail("rock was left so ant did move");
       }

       brain = "brain \"sample\" {\nsense right rock else 0\nturn right\njump 0\n}";
       world =  gameInfo.simulate(2,42,map,brain,brain0);
       ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("rock was not  right so ant did not move");
        }

        brain = "brain \"sample\" {\nsense ahead rock else 0\nturn right\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("rock was not ahead so ant did not move");
        }

        brain = "brain \"sample\" {\nsense here rock else 0\nturn right\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(dir.equals(ant.getDirection())) {
            fail("here not rock so ant did not move");
        }




    }
}

