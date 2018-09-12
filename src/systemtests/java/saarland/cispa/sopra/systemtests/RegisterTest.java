package saarland.cispa.sopra.systemtests;

public class RegisterTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            "A.\n" +
            "B.";

        String brain = "brain " +
            "\"sample\" {\nset 7\njump 0\n}";

        String brain2 = "brain " +
            "\"sample\" {\nset -1\njump 0\n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain2, brain2));
    }
}
