package saarland.cispa.sopra.systemtests;

public class MultipleMarkersTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".A..\n" +
            ".B..\n" +
            "....\n" +
            "....";

        String brain = "brain " +
            "\"collision\" {\nmark 0\nmark 1\nmark 2\nmark 3\nmark 4\nmark 5\nmark 6\nmove else 7\njump 0\n}";

        WorldInfo world = gameInfo.simulate(40, 42, map, brain, brain);
        for (int i = 0; i < 7; i++) {
            if (!world.getFieldAt(1, 0).getMarkers().get('A')[i]) {
                fail("all markers for A should be set");
            }
            if (!world.getFieldAt(1, 0).getMarkers().get('B')[i]) {
                fail("all markers for B should be set");
            }
        }
    }
}
