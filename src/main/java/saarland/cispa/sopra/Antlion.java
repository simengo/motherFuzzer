package saarland.cispa.sopra;

public class Antlion extends Field {
    public Antlion(int posX, int posY) {
        super('=', posX, posY);
    }
    @Override
    public int getFood(){
        return 0;
    }
}
