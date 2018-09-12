import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;
import java.util.Map;

public class DirectionTest {

    @Test
    public void DirectionTest1() {



        String map = "2\n2\n" + "A.\n" + "BC";

        Instruction[] brainA = new Instruction[4];
        brainA[0] = new Turn(TurnDirection.right);
        brainA[1] = new Direction(3,"northeast");
        brainA[2] = new Jump(0);
        brainA[3] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Swarm swarmC = new Swarm('C', brainA, "brainC");
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        swarms.put('C', swarmC);
        World world = WorldParser.parseMap(map, 12, swarms);

        world.getAnt(0).getNextInstruction().execute(world,world.getAnt(0));
        world.getAnt(0).getNextInstruction().execute(world,world.getAnt(0));
        world.getAnt(1).getNextInstruction().execute(world,world.getAnt(1));
        world.getAnt(1).setDirection("east");
        world.getAnt(1).getNextInstruction().execute(world,world.getAnt(1));

        assert (world.getAnt(0).getDirection().equals("northeast"));
        assert (world.getAnt(0).getPc() == 2);
        assert (world.getScore('A') == 0);
        assert (world.getFieldAt(1,1).getType() == 'C');
        assert (world.getAnt(1).getDirection().equals("east"));
        assert (world.getAnt(1).getPc() == 3);




    }
}
