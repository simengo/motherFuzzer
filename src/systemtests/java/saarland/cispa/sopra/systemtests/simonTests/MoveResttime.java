package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveResttime extends MapTest {
    @Override
    public void test(GameInfo gameInfo) {
        //Wartephase einhalten
        String map =
            "6\n6\n"+
            "......\n" +
            "...A..\n" +
            "......\n" +
            "......\n" +
            "..BB..\n" +
            "######";
        String brain = "brain \"sample\"{\nturn left\nmove else 0\nmove else 0\njump 0\n}";
        String brain0 ="brain \"sample\"{\njump 0\n}";
        WorldInfo world = gameInfo.simulate(5, 42, map, brain, brain0);
        AntInfo ant = world.getAnt(0);
        if (ant.getField().getX() != 2) {
            fail(String.format("Expected x to be 2 but was %d, ant probably did not wait 14 rounds", ant.getField().getX()));
        }
        if (ant.getField().getY() != 1) {
            fail(String.format("Expected y to be 1 but was %d, ant probably did not wait 14 rounds", ant.getField().getY()));
        }

        brain = "brain \"sample\"{\nturn left\nturn left\nmove else 0\njump 0\n}";
        world = gameInfo.simulate(3, 42, map, brain, brain);
        ant = world.getAnt(0);
        if (ant.getRestTime() != 13) {
            fail(String.format("Expected ants resttime to be 13 but was %d", ant.getRestTime()));
        }
        world = gameInfo.simulate(10, 42, map, brain, brain);
        ant = world.getAnt(0);
        if (ant.getRestTime() != 6) {
            fail(String.format("Expected ants resttime to be 6 but was %d", ant.getRestTime()));
        }
        world = gameInfo.simulate(16, 42, map, brain, brain);
        ant = world.getAnt(0);
        if (ant.getRestTime() != 0) {
            fail(String.format("Expected ants resttime to be 0 but was %d", ant.getRestTime()));
        }

        String failMap =
                "6\n6\n"+
                "######\n" +
                "###A##\n" +
                "######\n" +
                "######\n" +
                "##BB##\n" +
                "######";
        WorldInfo world0 = gameInfo.simulate(4,42,failMap,brain,brain);
            if(world0.getAnt(0).getRestTime() != 0){
                fail("move failed but resttime not 0");
            }
        }



}
