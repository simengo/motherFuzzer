package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class Attack7 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "AB.C\n" +
            "B..C\n" +
            "....\n" +
            "D...";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";

        WorldInfo winfo = gameInfo.simulate(100,1,map,brainA,brainB,brainB,brainB);
        try {
            winfo.getAnt(0);
        } catch (NoSuchElementException e) {
            fail("Wrong death! Ant move away!");
        }




    }


}
