package saarland.cispa.sopra.systemtests.dennistests.maptests;

import saarland.cispa.sopra.systemtests.GameInfo;

import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;


public class GuessItsSkipped extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map123 = "2\n2\n" + "AC\n" + "..";
        String map234 = "2\n2\n" + "..\n" + ".C";
        String map345 = "2\n2\n" + "AB\n" + ".";

        String brain = "brain \"sample\" {\njump 0\n}";

        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map123, brain,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map234, brain,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map345, brain,brain));


    }
}
