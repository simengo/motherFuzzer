package saarland.cispa.sopra.systemtests.mischatests;

// initial no markers

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.Arrays;
import java.util.Map;

public class SenseMarkerTest3 extends BaseTest{

    @Override
    public void test(GameInfo gameInfo) {


        String map = "2\n2\n" +
            "#A\n" +
            "B5";

        String brainA = "brain \"sample\" {\n jump 0\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1000,744,map,brainA,brainB);
        Map<Character,boolean[]> markers1 = winfo.getFieldAt(0,0).getMarkers();
        Map<Character,boolean[]> markers2 = winfo.getFieldAt(1,0).getMarkers();
        Map<Character,boolean[]> markers3 = winfo.getFieldAt(0,1).getMarkers();
        Map<Character,boolean[]> markers4 = winfo.getFieldAt(1,1).getMarkers();

        boolean [] mak1 = markers1.get('A');
        boolean [] mak2 = markers2.get('A');
        boolean [] mak3 = markers3.get('A');
        boolean [] mak4 = markers4.get('A');

        boolean [] is1 = {false,false,false,false,false,false,false};
        boolean [] is2 = {false,false,false,false,false,false,false};
        boolean [] is3 = {false,false,false,false,false,false,false};
        boolean [] is4 = {false,false,false,false,false,false,false};

        boolean arr1 = Arrays.equals(is1,mak1);
        boolean arr2 = Arrays.equals(is2,mak2);
        boolean arr3 = Arrays.equals(is3,mak3);
        boolean arr4 = Arrays.equals(is4,mak4);

        if(!(arr1 && arr2 && arr3 && arr4)){

            fail("Wrong markers!");
        }














    }





}
