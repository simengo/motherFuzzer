import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;

public class Ant implements AntInfo {

    private int id;
    private Field field;
    private Swarm swarm;
    private int pc = 0;
    private boolean isDead = false;
    private DirEnum direction = DirEnum.northwest;
    private int restTime = 0;
    private boolean hasFood = false;
    private boolean[] regs = new boolean[]{false, false, false, false, false, false, false};

    public Ant(Swarm swarm, int id, Field field) {
        this.swarm = swarm;
        this.id = id;
        this.field = field;
    }

    public boolean isDead() {

        return isDead;
    }

    public void incrasePC(){
        pc++;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public boolean hasFood() {
        return false;
    }

    @Override
    public int getRestTime() {
        return 0;
    }

    @Override
    public boolean[] getRegister() {
        return new boolean[0];
    }

    @Override
    public int getPc() {
        return 0;
    }

    @Override
    public FieldInfo getField() {
        return null;
    }

    @Override
    public char getSwarm() {
        return swarm.getSwarm();
    }

    @Override
    public String getDirection() {
        return null;
    }
}
