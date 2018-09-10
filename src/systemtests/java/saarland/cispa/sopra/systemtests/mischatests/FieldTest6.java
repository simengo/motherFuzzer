package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

// MapSize 0/0
public class FieldTest6 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo){

        String map = "0\n0\n";


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10,23,map,brain,brain));


        String str = "................................................................................................................................\n";
        String newString = String.format("%0" + 127 + "d", 0).replace("0", str);

        String map1 = "128\n128\n" +
            newString +
            ".....................................................................................B.................A........................";

        try {
            gameInfo.simulate(10,2,map1,brain,brain);
        } catch (IllegalArgumentException e) {
            fail("Map is ok but threw IllegalArgumentException!");
        }


    }



}
