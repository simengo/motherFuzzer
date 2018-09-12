import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import saarland.cispa.sopra.Game;
import saarland.cispa.sopra.WorldParser;
import saarland.cispa.sopra.systemtests.WorldInfo;

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

    @Test
    public void FoodTest3() {

        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "...1\n" +
            "...B";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n pickup  else 1 \n drop else 2 \n jump 2\n}";

        Game game = new Game();
        WorldInfo winfo = game.simulate(1, 4, map, brainA, brainB);


        if (winfo.getAnt(1).hasFood()) {
            fail("Ant1 shouldnt pick up the food");
        }

        WorldInfo winfo2 = game.simulate(2, 4, map, brainA, brainB);

        if (winfo2.getFieldAt(3, 3).getFood() != 0) {
            fail("There shouldnt be Food on Field (3,3) !");
        }


    }


}
