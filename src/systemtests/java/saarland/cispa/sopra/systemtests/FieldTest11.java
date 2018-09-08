package saarland.cispa.sopra.systemtests;

public class FieldTest11 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "A123\n" +
            "456.\n" +
            "98#7\n" +
            "...B";

        String brain = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(10,24,map,brain,brain);

        for(int y = 0; y<4 ; y++){
            for(int x = 0; x<4; x++){
                FieldInfo finfo = winfo.getFieldAt(x,y);
                int actualX = finfo.getX();
                int actualY = finfo.getY();

                if(!(x == actualX && y == actualY)){

                    fail("Field Numbers are Wrong!");
                }
            }
        }




    }



}
