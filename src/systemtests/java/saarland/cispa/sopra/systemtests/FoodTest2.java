package saarland.cispa.sopra.systemtests;

public class FoodTest2 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".3..\n" +
            ".A..\n" +
            ".3..\n" +
            ".B..";

        String brainA = "brain \"sample\" {\n move else 4 \n pickup else 4 \n move else 4 \n drop else 4 \n jump 4\n}";
        String brainB = "brain \"sample\" {\n move else 6 \n pickup else 6 \n move else 6 \n  turn right \n move else 6 \n drop else 6 \n jump 6\n}";

        WorldInfo winfo = gameInfo.simulate(30,4,map,brainA,brainB);
        if(winfo.getAnt(0).hasFood()){
            fail("Ant0 didn't drop the food");
        }

        if(! winfo.getAnt(1).hasFood()){
            fail("Ant1 didn't pick up the food");
        }

        FieldInfo finfo = winfo.getFieldAt(0,3);

        if(finfo.getFood() != 1){
            fail("No food droped on field (0,3)");
        }


        WorldInfo winfo2 = gameInfo.simulate(45,4,map,brainA,brainB);

        if (winfo2.getAnt(1).hasFood()){
            fail("Ant1 didn't drop the food");
        }


        FieldInfo finfo1 = winfo2.getFieldAt(1,0);

        if(finfo1.getFood() != 3){
            fail("No food droped on field (1,0)");
        }


    }



}
