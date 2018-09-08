package saarland.cispa.sopra.systemtests;

import java.util.Arrays;
import java.util.Map;

public class SenseMarkerTest4 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "2\n2\n" +
            ".A\n" +
            "B.";

        String brainA = "brain \"sample\" {\n turn left \n move else 11  \n turn right \n turn right \n turn right \n move else 11 \n turn right\n move else 11 \n mark 0 \n sense here marker 0 else 11 \n turn right \n jump 11\n}";
        String brainB = "brain \"sample\" {\n turn right \n turn right \n move else 12 \n mark 0 \n turn left \n turn left \n turn left \n move else 12 \n turn right \n turn right \n sense right marker 0 else 12 \n turn left \n jump 12\n}";

        // A southwest
        // B northwest
        // field (1,1) marker 0 both
        WorldInfo winfo = gameInfo.simulate(200,94,map,brainA,brainB);


        Map<Character,boolean[]> markers1 = winfo.getFieldAt(1,1).getMarkers();

        boolean [] mak1 = markers1.get('A');
        boolean [] mak2 = markers1.get('B');

        boolean [] is = {true,false,false,false,false,false,false};


        boolean arr1 = Arrays.equals(is,mak1);
        boolean arr2 = Arrays.equals(is,mak2);

        if(!(arr1 && arr2)){

            fail("Wrong markers!");
        }



    }


}
