package saarland.cispa.sopra;

public class Direction extends Instruction {
    private String direction;
    private int jumpPC;
    public Direction(int jumpPC,String dir) {
        this.jumpPC=jumpPC;
        this.direction = dir;
    }

    @Override
    public void execute(World world, Ant ant) {
        if(ant.getDirection() == direction){
            ant.increasePC();
        }
        else{
            ant.setPc(jumpPC);
        }
        Field field = (Field) ant.getField();
        field.setChanged();
    }

    public String toString(){
        return "direction" + direction + "else" + jumpPC;
    }
}
