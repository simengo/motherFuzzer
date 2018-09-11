package saarland.cispa.sopra.systemtests.sensetests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class SenseAnt extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".B..\n" +
            "AAA.\n" +
            "AAA.\n" +
            "....";

        senseAntFoe(gameInfo, map);
        senseAntFriend(gameInfo, map);
    }

    private void senseAntFoe(GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nsense ahead foe else 2\nset 0\nsense here foe else 4\nset 1\nsense left foe else 6\nset 2\nturn left\njump 6\n}";
        WorldInfo world = gameInfo.simulate(7, 42, map, brain, brain);
        if (!world.getAnt(2).getRegister()[0]) {
            fail("ant didn't sense foe");
        }
        if (world.getAnt(2).getRegister()[1]) {
            fail("ant sees itself as foe");
        }
        if (world.getAnt(2).getRegister()[2]) {
            fail("ant sees ally as foe");
        }
    }

    private void senseAntFriend(GameInfo gameInfo, String map) {
        String brain = "brain " +
            "\"collision\" {\nsense ahead friend else 2\nset 0\nsense here friend else 4\nset 1\nsense left friend else 6\nset 2\nturn left\njump 6\n}";
        WorldInfo world = gameInfo.simulate(7, 42, map, brain, brain);
        if (world.getAnt(2).getRegister()[0]) {
            fail("ant sensed foe as friend");
        }
        if (!world.getAnt(2).getRegister()[1]) {
            fail("ant doesn't see itself as friend");
        }
        if (!world.getAnt(2).getRegister()[2]) {
            fail("ant doesn't see ally as friend");
        }
    }
}
