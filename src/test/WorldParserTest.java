import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.FieldInfo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


public class WorldParserTest {
    @Test
    public void smallMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\smallMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = true;
        }
        assert (!fail);
    }

    @Test
    public void bigMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\bigMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = true;
        }
        assert (!fail);
    }

    @Test
    public void unevenMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\unevenMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void emptyMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\emptyMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void tooBigMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\tooBigMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void invalidCharsMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\invalidCharsMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = true;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void wrongHeaderMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\wrongHeaderMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void variousMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        World world = null;
        try {
            world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\variousTestMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = true;
        }
        assert (!fail);
        assert (world.getAnts().size() == 4);
        assert (world.getFieldAt(0, 0).getType() == '.');
        assert (world.getFieldAt(1, 0).getType() == 'A');
        assert (world.getFieldAt(1, 0).getAnt().get().getId() == 0);
        assert (world.getFieldAt(1, 3).getType() == 'B');
        assert (world.getFieldAt(0, 1).getType() == '.');
        assert (world.getFieldAt(1, 1).getType() == '.');
        assert (world.getFieldAt(2, 1).getType() == '.');
        assert (world.getFieldAt(3, 1).getType() == '.');
        assert (world.getFieldAt(0, 1).getFood() == 1);
        assert (world.getFieldAt(1, 1).getFood() == 2);
        assert (world.getFieldAt(2, 1).getFood() == 3);
        assert (world.getFieldAt(3, 1).getFood() == 4);
        FieldInfo field = world.getFieldAt(1, 1);
        field = (Normal) field;
        assert (((Normal) field).getIsNextToAntlion());
        assert (world.getFieldAt(0, 2).getType() == '=');
        assert (world.getFieldAt(0, 2).getType() == '=');
    }

    @Test
    public void basesNotConnectedMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\basesNotConnectedMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void inconsistentMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainC = new Instruction[1];
        brainA[0] = new Jump(0);
        brainC[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('C', brainC, "C");
        swarms.put('A', swarmA);
        swarms.put('C', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\inconsistentMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void pointMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\pointMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void toSmallMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\tooSmallMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }

    @Test
    public void weirdMapTest() {
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        Instruction[] brainA = new Instruction[1];
        Instruction[] brainB = new Instruction[1];
        brainA[0] = new Jump(0);
        brainB[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "A");
        Swarm swarmB = new Swarm('B', brainB, "B");
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        boolean fail = false;

        try {
            World world = WorldParser.parseMap(new File("C:\\Users\\simen\\Desktop\\maps\\weirdMap.txt"), 42, swarms);
        } catch (java.io.IOException e) {
            fail = false;
        } catch (IllegalArgumentException e) {
            fail = true;
        }
        assert (fail);
    }


}

//inconsistenMap = 2\n2\nAC\n..
