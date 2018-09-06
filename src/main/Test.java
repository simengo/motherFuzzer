public class Test extends Instruction {

    int register;
    int jumpPC;
    public Test(int reg,int jumpPC) {
        this.register = reg;
        this.jumpPC=jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {


        if (ant.getRegister(register)){
            ant.increasePC();
        }
        else{ant.setPc(jumpPC);}

    }
}
