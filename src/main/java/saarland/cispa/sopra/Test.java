package saarland.cispa.sopra;

public class Test extends Instruction {

    private int register;
    private int jumpPC;
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

        Field field = (Field) ant.getField();
        field.setChanged();

    }

    public String toString(){
        return "test" + register + "else" + jumpPC;
    }
}
