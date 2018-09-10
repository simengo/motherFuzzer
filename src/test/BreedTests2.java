import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class BreedTests2 {

    @Test
    public void BreedAntlionTest1() {
        Field[][] spielfeld = new Field[4][4];
        Antlion field00 = new Antlion(0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field20 = new Normal(2, 0, 0);
        Normal field30 = new Normal(3, 0, 0);

        Normal field01 = new Normal(0, 1, 0);
        Normal field11 = new Normal(1, 1, 0);
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

        field32.setNextToAntlion(true);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Turn(TurnDirection.left);
        brainA[1] = new Breed(1);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(1);
        brainB[1] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA0 = new Ant(swarmA, 0, spielfeld[2][2]);
        Ant antA1 = new Ant(swarmA, 1, spielfeld[3][2]);
        antA0.setHasFood(true);
        antA1.setHasFood(true);
        Ant antB = new Ant(swarmB, 2, spielfeld[3][3]);
        spielfeld[2][2].setAnt(antA0);
        spielfeld[3][2].setAnt(antA1);
        spielfeld[3][3].setAnt(antB);
        antA0.setField(spielfeld[2][2]);
        antA1.setField(spielfeld[3][2]);
        antB.setField(spielfeld[3][3]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(1, antA1);
        ants.put(2, antB);
        World world = new World(spielfeld, 1, ants,swarms);

        antA1.getNextInstruction().execute(world,antA1);
        antA1.getNextInstruction().execute(world,antA1);

        assert(field21.getChanged());
        assert(field22.getChanged());
        assert(field32.getChanged());
        assert(field21.getFood() == 1);
        assert(world.getAnt(3).isDead());
        assert(!antA0.hasFood());
        assert(!antA1.hasFood());
        // Do nothing

    }
}
