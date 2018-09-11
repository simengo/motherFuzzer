import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class BreedTestIsSurroundedBase {

    @Test
    public void BreedAntlionTest3() {
        Field[][] spielfeld = new Field[4][4];
        Normal field00 = new Normal(0, 0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field20 = new Normal(2, 0, 0);
        Normal field30 = new Normal(3, 0, 0);

        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);
        Base field21 = new Base('B',2, 1);
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


        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Turn(TurnDirection.left);
        brainA[1] = new Breed(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(1);
        brainB[1] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA, 0, spielfeld[2][2]);
        Ant antA1 = new Ant(swarmA, 1, spielfeld[3][2]);
        Ant antB1 = new Ant(swarmB, 2, spielfeld[1][1]);
        Ant antB2 = new Ant(swarmB, 3, spielfeld[2][0]);
        Ant antB3 = new Ant(swarmB, 4, spielfeld[3][0]);
        Ant antB4 = new Ant(swarmB, 5, spielfeld[3][1]);
        Ant antB5 = new Ant(swarmB, 6, spielfeld[0][2]);
        antA0.setHasFood(true);
        antA1.setHasFood(true);
        spielfeld[2][2].setAnt(antA0);
        spielfeld[3][2].setAnt(antA1);
        spielfeld[1][1].setAnt(antB1);
        spielfeld[2][0].setAnt(antB2);
        spielfeld[3][0].setAnt(antB3);
        spielfeld[3][1].setAnt(antB4);
        spielfeld[0][2].setAnt(antB5);
        antA0.setField(spielfeld[2][2]);
        antA1.setField(spielfeld[3][2]);
        antB1.setField(spielfeld[1][1]);
        antB2.setField(spielfeld[2][0]);
        antB3.setField(spielfeld[3][0]);
        antB4.setField(spielfeld[3][1]);
        antB5.setField(spielfeld[0][2]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(1, antA1);
        ants.put(2, antB1);
        ants.put(3, antB2);
        ants.put(4, antB3);
        ants.put(5, antB4);
        ants.put(6, antB5);
        World world = new World(spielfeld, 1, ants,swarms);

        antA1.getNextInstruction().execute(world,antA1);
        antA1.getNextInstruction().execute(world,antA1);

        assert(field21.getChanged());
        assert(field22.getChanged());
        assert(field32.getChanged());
        assert(field21.getFood() == 0);
        assert(world.getScore('B') == 3);
        assert(world.getAnt(7).isDead());
        assert(!antA0.hasFood());
        assert(!antA1.hasFood());
        // Do nothing

    }
}

