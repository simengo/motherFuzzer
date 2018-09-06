package saarland.cispa.sopra;

public class Mark extends Instruction {

    private final int marker;

    public Mark(int marker1){
        this.marker = marker1;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if(ant.getField().getType() != '=' || ant.getField().getType() != '#'){
            Field field = (Field) ant.getField();
            field.setMarker(swarm,marker,true);
        }

        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged();
    }
    @Override
    public String toString(){
        return "mark" + marker;
    }
}
