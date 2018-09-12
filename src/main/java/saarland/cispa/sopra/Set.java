package saarland.cispa.sopra;

public class Set extends Instruction {

    private final int reg;

    public Set(int reg1){this.reg = reg1;}


    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg,true);
        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);
    }
    @Override
    public String toString(){
        return "set " + reg;
    }
}
