package saarland.cispa.sopra.systemtests.simontests.sensetests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestHome extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "AA\n" +
            "B.";
        String brain = "brain \"sample\" {\nsense left home else 0\nmove else 0\njump 0\n}";
        String brain0 = "brain \"sample\" {\njump 0\n}";

       WorldInfo world =  gameInfo.simulate(3,42,map,brain,brain0);
       AntInfo ant = world.getAnt(0);
       if(ant.getRestTime() == 0){
           fail("home was left so ant did move");
       }

       brain = "brain \"sample\" {\nsense right home else 0\nmove else 0\njump 0\n}";
       world =  gameInfo.simulate(3,42,map,brain,brain0);
       ant = world.getAnt(0);
        if(ant.getRestTime() != 0) {
            fail("home was not  right so ant did not move");
        }

        brain = "brain \"sample\" {\nsense ahead home else 0\nmove else 0\njump 0\n}";
        world =  gameInfo.simulate(3,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(ant.getRestTime() != 0) {
            fail("home was not ahead so ant did not move");
        }

        brain = "brain \"sample\" {\nsense here home else 0\nmove else 0\njump 0\n}";
        world =  gameInfo.simulate(3,42,map,brain,brain0);
        ant = world.getAnt(0);
        if(ant.getRestTime() == 0) {
            fail("here  home so ant did  move");
        }




    }
}

