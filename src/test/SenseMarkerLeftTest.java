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
        brainA[0] = new SenseMarker("left", Target.marker, 0,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(mapFile,42,swarms);
        Normal field = (Normal)world.getFieldAt(1,0);
        field.setMarker('A',0,true);
        world.getAnt(0).getNextInstruction().execute(world, world.getAnt(0));

        assert (world.getAnt(0).getPc() == 1);
    }

    @Test
    public void SenseMarkerTest1() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 0,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseMarkerTest2() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',1,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest3() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseMarkerTest4() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',2,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest5() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseMarkerTest6() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',3,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest7() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseMarkerTest8() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',4,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest9() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseMarkerTest10() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',5,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest11() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseMarkerTest12() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',6,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseMarkerTest13() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('B',0,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 0,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest1() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 0,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseFoeMarkerTest2() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',1,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest3() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 1,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest4() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',2,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest5() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 2,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest6() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',3,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest7() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 3,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseFoeMarkerTest8() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',4,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest9() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 4,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }

    @Test
    public void SenseFoeMarkerTest10() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',5,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest11() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 5,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
    @Test
    public void SenseFoeMarkerTest12() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        field10.setMarker('A',6,true);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 1);
    }

    @Test
    public void SenseFoeMarkerTest13() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseMarker("left", Target.marker, 6,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, field00);
        field00.setAnt(antA0);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields, 42, ants, swarms);
        antA0.getNextInstruction().execute(world, antA0);

        assert (antA0.getPc() == 2);
    }
}
