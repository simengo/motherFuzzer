package saarland.cispa.sopra.systemtests;

import java.util.NoSuchElementException;

public class AntlionTestsM extends SystemTest {

    @Override
    public void test(GameInfo gameInfo){

        String map = "4\n4\n" +
            ".BB.\n" +
            "B=A.\n" +
            ".BB.\n" +
            "....";
        String brainB = "brain \"testbrain\" {\njump 0\n}";
        String brainA = "brain \"testbrain\" {\nturn left\n move else 3 \n jump 2 \n jump 3\n}";

        WorldInfo world = gameInfo.simulate(2,7645,map,brainA,brainB);

        expect(NoSuchElementException.class, () -> world.getAnt(3));

        if(world.getFieldAt(1,1).getFood() != 0){
            fail("There is food on an antlionField!!!");
        }

        try{
            world.getAnt(0);
            world.getAnt(1);
            world.getAnt(2);
            world.getAnt(4);
            world.getAnt(5);
        } catch(NoSuchElementException e){
            fail("An Ant died from Antlion without move or breed!");
        }

        if(world.getScore('B') != 0){
            fail("Score B should be zero!");
        }

        if(world.getScore('A') != 0){
            fail("Score A should be zero!");
        }

        if(world.getFieldAt(2,1).getFood() != 0){
            fail("there shouldnt be food on field (2,1) !");
        }

    }



}
