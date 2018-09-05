public class Mark extends Instruction {

    int marker;

    public Mark(int marker){
        this.marker = marker;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if(ant.getField().getType() != '=' || ant.getField().getType() != '#'){
            ant.getField().setMarker(swarm,marker,true);
        }

        ant.increasePC();

    }
}
