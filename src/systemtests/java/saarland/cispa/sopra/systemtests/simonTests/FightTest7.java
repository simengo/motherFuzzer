package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest7 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "6\n6\n" +
            "######\n" +
            "#AA###\n" +
            "#ABAAA\n" +
            "#.###A\n" +
            "##AAAA\n" +
            "######";
        String brain = "brain \"sample\" {\nmove else 0\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        expect(NoSuchElementException.class, () -> world.getAnt(3));
        if (world.getScore('B') == 0) {
            fail("Expected B to have 3 points");
        }
    }
}
