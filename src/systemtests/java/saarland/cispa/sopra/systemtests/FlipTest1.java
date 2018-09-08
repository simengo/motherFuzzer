package saarland.cispa.sopra.systemtests;

public class FlipTest1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "12\n4\n" +
            "..A.........\n" +
            "............\n" +
            ".......B....\n" +
            "............";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n flip 2 else 4 \n turn right \n flip 2 else 4  \n turn right \n jump 4\n}";

        WorldInfo winfo = gameInfo.simulate(4,234,map,brainA,brainB);
        WorldInfo winfo1 = gameInfo.simulate(4,234,map,brainA,brainB);
        WorldInfo winfo2 = gameInfo.simulate(4,234,map,brainA,brainB);
        WorldInfo winfo3 = gameInfo.simulate(4,234,map,brainA,brainB);


        String dir = winfo.getAnt(1).getDirection();
        String dir1 = winfo1.getAnt(1).getDirection();
        String dir2 = winfo2.getAnt(1).getDirection();
        String dir3 = winfo3.getAnt(1).getDirection();


        if(!(dir.equals(dir1)  && dir1.equals(dir2) && dir2.equals(dir3) )){
            fail("Wrong flip!");
        }





    }





    }
