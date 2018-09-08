package saarland.cispa.sopra.systemtests;

public class ScoreTest6 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
        "..1A\n" +
        "....\n" +
        "1...\n" +
        ".B..";

    String brainA = "brain \"sample\" {\n turn left \n move else 6 \n turn left \n turn left \n turn left \n move else 6 \n jump 6\n}";
    String brainB = "brain \"sample\" {\n drop else 1 \n pickup else 2 \n move else 3 \n jump 3\n}";

    WorldInfo world = gameInfo.simulate(50, 217, map, brainA, brainB);
    int sc0 = world.getScore('A');
    int sc1 = world.getScore('B');

    if(sc0 != 0 || sc1 != 0){
        fail("Wrong Score!");
    }

    boolean food0 = world.getAnt(0).hasFood();
    boolean food1 = world.getAnt(1).hasFood();

    if(food0){
        fail("A shouldn't have food!");

    }


    if (food1){
        fail("B shouldn't have food!");
    }



    }

}
