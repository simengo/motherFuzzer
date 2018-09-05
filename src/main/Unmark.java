public class Unmark extends Instruction {
    int marker;

    public Unmark(int marker){
        this.marker = marker;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if(ant.getField().getType() != '=' || ant.getField().getType() != '#'){
            ant.getField().setMarker(swarm,marker,false);
        }

        ant.increasePC();

    }
}