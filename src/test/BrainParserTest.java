import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.BrainParser;
import saarland.cispa.sopra.Swarm;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class BrainParserTest {

    @Test
    public void emptyTest() {

        File[] brains = new File[2];

        File brainA = new File("C:\\Users\\MBreit\\Desktop\\brain.txt");
        brains[0] = brainA;
        brains[1] = brainA;

        try {
            Map<Character, Swarm> swarms = BrainParser.parse(brains);
            Swarm a = swarms.get('A');
            for(int i = 0; i< a.getBrain().length; i++) {
                System.out.println(a.getInstruction(i).toString());
            }
        } catch(IOException e){
            e.printStackTrace();
        }

    }

}
