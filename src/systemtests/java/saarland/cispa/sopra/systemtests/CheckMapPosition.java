package saarland.cispa.sopra.systemtests;

public class CheckMapPosition extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";

        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        checkMapPosition(0, 0, 0, world, 'B');
        checkMapPosition(1, 0, 1, world, 'B');
        checkMapPosition(2, 0, 2, world, 'B');

        checkMapPosition(0, 3, 3, world, 'A');
        checkMapPosition(1, 3, 4, world, 'A');
        checkMapPosition(2, 3, 5, world, 'A');
    }

    private void checkMapPosition(int x, int y, int id, WorldInfo world, char swarm) {
        if (world.getAnt(id).getField().getX() != x || world.getAnt(id).getField().getY() != y) {
            fail("Ant was spawned in wrong position with swarm " + swarm + " and ID " + id + "and Position (" + x + "," + y + ")");
        }
    }
}
