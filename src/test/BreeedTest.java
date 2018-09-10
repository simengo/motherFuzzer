import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.AntInfo;

import java.util.HashMap;
import java.util.Optional;

public class BreeedTest {

    @Test
    public void emptyTest() {

        Field[][] spielfeld = new Field[2][2];
        Field field00 = new Base('A', 0, 0);
        Field field10 = new Base('A', 1, 0);
        Field field01 = new Base('B', 0, 1);
        Field field11 = new Normal(1, 1, 8);
        spielfeld[0][0] = field00;
        spielfeld[1][0] = field10;
        spielfeld[0][1] = field01;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Breed(0);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antA1 = new Ant(swarmA,1,spielfeld[1][0]);
        Ant antB = new Ant(swarmB, 2, spielfeld[0][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][0].setAnt(antA1);
        spielfeld[0][1].setAnt(antB);
        antA.setField(spielfeld[0][0]);
        antA1.setField(spielfeld[1][0]);
        antB.setField(spielfeld[0][1]);
        HashMap<Integer, Ant> ants = new HashMap<>();
        ants.put(0, antA);
        ants.put(1,antA1);
        ants.put(2, antB);

        World world = new World(spielfeld, 12, ants, swarms);

        antA.setHasFood(true);
        antA1.setHasFood(true);
        antB.setHasFood(true);

        antA.setDirection("east");
        antA.getNextInstruction().execute(world,antA);

        Optional<AntInfo> ant = world.getFieldAt(1,1).getAnt();
        Optional<AntInfo> ant1 = world.getFieldAt(0,1).getAnt();


        assert(ant.isPresent() == true);
        assert(ant.get().getSwarm() == 'A' );
        assert(ant.get().getId() == 3);
        assert(ant.get().getDirection() == "northwest");
        assert(ant.get().getField().getX() == 1 && ant.get().getField().getY() == 1);
        assert(antB.isDead() == true);
        assert(ant1.isPresent( )== false);
        assert(field01.getFood() == 0);
        assert(world.getScore('B')== 3);










    }
}
