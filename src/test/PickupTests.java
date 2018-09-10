import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class PickupTests {


    @Test
    public void PickupTest1() {

        Field[][] spielfeld = new Field[2][2];
        Normal field00 = new Normal(0, 0,9);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 1);
        Base field11 = new Base('C', 1, 1);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[5];
        brainA[0] = new Pickup(3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Swarm swarmC = new Swarm('C', brainA, "brainC");
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[0][1]);
        Ant antD = new Ant(swarmB, 3, spielfeld[1][0]);
        Ant antC = new Ant(swarmB, 2, spielfeld[1][1]);
        antD.setHasFood(true);
        spielfeld[0][0].setAnt(antA);
        spielfeld[0][1].setAnt(antB);
        spielfeld[1][0].setAnt(antD);
        spielfeld[1][1].setAnt(antC);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[0][1]);
        antD.setField(spielfeld[1][0]);
        antC.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        ants.put(2, antC);
        ants.put(3, antD);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        swarms.put('C', swarmC);

        World world = new World(spielfeld, 1, ants, swarms);

        world.getAnt(0).getNextInstruction().execute(world, antA);
        world.getAnt(1).getNextInstruction().execute(world, antB);
        world.getAnt(2).getNextInstruction().execute(world, antC);
        world.getAnt(3).getNextInstruction().execute(world, antD);

        assert (antA.getPc() == 1);
        assert (antA.hasFood());
        assert (field00.getFood() == 8);
        assert (antB.getPc() == 3);
        assert (!antB.hasFood());
        assert (field01.getFood() == 0);
        assert (antC.getPc() == 3);
        assert (!antC.hasFood());
        assert (antD.getPc() == 3);
        assert (antD.hasFood());
        assert (field10.getFood() == 1);
        assert (field00.getChanged());
        assert (field01.getChanged());
        assert (field11.getChanged());



    }
}
