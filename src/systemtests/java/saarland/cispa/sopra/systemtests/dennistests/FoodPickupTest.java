package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodPickupTest extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "..2.\n" +
            "..A.\n" +
            ".B..\n" +
            "....";
        String brain = "brain \"sample\" {\njump 0\n}";
        String brainPickup = "brain \"sample\" {\nmove else 3\npickup else 3\npickup else 4\njump 3\njump 4\n}";
        WorldInfo world = gameInfo.simulate(15, 42, map, brainPickup, brain);

        if(world.getFieldAt(2,0).getFood() != 1) {fail("Wrong number of food on Field");}
        WorldInfo world2 = gameInfo.simulate(16, 42, map, brainPickup, brain);

        if(world2.getFieldAt(2,0).getFood() != 1) {fail("Wrong number of food on Field");}

        String pickBrain = "brain \"sample\" {\npickup else 2\njump 1\njump 2\n}";
        WorldInfo world3 = gameInfo.simulate(1, 42, map, pickBrain, brain);

        if(world3.getAnt(0).getPc() != 2){fail("ant picked up food without food on field");}

    }
}
