package saarland.cispa.sopra.systemtests;



public class SetEasyTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        for (int i = 0; i <= 5; i++) {
            setRegisterTest(gameInfo, i);
        }

        for (int i = 0; i <= 5; i++) {
            unsetRegisterTest(gameInfo, i);
        }
    }

    private void setRegisterTest(GameInfo gameInfo, int registerId) {
        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            ".A..\n" +
            "...B";
        String brain = String.format("brain \"testbrain\" {%nset %d%njump 1%n}", registerId);
        WorldInfo world = gameInfo.simulate(1, 42, map, brain, "brain \"nobrain\" {\njump 0\n}");
        Boolean[] register = {Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE};
        register[registerId] = Boolean.TRUE;
        checkAnt(world, 0, 1,2, "northwest", Boolean.FALSE, 1, 'A', 0, register);
    }

    private void unsetRegisterTest(GameInfo gameInfo, int registerId) {
        String map = "4\n4\n" +
            "....\n" +
            "....\n" +
            ".A..\n" +
            "...B";
        String brain = String.format("brain \"testbrain\" {%nset %d%nunset %d%njump 2%n}", registerId, registerId);
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, "brain \"nobrain\" {\njump 0\n}");
        Boolean[] register = {Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE};
        checkAnt(world, 0, 1,2, "northwest", Boolean.FALSE, 2, 'A', 0, register);
    }
    
    private void checkAnt(WorldInfo world, int id, Integer x, Integer y, String direction, Boolean food, Integer pc, Character swarm, Integer restTimer, Boolean[] register) {
        var ant = world.getAnt(id);
        if (ant == null) {
            fail(String.format("Ant %d does not exist", id));
        }
        if (x != null && y != null) {
            var field = ant.getField();
            if (field == null) {
                fail(String.format("Ant %d has no field.", id));
            }
            if (field.getX() != x || field.getY() != y) {
                fail(String.format("Ant %d is has field (%d, %d) instead of (%d, %d).", id, field.getX(), field.getY(), x, y));
            }
            if (!field.getAnt().isPresent() || field.getAnt().get() != ant) {
                fail(String.format("Ant %d stands on field that does not know it.", id));
            }
            if (world.getFieldAt(x, y) != ant.getField()) {
                fail(String.format("Ant has field %s, world has field %s at position (%d, %d)", ant.getField(), world.getFieldAt(x, y), x, y));
            }
        }
        if (direction != null && !ant.getDirection().equals(direction)) {
            fail(String.format("Ant %d has direction %s instead of %s.", id, ant.getDirection(), direction));
        }
        if (food != null && ant.hasFood() != food) {
            fail(String.format("Ant %d has food %s instead of %s.", id, ant.hasFood(), food));
        }
        if (pc != null && ant.getPc() != pc) {
            fail(String.format("Ant %d has pc %d instead of %d.", id, ant.getPc(), pc));
        }
        if (swarm != null && ant.getSwarm() != swarm) {
            fail(String.format("Ant %d has swarm %s instead of %s.", id, ant.getSwarm(), swarm));
        }
        if (restTimer != null && ant.getRestTime() != restTimer) {
            fail(String.format("Ant %d has restTimer %d instead of %d.", id, ant.getRestTime(), restTimer));
        }
        if (register != null) {
            int counter = 0;
            for (var reg :register) {
                if (reg == null) {
                    continue;
                }
                if (ant.getRegister()[counter] != register[counter]) {
                    fail(String.format("Ant %d has for register %d value %s instead of %s.", id, counter, ant.getRegister()[counter], register[counter]));
                }
                counter++;
            }
        }
    }
}
