package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
                "6\n6\n" +
                "######\n"+
                "#AA###\n"+
                "#ABA##\n"+
                "#A####\n"+
                "######\n"+
                "######";
        String brain = "brain \"sample\" {\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        expect(NoSuchElementException.class, () -> world.getAnt(42));
        /*if (world0.getScore('B') != 3) {
            fail("Expected score to go up by 3");
        }*/


    }
}
