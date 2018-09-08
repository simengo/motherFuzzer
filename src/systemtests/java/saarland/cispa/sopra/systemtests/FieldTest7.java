package saarland.cispa.sopra.systemtests;

// negative mapSize
public class FieldTest7 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        //test1
        String map = "-1\n-1\n";


        String brain = "brain \"sample\" {\n jump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map,brain,brain));


        //test2
        String map1 = "-2\n-2\n";

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(5,23,map1,brain,brain));


    }

}
