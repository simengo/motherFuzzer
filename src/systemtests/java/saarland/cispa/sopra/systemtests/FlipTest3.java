package saarland.cispa.sopra.systemtests;

public class FlipTest3 extends BaseTest {



    @Override
    public void test(GameInfo gameInfo) {


        String map = "12\n4\n" +
            "..A.........\n" +
            "............\n" +
            ".......B....\n" +
            "............";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n flip 0 else 4 \n turn right \n flip 0 else 4  \n turn right \n jump 4\n}";

        WorldInfo winfop = gameInfo.simulate(4, 24, map, brainA, brainB);
        WorldInfo winfop1 = gameInfo.simulate(4, 24, map, brainA, brainB);
        WorldInfo winfop2 = gameInfo.simulate(4, 24, map, brainA, brainB);
        WorldInfo winfop3 = gameInfo.simulate(4, 24, map, brainA, brainB);


        String diro = winfop.getAnt(1).getDirection();
        String diro1 = winfop1.getAnt(1).getDirection();
        String diro2 = winfop2.getAnt(1).getDirection();
        String diro3 = winfop3.getAnt(1).getDirection();


        if (!("east".equals(diro) && diro.equals(diro1) && diro1.equals(diro2) && diro2.equals(diro3))) {
            fail("Wrong flip 0!");
        }



    }

}
