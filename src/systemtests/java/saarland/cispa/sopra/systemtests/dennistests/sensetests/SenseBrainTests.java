package saarland.cispa.sopra.systemtests.dennistests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class SenseBrainTests extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";

        String brain = "brain \"sample\" {\njump 0\n}";
        String brainLeft = "brain \"sample\" {\nsense left marker 7 else 2\njump 0\n}";
        String brainRight = "brain \"sample\" {\nsense right marker 7 else 2\njump 0\n}";
        String brainAhead = "brain \"sample\" {\nsense ahead marker 7 else 2\njump 0\n}";
        String brainHere = "brain \"sample\" {\nsense here marker 7 else 2\njump 0\n}";
        String brainFriend = "brain \"sample\" {\nsense left foe else 2\njump 0\n}";
        String brainFoe = "brain \"sample\" {\nsense left food else 2\njump 0\n}";
        String brainFood = "brain \"sample\" {\nsense left rock else 2\njump 0\n}";
        String brainRock = "brain \"sample\" {\nsense left home else 2\njump 0\n}";
        String brainHome = "brain \"sample\" {\nsense left home else 2\njump 0\n}";
        String brainFoehome = "brain \"sample\" {\nsense left marker else 2\njump 0\n}";

        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainLeft,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainLeft,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainRight,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainAhead,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainHere,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainFriend,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainFoe,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainFood,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainRock,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainHome,brain));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainFoehome,brain));


    }
}
