package saarland.cispa.sopra;

import java.util.Comparator;

public class Brain implements Comparator<Brain> {

    private Instruction[] brain;
    private int brainID;
    private int points;

    public Brain(Instruction[] brain, int brainID) {
        this.brain = brain;
        this.brainID = brainID;
        this.points = 0;

    }

    public Instruction[] getBrain() {
        return brain;
    }

    public void setBrain(Instruction[] brain) {
        this.brain = brain;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getBrainID() {
        return brainID;
    }

    public void setBrainID(int brainID) {
        this.brainID = brainID;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        result.append("Brain-ID: ");
        result.append(brainID);
        result.append(" ");
        for (Instruction subinstruction : brain) {
            result.append(subinstruction.toString());
            result.append(" ");
        }
        return result.toString();
    }

    @Override
    public int compare(Brain brain1, Brain brain2) {
        if (brain1.getBrainID() > brain2.getBrainID()) {
            return 1;
        } else {
            if (brain1.getBrainID() < brain2.getBrainID()) {
                return -1;
            } else return 0;
        }
    }
}
