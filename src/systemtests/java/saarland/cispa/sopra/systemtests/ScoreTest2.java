package saarland.cispa.sopra.systemtests;

public class ScoreTest2 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "..A.\n" +
            ".1..\n" +
            "....\n" +
            "B..9";

        String brainA = "brain \"sample\" {\n turn left \n turn left \n move else 8 \n pickup else 8 \n turn right \n turn right \n turn right \n move else 8 \n drop else 8  \n jump 8\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n move else 8 \n move else 8 \n move else 8 \n pickup else 8 \n move else 8 \n drop else 8 \n jump 8\n}";

        WorldInfo winfo = gameInfo.simulate(134,13,map,brainA,brainB);

        boolean food0 =  winfo.getAnt(0).hasFood();
        boolean food1 =  winfo.getAnt(1).hasFood();

        if(food0 || food1){
            fail("Ant shouldn't have food!");
        }

        int scA = winfo.getScore('A');
        int scB = winfo.getScore('B');

        if(scA != 1){
            fail("Score of Swarm A should be 1!");
        }


        if(scB != 1){
            fail("Score of Swarm B should be 1!");
        }

        int foodField = winfo.getFieldAt(2,0).getFood();
        int foodField1 = winfo.getFieldAt(0,3).getFood();

        if(foodField != 0){
            fail("There is food on a BaseField!");
        }



        if(foodField1 != 0){
            fail("There is food on a BaseField!");
        }

    }




}
