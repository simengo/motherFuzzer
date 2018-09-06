package saarland.cispa.sopra;

public abstract class Instruction {
    public Instruction() {
    }

    public abstract void execute(World world, Ant ant);
}
