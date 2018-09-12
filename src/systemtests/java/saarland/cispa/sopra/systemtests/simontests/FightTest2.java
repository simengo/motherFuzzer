package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {

        String map =
            "6\n6\n"+
            "######\n"+
            "AAAA##\n"+
            "AABA##\n"+
            "A.####\n"+
            "AAA###\n"+
            "######";
        String brain = "brain \"sample\" {\nmove else 1\njump 0\n}";
        WorldInfo world = gameInfo.simulate(3, 42, map, brain, brain);
        expect(NoSuchElementException.class, () -> world.getAnt(6));
        /*if (world1.getScore('B') != 3) {
            fail("Expected B to have 3 food points");
        }*/
    }
}
