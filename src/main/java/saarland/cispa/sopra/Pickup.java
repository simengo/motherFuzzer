package saarland.cispa.sopra;



public class Pickup extends Instruction {

    private final int jumpPC;

    public Pickup(int jumpPC){this.jumpPC = jumpPC;}
    @Override
    public void execute(World world, Ant ant) {

        char point = '.';
        if(ant.getField().getType()==point){
            Normal field = (Normal) ant.getField();
            if(field.getFood() == 0 || ant.hasFood()){
                ant.setPc(jumpPC);

            }

            else{
                ant.setHasFood(true);
                field.removeFood();
                ant.increasePC();
            }


        }
        else{ant.setPc(jumpPC);}

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }
    @Override
    public String toString(){
        return "direction" + "else" + jumpPC;
    }
}
