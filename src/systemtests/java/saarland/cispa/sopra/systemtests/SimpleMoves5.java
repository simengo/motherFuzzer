package saarland.cispa.sopra.systemtests;

public class SimpleMoves5 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {

        //test4 wait after Move

        String map = "10\n2\n" +
            "..A...#...\n" +
            "......B..C";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        String brainB = "brain \"sample\" {\n turn left \n turn left \n move else 3 \n jump 3\n}";
        String brainC = "brain \"sample\" {\n turn left \n turn left \n turn left \n move else 4 \n jump 4\n}";


        WorldInfo world = gameInfo.simulate(17,637,map,brainA,brainB,brainC);
        FieldInfo finfo0 = world.getAnt(0).getField();
        FieldInfo finfo1 = world.getAnt(1).getField();
        FieldInfo finfo2 = world.getAnt(2).getField();

        if(!(finfo0.equals(world.getFieldAt(1,1)))){
            fail("wrong move A!");
        }


        if(!(finfo1.equals(world.getFieldAt(6,1)))){
            fail("wrong move B!");
        }


        if(!(finfo2.equals(world.getFieldAt(0,0)))){
            fail("wrong move C!");
        }

    }

}
