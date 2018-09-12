package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class BrainFaults extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain\"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "\n}";

        String brain1 = "brain\"stan1 1dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "\n}";

        String brain2 = "brain1\"stan1 1dby\"{" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "\n}";

        String brain3 = "brain\"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "}";

        String brain4 = "brain\"stan11dby\" {" +
            "set 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 17" +
            "\n}";
        String map = InitTests.full();

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map, brain1));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map, brain2));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map, brain3));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 1, map, brain4));

    }
}
