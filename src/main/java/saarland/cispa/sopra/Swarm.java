package saarland.cispa.sopra;

public class Swarm {

    private final Instruction[] brain;
    private final String name;
    private char ident;

    public Swarm(char ident, Instruction[] brain, String name) {

        this.ident = ident;
        this.brain = brain.clone();
        this.name = name;
    }

    public char getIdent() {
        return ident;
    }

    public void setIdent(char ident) {
        this.ident = ident;
    }

    public void setSwarm(char ident) {
        this.ident = ident;
    }

    public String getSwarmName() {

        return this.name;
    }

    public Instruction getInstruction(int position) {

        return brain[position];
    }

    public Instruction[] getBrain() {
        return brain;
    }

    @Override
    public String toString() {
        return "Swarm{" +
            "ident=" + ident +
            '}';
    }
}
