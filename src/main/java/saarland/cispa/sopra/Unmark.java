package saarland.cispa.sopra;

public class Unmark extends Instruction {
    private final int markerFalse;

    public Unmark(int marker){
        this.markerFalse = marker;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if(ant.getField().getType() != '#' || ant.getField().getType() != '='){
            Field field = (Field) ant.getField();
            field.setMarker(swarm,markerFalse,false);
        }

        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);

    }
    @Override
    public String toString(){
        return "unmark" + " " + markerFalse;
    }
}
