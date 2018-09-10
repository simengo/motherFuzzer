package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class GetFieldTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "2\n2\n" + ".A\n" + "B.";
        String brain = "brain \"sample\" {\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain,brain);

        expect(NoSuchElementException.class, () -> world.getFieldAt(-1,-1));
        expect(NoSuchElementException.class, () -> world.getFieldAt(2,2));
    }
}
