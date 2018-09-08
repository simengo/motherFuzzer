package saarland.cispa.sopra.systemtests;

public class FlipTest2 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "2\n4\n" +
            "BA\n" +
            "..\n" +
            "..\n" +
            "..";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n flip 1 else 4 \n turn right \n flip 1 else 4  \n turn right \n jump 4\n}";


        WorldInfo win = gameInfo.simulate(4,2423,map,brainA,brainB);
        WorldInfo win1 = gameInfo.simulate(4,2423,map,brainA,brainB);
        WorldInfo win2 = gameInfo.simulate(4,2423,map,brainA,brainB);
        WorldInfo win3 = gameInfo.simulate(4,2423,map,brainA,brainB);


        String di = win.getAnt(0).getDirection();
        String di1 = win1.getAnt(0).getDirection();
        String di2 = win2.getAnt(0).getDirection();
        String di3 = win3.getAnt(0).getDirection();


        if(!("east".equals(di) && di.equals(di1) && di1.equals(di2) && di2.equals(di3))){
            fail("Wrong flip!");
        }





    }



}
