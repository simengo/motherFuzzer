import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.HashMap;
import java.util.Map;

import static com.ibm.icu.impl.Assert.fail;

public class TestFürDennisx3 {
    protected String createTileMap(char tile) {
        return "2\n2\n" +
            String.format("A%c\n", tile) +
            ".B";
    }

    @Test
    public void test() {
        String map = createTileMap('.');
        String brainA = "brain \"donalddump\" {\nturn right\nturn right\nmove else 0\nmark 0\nsense here marker 0 else 9\nturn left\nturn left\nmove else 0\nsense here foemarker else 10\njump 9\njump 10\n}";
        String brainB = "brain \"donaldump\" {\nturn left\nmove else 0\nmark 0\nmove else 0\njump 4\n}";


        String[] arr = {brainA, brainB};

        Map<Character, Swarm> kkk = BrainParser.parse(arr);
        Swarm swarmA = kkk.get('A');
        Swarm swarmB = kkk.get('B');
        Map<Character, Swarm> swarms = new HashMap<Character, Swarm>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        World world = WorldParser.parseMap(map, 42, swarms);
        AntInfo[] ants = new AntInfo[world.getAnts().size()];
        int iter = 0;
        for(AntInfo antI: world.getAnts()){
            ants[iter] = antI;
            iter++;
        }

        for (int i = 0; i < 19; i++) {
            for (AntInfo ant : ants) {
                Ant ant1 = (Ant) ant;
                if (ant1.getRestTime() == 0){
                    ant1.getNextInstruction().execute(world, ant1);
                } else{
                    ant1.decreaseResttime();
                }

            }
        }

        assert("northeast".equals(world.getAnt(0).getDirection()));

        if (world.getAnt(0).getPc() != 6) {
            fail("You should have sensed your marker");
        }


        world = WorldParser.parseMap(map, 42, swarms);
        AntInfo[] antsi = new AntInfo[world.getAnts().size()];
         iter = 0;
        for(AntInfo antI: world.getAnts()){
            antsi[iter] = antI;
            iter++;
        }
        for (int i = 0; i < 41; i++) {
            for (AntInfo ant : ants) {
                Ant ant1 = (Ant) ant;
                if (ant1.getRestTime() == 0){
                    ant1.getNextInstruction().execute(world, ant1);
                } else{
                    ant1.decreaseResttime();
                }
            }
        }
        if (world.getAnt(0).getPc() != 9) {
            fail("You should have sensed enemy marker" + world.getAnt(0).getField().getX() + world.getAnt(0).getPc());
        }
    }
}

