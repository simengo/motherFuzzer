import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class BreedTest1 {

    @Test
    public void breedTest1() {


        World welt = MoveTests.Szenario3();
        welt.getAnt(1).setHasFood(true);
        welt.getAnt(2).setHasFood(true);
        Instruction breed = welt.getAnt(1).getNextInstruction();
        breed.execute(welt, welt.getAnt(1));

        assert (welt.getAnt(3) != null && welt.getFieldAt(0, 1).getAnt().isPresent());

    }

}
