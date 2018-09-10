package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

// FieldSize 129*129
public class FieldTest5 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        String str = ".................................................................................................................................\n";
        String newString = String.format("%0" + 128 + "d", 0).replace("0", str);

        String map = "129\n129\n" +
            newString +
            ".........................A.....B................................................................................................." ;


            String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain));
    }

}
