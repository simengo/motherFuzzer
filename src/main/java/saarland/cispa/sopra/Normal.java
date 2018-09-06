package saarland.cispa.sopra;

public class Normal  extends Field {
    int food;
    public Normal(int posX, int posY, int food){
        super('.',posX,posY);
        this.food = food;
    }
    public void addFood(int food){
        this.food =+ food;
    }

    public void removeFood(){
        this.food--;
    }

}
