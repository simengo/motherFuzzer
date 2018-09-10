package saarland.cispa.sopra;

public class Direction extends Instruction {
    private final String directionToLookAt;
    private final int jumpPC;
    public Direction(int jumpPC,String dir) {
        this.jumpPC=jumpPC;
        this.directionToLookAt = dir;
    }

    @Override
    public void execute(World world, Ant ant) {
        if(ant.getDirection() == directionToLookAt){
            ant.increasePC();
        }
        else{
            ant.setPc(jumpPC);
        }
        Field field = (Field) ant.getField();
        field.setChanged(true);
    }
    @Override
    public String toString(){
        return "direction" + directionToLookAt + "else" + jumpPC;
    }
}
