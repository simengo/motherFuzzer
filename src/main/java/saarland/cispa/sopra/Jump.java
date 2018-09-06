package saarland.cispa.sopra;

public class Jump extends Instruction {
    private int jumpPC;
    public Jump(int jumpPC) {
        this.jumpPC=jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {
        ant.setPc(jumpPC);
    }

    public String toString(){
        return "jump" + jumpPC;
    }
}
