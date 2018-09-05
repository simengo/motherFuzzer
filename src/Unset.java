public class Unset extends Instruction {

    private int reg;

    public Unset(int reg){this.reg = reg;}


    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg,false);
        ant.increasePC();

    }
}
