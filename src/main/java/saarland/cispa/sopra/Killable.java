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
        char normalField = '.';
        char antLionField = '=';
        char rockField = '#';
        List<AntInfo> ants = world.getAnts();
        for (AntInfo a : ants) {
            Ant suspect = (Ant) a;
            Field field = (Field) suspect.getField();
            if (!suspect.isDead()) {
                if (suspect.equals(ant)) {
                    if (field.getIsNextToAntlion() || field.getType() == antLionField) {
                        suspect.setDead(true);
                        if (field.getType() == normalField) {
                            field = (Normal) field;
                            ((Normal) field).addFood(1);
                        }
                        if (field.getType() != rockField || field.getType() != normalField || field.getType() != antLionField) {
                            world.increasePoints(field.getType(), 1);
                        }
                    }
                }
                if (isSurrounded(world, suspect)) {
                    suspect.setDead(true);
                    if (field.getType() == normalField) {
                        field = (Normal) field;
                        if (ant.get().hasFood()) {
                            ((Normal) field).addFood(4);
                        } else {
                            ((Normal) field).addFood(3);
                        }
                    }
                    if (field.getType() != normalField || field.getType() != rockField || field.getType() != antLionField) {
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
        return enemies >= 5;

    }

    public int getJumpPc() {
        return jumpPc;
    }
}
