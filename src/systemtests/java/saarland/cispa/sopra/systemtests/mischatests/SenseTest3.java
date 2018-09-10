package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.Map;

public class SenseTest3 extends BaseTest{

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "A5.A\n" +
            "#.A#\n" +
            "...A\n" +
            "B#..";

        String brainA = "brain \"sample\" {\n turn right \n turn right \n turn right \n move else 4  \n sense left food else 12 \n sense right rock else 12 \n turn right \n turn right \n turn right \n sense ahead friend else 12 \n sense right foehome else 12\n mark 2 \n jump 12\n}";
        String brainB = "brain \"sample\" {\n  move else 1 \n jump 1\n}";

        WorldInfo winfo = gameInfo.simulate(14,5,map,brainA,brainB);

        Map<Character,boolean[]> mark = winfo.getFieldAt(0,0).getMarkers();

        boolean[] actualMark = mark.get('A');

        if(!actualMark[2]){
            fail("Wrong senses over side!");
        }




    }
}
