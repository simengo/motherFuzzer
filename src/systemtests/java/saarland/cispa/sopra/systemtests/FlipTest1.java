package saarland.cispa.sopra.systemtests;

public class FlipTest1 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";

        String brain = "brain \"sample\" {\nflip 2 else 2\nset 0\nflip 2 else 4\nset 1\nflip 2 else 6\nset 2\nflip 2 else 8\nset 3\nflip 2 else 10\nset 4\nflip 2 else 12\nset 5\nturn left\njump 12\n}";
        WorldInfo world = gameInfo.simulate(13, 4, map, brain, brain);
        if (world.getAnt(0).getRegister()[0] || world.getAnt(0).getRegister()[1] || world.getAnt(0).getRegister()[2] || world.getAnt(0).getRegister()[3] || !world.getAnt(0).getRegister()[4] || !world.getAnt(0).getRegister()[5]) {
            fail("flip didn't give the expected results");
        }
    }
}
