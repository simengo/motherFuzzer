import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class breedAntlionTest {



    @Test
    public void breedAntlionTest() {

        Field[][] spielfeld = new Field[4][4];
        Field field00 = new Normal(0, 0, 1);
        Field field10 = new Normal(1, 0, 0);
        Field field20 = new Antlion(2, 0);
        Field field30 = new Normal(3,0,0);

        Field field01 = new Base('A', 0, 1);
        Field field11 = new Base('A', 1, 1);
        Field field21 = new Rock(2, 1);
        Field field31 = new Rock(3, 1);

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
        Ant antA1 = new Ant(swarmA, 1, spielfeld[1][1]);
        Ant antA2 = new Ant(swarmA, 2, spielfeld[0][2]);
        Ant antA3 = new Ant(swarmA, 4, spielfeld[2][2]);
        Ant antA4 = new Ant(swarmA, 5, spielfeld[3][2]);

        Ant antB0 = new Ant(swarmB,3,spielfeld[1][2]);
        antB0.setHasFood(true); // -> wenn Ameise auf Basis B stirbt -> score +4

        spielfeld[0][1].setAnt(antA0);
        spielfeld[1][1].setAnt(antA1);
        spielfeld[0][2].setAnt(antA2);
        spielfeld[2][2].setAnt(antA3);
        spielfeld[3][2].setAnt(antA4);
        spielfeld[1][3].setNextToAntlion(true);

        spielfeld[1][2].setAnt(antB0);

        antA0.setField(spielfeld[0][1]);
        antA1.setField(spielfeld[1][1]);
        antA2.setField(spielfeld[0][2]);
        antA3.setField(spielfeld[2][2]);
        antA4.setField(spielfeld[3][2]);

        antB0.setField(spielfeld[1][2]);




        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA0);
        ants.put(1, antA1);
        ants.put(2, antA2);
        ants.put(3, antB0);
        ants.put(4, antA3);
        ants.put(5, antA4);

        World world = new World(spielfeld, 873, ants, swarms);


        antA3.setHasFood(true);
        antA4.setHasFood(true);

        antA3.setDirection("northeast");
        antA4.setDirection("west");

        assert(world.getAnts().size() == 6);
        antA4.getNextInstruction().execute(world,antA4);

        assert(world.getAnts().size() == 7);
        Ant helpAnt = (Ant) world.getAnts().get(6);
//        System.out.println(String.format("id: %d", helpAnt.getId()));
//        System.out.println(String.format("x: %d", helpAnt.getField().getX()));
//        System.out.println(String.format("y: %d", helpAnt.getField().getY()));
//        System.out.println(String.format("swarm: %c", helpAnt.getSwarm()));
//
//        System.out.println(String.format("x: %d", antA4.getField().getX()));
//        System.out.println(String.format("y: %d", antA4.getField().getY()));

        assert(helpAnt.isDead() == true);
        assert(helpAnt.getField().getX() == 1 && helpAnt.getField().getY() == 3);
        assert(field13.getFood() == 3); // Ameise von Antlion getötet -> 1 + 2 food initial -> 3
        assert(field12.getFood() == 0);
        assert(world.getScore('B') == 4);


    }

}
