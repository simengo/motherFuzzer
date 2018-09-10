package saarland.cispa.sopra.systemtests.mischatests;


import saarland.cispa.sopra.systemtests.GameInfo;

// odd FieldSize
public class FieldTest4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo){

        String map = "5\n5\n" +
            "2351.\n" +
            "9A22.\n" +
            "#..#.\n" +
            "#B.#.\n" +
            "####.\n" ;


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(100,23,map,brain,brain));
    }




}
