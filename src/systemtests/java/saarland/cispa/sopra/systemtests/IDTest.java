package saarland.cispa.sopra.systemtests;

public class IDTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";

        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain);

        testSwarm('B', 0, 1, 2, world);
        testSwarm('A', 3, 4, 5, world);

        if (world.getAnt(0).getId()!=0){
            fail("ant with world id 0 does have a different private id");
        }
    }

    private void testSwarm(Character swarm, int id1, int id2, int id3, WorldInfo world) {
        if (swarm != world.getAnt(id1).getSwarm() || swarm != world.getAnt(id2).getSwarm() || swarm != world.getAnt(id3).getSwarm()) {
            fail("ant assigned to wrong swarm was " + world.getAnt(id1).getSwarm() + "expected" + swarm);
        }
    }
}
