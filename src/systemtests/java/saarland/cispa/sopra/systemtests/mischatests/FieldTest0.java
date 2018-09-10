package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

//test 2500 Instruktionsspeicher max
public class FieldTest0 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "6\n6\n" +
            "..A...\n" +
            ".#####\n" +
            ".#####\n" +
            "B.....\n" +
            "......\n" +
            "......";

        String str = " jump 0 \n";
        String newString = String.format("%0" + 2500 + "d", 0).replace("0", str);
        String brain = "brain \"sample\" {\n ";
        String brainH = brain  + newString + " jump 0 \n}";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brainH,brainH));
    }

}
