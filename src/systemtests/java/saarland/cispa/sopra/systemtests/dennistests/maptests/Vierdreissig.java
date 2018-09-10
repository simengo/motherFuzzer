package saarland.cispa.sopra.systemtests.dennistests.maptests;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class Vierdreissig extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map4 = createField(24, 32);

        String brain = "brain \"sample\" {\njump 0\n}";


        gameInfo.simulate(1, 42, map4,brain,brain);

    }
}
