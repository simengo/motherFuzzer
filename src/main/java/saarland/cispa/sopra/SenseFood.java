package saarland.cispa.sopra;

public class SenseFood extends Sense{

    public SenseFood(String dir,Target target, int jumpPC) {
        super(dir,target,jumpPC);

    }

    @Override
    public void execute(World world, Ant ant) {

        Field field =  getMyField(world,ant);

        if(getTargetS() == Target.food){
            if(field.getFood() >= 0 ){ant.increasePC();}
            else{ant.setPc(getJumpPC());}
            Field field1 = (Field) ant.getField();
            field1.setChanged();
        }
        if(getTargetS() == Target.friendfood) {
            if (field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() == ant.getSwarm()) {
                ant.increasePC();
            } else {
                ant.setPc(getJumpPC());
            }
            Field field1 = (Field) ant.getField();
            field1.setChanged();
        }
        if(getTargetS() == Target.foefood){
            if(field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() != ant.getSwarm()){ant.increasePC();}
            else{ant.setPc(getJumpPC());}

            Field field1 = (Field) ant.getField();
            field1.setChanged();
    }
}
    @Override
    public String toString(){

        return "sense" + getDirectionS() + getTargetS() + "else" + getJumpPC();
    }
}
