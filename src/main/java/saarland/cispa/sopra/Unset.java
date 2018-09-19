package saarland.cispa.sopra;

import java.util.Objects;

public class Unset extends Instruction {

    private final int reg;

    public Unset(int reg1) {
        this.reg = reg1;
    }


    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg, false);
        ant.increasePC();


        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unset unset = (Unset) o;
        return reg == unset.reg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reg);
    }

    @Override
    public String toString() {
        return "unset " + reg;
    }
}
