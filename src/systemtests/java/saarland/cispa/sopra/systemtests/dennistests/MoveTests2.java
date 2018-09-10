package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveTests2 extends OberklasseTests {


    @Override
    protected void test(GameInfo gameInfo) {

        String map3 =
            "4\n4\n" +
                "...A\n" +
                "..B.\n" +
                "....\n" +
                "....";
        String brain3 = "brain \"sample2\" {\njump 0\n}";
        String brain1 = "brain \"sample\" {\nmove else 2\njump 1\njump 2\n}";
        WorldInfo world3 = gameInfo.simulate(1, 42, map3, brain1, brain3);

        if(world3.getAnt(0).getField().getX() != 2 || world3.getAnt(0).getField().getY() != 3){
            fail("Ant moved to the wrong place");}


        //Test auf den move Schlafcounter
        String brain4 = "brain \"sample3\" {\nmove else 0\nmove else 1\njump 3\njump 4\njump 4\n}";
        WorldInfo world4 = gameInfo.simulate(2, 42, map3, brain4, brain3);
        WorldInfo world5 = gameInfo.simulate(14, 42, map3, brain4, brain3);
        if(world4.getAnt(0).getField().getX() != 2 || world4.getAnt(0).getField().getY() != 3){
            fail("Ant moved to the wrong place");}

             if(world4.getAnt(0).getPc() !=1){fail("Wrong Pc");}
             if(world5.getAnt(0).getPc() !=1){fail("Wrong Pc");}

        if(world5.getAnt(0).getField().getX() != 2 || world5.getAnt(0).getField().getY() != 3){
            fail("Ant moved to the wrong place");}

        WorldInfo world6 = gameInfo.simulate(15, 42, map3, brain4, brain3);
        if(world6.getAnt(0).getField().getX() != 2 || world6.getAnt(0).getField().getY() != 2){
            fail("Ant moved to the wrong place");}

        if(world6.getAnt(0).getPc() != 2){fail("Wrong Pc2");}
}}
