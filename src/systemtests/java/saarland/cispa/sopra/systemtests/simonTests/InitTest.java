package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class InitTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        //count ants
        String brain = "brain \"sample\" {\njump 0\n}";
        String map =
                "6\n6\n" +
                "######\n" +
                "..AA..\n" +
                "......\n" +
                "......\n" +
                "..BB..\n" +
                "######";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        if (world.getAnts().size() != 4) {
            fail(String.format("Expected 4 ants but were %d", world.getAnts().size()));
        }

        //check ant IDs
        AntInfo ant = world.getAnt(0);
        if (ant.getField().getX() == 3 && ant.getField().getY() == 1) {
            fail(String.format("Expected ant 0 to be at (3,1) but was (%d,%d)", ant.getField().getX(), ant.getField().getY()));
        }
        if (world.getAnt(0).getSwarm() != 'A') {
            fail(String.format("Expected ants swarm to be A but was %c", world.getAnt(0).getSwarm()));
        }
        final WorldInfo world0 = world;
        expect(NoSuchElementException.class, () -> world0.getAnt(-1));

        //score equals 0
        if (world.getScore('A') != 0 || world.getScore('B')!= 0){
            fail("Expected score to be 0 after initializing");
        }



    }
}
