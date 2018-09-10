package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.Map;

public class DirectionTest2 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {






        String map = "4\n4\n" +
            "....\n" +
            ".A..\n" +
            "....\n" +
            ".B..";

        String brainA = "brain \"sample\" {\n direction northwest else 18 \n turn left \n direction west else 18 \n turn right \n direction northwest else 18 \n turn right \n direction northeast else 18 \n turn right \n direction east else 18 \n turn right \n direction southeast else 18 \n turn right \n direction southwest else 18 \n turn right \n direction west else 18 \n turn right \n direction northwest else 18 \n mark 6 \n jump 18\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";



        WorldInfo winfo = gameInfo.simulate(19,2,map, brainA,brainB);
        Map<Character,boolean[]> mark = winfo.getFieldAt(1,1).getMarkers();
        boolean[] actualmarks = mark.get('A');
        if(!actualmarks[6]){
            fail("Wrong Ant direction detection!");
        }

    }



}
