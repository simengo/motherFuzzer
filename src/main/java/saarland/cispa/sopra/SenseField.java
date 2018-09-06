package saarland.cispa.sopra;

public class SenseField extends Sense{

    public SenseField(SenseDir dir,Target target, int jumpPC) {
        super(dir,target,jumpPC);

    }

    @Override
    public void execute(World world, Ant ant) {

        Field field =  getMyField(world,ant);

        if(getTargetS() == Target.home && field.getType() == ant.getSwarm()){

                ant.increasePC();

        }
        else{
        if(getTargetS() == Target.foehome && field.getType() != ant.getSwarm() && field.getType() != '#' && field.getType() != '=' && field.getType() != '.') {

                ant.increasePC();

        }
        else{
        if(getTargetS() == Target.rock){
            char rock = '#';
            if(field.getType() == rock){ant.increasePC();}



        }
        else{
        if(getTargetS() == Target.antlion){
            if(field.getType() == '=' || field.getIsNextToAntlion()){
                ant.increasePC();
            }


        }}}}
        Field field1 = (Field) ant.getField();
        field1.setChanged();
        ant.setPc(getJumpPC());
    }
    @Override
    public String toString(){

        return "sense" + getDirectionS() + getTargetS()+ "else" + getJumpPC();
    }
}
