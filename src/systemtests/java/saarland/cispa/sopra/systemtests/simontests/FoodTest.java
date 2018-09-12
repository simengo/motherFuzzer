package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FoodTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String brain = "brain \"sample\" {\njump 0\n}";
        String enemyBrain = "brain \"sample\"{\nturn right\nturn right\nmove else 0\nmove else 0\njump 0\n}";

        String map0 = "4\n4\n"+"A...\n"+ "1111\n"+"....\n"+"BBBB";
        String map1 = "4\n4\n"+"A...\n"+"....\n"+"....\n"+"BBBB";
        String map2 = "4\n4\n"+"A...\n"+"2222\n"+"....\n"+"BBBB";
        String map3 = "4\n4\n"+"A...\n"+"....\n"+"....\n"+"BBBB";
        String map4 = "4\n4\nA"+"...\n"+"1111\n"+"AAAA\n"+"BBBB";
        String map5 = "4\n4\n"+"A...\n"+"1111\n.BBB\n....";
        String map6 = "4\n4\n"+"A...\n"+"1111\n"+"1111\n"+"BBBB";

        String brain0 = "brain \"sample\"{\nturn left\nturn left\nturn left\nmove else 0\npickup else 0\njump 0\n";
        String brain1 = "brain \"sample\"{\nturn left\nturn left\nturn left\nmove else 0\npickup else 0\nmove else 0\ndrop else 0\njump 0\n";
        String brain2 = "brain \"sample\"{\nturn left\nturn left\nturn left\ndrop else 0\njump 0\n";
        String brain3 = "brain \"sample\"{\nturn left\nturn left\tturn left\nmove else 0\npickup else 0\nmove else 0\npickup else 0\njump\n";

        //0
        WorldInfo world0 = gameInfo.simulate(19, 42, map1, brain0, brain);
        AntInfo ant0 = world0.getAnt(0);
        if (ant0.hasFood()) {
            fail("Ant has food even though there is none");
        }

        //1
        WorldInfo world1 = gameInfo.simulate(19, 42, map2, brain0, brain);
        AntInfo ant1 = world0.getAnt(0);
        if (!(ant1.hasFood()) || world1.getFieldAt(0, 1).getFood() != 1) {
            fail("Ant has no food but picked food up");
        }

        //2
        WorldInfo world2 = gameInfo.simulate(34, 42, map0, brain1, brain);
        AntInfo ant2 = world2.getAnt(0);
        if (ant2.hasFood() || world2.getFieldAt(1, 2).getFood() != 1) {
            fail("Ant did not drop food correctly");
        }

        //3
        WorldInfo world3 = gameInfo.simulate(34, 42, map4, brain1, brain);
        AntInfo ant3 = world3.getAnt(0);
        if (ant3.hasFood() || world3.getFieldAt(2, 1).getFood() != 0 || world3.getScore('A') != 1) {
            fail("Ant did not drop food on own base correctly");
        }

        //4
        WorldInfo world4 = gameInfo.simulate(34, 42, map5, brain1, enemyBrain);
        AntInfo ant4 = world4.getAnt(0);
        if(ant4.hasFood() || world4.getFieldAt(2,1).getFood() != 0 || world4.getScore('B') != 1){
            fail("Ant did not drop food on opponents base correctly");
        }

        //5
        WorldInfo world5 = gameInfo.simulate(6,42,map3,brain2,brain);
        AntInfo ant5 = world5.getAnt(0);
        if(ant5.hasFood() || world5.getFieldAt(0,1).getFood() != 0){
            fail("Expected Field to be empty aswell as ant to be empty but was not!");
        }

        //6
        WorldInfo world6 = gameInfo.simulate(35,42,map6,brain3,brain);
        AntInfo ant6 = world6.getAnt(0);
        if(!(ant6.hasFood()) || world6.getFieldAt(2,1).getFood()!= 1){
            fail("Ant can not pick up more then one food!");
        }
    }
}
