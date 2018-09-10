package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class MoveTests extends OberklasseTests {


    @Override
    protected void test(GameInfo gameInfo) {
        String map = initMapSt('#', '.');
        String brain1 = "brain \"sample\" {\nmove else 2\njump 1\njump 2\n}";
        String brain2 = "brain \"sample1\" {\nmove else 2\njump 1\njump 2\n}";
        // gameInfo gibt einen Snapshot der Welt nach Runde 1 zurück
        WorldInfo world = gameInfo.simulate(1, 42, map, brain1, brain2);

        int counter1 = world.getAnt(0).getPc();
        int counter2 = world.getAnt(1).getPc();
        int var1 = 1;
        int var2 = 2;

        if (counter1 != var2) {
            fail("Ant moved but should not have");
        }
        if (counter2 != var1) {
            fail("Ant did not move but it should have");
        }

        if (world.getAnt(0).getField().getX() != 8 || world.getAnt(0).getField().getY() != 2) {
            fail("Ant moved but should not have");
        }

        if (world.getAnt(1).getField().getX() != 8 || world.getAnt(1).getField().getY() != 8) {
            fail("Ant did not move but it should have");
        }

        //Test auf Himmelsrichtung
        if (!("northwest".equals(world.getAnt(0).getDirection()))) {
            fail("Wrong direction");
        }
        if (!("northwest".equals(world.getAnt(1).getDirection()))) {
            fail("Wrong direction");
        }


        String map2 = initMapSt('C', '.');
        String brain3 = "brain \"sample2\" {\njump 0\n}";
        WorldInfo world2 = gameInfo.simulate(1, 42, map2, brain1, brain2, brain3);
        if (world2.getAnt(1).getField().getX() != 8 || world2.getAnt(1).getField().getY() != 2) {
            fail("Ant moved but should not have");

        }

    }
}
