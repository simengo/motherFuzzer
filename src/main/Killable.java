import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;
import java.util.List;

import java.util.Optional;

abstract class Killable extends Instruction {
    int jumpPc;

    public Killable(int jumpPc) {

        this.jumpPc = jumpPc;

    }

    public void killcheck(World world, Optional<Ant> ant) {
        List<AntInfo> ants = world.getAnts();
        for(int i = 0; i < ants.size(); i++){
            Ant suspect = (Ant) ants.get(i);
            Field field = (Field) suspect.getField();
            if(!suspect.isDead()){
                if(suspect.equals(ant)){
                    if(field.isNextToAntlion()){
                        suspect.setDead(true);
                    }
                }
                if(isSurrounded(world,suspect)){
                    suspect.setDead(true);
                }
            }
        }
    }

    private boolean isSurrounded(World world, Ant ant) {
        FieldInfo field = ant.getField();
        Field[] neighbours = world.getNeighbours((Field) field);
        int enemies = 0;

        for (int i = 0; i < neighbours.length; i++) {
            if (neighbours[i].getAnt().get().getSwarm() != ant.getSwarm()) {
                enemies++;
            }
        }

        if (enemies >= 5) {
            return true;
        }
        return false;

    }
}
