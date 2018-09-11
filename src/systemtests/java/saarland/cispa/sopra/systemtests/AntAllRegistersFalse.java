package saarland.cispa.sopra.systemtests;

public class AntAllRegistersFalse extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            ".A..\n" +
            "....\n" +
            "....\n" +
            ".B..";

        String brain = "brain " +
            "\"sample\" {\nturn left\nturn left\nturn left\nturn left\njump 0\n}";
        WorldInfo world = gameInfo.simulate(2, 42, map, brain, brain);

        testRegs(0, world);
        testRegs(1, world);
    }


    private void testRegs(int ant, WorldInfo world) {
        boolean[] registerFile = world.getAnt(ant).getRegister();
        for (int reg = 0; reg < 6; reg ++) {
            if (registerFile[reg]) {
                fail("register " + reg + " was set to true when ant was created");
            }
        }
    }
}
