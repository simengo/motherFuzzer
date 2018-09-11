import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class MoveStressTest {

    @Test
    public void StressTest1() {
        Field[][] spielfeld = new Field[4][4];
        Normal field00 = new Normal(0, 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field20 = new Normal(2, 0, 0);
        Normal field30 = new Normal(3, 0, 0);

        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 3);
        Normal field21 = new Normal(2, 1, 0);
        Normal field31 = new Normal(3, 1, 0);

        Normal field02 = new Normal(0, 2, 0);
        Normal field12 = new Normal(1, 2, 0);
        Normal field22 = new Normal(2, 2, 0);
        Normal field32 = new Normal(3, 2, 0);

        Normal field03 = new Normal(0, 3, 0);
        Normal field13 = new Normal(1, 3, 0);
        Normal field23 = new Normal(2, 3, 0);
        Normal field33 = new Normal(3, 3, 0);

        spielfeld[0][0] = field00;
        spielfeld[1][0] = field10;
        spielfeld[2][0] = field20;
        spielfeld[3][0] = field30;

        spielfeld[0][1] = field01;
        spielfeld[1][1] = field11;
        spielfeld[2][1] = field21;
        spielfeld[3][1] = field31;

        spielfeld[0][2] = field02;
        spielfeld[1][2] = field12;
        spielfeld[2][2] = field22;
        spielfeld[3][2] = field32;

        spielfeld[0][3] = field03;
        spielfeld[1][3] = field13;
        spielfeld[2][3] = field23;
        spielfeld[3][3] = field33;


        Instruction[] brainA = new Instruction[4];
        brainA[0] = new Turn(TurnDirection.right);
        brainA[1] = new Turn(TurnDirection.right);
        brainA[2] = new Move(1);
        brainA[3] = new Jump(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(1);
        brainB[1] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA, 0, spielfeld[1][0]);
        Ant antA1 = new Ant(swarmA, 1, spielfeld[2][0]);
        Ant antA2 = new Ant(swarmA, 2, spielfeld[2][1]);
        Ant antA3 = new Ant(swarmA, 3, spielfeld[2][2]);
        Ant antA4 = new Ant(swarmA, 4, spielfeld[2][3]);
        Ant antA5 = new Ant(swarmA, 5, spielfeld[0][2]);
        Ant antB0 = new Ant(swarmB, 6, spielfeld[1][1]);
        Ant antB1 = new Ant(swarmB, 7, spielfeld[1][3]);


        spielfeld[1][0].setAnt(antA0);
        spielfeld[2][0].setAnt(antA1);
        spielfeld[2][1].setAnt(antA2);
        spielfeld[2][2].setAnt(antA3);
        spielfeld[2][3].setAnt(antA4);
        spielfeld[0][2].setAnt(antA5);

        spielfeld[1][1].setAnt(antB0);
        spielfeld[1][3].setAnt(antB1);

        antA0.setField(spielfeld[1][0]);
        antA1.setField(spielfeld[2][0]);
        antA2.setField(spielfeld[2][1]);
        antA3.setField(spielfeld[2][2]);
        antA4.setField(spielfeld[2][3]);
        antA5.setField(spielfeld[0][2]);

        antB0.setField(spielfeld[1][1]);
        antB1.setField(spielfeld[1][3]);

        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(1, antA1);
        ants.put(2, antA2);
        ants.put(3, antA3);
        ants.put(4, antA4);
        ants.put(5, antA5);
        ants.put(6, antB0);
        ants.put(7, antB1);
        World world = new World(spielfeld, 1, ants,swarms);

        antA5.getNextInstruction().execute(world,antA5);
        antA5.getNextInstruction().execute(world,antA5);
        antA5.getNextInstruction().execute(world,antA5);

        assert(field02.getChanged());
        assert(field11.getChanged());
        assert(field12.getChanged());
        assert(field13.getChanged());
        assert(field11.getFood() == 6);
        assert(field13.getFood() == 3);
        assert(world.getAnt(6).isDead());
        assert(world.getAnt(7).isDead());
    }
}
