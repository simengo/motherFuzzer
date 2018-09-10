import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.WorldInfo;


import java.util.HashMap;

public class AntTests {


    @Test
    public void emptyTest() {

        Field[][] spielfeld = new Field[2][2];
        Field field00 = new Base('A', 0, 0);
        Field field01 = new Normal(0, 1, 0);
        Field field10 = new Normal(1, 0, 9);
        Field field11 = new Base('B', 1, 1);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[3];
        brainA[0] = new Set(3);
        brainA[1] = new Set(5);
        brainA[2] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);

        World world = new World(spielfeld,12,ants, swarms);
        assert (antA.getSwarm() == 'A');
        assert (antA.getRegister(0) == false);
        assert (antA.getRegister(1) == false);
        assert (antA.getRegister(2) == false);
        assert (antA.getRegister(3) == false);
        assert (antA.getRegister(4) == false);
        assert (antA.getRegister(5) == false);

        assert (antA.hasFood() == false);

        assert(antB.getDirection() == "northwest");
        assert(antB.isDead() == false);
        assert(antA.getId() == 0);
        assert(antB.getId() == 1);
        assert(antB.getPc() == 0);
        assert(antB.getRestTime() == 0);

        antA.getNextInstruction().execute(world,antA);
        antA.getNextInstruction().execute(world,antA);
        antB.getNextInstruction().execute(world,antB);


        assert (antA.getRegister(0) == false);
        assert (antA.getRegister(1) == false);
        assert (antA.getRegister(2) == false);
        assert (antA.getRegister(3) == true);
        assert (antA.getRegister(4) == false);
        assert (antA.getRegister(5) == true);

        assert (antB.getRegister(0) == false);
        assert (antB.getRegister(1) == false);
        assert (antB.getRegister(2) == false);
        assert (antB.getRegister(3) == true);
        assert (antB.getRegister(4) == false);
        assert (antB.getRegister(5) == false);




    }
}
