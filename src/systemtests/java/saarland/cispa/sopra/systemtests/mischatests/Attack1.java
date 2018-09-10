package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class Attack1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "BBBB\n" +
            "B.BB\n" +
            "BBAB\n" +
            "....";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1,3,map,brainA,brainB);

        int food = winfo.getFieldAt(1,1).getFood();

        if(food != 3){

            fail(String.format("Expected 3 food on field (1,1), but is: %d",food));
        }

        expect(NoSuchElementException.class, () -> winfo.getAnt(9));


        String map1 = "6\n6\n" +
            "..B...\n" +
            "......\n" +
            "...AA.\n" +
            "..AAA.\n" +
            "...AA.\n" +
            "......";

        brainA = "brain \"sample\" {\n jump 0\n}";
        brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo2 = gameInfo.simulate(20,3,map1,brainA,brainB);

        int food2 = winfo2.getFieldAt(3,3).getFood();

        if(food2 != 0){

            fail(String.format("Expected 0 food on field (3,3), but is: %d(initial food 0?)",food2));
        }






    }





}
