import saarland.cispa.sopra.systemtests.FieldInfo;

import java.util.Optional;
public class Killable extends Instruction {
    int jumpPc;

    public Killable(int jumpPc) {

        this.jumpPc = jumpPc;

    }

    public void execute(World world, Ant ant) {

    }

    private void killcheck(World world,Optional<Ant> ant) {


    }

    private boolean isSurrounded(World world, Ant ant){
        FieldInfo field = ant.getField();
        Field[] neighbours = world.getNeighbours((Field)field);

        for(int i = 0; i<neighbours.length;i++){
            if(neighbours[i].getAnt().get().getSwarm()
        }


    }

}
