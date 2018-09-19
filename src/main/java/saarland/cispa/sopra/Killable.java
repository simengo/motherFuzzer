package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.FieldInfo;
import saarland.cispa.sopra.systemtests.AntInfo;

import java.util.List;

import java.util.Objects;
import java.util.Optional;

abstract class Killable extends saarland.cispa.sopra.Instruction {
    private int jumpPc;

    public Killable(int jumpPc) {

        this.jumpPc = jumpPc;

    }

    public void killcheck(World world, Optional<Ant> ant) {
        List<AntInfo> ants = world.getAnts();
        for (AntInfo iter : ants) {
            Ant suspect = (Ant) iter;
            Field field = (Field) suspect.getField();
            char fieldType = field.getType();
            if (suspect.isDead()) {
                continue;
            }
            if (ant.isPresent()) {
                Ant thisAnt = ant.get();
                if (suspect.getId() == thisAnt.getId()) {
                    checkAnt(world, suspect);
                    if (suspect.isDead()) {
                        continue;
                    }
                }
            }
            if (isSurrounded(world, suspect)) {
                suspect.setDead(true);
                ((Field) suspect.getField()).removeAnt();
                world.decreaseNumOfAntsInSwarm(suspect.getSwarm());
                switch (fieldType) {
                    case '.':
                        if (suspect.hasFood()) {
                            ((Normal) field).addFood(4);
                        } else {
                            ((Normal) field).addFood(3);
                        }
                        break;
                    case '#':
                        break;
                    case '=':
                        break;
                    default:
                        if (suspect.hasFood()) {
                            world.increasePoints(fieldType, 4);
                        } else {
                            world.increasePoints(fieldType, 3);
                        }
                        break;
                }
            }
        }
    }

    public void checkAnt(World world, Ant ant) {
        char antLionField = '=';
        Field field = (Field) ant.getField();
        char fieldType = field.getType();
        if (field.getIsNextToAntlion() || fieldType == antLionField) {
            ant.setDead(true);
            field.removeAnt();
            world.decreaseNumOfAntsInSwarm(ant.getSwarm());
            switch (fieldType) {
                case '.':
                    ((Normal) field).addFood(1);
                    break;
                case '#':
                    break;
                case '=':
                    break;
                default:
                    world.increasePoints(fieldType, 1);
                    break;
            }
        }

    }

    private boolean isSurrounded(World world, AntInfo ant) {
        FieldInfo field = ant.getField();
        Field[] neighbours = world.getNeighbours((Field) field);
        int enemies = 0;


        for (Field neighbour : neighbours) {

            if (!neighbour.getAnt().isPresent()) {
                continue;
            }
            if (neighbour.getAnt().get().getSwarm() != ant.getSwarm()) {
                enemies++;
            }
        }
        return enemies >= 5;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Killable)) return false;
        Killable killable = (Killable) o;
        return jumpPc == killable.jumpPc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpPc);
    }

    public int getJumpPc() {
        return jumpPc;
    }

    public void setJumpPc(int jumpPc) {
        this.jumpPc = jumpPc;
    }

}
