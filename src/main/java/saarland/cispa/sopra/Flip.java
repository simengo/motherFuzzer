package saarland.cispa.sopra;

public class Flip extends Instruction {
    private int maxNum;
    private int jumpPC;
    public Flip(int maxNum,int jumpPC) {
        this.maxNum = maxNum;
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {
        int randomInt = world.getRand(maxNum);
        if(randomInt == 0){ant.increasePC();}
        else{ant.setPc(jumpPC);}

        Field field = (Field) ant.getField();
        field.setChanged();
    }
    @Override
    public String toString(){
        return "flip" + maxNum + "else" + jumpPC;
    }

}
