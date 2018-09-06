package saarland.cispa.sopra;

public class Set extends Instruction {

    private int reg;

    public Set(int reg){this.reg = reg;}


    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg,true);
        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged();
    }
    @Override
    public String toString(){
        return "set" + reg;
    }
}
