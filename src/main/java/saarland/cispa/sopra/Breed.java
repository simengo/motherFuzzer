package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.WorldInfo;

public class Breed extends Killable {
    public Breed(int jumpPc) {
        super(jumpPc);
    }

    @Override
    public void execute(World world, Ant ant) {
        Field field = (Field) ant.getField();
        String direction = ant.getDirection();
        Field fieldInDirection = world.getFieldInDirection(field, direction);
        if (fieldInDirection.getAnt().isPresent()) {
            Ant partner = (Ant) fieldInDirection.getAnt().get();
            boolean antSpawned = false;

            if (ant.hasFood() && partner.hasFood() && ant.getSwarm() == partner.getSwarm()) {
                Field[] fields = world.getNeighbours(field);
                field.setChanged(true);
                fieldInDirection.setChanged(true);
                for (Field neighbour : fields) {
                    if (neighbour.isAccessible()) {
                        Ant spawnedAnt = spawnAnt(ant.getSwarmInstance(), neighbour, world);
                        killcheck(world, java.util.Optional.ofNullable(spawnedAnt));
                        antSpawned = true;
                        break;
                    }
                }
                if (!antSpawned) {
                    fields = world.getNeighbours(fieldInDirection);
                    for (Field neighbour : fields) {
                        if (neighbour.isAccessible()) {
                            Ant spawnedAnt = spawnAnt(ant.getSwarmInstance(), neighbour, world);
                            killcheck(world, java.util.Optional.ofNullable(spawnedAnt));
                            break;
                        }
                    }
                }
            }
            ant.increasePC();


        } else {
            ant.setPc(getJumpPc());
        }
    }


    public Ant spawnAnt(Swarm swarm, Field field, WorldInfo world) {
        Ant spawnedAnt = new Ant(swarm, world.getAnts().size(), field);
        world.getAnts().add(world.getAnts().size(),spawnedAnt);
        field.setAnt(spawnedAnt);
        field.setChanged(true);
        return spawnedAnt;
    }
}
