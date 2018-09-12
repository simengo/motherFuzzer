package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class InitTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,brain,brain,brain));
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,brain));

        String wBrain ="bra in \"sample\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,wBrain,wBrain));
        String wrBrain ="brain \"sa mple\" {\nturn left\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,wrBrain,wrBrain));

        WorldInfo world = gameInfo.simulate(1,42,map,brain,brain);
        if (world.getFieldAt(0,0).getFood() != 0 || world.getFieldAt(1,0).getFood() != 0){
            fail("initial food is 0!");
        }
    }
}
