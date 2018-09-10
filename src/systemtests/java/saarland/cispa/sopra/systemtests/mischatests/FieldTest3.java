package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;

// theoretical FieldSize and actual FieldSize differ
public class FieldTest3 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        String map = "2\n6\n" +
            "2351\n" +
            "9A22\n" +
            "#..#\n" +
            "#B.#\n" +
            "#.C#\n" +
            "####\n" ;


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain,brain));
    }



}
