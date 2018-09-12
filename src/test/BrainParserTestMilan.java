import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.util.HashMap;

public class BrainParserTestMilan {

    @Test
    public void testInvalidBrainname(Instruction[] brainA) {

        HashMap<Character, Swarm> swarms = new HashMap<>();

        Instruction[] brainB = new Instruction[2];
        brainB[0]=new Move(1);
        brainB[1]=new Move(1);


        Swarm swarmA = new Swarm('A', brainB, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");

        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        WorldParser.parseMap(new File("4\n4\nAAAA\nBBBB\n....\n===="), 1, swarms);




    }
}
