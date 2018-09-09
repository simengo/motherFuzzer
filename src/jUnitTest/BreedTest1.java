import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class BreedTest1 {

    @Test
    public void breedTest1() {


        World welt = MoveTests.Szenario1();
        welt.getAnt(1).setHasFood(true);
        Ant antB1 = new Ant(welt.getAnt(1).getSwarmInstance(), 2, (Field) welt.getFieldAt(1, 0));
        ((Field) welt.getFieldAt(1, 0)).setAnt(antB1);
        welt.getAnts().add(antB1);
        welt.getAnt(2).setHasFood(true);

        Instruction breed = new Breed(0);
        breed.execute(welt, welt.getAnt(2));

        assert (welt.getAnt(3) != null && welt.getFieldAt(0, 1).getAnt().isPresent());

    }

}
