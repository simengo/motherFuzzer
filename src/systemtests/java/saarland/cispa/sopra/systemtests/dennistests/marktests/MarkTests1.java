package saarland.cispa.sopra.systemtests.dennistests.marktests;


import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;

public class MarkTests1 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ".A\n" + "B.";
        String brain = "brain \"sample\" {\nmark 0\nunmark 0\njump 0\n}";
        String brain2 = "brain \"sample1\" {\nmark 6\nunmark 6\njump 0\n}";



        WorldInfo world = gameInfo.simulate(1, 42, map, brain,brain2);

        if(!(world.getFieldAt(1,0).getMarkers().get('A')) [0]){fail("Field 1,0 is not marked");}
        if(!(world.getFieldAt(0,1).getMarkers().get('B')) [6]){fail("Field 0,1 is not marked");}



        WorldInfo world2 = gameInfo.simulate(2, 42, map, brain,brain2);

        if(world2.getFieldAt(1,0).getMarkers().get('A') [0]){fail("Field 1,0 is still marked");}
        if(world2.getFieldAt(0,1).getMarkers().get('B') [6]){fail("Field 0,1 is still marked");}

        String kaputtesBrain1 = "brain \"sample2\" {\nmark -1\njump 1\njump 0\n}";
        String kaputtesBrain2 = "brain \"sample3\" {\nmark 7\njump 1\njump 0\n}";

//testen ob alle false sind

        for (int i = 0; i < 7; i++) {


            if (world2.getFieldAt(0, 0).getMarkers().get('A')[i]){ fail("Not false on initial");}
        }

        expect(IllegalArgumentException.class,()->  gameInfo.simulate(1, 42, map, kaputtesBrain1, kaputtesBrain1));
        expect(IllegalArgumentException.class,()->  gameInfo.simulate(1, 42, map, kaputtesBrain2, kaputtesBrain2));


    }
}
