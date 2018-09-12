package saarland.cispa.sopra.systemtests.foodtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class PickUpTest2 extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "..B.\n" +
            "....";

        String brain = "brain " +
            "\"collision\" {\npickup else 2\njump 1\nmark 0\njump 2\n}";


        WorldInfo world1 = gameInfo.simulate(3, 42, map, brain, brain);

        if(!world1.getFieldAt(2,2).getMarkers().get('B')[0]){
            fail("ant picked up food even thou there was none");
        }
    }
}

