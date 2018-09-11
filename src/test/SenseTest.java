import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.Swarm;


import java.util.HashMap;

public class SenseTest {
    @Test
    public void SenseFriendFoeTest(){
        Field[][] fields = new Field[4][4];
        Base field00 = new Base('A',0,0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(2, 0, 0);
        Normal field11 = new Normal(3, 0, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseAnt("left",Target.friend,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA,0,field00);

        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields,42,ants,swarms);
        antA0.getNextInstruction().execute(world,antA0);

        assert(antA0.getPc() == 2);
    }

    @Test
    public void SenseFriendFoe1Test(){
        Field[][] fields = new Field[4][4];
        Base field00 = new Base('A',0,0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(2, 0, 0);
        Normal field11 = new Normal(3, 0, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseAnt("left",Target.friend,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA,0,field00);
        Ant antA1 = new Ant(swarmA,0,field10);

        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(0, antA1);

        World world = new World(fields,42,ants,swarms);
        antA0.getNextInstruction().execute(world,antA0);

        assert(antA0.getPc() == 1);
    }

    @Test
    public void SenseFriendFoe2Test(){
        Field[][] fields = new Field[4][4];
        Base field00 = new Base('A',0,0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(2, 0, 0);
        Normal field11 = new Normal(3, 0, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseAnt("left",Target.foe,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA,0,field00);

        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);

        World world = new World(fields,42,ants,swarms);
        antA0.getNextInstruction().execute(world,antA0);

        assert(antA0.getPc() == 2);
    }

    @Test
    public void SenseFriendFoe3Test(){
        Field[][] fields = new Field[4][4];
        Base field00 = new Base('A',0,0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field01 = new Normal(2, 0, 0);
        Normal field11 = new Normal(3, 0, 0);

        fields[0][0] = field00;
        fields[1][0] = field10;
        fields[0][1] = field01;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new SenseAnt("left",Target.foe,2);
        brainA[1] = new Jump(1);
        brainA[1] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA,0,field00);
        Ant antB0 = new Ant(swarmB,0,field10);

        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(0, antB0);

        World world = new World(fields,42,ants,swarms);
        antA0.getNextInstruction().execute(world,antA0);

        assert(antA0.getPc() == 1);
    }
}
