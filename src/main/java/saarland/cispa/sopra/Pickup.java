package saarland.cispa.sopra;


import java.util.Objects;

public class Pickup extends Instruction {

    private int jumpPC;

    public Pickup(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    public void setJumpPC(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {

        char point = '.';
        if (ant.getField().getType() == point) {
            Normal field = (Normal) ant.getField();
            if (field.getFood() == 0 || ant.hasFood()) {
                ant.setPc(jumpPC);

            } else {
                ant.setHasFood(true);
                field.removeFood();
                ant.increasePC();
            }


        } else {
            ant.setPc(jumpPC);
        }

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pickup pickup = (Pickup) o;
        return jumpPC == pickup.jumpPC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jumpPC);
    }

    @Override
    public String toString() {
        return "pickup " + "else " + jumpPC;
    }
}
