import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class TestTest {

    @Test
    public void TestTest() {
        Field[][] fields = new Field[2][2];
        Base field00 = new Base('A', 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Base field11 = new Base('C', 1, 1);
        fields[0][0] = field00;
        fields[0][1] = field01;
        fields[1][0] = field10;
        fields[1][1] = field11;

        Instruction[] brainA = new Instruction[3];
        brainA[0] = new Set(0);
        brainA[1] = new saarland.cispa.sopra.Test(0,5);
        brainA[2] = new Jump(0);
        brainA[3] = new Jump(0);
        brainA[4] = new Jump(0);
        brainA[5] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Ant antA = new Ant(swarmA, 0, fields[0][0]);
        Ant antB = new Ant(swarmB, 1, fields[1][1]);
        fields[0][0].setAnt(antA);
        fields[0][1].setAnt(antB);
        antA.setField(fields[0][0]);
        antB.setField(fields[0][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = new World(fields, 1, ants, swarms);

        world.getAnt(0).getNextInstruction().execute(world, antA);
        world.getAnt(0).getNextInstruction().execute(world, antA);

        assert (antA.getPc() == 5);
        assert(antA.getRegister(0));
    }
}
