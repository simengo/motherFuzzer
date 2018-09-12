import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;

public class breedAntlionTest {



    @Test
    public void breedAntlionTest() {
        String map = "4\n4\n1.=.\nAA##\nABAA\n.2##";
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

        World world = WorldParser.parseMap(map,42,swarms);

        world.getAnt(3).setHasFood(true); // -> wenn Ameise auf Basis B stirbt -> score +4
        world.getAnt(4).setHasFood(true);
        world.getAnt(5).setHasFood(true);
        world.getAnt(4).setDirection("northeast");
        world.getAnt(5).setDirection("west");

        assert(world.getAnts().size() == 6);
        world.getAnt(5).getNextInstruction().execute(world,world.getAnt(5));
        assert(world.getAnts().size() == 5);
        Ant ant = (Ant)world.getAllAnts().get(6);
        assert(ant.isDead());
        assert(ant.getField().getX() == 1 && ant.getField().getY() == 3);
        assert(world.getFieldAt(1,3).getFood() == 3); // Ameise von Antlion getötet -> 1 + 2 food initial -> 3
        assert(world.getFieldAt(1,2).getFood() == 0);
        assert(world.getScore('B') == 4);
    }
}
