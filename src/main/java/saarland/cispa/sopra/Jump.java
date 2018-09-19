package saarland.cispa.sopra;

import java.util.Objects;

public class Jump extends Instruction {
    private int jumpPC;

    public Jump(int jumpPC) {
        this.jumpPC = jumpPC;
    }


    public void setJumpPC(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {
        ant.setPc(jumpPC);
        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jump jump = (Jump) o;
        return jumpPC == jump.jumpPC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpPC);
    }

    @Override
    public String toString() {
        return "jump " + jumpPC;
    }
}
