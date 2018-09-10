import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class SetTests {

    @Test
    public void SetTest1() {

        Field[][] spielfeld = new Field[2][2];
        Normal field00 = new Normal(0, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[5];
        brainA[0] = new Set(3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainA");
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmA, 1, spielfeld[0][1]);
        Ant antC = new Ant(swarmA, 2, spielfeld[1][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[0][1].setAnt(antB);
        spielfeld[1][1].setAnt(antC);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[0][1]);
        antC.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        ants.put(2, antC);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        swarms.put('C', swarmB);

        World world = new World(spielfeld, 1, ants, swarms);

        world.getAnt(0).getNextInstruction().execute(world, antA);
        world.getAnt(1).getNextInstruction().execute(world, antB);
        world.getAnt(2).getNextInstruction().execute(world, antC);

        assert (antA.getRegister(3));
        assert (antB.getRegister(3));
        assert (antC.getRegister(3));
        assert (field00.getChanged());




    }
}
