import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MarkTests {

    @Test
    public void MarkTest1() {



        String map = "2\n2\n" + "A.\n" + "BC";
        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Mark(3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Swarm swarmC = new Swarm('C', brainA, "brainC");
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        swarms.put('C', swarmC);
        World world = WorldParser.parseMap(map, 12, swarms);
        world.printMap();

        assert (field00.getMarker('A',3));
        assert (field01.getMarker('B',3));
        assert (field11.getMarker('C',3));
        assert (field00.getChanged());




    }
}
