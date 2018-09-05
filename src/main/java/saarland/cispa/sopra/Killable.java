package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;

import java.util.List;

import java.util.Optional;

abstract class Killable extends Instruction {
    private final int jumpPc;

    public Killable(int jumpPc) {

        this.jumpPc = jumpPc;

    }

    public void killcheck(World world, Optional<Ant> ant) {
        List<AntInfo> ants = world.getAnts();
        for (int i = 0; i < ants.size(); i++) {
            Ant suspect = (Ant) ants.get(i);
            Field field = (Field) suspect.getField();
            if (!suspect.isDead()) {
                if (suspect.equals(ant)) {
                    if (field.getIsNextToAntlion() || field.getType() == '=') {
                        suspect.setDead(true);
                        if (field.getType() == '.') {
                            field = (Normal) field;
                            ((Normal) field).addFood(1);
                        }
                        if (field.getType() != '#' || field.getType() != '.' || field.getType() != '=') {
                            world.increasePoints(field.getType(), 1);
                        }
                    }
                }
                if (isSurrounded(world, suspect)) {
                    suspect.setDead(true);
                    if (field.getType() == '.') {
                        field = (Normal) field;
                        if (ant.get().hasFood()) {
                            ((Normal) field).addFood(4);
                        } else {
                            ((Normal) field).addFood(3);
                        }
                    }
                    if (field.getType() != '.' || field.getType() != '#' || field.getType() != '=') {
                        if (ant.get().hasFood()) {
                            world.increasePoints(field.getType(), 4);
                        } else {
                            world.increasePoints(field.getType(), 3);
                        }
                    }
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

    public int getJumpPc(){
        return jumpPc;
    }
}
