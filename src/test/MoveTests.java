import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class MoveTests {

    public static World Szenario1() {

        Normal[][] spielfeld = new Normal[2][2];
        Normal field00 = new Normal(0, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Move(1);
        brainA[1] = new Move(0);
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
        World welt = new World(spielfeld, 1, ants, swarms);

        return welt;

    }

    public static World Szenario2() {

        Field[][] spielfeld = new Field[4][4];

        Normal field00 = new Normal(0, 0, 0);
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


        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Turn(TurnDirection.left);
        brainB[1] = new Move(0);

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Turn(TurnDirection.left);
        brainA[1] = new Turn(TurnDirection.right);


        Swarm swarmA = new Swarm('A', brainA, "swarmA");
        Swarm swarmB = new Swarm('B', brainB, "swarmB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);

        Ant antA0 = new Ant(swarmA, 0, spielfeld[1][1]);
        Ant antA1 = new Ant(swarmA, 1, spielfeld[2][1]);
        Ant antA2 = new Ant(swarmA, 2, spielfeld[1][2]);
        Ant antA4 = new Ant(swarmA, 4, spielfeld[1][3]);
        Ant antA5 = new Ant(swarmA, 5, spielfeld[2][3]);
        Ant antB3 = new Ant(swarmB, 3, spielfeld[3][2]);

        spielfeld[1][1].setAnt(antA0);
        spielfeld[1][2].setAnt(antA2);
        spielfeld[2][1].setAnt(antA1);
        spielfeld[3][2].setAnt(antB3);
        spielfeld[1][3].setAnt(antA4);
        spielfeld[2][3].setAnt(antA5);

        antA0.setField(spielfeld[1][1]);
        antA1.setField(spielfeld[2][1]);
        antA2.setField(spielfeld[1][2]);
        antA4.setField(spielfeld[1][3]);
        antA5.setField(spielfeld[2][3]);
        antB3.setField(spielfeld[3][2]);

        HashMap<Integer, Ant> ants = new HashMap<>();

        ants.put(0, antA0);
        ants.put(1, antA1);
        ants.put(2, antA2);
        ants.put(3, antB3);
        ants.put(4, antA4);
        ants.put(5, antA5);

        World welt = new World(spielfeld, 1, ants, swarms);

        return welt;


    }

    public static World Szenario3() {

        Normal[][] spielfeld = new Normal[2][2];
        Normal field00 = new Normal(0, 0, 1);
        Normal field01 = new Normal(0, 1, 1);
        Normal field10 = new Normal(1, 0, 1);
        Normal field11 = new Normal(1, 1, 1);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Breed(1);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        Ant antC = new Ant(swarmB, 2, spielfeld[1][0]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        spielfeld[1][0].setAnt(antC);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[1][1]);
        antC.setField(spielfeld[1][0]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        ants.put(2, antC);
        World welt = new World(spielfeld, 1, ants, swarms);

        return welt;

    }

    @Test
    public void moveTest1() {

        World welt = Szenario1();
        int x = welt.getWidth();
        int y = welt.getHeight();
        Ant antA = welt.getAnt(0);
        Ant antB = welt.getAnt(1);
        Instruction move = antA.getNextInstruction();
        move.execute(welt, antB);
        move.execute(welt, antA);
        assert (antA.getField().getX() == 1 && antA.getField().getY() == 1);

    }

    @Test
    public void moveTest2() {

        World welt = Szenario2();
        Ant antB = welt.getAnt(3);
        Instruction turn = antB.getNextInstruction();
        turn.execute(welt, antB);
        Instruction move = antB.getNextInstruction();
        move.execute(welt, antB);

    }
}
