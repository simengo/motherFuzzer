package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class MapWhitespaceTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ". .\n" + "AB ";
        String brain = "brain \"sample\" {\nsense ahead friend else 2\njump 1\njump 2\n}";

        expect(Exception.class, ()->gameInfo.simulate(1,42,map, brain,brain));
    }
}
