package saarland.cispa.sopra.systemtests;

import java.util.NoSuchElementException;

public class BreedTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "111.\n" +
            "AAA.\n";

        String brainA = "brain \"sample\" {\nmove else 3 \n turn left \n pickup else 3 \n breed else 3 \njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";
        WorldInfo world = gameInfo.simulate(100, 4, map, brainA, brainB);
        try {world.getAnt(6); }catch(NoSuchElementException e){
            fail("Ant couldnt be breeded");
        }
        if(!world.getAnt(5).hasFood()){
            fail("wrong breed");
        }

        if(world.getAnt(4).hasFood()){
            fail("wrong breed");
        }

        if(world.getAnt(3).hasFood()){
            fail("wrong breed");
        }

    }
}
