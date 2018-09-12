package saarland.cispa.sopra.systemtests;

public class MarkEasyTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        for (int i = 0; i <= 6; i++) {
            markTest(gameInfo, i);
        }

        for (int i = 0; i <= 6; i++) {
            unmarkTest(gameInfo, i);
        }
    }

    private void markTest(GameInfo gameInfo, int markerID) {
        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            ".A..\n" +
            "...B";
        String brain = String.format("brain \"testbrain\" {%nmove else 0%nmark %d%njump 2%n}", markerID);
        WorldInfo world = gameInfo.simulate(15, 42, map, brain, "brain \"nobrain\" {\njump 0\n}");
        boolean[] markerAtField = world.getFieldAt(0, 1).getMarkers().get('A');
        if (markerAtField == null || !markerAtField[markerID]) {
            fail(String.format("Field (0,1) should have marker with ID %d", markerID));
        }
    }

    private void unmarkTest(GameInfo gameInfo, int markerID) {
        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            ".A..\n" +
            "...B";
        String brain = String.format("brain \"testbrain\" {%nmove else 0%nmark %d%nunmark %d%njump 3%n}", markerID, markerID);
        WorldInfo world = gameInfo.simulate(16, 42, map, brain, "brain \"nobrain\" {\njump 0\n}");
        boolean[] markerAtField = world.getFieldAt(0, 1).getMarkers().get('A');
        if (markerAtField != null && markerAtField[markerID]) {
            fail(String.format("Field (0,1) should not have marker with ID %d", markerID));
        }
    }
}
