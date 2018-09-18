package saarland.cispa.sopra;

public class SenseMarker extends Sense{
    private final int marker;

    public SenseMarker(String dir,Target target,int marker, int jumpPC) {
        super(dir,target,jumpPC);
        this.marker = marker;

    }

    public void setJumpPC(int jumpPC) {
        super.setJumpPC(jumpPC);
    }

    @Override
    public void execute(World world, Ant ant) {

        Field field =  getMyField(world,ant);

        if(getTargetS() == Target.marker){
            if(field.getMarker(ant.getSwarm(),marker)){
                ant.increasePC();

            }
            else{ant.setPc(getJumpPC());}

            Field field1 = (Field) ant.getField();
            field1.setChanged(true);
        }
        if(getTargetS() == Target.foemarker){

            senseFoeMarkers(field,ant);

            Field field1 = (Field) ant.getField();
            field1.setChanged(true);}

    }

    @Override
    public String toString(){

        if(getTargetS() == Target.foemarker){
            return "sense " + getDirectionS() + "foemarker " + "else " + getJumpPC();
        }
        return "sense " + getDirectionS() + "marker " + marker + " else " + getJumpPC();

    }
}
