import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;


import java.util.HashMap;

public class AntTests {


    @Test
    public void emptyTest() {

        Normal[][] spielfeld = new Normal[2][2];
        Normal field00 = new Normal(0, 0, 0);
        Normal field01 = new Normal(0, 1, 0);
        Normal field10 = new Normal(1, 0, 0);
        Normal field11 = new Normal(1, 1, 0);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[1];
        brainA[0] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);

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
        assert(antB.getId() == 2);
        assert(antB.getPc() == 0);



    }
}
