package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.AntInfo;
import saarland.cispa.sopra.systemtests.FieldInfo;

public class Ant implements AntInfo {

    private int id;
    private Field field;
    private Swarm swarm;
    private int pc = 0;
    private boolean isDead = false;

    private String direction = "northwest";
    private int restTime = 0;
    private boolean hasFood = false;
    private boolean[] regs = new boolean[]{false, false, false, false, false, false, false};

    public Ant(Swarm swarm, int id, Field field) {
        this.swarm = swarm;
        this.id = id;
        this.field = field;
    }

    public boolean getRegister(int location) {
        return regs[location];
    }

    public void setRegister(int location, boolean value) {
        regs[location] = value;
    }

    public boolean isDead() {

        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void setHasFood(boolean hasFood) {
        this.hasFood = hasFood;
    }

    public void setRegs(boolean[] regs) {
        this.regs = regs;
    }

    public void increasePC() {
        pc++;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean hasFood() {
        return false;
    }

    @Override
    public int getRestTime() {
        return 0;
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
        return 0;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    @Override
    public FieldInfo getField() {
        return null;
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
}
