import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class WorldParserTestMilan {

    @Test
    public void worldParserTest() throws IOException {
        String map = "8\n6\n" +
            "........\n" +
            "...BB...\n" +
            "........\n" +
            "........\n" +
            "...AA...\n" +
            "........";

        File mapfile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Turn(TurnDirection.left);
        brainA[1] = new Turn(TurnDirection.right);

        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmA = new Swarm('A', brainA, "swarmA");
        Swarm swarmB = new Swarm('B', brainA, "swarmB");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        WorldParser.parseMap(mapfile, 1, swarms);

    }
}
