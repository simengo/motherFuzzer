package saarland.cispa.sopra;

import java.util.Map;
import java.util.Objects;

public abstract class Sense extends Instruction {

    private final String direction;
    private final Target target;
    private int jumpPC;

    public Sense(String dir, Target target, int jumpPC) {

        this.direction = dir;
        this.target = target;
        this.jumpPC = jumpPC;
    }

    public int getJumpPC() {
        return jumpPC;
    }

    public void setJumpPC(int pc) {
        this.jumpPC = pc;
    }

    public Target getTargetS() {
        return target;
    }

    public String getDirectionS() {
        return direction;
    }

    private String toTheRight(String antLooking, String[] dirs1) {


        String newAntLooking;
        switch (antLooking) {
            case "northwest":
                newAntLooking = dirs1[1];
                break;
            case "east":
                newAntLooking = dirs1[3];
                break;
            case "northeast":
                newAntLooking = dirs1[2];
                break;
            case "southeast":
                newAntLooking = dirs1[4];
                break;
            case "southwest":
                newAntLooking = dirs1[5];
                break;
            case "west":
                newAntLooking = dirs1[0];
                break;
            default:
                throw new IllegalArgumentException();


        }

        return newAntLooking;
    }

    private String toTheLeft(String antLooking, String[] dirs1) {

        String newAntLooking;
        switch (antLooking) {
            case "northwest":
                newAntLooking = dirs1[5];
                break;
            case "northeast":
                newAntLooking = dirs1[0];
                break;
            case "east":
                newAntLooking = dirs1[1];
                break;
            case "west":
                newAntLooking = dirs1[4];
                break;
            case "southeast":
                newAntLooking = dirs1[2];
                break;
            case "southwest":
                newAntLooking = dirs1[3];
                break;
            default:
                throw new IllegalArgumentException();

        }
        return newAntLooking;
    }

    public Field getMyField(World world, Ant ant) {
        final String[] directionsSense = new String[6];

        directionsSense[0] = "northwest";
        directionsSense[1] = "northeast";
        directionsSense[2] = "east";
        directionsSense[3] = "southeast";
        directionsSense[4] = "southwest";
        directionsSense[5] = "west";


        Field field;

        switch (direction) {
            case "left":
                String antDirLeft = ant.getDirection();
                String newDirectionLeft;
                newDirectionLeft = toTheLeft(antDirLeft, directionsSense);
                field = world.getFieldInDirection((Field) ant.getField(), newDirectionLeft);
                break;
            case "right":
                String antDirRight = ant.getDirection();
                String newDirectionRight;
                newDirectionRight = toTheRight(antDirRight, directionsSense);
                field = world.getFieldInDirection((Field) ant.getField(), newDirectionRight);
                break;
            case "ahead":
                field = world.getFieldInDirection((Field) ant.getField(), ant.getDirection());
                break;
            case "here":
                field = (Field) ant.getField();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return field;
    }

    public void senseFriendOrFoe(Ant ant, Field field, boolean friendFoe) {
        //wenn true dann wird nach freund geschaut, bei false nach feind
        if (friendFoe) {
            if (field.getAnt().isPresent()) {
                if (field.getAnt().get().getSwarm() == ant.getSwarm()) {
                    ant.increasePC();
                    return;
                }
            }
        }
        if (!(friendFoe) && field.getAnt().isPresent() && field.getAnt().get().getSwarm() != ant.getSwarm()) {
            ant.increasePC();
            return;
        }
        ant.setPc(jumpPC);


    }

    public void senseFoeMarkers(Field field, Ant ant) {
        Map<Character, boolean[]> markers = field.getMarkers();
        for (char key : markers.keySet()) {
            if (key != ant.getSwarm()) {
                for (boolean marker : markers.get(key)) {
                    if (marker) {
                        ant.increasePC();
                        return;
                    }
                }
            }
        }
        ant.setPc(jumpPC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sense)) return false;
        Sense sense = (Sense) o;
        return jumpPC == sense.jumpPC &&
            Objects.equals(direction, sense.direction) &&
            target == sense.target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, target, jumpPC);
    }

    @Override
    public abstract void execute(World world, Ant ant);


}
