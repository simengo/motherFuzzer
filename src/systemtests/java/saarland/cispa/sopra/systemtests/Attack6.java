package saarland.cispa.sopra.systemtests;

import java.util.NoSuchElementException;

public class Attack6 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "....\n" +
            "..BB\n" +
            "B.CA\n" +
            "..C.";

        String brainA = "brain \"sample\" {\njump 0\n}";
        String brainB = "brain \"sample\" {\njump 0\n}";

        try {
           WorldInfo winfo = gameInfo.simulate(0, 23, map, brainA, brainB,brainA);
           winfo.getAnt(4);
        } catch (NoSuchElementException e) {
            fail("Wrong Attack in 0 rounds!");
        }



        String map1 = "4\n4\n" +
            "AAA#\n" +
            "BBA#\n" +
            "BAA#\n" +
            "BB##";

        brainA = "brain \"sample\" {\njump 0\n}";
        brainB = "brain \"sample\" {\n move else 0 \n jump 0\n}";

        WorldInfo winfo2 = gameInfo.simulate(1,343,map1,brainA,brainB);

        expect(NoSuchElementException.class, () -> winfo2.getAnt(4));


        try {
            winfo2.getAnt(7);
        } catch (NoSuchElementException e) {
            fail("Wrong Ant died!");
        }





    }


}
