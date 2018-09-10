package saarland.cispa.sopra.systemtests.dennistests;


import saarland.cispa.sopra.systemtests.GameInfo;

public class MapTests extends OberklasseTests {
   @Override
   protected void test(GameInfo gameInfo) {
       String map = createField(1, 1);

       String map2 = createField(3, 4);
       String map3 = createField(4, 3);
       String mapminus1 = createField(-1, 4);
       String mapminus2 = createField(4, -1);

       String map5 = createField(130, 130);

       String brain = "brain \"sample\" {\njump 0\n}";

       tryCatchFalse(mapminus2,brain,gameInfo);
       tryCatchFalse(mapminus1,brain,gameInfo);

       tryCatchFalse(map,brain,gameInfo);

       tryCatchFalse(map2,brain,gameInfo);
       tryCatchFalse(map3,brain,gameInfo);

       tryCatchFalse(map5,brain,gameInfo);



   }
}
