package saarland.cispa.sopra.systemtests;

import java.util.Arrays;
import java.util.Map;

// getMarker()...
public class SenseMarkerTest1 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {



        String map = "4\n4\n" +
            "....\n" +
            ".B..\n" +
            ".1..\n" +
            ".A..";

        String brainA = "brain \"sample\" {\n mark 0 \n mark 1 \n mark 0 \n mark 6 \n move else 1 \n mark 2 \n mark 3 \n turn right \n turn right \n move else 1 \n mark 5 \n mark 4 \n turn right \n turn right \n move else 1 \n unmark 0 \n jump 16\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(500,74,map,brainA,brainB);
        Map<Character,boolean[]> markers1 = winfo.getFieldAt(1,3).getMarkers();
        Map<Character,boolean[]> markers2 = winfo.getFieldAt(1,2).getMarkers();
        Map<Character,boolean[]> markers3 = winfo.getFieldAt(2,2).getMarkers();

        boolean [] mak1 = markers1.get('A');
        boolean [] mak2 = markers2.get('A');
        boolean [] mak3 = markers3.get('A');

        boolean [] is1 = {false,true,false,false,false,false,true};
        boolean [] is2 = {false,false,true,true,false,false,false};
        boolean [] is3 = {false,false,false,false,true,true,false};


        boolean arr1 = Arrays.equals(is1,mak1);
        boolean arr2 = Arrays.equals(is2,mak2);
        boolean arr3 = Arrays.equals(is3,mak3);

        if(!(arr1 && arr2 && arr3)){

            fail("Wrong markers!");
        }

    }


}
