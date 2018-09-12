import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class SenseFieldAheadTest {
    @Test
    public void SenseFieldTest() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Base field11 = new Base('A',1, 1);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseField("ahead", Target.home, 2);
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
    public void SenseFieldTest1() {
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
        brainA[0] = new SenseField("ahead", Target.home, 2);
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
    public void SenseFieldTest2() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Base field11 = new Base('B',1, 1);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseField("ahead", Target.foehome, 2);
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
    public void SenseFieldTest3() {
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
        brainA[0] = new SenseField("ahead", Target.foehome, 2);
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
    public void SenseFieldTest4() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Rock field11 = new Rock(1, 1);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseField("ahead", Target.rock, 2);
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
    public void SenseFieldTest5() {
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
        brainA[0] = new SenseField("ahead", Target.rock, 2);
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
    public void SenseFieldTest6() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field10 = new Normal(1, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Antlion field11 = new Antlion(1, 1);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseField("ahead", Target.antlion, 2);
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
    public void SenseFieldTest7() {
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
        brainA[0] = new SenseField("ahead", Target.antlion, 2);
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
