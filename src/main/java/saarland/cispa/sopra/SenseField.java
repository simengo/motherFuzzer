package saarland.cispa.sopra;

public class SenseField extends Sense {

    public SenseField(String dir, Target target, int jumpPC) {
        super(dir, target, jumpPC);

    }

    public void setJumpPC(int jumpPC) {
        super.setJumpPC(jumpPC);
    }

    @Override
    public void execute(World world, Ant ant) {

        Field field = getMyField(world, ant);

        if (getTargetS() == Target.home) {
            if (field.getType() == ant.getSwarm()) {
                ant.increasePC();
                return;
            }
            ant.setPc(getJumpPC());
            assert ant.getPc() == getJumpPC();
        } else {
            if (getTargetS() == Target.foehome) {

                if (field.getType() != ant.getSwarm() && field.getType() != '#' && field.getType() != '=' && field.getType() != '.') {
                    ant.increasePC();
                    return;
                }
                ant.setPc(getJumpPC());
                return;

            } else {
                if (getTargetS() == Target.rock) {
                    char rock = '#';
                    if (field.getType() == rock) {
                        ant.increasePC();
                        return;
                    }
                    ant.setPc(getJumpPC());


                } else {
                    if (getTargetS() == Target.antlion) {
                        if (field.getType() == '=' || field.getIsNextToAntlion()) {
                            ant.increasePC();
                            return;
                        }
                        ant.setPc(getJumpPC());
                        return;


                    }
                }
            }
        }
        Field field1 = (Field) ant.getField();
        field1.setChanged(true);

    }

    @Override
    public String toString() {

        return "sense " + getDirectionS() + " " + getTargetS() + " else " + getJumpPC();
    }
}
