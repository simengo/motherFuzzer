package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class MoveMutanten extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String ameiseNorth = "brain \"North\" {" +
            "\nturn right" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";
        String ameiseWest = "brain \"West\" {" +
            "\nturn left" +
            "\nmove else 1" +
            "\njump 0" +
            "\n}";

        String hindernis = InitTests.hindernisMap();

        WorldInfo worldHindernis = gameInfo.simulate(3, 42, hindernis, ameiseNorth, ameiseNorth);

        if (!worldHindernis.getFieldAt(1, 1).getAnt().isPresent() || !worldHindernis.getFieldAt(2, 1).getAnt().isPresent()
            || worldHindernis.getAnts().size() != 2) {
            fail("Illegaler Mutantenmove");
        }

        WorldInfo mutantenwelt = gameInfo.simulate(3, 42, hindernis, ameiseWest, ameiseWest);

        if (!mutantenwelt.getFieldAt(1, 1).getAnt().isPresent() || mutantenwelt.getAnts().size() != 2 || !mutantenwelt.getFieldAt(2,1).getAnt().isPresent()) {
            fail("IllegalerMutantenmove");
        }
    }
}
