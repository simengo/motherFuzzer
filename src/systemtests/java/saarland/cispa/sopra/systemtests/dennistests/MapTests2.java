package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class MapTests2 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        String map1 = "2\n2\n" +
                        "A.\n" + "B.";

        char punkt = '.';
        char zeile = '\n';
        StringBuilder initMap = new StringBuilder("128\n128\n");
        StringBuilder mapA = new StringBuilder("A");
        StringBuilder mapB = new StringBuilder("B");
        for(int i=0;i<127;i++){
            mapA.append(punkt);
            mapB.append(punkt);
        }
        mapA.append(zeile);
        for(int i=0;i<127;i++){
            initMap.append(mapA);

        }
        initMap.append(mapB);



        /*String map4 =
            createField(128, 128);*/


        String brain = "brain \"sample\" {\njump 0\n}";


        tryCatchTrue(map1, brain, gameInfo);
        tryCatchTrue(initMap.toString(), brain, gameInfo);

    }}
