package saarland.cispa.sopra;

public class Rock extends Field {

    public Rock(int posX, int posY){
        super('#',posX,posY);

    }
    @Override
    public int getFood(){
        return 0;
    }
}
