package saarland.cispa.sopra;

public class Breed extends Killable {
    public Breed(int jumpPc) {
        super(jumpPc);
    }

    @Override
    public void execute(World world, Ant ant) {
        Field field = (Field) ant.getField();
        String direction = ant.getDirection();
        Field fieldInDirection = world.getFieldInDirection(field, direction);
        Ant partner = (Ant) fieldInDirection.getAnt().get();
        boolean antSpawned = false;

        if (ant.hasFood() && partner.hasFood() && ant.getSwarm() == partner.getSwarm()) {
            Field[] fields = world.getNeighbours(field);
            for (Field neighbour : fields) {
                if (neighbour.isAccessible() && !antSpawned) {
                    spawnAnt(ant.getSwarmInstance(), neighbour, world);
                    antSpawned = true;
                    break;
                }
            }
            if (!antSpawned) {
                fields = world.getNeighbours(fieldInDirection);
                for (Field neighbour : fields) {
                    if (neighbour.isAccessible()) {
                        spawnAnt(ant.getSwarmInstance(), neighbour, world);
                        break;
                    }
                }
            }
        }

    }


    public void spawnAnt(Swarm swarm, Field field, World world) {
        field.setAnt(new Ant(swarm, world.getAnts().size(), field));
    }
}