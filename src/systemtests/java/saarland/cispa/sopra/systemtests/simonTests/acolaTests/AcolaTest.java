package saarland.cispa.sopra.systemtests.simontests.acolatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class AcolaTest extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //toBigBrain
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = createBigBrain();
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain, brain));

        //brain with withespaces
        String map0 = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain0 = "brain \"sample\" {\n turn left\n jump 0 \n}";
        try {
            gameInfo.simulate(1, 42, map0, brain0, brain0);
        } catch (IllegalArgumentException e) {
            fail("Expected brain to be accepted!");
        }
        //brain with keyword
        String brain1 = "brain \"food\" {\nturn left\n jump 0 \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, brain1, brain1));

        //brain not starting with brain
        String braim = "braim \"sample\" {\nturn left\n jump 0 \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, braim, braim));

        //brain negative index
        String negBrain = "brain \"sample\" {\nmove else -5\n jump 0 \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, negBrain, negBrain));

        //brain to big index
        String indBrain = "brain \"sample\" {\nmove else 9\n jump 0 \n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, indBrain, indBrain));

        //empty brain
        String empBrain = "brain \"sample\" {}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, empBrain, empBrain));

        //brain without jump
        String jBrain = "brain \"sample\" {\nturn left\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, jBrain, jBrain));

        //brain with short name
        String sBrain = "brain \"w\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, sBrain, sBrain));

        //brain without \n 1
        /*String enBrain = "brain \"sample\" {\nturn left\njump 0}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, enBrain, enBrain));

        //brain without \n 2
        String anBrain = "brain \"sample\" {turn left\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, map, anBrain, anBrain));
        */
    }

    public String createBigBrain() {
        StringBuilder result = new StringBuilder(50);
        result.append("brain \"sample\" {\n");
        for (int i = 0; i <= 2501; i++) {
            result.append("turn left\n");
        }
        result.append("jump 0\n}");
        return result.toString();
    }

}
