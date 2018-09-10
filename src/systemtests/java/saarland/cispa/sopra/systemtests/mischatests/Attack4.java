package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class Attack4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "BB..\n" +
            "9B.B\n" +
            "BA..\n" +
            "....";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 0\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(100,63,map,brainA,brainB);
        int food = winfo.getFieldAt(0,1).getFood();

        if (food != 12){
            fail(String.format("Expected 12 food on field (0,1), but is %d (already 9 on field!)",food));
        }


        expect(NoSuchElementException.class, () -> winfo.getAnt(5));











    }




}
