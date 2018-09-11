package saarland.cispa.sopra.systemtests;

public class RestTimerTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "A...\n" +
            "....\n" +
            "....\n" +
            "...B";

        String brain = "brain " +
            "\"collision\" {\nmove else 1\njump 0\n}";

        WorldInfo world1 = gameInfo.simulate(1, 42, map, brain, brain);
        WorldInfo world2 = gameInfo.simulate(3, 42, map, brain, brain);

        if (world1.getAnt(0).getRestTime() != 0) {
            fail("timer is wrong");
        }
        if (world1.getAnt(1).getRestTime() != 13) {
            fail("timer is wrong");
        }

        if (world2.getAnt(0).getRestTime() != 13) {
            fail("timer is wrong");
        }
        if (world2.getAnt(1).getRestTime() != 11) {
            fail("timer is wrong");
        }
    }
}
