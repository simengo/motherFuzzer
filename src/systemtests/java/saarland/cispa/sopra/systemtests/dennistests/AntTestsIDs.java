package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;

public class AntTestsIDs extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {
        String map = "2\n2\n" + "AB\n" + "CD";

        String brain = "brain \"sample\" {\njump 0\n}";
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, brain,brain,brain);

        if(world.getAnt(0).getField().getX() != 0 || world.getAnt(0).getField().getY() != 0){fail("Ant 0 has wrong ID");}
        if(world.getAnt(1).getField().getX() != 1 || world.getAnt(1).getField().getY() != 0){fail("Ant 1 has wrong ID");}
        if(world.getAnt(2).getField().getX() != 0 || world.getAnt(2).getField().getY() != 1){fail("Ant 2 has wrong ID");}
        if(world.getAnt(3).getField().getX() != 1 || world.getAnt(3).getField().getY() != 1){fail("Ant 3 has wrong ID");}
        expect(NoSuchElementException.class,() -> world.getAnt(-1));
        expect(NoSuchElementException.class,() -> world.getAnt(4));
    }
}
