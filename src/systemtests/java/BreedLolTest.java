
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class BreedLolTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo){
        String map = "4\n4\n" +
            "#AA#\n" +
            "AB=#\n" +
            "#A#A\n" +
            "####";

        String brainA = "brain \"sample\" {\nmove else 0\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brainA, brainB);
        expect(NoSuchElementException.class, () -> world.getAnt(3));
        expect(NoSuchElementException.class, () -> world.getAnt(5));
    }



}
