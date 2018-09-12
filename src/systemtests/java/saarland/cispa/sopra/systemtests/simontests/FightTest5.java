package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest5 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
            "2\n2\n" +
                "AA\n" +
                "BA";
        String brain = "brain \"sample\" {\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        expect(NoSuchElementException.class, () -> world.getAnt(2));
        /*if(world3.getScore('B') != 3){
            fail("Swarm B did not get 3 points");
        }*/
    }
}
