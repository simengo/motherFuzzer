package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;
public class GetTypeTest extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = "4\n4\n" +
            "#ABC\n" +
            "1.4.\n" +
            "....\n" +
            "....";

        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        WorldInfo welt = gameInfo.simulate(2, 1, map, brain, brain, brain);

        if ('#' != welt.getFieldAt(0, 0).getType()) {
            fail("# falsch uebergeben");
        }

        if ('A' != welt.getFieldAt(1, 0).getType()) {
            fail("A falsch uebergeben");
        }

        if ('B' != welt.getFieldAt(2, 0).getType()) {
            fail("B falsch uebergeben");
        }

        if ('C' != welt.getFieldAt(3, 0).getType()) {
            fail("C falsch uebergeben");
        }

        if ('.' != welt.getFieldAt(0, 1).getType()) {
            fail("Food falsch uebergeben");
        }

        if ('.' != welt.getFieldAt(2, 1).getType()) {
            fail("#Food falsch uebergeben");
        }

        if ('.' != welt.getFieldAt(3, 3).getType()) {
            fail("#C falsch uebergeben");
        }


    }

}

