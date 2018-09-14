package saarland.cispa.sopra;

public class Flip extends Instruction {
    private final int maxNum;
    private final int jumpPC;
    public Flip(int maxNum,int jumpPC) {
        this.maxNum = maxNum;
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {

        int randomInt;
        if(maxNum == 0){
            randomInt = 0;
        } else {
            randomInt = world.getRand(maxNum);
        }
        if(randomInt == 0){ant.increasePC();}
        else{ant.setPc(jumpPC);}

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }
    @Override
    public String toString(){
        return "flip " + maxNum + " else " + jumpPC;
    }

}
