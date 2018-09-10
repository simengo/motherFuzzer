package saarland.cispa.sopra;

public class Normal extends Field {
    private int food;

    public Normal(int posX, int posY, int food) {
        super('.', posX, posY);
        this.food = food;
    }

    public void addFood(int foodDazu) {
        this.food = food+foodDazu;
    }

    public void removeFood() {
        if (this.food > 0) {
            this.food--;
        }
    }

    @Override
    public int getFood() {
        return food;
    }

}
