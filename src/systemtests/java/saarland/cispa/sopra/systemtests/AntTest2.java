package saarland.cispa.sopra.systemtests;

public class AntTest2 extends BaseTest{


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "...A\n" +
            "....\n" +
            "....\n" +
            "B...";

        String brainA = "brain \"sample\" {\n turn left \n mark 0 \n unmark 0 \n set 3 \n unset 3 \n test 0 else 6 \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n jump 2\n jump 0 \n jump 2 \n}";

        WorldInfo winfo = gameInfo.simulate(0,98,map,brainA,brainB);
        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);

        if( ant0.getPc() != 0 || ant1.getPc() != 0){
            fail("Wrong PC");
        }



        WorldInfo winfo2 = gameInfo.simulate(1,98,map,brainA,brainB);

        ant0 = winfo2.getAnt(0);
        ant1 = winfo2.getAnt(1);

        if( ant0.getPc() != 1 || ant1.getPc() != 2){
            fail("Wrong PC");
        }



        WorldInfo winfo3 = gameInfo.simulate(2,98,map,brainA,brainB);

        ant0 = winfo3.getAnt(0);
        ant1 = winfo3.getAnt(1);

        if( ant0.getPc() != 2 || ant1.getPc() != 2){
            fail("Wrong PC");
        }


        WorldInfo winfo4 = gameInfo.simulate(3,98,map,brainA,brainB);

        ant0 = winfo4.getAnt(0);
        ant1 = winfo4.getAnt(1);

        if( ant0.getPc() != 3 || ant1.getPc() != 2){
            fail("Wrong PC");
        }


        WorldInfo winfo5 = gameInfo.simulate(4,98,map,brainA,brainB);

        ant0 = winfo5.getAnt(0);
        ant1 = winfo5.getAnt(1);

        if( ant0.getPc() != 4 || ant1.getPc() != 2){
            fail("Wrong PC");
        }


        WorldInfo winfo6 = gameInfo.simulate(5,98,map,brainA,brainB);

        ant0 = winfo6.getAnt(0);
        ant1 = winfo6.getAnt(1);

        if( ant0.getPc() != 5 || ant1.getPc() != 2){
            fail("Wrong PC");
        }

        WorldInfo winfo7 = gameInfo.simulate(6,98,map,brainA,brainB);

        ant0 = winfo7.getAnt(0);
        ant1 = winfo7.getAnt(1);

        if( ant0.getPc() != 6 || ant1.getPc() != 2){
            fail("Wrong PC");
        }



    }


}
