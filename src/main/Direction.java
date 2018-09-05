public class Direction extends Instruction {
    String direction;
    int jumpPC;
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
    }
}