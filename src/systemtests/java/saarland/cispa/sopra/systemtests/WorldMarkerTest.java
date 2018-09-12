package saarland.cispa.sopra.systemtests;

public class WorldMarkerTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n" +
            "....";

        worldMarkerTest(gameInfo, map, 0);
        worldMarkerTest(gameInfo, map, 1);
        worldMarkerTest(gameInfo, map, 2);
        worldMarkerTest(gameInfo, map, 3);
        worldMarkerTest(gameInfo, map, 4);
        worldMarkerTest(gameInfo, map, 5);
        worldMarkerTest(gameInfo, map, 6);
    }

    private void worldMarkerTest(GameInfo gameInfo, String map, int num) {
        String brain = "brain " +
            "\"collision\" {\nmark " + num + "\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        boolean marker = world.getFieldAt(1, 0).getMarkers().get('B')[num];
        if (!marker) {
            fail("marker was not set");
        }
    }
}
