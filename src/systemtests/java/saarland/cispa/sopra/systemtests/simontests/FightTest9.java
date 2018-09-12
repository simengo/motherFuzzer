package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest9 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "AAA.\n" +
            "CB..\n" +
            "DDD.\n" +
            "....";
        String cBrain ="brain \"sample\" {\nmove else 0\njump 0\n}";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        WorldInfo world = gameInfo.simulate(1,42,map,brain,brain,cBrain,brain);
        expect(NoSuchElementException.class, () -> world.getAnt(3));
        if (world.getScore('C') == 0) {
            fail("Expected C to have 3 points");
        }
        if (world.getScore('B') != 0){
            fail("Expected B to be alive with 0 points");
        }


    }
}
