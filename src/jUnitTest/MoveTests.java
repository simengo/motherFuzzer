import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;


public class MoveTests {

    private World Szenario1() {

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
        Swarm swarmA = new Swarm('A', brainA);
        Swarm swarmB = new Swarm('B', brainA);
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);
        antA.setField(spielfeld[0][0]);
        antB.setField(spielfeld[1][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1, antB);
        World welt = new World(spielfeld, 1, ants);

        return welt;

    }

    @Test
    public void moveTest1() {

        World welt = Szenario1();
        int x= welt.getWidth();
        int y=welt.getHeight();
        Ant antA = welt.getAnt(0);
        Ant antB = welt.getAnt(1);
        Instruction move = antA.getNextInstruction();
        move.execute(welt, antB);
        move.execute(welt, antA);
        assert (antA.getField().getX() == 1 && antA.getField().getY() == 1);

    }
}
