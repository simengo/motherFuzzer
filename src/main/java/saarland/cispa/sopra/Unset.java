package saarland.cispa.sopra;

public class Unset extends Instruction {

    private final int reg;

    public Unset(int reg1){this.reg = reg1;}


    @Override
    public void execute(World world, Ant ant) {

        ant.setRegister(reg,false);
        ant.increasePC();


        Field field = (Field) ant.getField();
        field.setChanged(true);
    }
    @Override
    public String toString(){
        return "unset" + " " + reg;
    }
}
