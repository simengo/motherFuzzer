package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseTestOppMark0 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "BA\n" +
            "..";
        String brain = "brain \"sample\" {\nsense left marker 0 else 0\nturn right\njump 0\n}";
        String brain0= "brain \"sample\" {\nmark 0\njump 0\n}";
        String dir = "northeast";

       WorldInfo world =  gameInfo.simulate(3,42,map,brain,brain0);
       AntInfo ant = world.getAnt(1);
       if(dir.equals(ant.getDirection())){
           fail("ant 1 can not sense marker 0 of B");
       }
    }
}

