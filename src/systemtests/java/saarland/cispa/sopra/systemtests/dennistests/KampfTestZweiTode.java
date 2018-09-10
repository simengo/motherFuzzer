package saarland.cispa.sopra.systemtests.dennistests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KampfTestZweiTode extends OberklasseTests{
    @Override
    protected void test(GameInfo gameInfo) {

        String map = "8\n6\n" +
            ".AA.....\n" +
            "ABB.....\n" +
            ".AAB....\n" +
            ".BB.....\n" +
            "........\n" +
            "........";

        String brainSimple = "brain \"sample\" {\nturn right\njump 1\n}";
        String moveBrain = "brain \"sample\"{\nmove else 1\njump 1\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brainSimple, moveBrain);
        if(world.getFieldAt(1,1).getAnt().isPresent()){fail("Ant should not be there");}
        if(world.getFieldAt(1,1).getFood() != 0){fail("The dropped food did not despawn");}
        if(world.getScore('B') != 3){fail("the dropped food did not count as points");}
        if(world.getScore('A') != 0){fail("the dropped food did not count as points");}


    }
}
