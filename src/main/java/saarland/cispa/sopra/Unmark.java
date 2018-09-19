package saarland.cispa.sopra;

import java.util.Objects;

public class Unmark extends Instruction {
    private final int markerFalse;

    public Unmark(int marker) {
        this.markerFalse = marker;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if (ant.getField().getType() != '#' || ant.getField().getType() != '=') {
            Field field = (Field) ant.getField();
            field.setMarker(swarm, markerFalse, false);
        }

        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unmark unmark = (Unmark) o;
        return markerFalse == unmark.markerFalse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(markerFalse);
    }

    @Override
    public String toString() {
        return "unmark " + markerFalse;
    }
}
