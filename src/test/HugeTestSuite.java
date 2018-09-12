import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.Game;

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

        game.simulate(1, 1, map2, brain, brain);
    }

}
