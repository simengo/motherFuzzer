public class Swarm {
    private Character swarm;
    private Instruction[] brain;

    public Swarm(Character swarm, Instruction[] brain) {
        this.swarm = swarm;
        this.brain = brain;
    }

    public Character getSwarm() {
        return swarm;
    }

    public void setSwarm(Character swarm) {
        this.swarm = swarm;
    }
}
