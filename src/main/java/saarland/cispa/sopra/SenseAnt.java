package saarland.cispa.sopra;

public class SenseAnt extends Sense {

    public SenseAnt(String dir, Target target, int jumpPC) {
        super(dir, target, jumpPC);

    }

    public void setJumpPC(int jumpPC) {
        super.setJumpPC(jumpPC);
    }
    public int getJumpPC() {
        return super.getJumpPC();
    }

    @Override
    public void execute(World world, Ant ant) {

        Field field = getMyField(world, ant);

        if (getTargetS() == Target.friend) {
            senseFriendOrFoe(ant, field, true);
            Field field1 = (Field) ant.getField();
            field1.setChanged(true);
        }
        if (getTargetS() == Target.foe) {
            senseFriendOrFoe(ant, field, false);
            Field field1 = (Field) ant.getField();
            field1.setChanged(true);
        }

    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {

        return "sense " + getDirectionS() + " " + getTargetS() + " else " + getJumpPC();
    }
}
