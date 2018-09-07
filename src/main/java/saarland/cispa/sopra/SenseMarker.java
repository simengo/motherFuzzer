package saarland.cispa.sopra;

public class SenseMarker extends Sense{
    private final int marker;

    public SenseMarker(String dir,Target target,int marker, int jumpPC) {
        super(dir,target,jumpPC);
        this.marker = marker;

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
            field1.setChanged();
        }
        if(getTargetS() == Target.foemarker){

            senseFoeMarkers(world,field,ant,marker);

            Field field1 = (Field) ant.getField();
            field1.setChanged();}

    }

    @Override
    public String toString(){

            return "sense" + getDirectionS() + "marker" + marker + "else" + getJumpPC();

    }
}
