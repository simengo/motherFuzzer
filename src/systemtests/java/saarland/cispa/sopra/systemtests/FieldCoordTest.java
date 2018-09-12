package saarland.cispa.sopra.systemtests;

public class FieldCoordTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            ".9#.\n" +
            ".9#.\n" +
            "AAA.\n";

        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        checkMapPosition(0, 0, world);
        checkMapPosition(1, 0, world);
        checkMapPosition(2, 0, world);

        checkMapPosition(0, 3, world);
        checkMapPosition(1, 3, world);
        checkMapPosition(2, 3, world);
    }

    private void checkMapPosition(int x, int y, WorldInfo world) {
        if (world.getFieldAt(x,y).getX() !=x || world.getFieldAt(x,y).getY() != y) {
            fail("Field was spawned with bad coords at Position (" + x + "," + y + ")");
        }
    }
}
