package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SwarmCheck extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.swarmCheck();

        String brain = "brain \"stan11dby\" {" +
            "\nset 1" +
            "\nmove else 0" +
            "\nturn left" +
            "\ndirection west else 0" +
            "\nturn left" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        WorldInfo welt = gameInfo.simulate(0, 1, map, brain, brain, brain, brain);

        if ('A' != welt.getFieldAt(0, 0).getAnt().get().getSwarm()) {
            fail("Falsche Schwarmzugehörigkeit A");
        }

        if ('B' != welt.getFieldAt(1, 0).getAnt().get().getSwarm()) {
            fail("Falsche Schwarmzugehörigkeit B");
        }

        if ('C' != welt.getFieldAt(2, 0).getAnt().get().getSwarm()) {
            fail("Falsche Schwarmzugehörigkeit C");
        }

        if ('D' != welt.getFieldAt(3, 0).getAnt().get().getSwarm()) {
            fail("Falsche Schwarmzugehörigkeit D");
        }

    }
}
