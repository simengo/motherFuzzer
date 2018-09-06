package saarland.cispa.sopra;

import java.util.Optional;

public class Move extends Killable {
    public Move(int jumpPc) {
        super(jumpPc);
    }

    @Override
    public void execute(World world, Ant ant) {
        Field field = (Field) ant.getField();
        String direction = ant.getDirection();
        Field fieldInDirection = world.getFieldInDirection(field, direction);
        if (ant.getRestTime() == 0 && fieldInDirection.isAccessible()) {
            field.removeAnt();
            field.setChanged();
            fieldInDirection.setAnt(ant);
            fieldInDirection.setChanged();
            killcheck(world, Optional.of(ant));
            ant.increasePC();
            ant.setRestTime(13);
        } else {
            field.setChanged();
            ant.setPc(getJumpPc());

        }
    }
}
