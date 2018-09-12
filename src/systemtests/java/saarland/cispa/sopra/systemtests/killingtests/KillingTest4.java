package saarland.cispa.sopra.systemtests.killingtests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class KillingTest4 extends SystemTest {
    @Override
    protected void test(GameInfo gameInfo) {

        String map4 = "6\n6\n" +
            ".AAA..\n" +
            ".ABBB.\n" +
            ".AAAB.\n" +
            "..BBB.\n" +
            "......\n" +
            "..C...\n";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\njump 0\n}";

        String brain2 = "brain " +
            "\"sample\" {\nmove else 1\nturn left\nturn left\nturn left\njump 0\n}";

        WorldInfo world4 = gameInfo.simulate(1, 42, map4, brain, brain, brain2);

        if (world4.getFieldAt(2, 1).getAnt().isPresent()) {
            fail("Ant didn't die in world 4");
        }
        if (!world4.getFieldAt(3, 2).getAnt().isPresent()) {
            fail("Ant didn't die even thou it should in world 4");
        }
        if(world4.getScore('B')!=3){
            fail("wrong number of points added to swarm B");
        }
        if(world4.getScore('A')!=0){
            fail("A has points without making any");
        }
    }
}
