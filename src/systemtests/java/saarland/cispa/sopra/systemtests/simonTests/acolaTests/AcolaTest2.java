package saarland.cispa.sopra.systemtests.simontests.acolatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class AcolaTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        //direction with wrong parameter1
        String map = "2\n2\n" +
            "#A\n" +
            "B#";
        String brain = "brain \"sample\" {\nmove else 2\njump 0\nturn right\njump 0\n}";
        String dir = "northeast";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction move");
        }

        brain = "brain \"sample\" {\nsense here marker 0 else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction sense");
        }

        brain = "brain \"sample\" {\ntest 0 else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction test");
        }

        brain = "brain \"sample\" {\npickup else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction pickup");
        }

        brain = "brain \"sample\" {\ndrop else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction drop");
        }

        brain = "brain \"sample\" {\ndirection east else 2\njump 0\nturn right\njump 0\n}";
        world = gameInfo.simulate(2, 42, map, brain, brain);
        if (!(dir.equals(world.getAnt(0).getDirection()))) {
            fail("wrong instruction direction");
        }


    }
}
