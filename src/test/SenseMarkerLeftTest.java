import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.io.File;
import java.util.HashMap;

public class SenseMarkerLeftTest {
    @Test
    public void SenseMarkerTest() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 0, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 0, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest1() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 0, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseMarkerTest2() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 1, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest3() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }

    @Test
    public void SenseMarkerTest4() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 2, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest5() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseMarkerTest6() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 3, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest7() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseMarkerTest8() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 4, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest9() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseMarkerTest10() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 5, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest11() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseMarkerTest12() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('A', 6, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseMarkerTest13() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 0, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 0, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest1() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 0, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest2() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 1, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 1, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest3() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 1, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }

    @Test
    public void SenseFoeMarkerTest4() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 2, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 2, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest5() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 2, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest6() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 3, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 3, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest7() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 3, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest8() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 4, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 4, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest9() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 4, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest10() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 5, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 5, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest11() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 5, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest12() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 6, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        field.setMarker('B', 6, true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }
    @Test
    public void SenseFoeMarkerTest13() {
        String map = "2\n2\nA.\nB.";
        File mapFile = new File(map);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.foemarker, 6, 2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile, 42, swarms);
        Normal field = (Normal) world.getFieldAt(1, 0);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 2);
    }
}
