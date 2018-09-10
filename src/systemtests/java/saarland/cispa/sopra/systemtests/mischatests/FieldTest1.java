package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

/*Test FieldSize */
public class FieldTest1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo){

        String map =
            "2\n8\n" +
            "A.\n" +
            "#.\n" +
            "#.\n" +
            ".B\n" +
            "..\n" +
             "..\n" +
             "..\n" +
             "..";

        String brainA ="brain \"sample\" {\n move else 1 \n mark 1 \n jump 0\n}";
        String brainB ="brain \"sample\" {\n  move else 1 \n jump 0\n}";
        WorldInfo winfo = gameInfo.simulate(50,23,map,brainA,brainB);
        int height = winfo.getHeight();
        int width = winfo.getWidth();

        if(!(height == 8 && width == 2)){

            fail(String.format("Wrong FieldSize: Expected:(2,8) but is (%d,%d)", width,height));
        }

    }
}
