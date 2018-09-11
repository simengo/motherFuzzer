import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class breedAntlionTest {



    @Test
    public void breedAntlionTest() {

        Field[][] spielfeld = new Field[4][4];
        Field field00 = new Normal('0', 0, 1);
        Field field10 = new Normal(1, 0, 0);
        Field field20 = new Antlion(2, 0);
        Field field30 = new Normal(3,0,0);

        Field field01 = new Base('A', 0, 1);
        Field field11 = new Base('A', 1, 1);
        Field field21 = new Rock(2, 1);
        Field field31 = new Rock(2, 1);

        Field field02 = new Base('A', 0, 2);
        Field field12 = new Base('B', 1, 2);
        Field field22 = new Base('A', 2, 2);
        Field field32 = new Base('A', 3, 2);

        Field field03 = new Normal(0, 3, 0);
        Field field13 = new Normal(1, 3, 2);
        Field field23 = new Rock(2, 3);
        Field field33 = new Rock(3, 3);

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
        Instruction[] brainB = new Instruction[1];
        brainB[0] = new Jump(0);
        brainA[0] = new Breed(1);
        brainA[1] = new Jump(1);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        Ant antA0 = new Ant(swarmA, 0, spielfeld[0][1]);
        Ant antA1 = new Ant(swarmA, 1, spielfeld[0][2]);
        Ant antA2 = new Ant(swarmA, 2, spielfeld[0][2]);
        Ant antA3 = new Ant(swarmA, 3, spielfeld[0][2]);
        Ant antA4 = new Ant(swarmA, 4, spielfeld[0][2]);

        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);

        World world = new World(spielfeld, 12, ants, swarms);


    }

}
