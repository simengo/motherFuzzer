package saarland.cispa.sopra.systemtests.simontests.movetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveInAllDirections extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
               "4\n4\n"+
               "....\n" +
               "..A.\n" +
               "....\n" +
               "...B";
        String brainNW = "brain \"sample\" {\nmove else 0\njump 0\n}";
        String brainW =  "brain \"sample\" {\nturn left\nmove else 0\njump 0\n}";
        String brainSW=  "brain \"sample\" {\nturn left\nturn left\nmove else 0\njump 0\n}";
        String brainSE=  "brain \"sample\" {\nturn left\nturn left\nturn left\nmove else 0\njump 0\n}";
        String brainE =  "brain \"sample\" {\nturn left\nturn left\nturn left\nturn left\nmove else 0\njump 0\n}";
        String brainNE= "brain \"sample\"  {\nturn left\nturn left\nturn left\nturn left\nturn left\nmove else 0\njump 0\n}";

        WorldInfo worldNW = gameInfo.simulate(2,42,map,brainNW,brainNW);
        if(worldNW.getAnt(0).getField().getX() != 2 && worldNW.getAnt(0).getField().getY() != 0){
            fail(String.format("Expected (2,0) was (%d,%d)",worldNW.getAnt(0).getField().getX(),worldNW.getAnt(0).getField().getY()));
        }
        WorldInfo worldW = gameInfo.simulate(3,42,map,brainW,brainW);
        if(worldW.getAnt(0).getField().getX() != 1 && worldW.getAnt(0).getField().getY() != 1){
            fail(String.format("Expected (1,1) was (%d,%d)",worldW.getAnt(0).getField().getX(),worldW.getAnt(0).getField().getY()));
        }
        WorldInfo worldSW = gameInfo.simulate(4,42,map,brainSW,brainSW);
        if(worldSW.getAnt(0).getField().getX() != 2 && worldSW.getAnt(0).getField().getY() != 2){
            fail(String.format("Expected (2,0) was (%d,%d)",worldSW.getAnt(0).getField().getX(),worldSW.getAnt(0).getField().getY()));
        }
        WorldInfo worldSE = gameInfo.simulate(5,42,map,brainSE,brainSE);
        if(worldSE.getAnt(0).getField().getX() != 3 && worldSE.getAnt(0).getField().getY() != 2){
            fail(String.format("Expected (3,2) was (%d,%d)",worldSE.getAnt(0).getField().getX(),worldSE.getAnt(0).getField().getY()));
        }
        WorldInfo worldE = gameInfo.simulate(6,42,map,brainE,brainE);
        if(worldE.getAnt(0).getField().getX() != 3 && worldE.getAnt(0).getField().getY() != 1){
            fail(String.format("Expected (3,1) was (%d,%d)",worldE.getAnt(0).getField().getX(),worldE.getAnt(0).getField().getY()));
        }
        WorldInfo worldNE = gameInfo.simulate(7,42,map,brainNE,brainNE);
        if(worldNE.getAnt(0).getField().getX() != 3 && worldNE.getAnt(0).getField().getY() != 0){
            fail(String.format("Expected (3,0) was (%d,%d)",worldNE.getAnt(0).getField().getX(),worldNE.getAnt(0).getField().getY()));
        }

    }
}
