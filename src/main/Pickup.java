import saarland.cispa.sopra.systemtests.FieldInfo;

public class Pickup extends Instruction {

    private int jumpPC;

    public Pickup(int jumpPC){this.jumpPC = jumpPC;}
    @Override
    public void execute(World world, Ant ant) {

        if(ant.getField().getType()==('.')){
            Normal field = ant.getField();
            if((field.getFood() != 0)){
                ant.setHasFood(true);
                field.decrementFood();
                ant.incrasePC();

            }

            else{
                ant.setPc(jumpPC);
            }

        }

    }
}
