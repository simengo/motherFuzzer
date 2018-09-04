public class Jump extends Instruction {
    int jumpPC;
    public Jump(int jumpPC) {
        this.jumpPC=jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {
        ant.setPc(jumpPC);
    }
}
