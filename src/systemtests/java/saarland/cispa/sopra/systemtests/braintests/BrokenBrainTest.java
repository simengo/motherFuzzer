package saarland.cispa.sopra.systemtests.braintests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BrokenBrainTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "..B.\n" +
            "....";

        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "flip", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "move", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "sense", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "turn", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "jump", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "drop", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "pickup", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "set", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "unset", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "mark", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "unmark", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "test", map));
        expect(IllegalArgumentException.class, () -> createBrokenBrain(gameInfo, "x", map));
        try {
            createBrokenBrain(gameInfo, "xx", map);
        } catch (IllegalArgumentException x){
            fail("empty name is legal");
            //TODO is it legal to let the name empty?
        }

        expect(IllegalArgumentException.class, () -> createBrokenBrain1(gameInfo, map));

        expect(IllegalArgumentException.class, () -> createBrokenBrain2(gameInfo, map));
    }


    private void createBrokenBrain(GameInfo gameInfo, String keyword, String map) {
        String brain1 = "brain " +
            "\"" + keyword + "\" {\nmove else 3\nturn left\njump 1\nmark 0\njump 3\n}";

        gameInfo.simulate(3, 42, map, brain1, brain1);
    }

    private void createBrokenBrain1(GameInfo gameInfo, String map) {
        String brain1 = "\"" + "sample" + "\" {\nmove else 3\nturn left\njump 1\nmark 0\njump 3\n}";

        gameInfo.simulate(3, 42, map, brain1, brain1);
    }
    private void createBrokenBrain2(GameInfo gameInfo, String map) {
        String brain1 = "\"" + "sample" + "\" {\njump 1\n}";

        gameInfo.simulate(3, 42, map, brain1, brain1);
    }
}
