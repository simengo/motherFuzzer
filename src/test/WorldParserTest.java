import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class WorldParserTest {
        @Test
        public void smallMapTest() {
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
                World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\smallMap.txt"),42,swarms);
            } catch (java.io.IOException e){
                fail = true;
            }
            assert(!fail);
        }

    @Test
    public void bigMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\bigMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(!fail);
    }

    @Test
    public void unevenMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\unevenMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(fail);
    }

    @Test
    public void emptyMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\emptyMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(fail);
    }

    @Test
    public void tooBigMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\tooBigMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(fail);
    }
    @Test
    public void wrongHeaderMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\wrongHeaderMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(!fail);
    }
    @Test
    public void invalidCharsMapTest() {
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
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\invalidCharsMap.txt"),42,swarms);
        } catch (java.io.IOException e){
            fail = true;
        }
        assert(fail);
    }
    }

