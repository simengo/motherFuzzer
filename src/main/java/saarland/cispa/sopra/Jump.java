package saarland.cispa.sopra;

public class Jump extends Instruction {
    private int jumpPC;
    public Jump(int jumpPC) {
        this.jumpPC=jumpPC;
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
    public String toString(){
        return "jump " + jumpPC;
    }
}
