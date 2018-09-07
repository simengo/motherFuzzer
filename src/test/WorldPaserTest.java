import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class WorldPaserTest {
    public class BreedTest {

        @BeforeEach
        public void doBefore () {
            Map<Character, Swarm> swarms = new HashMap<Character,Swarm>();
            Instruction[] brainA = new Instruction[1];
            Instruction[] brainB = new Instruction[1];
            brainA[0] = new Jump(0);
            brainB[0] = new Jump(0);
            Swarm swarmA = new Swarm('A',brainA,"A");
            Swarm swarmB = new Swarm('B',brainB,"B");
            swarms.put('A',swarmA);
            swarms.put('B',swarmB);
            boolean fail = false;

            try {
                World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\map.txt"),42,swarms);
            } catch (java.io.IOException e){
                fail = true;
            }
            assert(fail);
        }

        @BeforeAll
        public void doBeforeAll () {
            //Do nothing
        }

        @Test
        public void emptyTest() {
            // Do nothing
        }

    }

}
