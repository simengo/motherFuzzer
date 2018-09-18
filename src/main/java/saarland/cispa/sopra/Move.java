package saarland.cispa.sopra;

import java.util.Optional;

public class Move extends Killable {
    public Move(int jumpPc) {
        super(jumpPc);
    }

    public void setJumpPC(int jumpPC) {
        super.setJumpPc(jumpPC);
    }

    @Override
    public void execute(World world, Ant ant) {
        Field field = (Field) ant.getField();
        String direction = ant.getDirection();
        Field fieldInDirection = world.getFieldInDirection(field, direction);
        if (ant.getRestTime() == 0 && fieldInDirection.isAccessible()) {
            field.removeAnt();
            field.setChanged(true);
            fieldInDirection.setAnt(ant);
            fieldInDirection.setChanged(true);
            ant.setField(fieldInDirection);
            killcheck(world, Optional.of(ant));
            ant.increasePC();
            ant.setRestTime(13);
        } else {
            field.setChanged(true);
            ant.setPc(getJumpPc());
            killcheck(world, Optional.ofNullable(ant));

        }
    }

    @Override
    public String toString() {

        return "move else " + this.getJumpPc();
    }

}
