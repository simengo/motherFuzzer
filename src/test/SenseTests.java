import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class SenseTests {


    @Test
    public void AntLionTest(){

        Field[][] spielfeld = new Normal[2][2];
        Antlion field00 = new Antlion(0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[5];
        brainA[0] = new SenseField("here",Target.antlion,3);
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

        assert (antA.getPc() == 3);
        assert (antA.getPc() == 3);

    }



}
