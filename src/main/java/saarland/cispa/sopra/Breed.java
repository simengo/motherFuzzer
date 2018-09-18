package saarland.cispa.sopra;

public class Breed extends Killable {
    public Breed(int jumpPc) {
        super(jumpPc);
    }

    public void setJumpPC(int jumpPC) {
        super.setJumpPc(jumpPC);
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
                            antSpawned = true;
                            killcheck(world, java.util.Optional.ofNullable(spawnedAnt));
                            break;
                        }
                    }
                }
            }
            if (antSpawned) {
                ant.setHasFood(false);
                partner.setHasFood(false);
                ant.increasePC();
            } else {
                ant.setPc(getJumpPc());
                killcheck(world, java.util.Optional.ofNullable(null));
            }


        } else {
            ant.setPc(getJumpPc());
            killcheck(world, java.util.Optional.ofNullable(null));
        }


    }


    public Ant spawnAnt(Swarm swarm, Field field, World world) {
        Ant spawnedAnt = new Ant(swarm, world.getAnts().size(), field);
        world.addAnt(spawnedAnt);
        field.setAnt(spawnedAnt);
        field.setChanged(true);
        world.increaseNumOfAntsInSwarm(swarm.getIdent());
        return spawnedAnt;
    }


    @Override
    public String toString() {

        return "breed else " + this.getJumpPc();
    }
}
