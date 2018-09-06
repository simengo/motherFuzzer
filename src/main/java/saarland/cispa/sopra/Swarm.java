package saarland.cispa.sopra;

public class Swarm {

    private char ident;
    private Instruction[] brain;
    private String name;

    public Swarm(char ident, Instruction[] brain) {
        this.ident = ident;
        this.brain = brain;
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
}