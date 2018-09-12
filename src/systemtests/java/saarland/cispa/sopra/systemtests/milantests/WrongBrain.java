package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
public class WrongBrain extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain1 \"sample\" {\nturn left\njump 0\n}";
        String brain1 = "brain \"sample\" {\n}";
        String brain2 = "brain \"food\" {\nturn left\njump 0\n}";

        String map = "2\n2\n" +
            ".A\n" +
            "B.";

        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain,brain));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain1,brain1));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain2,brain2));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain2,brain2,brain2));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain2));
        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map));




    }
}
