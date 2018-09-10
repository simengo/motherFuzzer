package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class Attack3 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".BBB\n" +
            "A..B\n" +
            "....\n" +
            "CCCC";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 0\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";
        String brainC = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1,25,map,brainA,brainB,brainC);
        int food = winfo.getFieldAt(0,0).getFood();

        if (food != 3){

            fail(String.format("Expected 3 food, but is %d (more team attack!)",food));
        }


        expect(NoSuchElementException.class, () -> winfo.getAnt(3));


    }






}

