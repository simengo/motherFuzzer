import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.*;


public class World implements WorldInfo {
    private int width;
    private int height;
    private Field[][] fields;
    private HashMap<Character, Integer> points;
    private HashMap<Integer, Ant> ants;
    private Random rand;
    private HashMap<Character, Integer> numOfAntsInSwarm;

    public int getRand(int i) {
        return rand.nextInt(i);
    }

    public World(Field[][] fields, long seed, HashMap<Integer, Ant> ants) {
        this.ants = ants;
        width = fields.length;
        height = fields[0].length;
        rand = new Random(seed);

    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public FieldInfo getFieldAt(int x, int y) {
        return (FieldInfo) fields[x][y];
    }

    @Override
    public int getScore(char swarm) {
        return points.get(swarm);
    }

    @Override
    public AntInfo getAnt(int id) {
        return ants.get(id);
    }

    @Override
    public List<AntInfo> getAnts() {
        ArrayList<AntInfo> list = new ArrayList<>();
        for (int i : ants.keySet()) {
            Ant ant = ants.get(i);
            if (!ant.isDead()) {
                list.add(ant);
            }
        }
        return list;
    }
}
