import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;

import java.util.HashMap;


public class WorldTests {

    private World Szenario1() {
        Field[][] spielfeld = new Field[4][4];
        Antlion field00 = new Antlion(0, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field20 = new Normal(2, 0, 0);
        Normal field30 = new Normal(3, 0, 0);

        Base field01 = new Base('A', 0, 1);
        Normal field11 = new Normal(1, 1, 0);
        Normal field21 = new Normal(2, 1, 0);
        Normal field31 = new Normal(3, 1, 0);

        Normal field02 = new Normal(0, 2, 0);
        Normal field12 = new Normal(1, 2, 0);
        Base field22 = new Base('B', 2, 2);
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
        brainA[0] = new Jump(1);
        brainA[1] = new Jump(0);
        Instruction[] brainB = new Instruction[2];
        brainB[0] = new Jump(1);
        brainB[1] = new Jump(0);

        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        Ant antA = new Ant(swarmA, 0, spielfeld[0][1]);
        Ant antB = new Ant(swarmB, 1, spielfeld[2][2]);
        spielfeld[0][1].setAnt(antA);
        spielfeld[2][2].setAnt(antB);
        antA.setField(spielfeld[0][1]);
        antB.setField(spielfeld[2][2]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        return new World(spielfeld, 1, ants,swarms);


        // Do nothing

    }



    @Test
    public void getFieldInDirectionTest(){

        World world = Szenario1();


        Antlion field = (Antlion) world.getFieldAt(0,0);
        Normal test = (Normal) world.getFieldAt(3,3);
        Normal test2 = (Normal) world.getFieldAt(1,0);

        assert (test == world.getFieldInDirection(field,"northwest"));
        assert (test2 == world.getFieldInDirection(field,"east"));
    }


    @Test
    public void increasePoints() {

        World world = Szenario1();

        world.increasePoints('A', 5);
        assert (world.getScore('A') == 5);
    }

    @Test
    public void getNeighbours(){

        World world = Szenario1();
        Antlion field = (Antlion) world.getFieldAt(0,0);
        Field[] fields = world.getNeighbours(field);
        Normal fieldNW = (Normal) world.getFieldAt(3,3);
        Normal fieldNE = (Normal) world.getFieldAt(0,3);
        Normal fieldE = (Normal) world.getFieldAt(1,0);
        Base fieldSE = (Base) world.getFieldAt(0,1);
        Normal fieldSW = (Normal) world.getFieldAt(3,1);
        Normal fieldW = (Normal) world.getFieldAt(3,0);

        assert(fieldNW == fields[0]);
        assert(fieldNE == fields[1]);
        assert(fieldE == fields[2]);
        assert(fieldSE == fields[3]);
        assert(fieldSW == fields[4]);
        assert(fieldW == fields[5]);
    }

    @Test
    public void setAntLion(){

        World world = Szenario1();


        Normal wfieldNW = (Normal) world.getFieldAt(3,3);
        Normal wfieldNE = (Normal) world.getFieldAt(0,3);
        Normal wfieldE = (Normal) world.getFieldAt(1,0);
        Base wfieldSE = (Base) world.getFieldAt(0,1);
        Normal wfieldSW = (Normal) world.getFieldAt(3,1);
        Normal wfieldW = (Normal) world.getFieldAt(3,0);
        wfieldW.setNextToAntlion(true);


        assert(!wfieldNW.getIsNextToAntlion());
        assert(!wfieldNE.getIsNextToAntlion());
        assert(!wfieldE.getIsNextToAntlion());
        assert(!wfieldSE.getIsNextToAntlion());
        assert(!wfieldSW.getIsNextToAntlion());
        assert(wfieldW.getIsNextToAntlion());

    }



}
