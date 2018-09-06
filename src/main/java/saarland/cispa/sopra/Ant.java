package saarland.cispa.sopra;


import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;

public class Ant implements AntInfo {

    private int id;
    private Field field;
    private Swarm swarm;
    private int pc;
    private boolean dead;
    private String direction = "northwest";
    private int restTime;
    private boolean food;
    private boolean[] regs = new boolean[6];

    public Ant(Swarm swarm, int id, Field field) {
        this.swarm = swarm;
        this.id = id;
        this.field = field;
        this.pc = 0;
    }

    public boolean getRegister(int location) {
        return regs[location];
    }

    public void setRegister(int location, boolean value) {
        regs[location] = value;
    }

    public boolean isDead() {

        return dead;
    }

    public void setDead(boolean isDead) {
        dead = isDead;
    }

    public void setHasFood(boolean hasFood) {
        this.food = hasFood;
    }


    public void increasePC() {
        pc++;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean hasFood() {
        return food;

    }

    @Override
    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    @Override
    public boolean[] getRegister() {
        return new boolean[0];
    }

    @Override
    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    @Override
    public FieldInfo getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    @Override
    public char getSwarm() {
        return swarm.getIdent();
    }

    public void setSwarm(Swarm swarm) {
        this.swarm = swarm;
    }

    @Override
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Instruction getNextInstruction() {

        return swarm.getBrain()[pc];

    }

    public void decreaseResttime() {

        assert restTime > 0;
        restTime--;
    }

    public Swarm getSwarmInstance() {
        return this.swarm;
    }
}
