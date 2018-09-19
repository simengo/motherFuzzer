package saarland.cispa.sopra;

import java.util.Objects;

public class Set extends Instruction {

    private final int reg;

    public Set(int reg1) {
        this.reg = reg1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Set set = (Set) o;
        return reg == set.reg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(reg);
    }

    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg, true);
        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public String toString() {
        return "set " + reg;
    }
}
