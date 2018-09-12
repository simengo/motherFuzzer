package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class SetTest extends SystemTest {


    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nset 1" +
            "\nset 2" +
            "\nset 3" +
            "\nset 4" +
            "\nset 5" +
            "\njump 0" +
            "\n}";

        String brain2 = "brain \"stan11dby\" {" +
            "\nset 0" +
            "\nset 1" +
            "\nset 2" +
            "\nset 3" +
            "\nset 4" +
            "\nset 5" +
            "\nunset 0" +
            "\nunset 1" +
            "\nunset 2" +
            "\nunset 3" +
            "\nunset 4" +
            "\nunset 5" +
            "\njump 0" +
            "\n}";

        String map = InitTests.foodMap1();

        WorldInfo welt = gameInfo.simulate(11,2,map,brain,brain);

        for(int i=0;i<6;i++){
            if(!welt.getAnt(0).getRegister()[i]){
                fail("Register auf false");
            }
        }

        WorldInfo welt2 = gameInfo.simulate(13,2,map,brain2,brain2);

        for(int i=0;i<6;i++){
            if(welt2.getAnt(0).getRegister()[i]){
                fail("Register auf true obwohl unset wurde");
            }
        }

    }
}
