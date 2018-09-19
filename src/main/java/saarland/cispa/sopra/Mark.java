package saarland.cispa.sopra;

import java.util.Objects;

public class Mark extends Instruction {

    private final int marker;

    public Mark(int marker1) {
        this.marker = marker1;
    }

    @Override
    public void execute(World world, Ant ant) {

        char swarm = ant.getSwarm();
        if (ant.getField().getType() != '=' || ant.getField().getType() != '#') {
            Field field = (Field) ant.getField();
            field.setMarker(swarm, marker, true);
        }

        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return marker == mark.marker;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker);
    }

    @Override
    public String toString() {
        return "mark " + marker;
    }
}
