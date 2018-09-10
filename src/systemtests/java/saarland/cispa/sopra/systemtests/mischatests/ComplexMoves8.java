package saarland.cispa.sopra.systemtests.mischatests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class ComplexMoves8 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "2\n2\n" +
            "AB\n" +
            "CD";

        String brainA = "brain \"sample\" {\n move else 1 \n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(20, 4, map, brainA, brainA,brainA,brainA);

        expect(NoSuchElementException.class, () -> winfo.getAnt(0));





    }



}
