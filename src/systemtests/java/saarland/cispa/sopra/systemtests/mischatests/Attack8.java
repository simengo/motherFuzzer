package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class Attack8 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "....\n" +
            ".BBB\n" +
            ".BAB\n" +
            ".BBB";

        String brainA = "brain \"sample\" {\n turn right \n jump 1\n}";
        String brainB = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(10, 1, map, brainA, brainB);
        try {
            winfo.getAnt(4);
        } catch (NoSuchElementException e) {
            fail("Wrong death! Ant move away!");
        }

        brainA = "brain \"sample\" {\n move else 1 \n jump 1\n}";
        WorldInfo winfo2 = gameInfo.simulate(10, 1, map, brainA, brainB);
        expect(NoSuchElementException.class, () -> winfo2.getAnt(4));






    }

}
