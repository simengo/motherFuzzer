package saarland.cispa.sopra.systemtests;

public class PcTest extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";

        String brain = "brain \"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world0 = gameInfo.simulate(0, 4, map, brain, brain);
        WorldInfo world1 = gameInfo.simulate(1, 4, map, brain, brain);
        WorldInfo world2 = gameInfo.simulate(4, 4, map, brain, brain);
        if(world0.getAnt(0).getPc()!=0){
            fail("pc incorrect");
        }
        if(world1.getAnt(0).getPc()!=1){
            fail("pc incorrect");
        }
        if(world2.getAnt(0).getPc()!=0){
            fail("pc incorrect");
        }
    }
}
