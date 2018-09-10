package saarland.cispa.sopra.systemtests.dennistests.settests;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.dennistests.OberklasseTests;



public class SetTests1 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + ".A\n" + "B.";
        String brain = "brain \"sample\" {\nset 0\nunset 0\njump 0\n}";
        String brain2 = "brain \"sample1\" {\nset 5\nunset 5\n jump 0\n}";
        String brain3 = "brain \"sample\" {\njump 0\n}";

        WorldInfo world = gameInfo.simulate(1, 42, map, brain,brain2);
        if(!(world.getAnt(0).getRegister() [0])){fail("Register 0 is not true");}
        if(!(world.getAnt(1).getRegister() [5])){fail("Register 5 is not true");}

        WorldInfo world2 = gameInfo.simulate(2, 42, map, brain,brain2);
        if(world2.getAnt(0).getRegister() [0]){fail("Register 0 is not false");}
        if(world2.getAnt(1).getRegister() [5]){fail("Register 5 is not false");}

        WorldInfo world3 = gameInfo.simulate(1, 42, map, brain3,brain3);
        if(world3.getAnt(0).getRegister() [0]){fail("Register 0 is not false");}
        if(world3.getAnt(1).getRegister() [5]){fail("Register 5 is not false");}


        String kbrain1 = "brain \"sample1\" {\nset -1\nunset 5\n jump 0\n}";
        String kbrain2 = "brain \"sample1\" {\nset 6\nunset 5\n jump 0\n}";

        expect(Exception.class, () -> gameInfo.simulate(1,42,map,kbrain1,brain));
        expect(Exception.class, () -> gameInfo.simulate(1,42,map,kbrain2,brain));



    }
}
