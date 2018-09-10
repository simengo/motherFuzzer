package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class AntTest4 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "6\n6\n" +
            "A.....\n" +
            ".BCDE.\n" +
            "......\n" +
            ".FGHI.\n" +
            "....#.\n" +
            "....J.";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        String brainC = "brain \"sample\" {\n set 0 \n jump 1\n}";
        String brainD = "brain \"sample\" {\n mark 1 \n jump 1\n}";
        String brainE = "brain \"sample\" {\n unmark 1 \n jump 1\n}";
        String brainF = "brain \"sample\" {\n unset 0 \n jump 1\n}";
        String brainG = "brain \"sample\" {\n pickup else 1 \n jump 1\n}";
        String brainH = "brain \"sample\" {\n drop else 1 \n jump 1\n}";
        String brainI = "brain \"sample\" {\n test 0 else 1 \n jump 1\n}";
        String brainJ = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        WorldInfo winfo = gameInfo.simulate(1,560,map,brainA,brainB,brainC,brainD,brainE,brainF,brainG,brainH,brainI,brainJ);

        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);
        AntInfo ant2 = winfo.getAnt(2);
        AntInfo ant3 = winfo.getAnt(3);
        AntInfo ant4 = winfo.getAnt(4);
        AntInfo ant5 = winfo.getAnt(5);
        AntInfo ant6 = winfo.getAnt(6);
        AntInfo ant7 = winfo.getAnt(7);
        AntInfo ant8 = winfo.getAnt(8);
        AntInfo ant9 = winfo.getAnt(9);

        if(!(ant0.getRestTime() == 0 && ant2.getRestTime() == 0 && ant3.getRestTime() == 0 && ant4.getRestTime() == 0 && ant5.getRestTime() == 0 && ant6.getRestTime() == 0 && ant7.getRestTime() == 0 && ant8.getRestTime() == 0 && ant9.getRestTime() == 0)){

            fail("Wrong RestTimes");
        }

        if(ant1.getRestTime() != 13){
            fail("Wrong RestTimes");
        }


    }


}
