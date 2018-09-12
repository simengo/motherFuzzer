package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class FightTest6 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map =
            "4\n4\n"+
                "##AA\n"+
                "#A.A\n"+
                "##A1\n"+
                "###B";
        String brain = "brain \"sample\" {\njump 0\n}";
        String brain0= "brain \"sample\" {\nmove else 0\npickup else 0\nmove else 0\njump 0\n}";

        WorldInfo world = gameInfo.simulate(30,42,map,brain,brain0);
        if(world.getFieldAt(2,1).getFood() != 4 ){
            fail(String.format("ant had one food and died => 4 food but was %d ",world.getFieldAt(2,1).getFood()));
        }
        expect(NoSuchElementException.class, () -> world.getAnt(5));
    }
}
