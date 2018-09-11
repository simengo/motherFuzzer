import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WorldParserTests1 {


    @Test
    public void WorldPTest() {

        Instruction[] brainA = new Instruction[1];
        brainA[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(new File("C:\\Users\\MBreit\\Desktop\\map.txt"), 12, swarms);
        world.printMap();

    }


}



