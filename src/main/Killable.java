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
        Field field = ant.getField();
        ant 0 = world.getNeighbours(field)[0];


    }

}
