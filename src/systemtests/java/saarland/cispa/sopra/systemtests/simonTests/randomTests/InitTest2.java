package saarland.cispa.sopra.systemtests.simontests.randomtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class InitTest2 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "AAAA\n" +
            "....\n" +
            "....\n" +
            "BBBB";
        String brain = "brain \"sample\" {\njump 0\n}";
        String dir = "northwest";

        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);
        if (world.getAnts().isEmpty()) {
            fail("every swarm got 1 ant");
        }
        if (world.getFieldAt(0, 0).getAnt().get().getId() != 0 || world.getFieldAt(1, 0).getAnt().get().getId() != 1 || world.getFieldAt(2, 0).getAnt().get().getId() != 2 || world.getFieldAt(3, 0).getAnt().get().getId() != 3) {
            fail("swarm A not correct ids");
        }
        if (world.getFieldAt(0, 3).getAnt().get().getId() != 4 || world.getFieldAt(1, 3).getAnt().get().getId() != 5 || world.getFieldAt(2, 3).getAnt().get().getId() != 6 || world.getFieldAt(3, 3).getAnt().get().getId() != 7) {
            fail("swarm B not correct ids");
        }
        if (world.getAnt(0).hasFood() || world.getAnt(6).hasFood()) {
            fail("initialized ants don't have food");
        }
        if (!(dir.equals(world.getAnt(1).getDirection()) || dir.equals(world.getAnt(5).getDirection()))) {
            fail("initialized ants have direction NW");
        }
        if (world.getAnt(0).getField().getX() != 0 || world.getAnt(0).getField().getY() != 0) {
            fail("point at upper left is (0,0)");
        }
        boolean[] arr = world.getAnt(0).getRegister();
        if (arr[0] || arr[1] || arr[2] || arr[3] || arr[4] || arr[5]) {
            fail("initial register needs to be false");
        }

        String map1 = "4\n4\n" +
            "AAAA\n" +
            "AAAA\n" +
            "BBBB\n" +
            "BBBB";
        world = gameInfo.simulate(1, 42, map1, brain, brain);
        if (world.getAnts().size() != 16) {
            fail("there are 16 ants!");
        }

        String map2 = "4\n4\n" +
            "1..4\n" +
            "5..8\n" +
            "9AAA\n" +
            "BBBB";
        brain = "brain \"sample\" {\nturn left\njump 0\n}";
        WorldInfo world1 = gameInfo.simulate(1, 42, map2, brain, brain);
        if (world1.getFieldAt(2, 2).getType() != 'A' || world1.getFieldAt(0, 3).getType() != 'B') {
            fail("2did not define correct type");
        }

        if (world1.getAnt(0).getRegister().length != 6) {
            fail("ants register is 6 long");
        }

    }
}
