package saarland.cispa.sopra.systemtests;


//test Direction

public class SimpleMoves0 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


// test 0

        String map = "4\n4\n" +
            "....\n" +
            "..A.\n" +
            "....\n" +
            ".B..";

        String brain = "brain \"sample\" {\n turn left \n turn left \n turn left \n turn left \n turn left \n turn left \n turn right \n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1, 567, map, brain, brain);
        if (!("west".equals(winfo.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }

        WorldInfo winfo2 = gameInfo.simulate(2, 567, map, brain, brain);
        if (!("southwest".equals(winfo2.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }

        WorldInfo winfo3 = gameInfo.simulate(3, 567, map, brain, brain);
        if (!("southeast".equals(winfo3.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }

        WorldInfo winfo4 = gameInfo.simulate(4, 567, map, brain, brain);
        if (!("east".equals(winfo4.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }

        WorldInfo winfo5 = gameInfo.simulate(5, 567, map, brain, brain);
        if (!("northeast".equals(winfo5.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }


        WorldInfo winfo6 = gameInfo.simulate(6, 567, map, brain, brain);
        if (!("northwest".equals(winfo6.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }

        WorldInfo winfo7 = gameInfo.simulate(7, 567, map, brain, brain);
        if (!("northeast".equals(winfo7.getAnt(0).getDirection()))) {
            fail("Wrong Direction!");
        }



        String map1 = "4\n4\n" +
            "...A\n" +
            "....\n" +
            "....\n" +
            ".B..";

        String brain1 = "brain \"sample\" {\n turn right \n move else 2 \n jump 2\n}";
        String brain2 = "brain \"sample\" {\n jump 0\n}";
        WorldInfo winfo8 = gameInfo.simulate(3, 57, map1, brain1, brain2);

        if(!("northeast".equals(winfo8.getAnt(0).getDirection()))){
            fail("Wrong Direction!");
        }
    }



}
