package saarland.cispa.sopra;

import java.util.Objects;

public class Flip extends Instruction {

    private final int maxNum;
    private int jumpPC;

    public Flip(int maxNum, int jumpPC) {
        this.maxNum = maxNum;
        this.jumpPC = jumpPC;
    }


    public void setJumpPC(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {

        int randomInt;
        if (maxNum == 0) {
            randomInt = 0;
        } else {
            randomInt = world.getRand(maxNum);
        }
        if (randomInt == 0) {
            ant.increasePC();
        } else {
            ant.setPc(jumpPC);
        }

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flip flip = (Flip) o;
        return maxNum == flip.maxNum &&
            jumpPC == flip.jumpPC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxNum, jumpPC);
    }

    @Override
    public String toString() {
        return "flip " + maxNum + " else " + jumpPC;
    }

}
