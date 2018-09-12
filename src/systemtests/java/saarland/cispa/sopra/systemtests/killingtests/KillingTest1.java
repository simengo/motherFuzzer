package saarland.cispa.sopra.systemtests.killingtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class KillingTest1 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String map1 = "4\n4\n" +
            "AAAA\n" +
            "AABA\n" +
            "A..A\n" +
            "..C.\n";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"sample\" {\nmove else 0\nturn left\nturn left\nturn left\njump 0\n}";

        WorldInfo world1 = gameInfo.simulate(2, 42, map1, brain, brain, brain2);

        if (world1.getFieldAt(2, 1).getAnt().isPresent()) {
            fail("Ant didn't die in world 1");
        }
        if (world1.getFieldAt(2, 1).getFood() == 3) {
            fail("trough death dropped food not automatically added to swarm base");
        }
        if (world1.getAnts().toArray().length != 10) {
            fail("getAnts also returns dead ants");
        }

        expect(NoSuchElementException.class, () -> world1.getAnt(6));
    }
}
