import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.HashMap;
import java.util.Map;

public class MarkTests {

    @Test
    public void MarkTest1() {



        String map = "2\n2\n" + "A.\n" + "BC";

        Instruction[] brainA = new Instruction[2];
        brainA[0] = new Mark(3);
        brainA[1] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        Swarm swarmC = new Swarm('C', brainA, "brainC");
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        swarms.put('C', swarmC);
        World world = WorldParser.parseMap(map, 12, swarms);

        world.getAnt(0).getNextInstruction().execute(world,world.getAnt(0));
        world.getAnt(1).getNextInstruction().execute(world,world.getAnt(1));
        world.getAnt(2).getNextInstruction().execute(world,world.getAnt(2));

        ((Field) world.getFieldAt(0,0)).setMarker('A',2,true);

        assert (((Field) world.getFieldAt(0,0)).getMarker('A',3));
        assert (((Field) world.getFieldAt(0,1)).getMarker('B',3));
        assert (((Field) world.getFieldAt(1,1)).getMarker('C',3));
        assert (((Field) world.getFieldAt(0,0)).getChanged());




    }

    @Test
    public void UnmarkTest1() {



        String map = "2\n2\n" + "A.\n" + "BC";
        Instruction[] brainA = new Instruction[3];
        brainA[0] = new Mark(3);
        brainA[1] = new Unmark(3);
        brainA[2] = new Jump(0);
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
        world.getAnt(1).getNextInstruction().execute(world,world.getAnt(1));
        world.getAnt(2).getNextInstruction().execute(world,world.getAnt(2));
        world.getAnt(2).getNextInstruction().execute(world,world.getAnt(2));

        ((Field) world.getFieldAt(0,0)).setMarker('A',2,true);

        assert (!(((Field) world.getFieldAt(0,0)).getMarker('A',3)));
        assert (!(((Field) world.getFieldAt(0,1)).getMarker('B',3)));
        assert (!(((Field) world.getFieldAt(1,1)).getMarker('C',3)));
        assert (((Field) world.getFieldAt(0,0)).getChanged());




    }
}
