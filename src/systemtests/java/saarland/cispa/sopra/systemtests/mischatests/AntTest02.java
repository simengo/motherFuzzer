package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class AntTest02 extends BaseTest {



    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "...A\n" +
            "....\n" +
            "....\n" +
            "B...";

        String brainA = "brain \"sample\" {\n turn left \n mark 0 \n unmark 0 \n set 3 \n unset 3 \n test 0 else 6 \n move else 3 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n jump 2\n jump 0 \n jump 2 \n}";



        WorldInfo winfo8 = gameInfo.simulate(7,98,map,brainA,brainB);

        AntInfo ant0 = winfo8.getAnt(0);
        AntInfo ant1 = winfo8.getAnt(1);

        if( ant0.getPc() != 7 || ant1.getPc() != 2){
            fail("Wrong PC");
        }



        WorldInfo winfo9 = gameInfo.simulate(20,98,map,brainA,brainB);

        ant0 = winfo9.getAnt(0);
        ant1 = winfo9.getAnt(1);

        if( ant0.getPc() != 7 || ant1.getPc() != 2){
            fail("Wrong PC");
        }


        WorldInfo winfo10 = gameInfo.simulate(21,98,map,brainA,brainB);

        ant0 = winfo10.getAnt(0);
        ant1 = winfo10.getAnt(1);

        if( ant0.getPc() != 3 || ant1.getPc() != 2){
            fail("Wrong PC");
        }







    }







}
