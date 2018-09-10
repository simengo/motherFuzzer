import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class SenseTests {


    @Test
    public void AntLionTest(){

        Field[][] spielfeld = new Field[2][2];
        Antlion field00 = new Antlion(0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[5];
        brainA[0] = new SenseField("ahead",Target.antlion,3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Ant antA = new Ant(swarmA, 0, spielfeld[0][1]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        spielfeld[0][1].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        antA.setField(spielfeld[0][1]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        World world = new World(spielfeld, 1, ants,swarms);

        world.getAnt(0).getNextInstruction().execute(world,antA);
        world.getAnt(1).getNextInstruction().execute(world,antB);

        assert (antA.getPc() == 1);
        assert (antB.getPc() != 1);

    }

    @Test
    public void friendFoodTest(){

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
        brainA[0] = new SenseFood("ahead",Target.friendfood,3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Ant antA1 = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antA2 = new Ant(swarmA, 1, spielfeld[0][1]);
        Ant antB = new Ant(swarmB, 2, spielfeld[1][1]);
        antA1.setHasFood(true);
        spielfeld[0][0].setAnt(antA1);
        spielfeld[0][1].setAnt(antA2);
        spielfeld[1][1].setAnt(antB);
        antA1.setField(spielfeld[0][0]);
        antA2.setField(spielfeld[0][1]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA1);
        ants.put(1, antA2);
        ants.put(2, antB);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        World world = new World(spielfeld, 1, ants,swarms);

        world.getAnt(1).getNextInstruction().execute(world,antA2);
        world.getAnt(2).getNextInstruction().execute(world,antB);

        assert (antA2.getPc() == 1);
        assert (antB.getPc() != 1);

    }

    @Test
    public void foeFoodTest(){

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
        brainA[0] = new SenseFood("ahead",Target.foefood,3);
        brainA[1] = new Jump(0);
        Instruction[] brainB = new Instruction[5];
        brainB[0] = new SenseFood("right",Target.foefood,3);
        brainB[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainB, "brainB");
        Ant antB1 = new Ant(swarmB, 0, spielfeld[0][0]);
        Ant antA2 = new Ant(swarmA, 1, spielfeld[0][1]);
        Ant antB = new Ant(swarmB, 2, spielfeld[1][1]);
        antB1.setHasFood(true);
        spielfeld[0][0].setAnt(antB1);
        spielfeld[0][1].setAnt(antA2);
        spielfeld[1][1].setAnt(antB);
        antB1.setField(spielfeld[0][0]);
        antA2.setField(spielfeld[0][1]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antB1);
        ants.put(1, antA2);
        ants.put(2, antB);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        World world = new World(spielfeld, 1, ants,swarms);

        world.getAnt(1).getNextInstruction().execute(world,antA2);
        world.getAnt(2).getNextInstruction().execute(world,antB);

        assert (antA2.getPc() == 1);
        assert (antB.getPc() != 1);

    }


    @Test
    public void foeMarkerTest(){

        Field[][] spielfeld = new Field[2][2];
        Normal field00 = new Normal(0, 0,0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        field00.setMarker('B',3,true);
        field10.setMarker('B',3,true);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[5];
        brainA[0] = new SenseMarker("ahead",Target.foemarker,3,3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");

        Ant antA2 = new Ant(swarmA, 1, spielfeld[0][1]);
        Ant antB = new Ant(swarmB, 2, spielfeld[1][1]);


        spielfeld[0][1].setAnt(antA2);
        spielfeld[1][1].setAnt(antB);

        antA2.setField(spielfeld[0][1]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();

        ants.put(0, antA2);
        ants.put(1, antB);
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A',swarmA);
        swarms.put('B',swarmB);

        World world = new World(spielfeld, 1, ants,swarms);

        world.getAnt(0).getNextInstruction().execute(world,antA2);
        world.getAnt(1).getNextInstruction().execute(world,antB);

        assert (antA2.getPc() == 1);
        assert (antB.getPc() != 1);
        assert (field01.getChanged());
        assert (field11.getChanged());

    }




}
