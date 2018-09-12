package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestFoe extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "BA\n" +
            "B.";
        String brain = "brain \"sample\" {\nsense left foe else 0\nturn right\njump 0\n}";
        String brain0 = "brain \"sample\" {\njump 0\n}";
        String dir = "northeast";

       WorldInfo world =  gameInfo.simulate(2,42,map,brain,brain0);
       AntInfo ant = world.getAnt(1);
       if(!(dir.equals(ant.getDirection()))){
           fail("foe was left so ant did turn");
       }

       brain = "brain \"sample\" {\nsense right foe else 0\nturn right\njump 0\n}";
       world =  gameInfo.simulate(2,42,map,brain,brain0);
       ant = world.getAnt(1);
        if(dir.equals(ant.getDirection())) {
            fail("foe was not right so ant did not  turn");
        }

        brain = "brain \"sample\" {\nsense ahead foe else 0\nturn right\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(1);
        if(!(dir.equals(ant.getDirection()))) {
            fail("foe was  ahead so ant did  turn");
        }

        brain = "brain \"sample\" {\nsense here foe else 0\nmove else 0\njump 0\n}";
        world =  gameInfo.simulate(2,42,map,brain,brain0);
        ant = world.getAnt(1);
        if(dir.equals(ant.getDirection())) {
            fail("here  not foe  so ant did not turn");
        }




    }
}

