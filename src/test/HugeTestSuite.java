import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import saarland.cispa.sopra.Game;

import static com.ibm.icu.impl.Assert.fail;

public class HugeTestSuite {

    @Test
    public void DennisTestWorldParser() {
        String map2 = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "....\n" +
            "..C.";

        String brain = "brain " +
            "\"sample\" {\nturn left\njump 0\n}";

        Game game = new Game();

        try {
            game.simulate(1, 1, map2, brain, brain);
        } catch (IllegalArgumentException x) {

        }
    }

    @Test
    public void illegalSeedRound() {
        String map1 = "2\n2\n" +
            "AB\n" +
            "..\n";

        String brain = "brain " +
            "\"collision\" {\nturn left\njump 0\n}";

        Game game = new Game();
        try {
            game.simulate(1, -1, map1, brain, brain);
        } catch (IllegalArgumentException x) {
        fail("Larrrrrrrrray");
        }
        try {
            game.simulate(-1, 1, map1, brain, brain);
        } catch (IllegalArgumentException x) {
           x.notifyAll();
        }
    }


}
