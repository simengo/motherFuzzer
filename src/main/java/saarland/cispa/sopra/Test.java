package saarland.cispa.sopra;

import java.util.Objects;

public class Test extends Instruction {

    private final int register;
    private int jumpPC;

    public Test(int reg, int jumpPC) {
        this.register = reg;
        this.jumpPC = jumpPC;
    }


    public void setJumpPC(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    public int getJumpPC() {
        return jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {


        if (ant.getRegister(register)) {
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
        Test test = (Test) o;
        return register == test.register &&
            jumpPC == test.jumpPC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(register, jumpPC);
    }

    @Override
    public String toString() {
        return "test " + register + " else " + jumpPC;
    }
}
