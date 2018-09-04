public class Normal  extends Field {
    int food;
    public Normal(int x, int y){
        super('.',x,y);

    }


    public int getFood(){
        return food;
    }
    public void addFood(int i){
        this.food = i;
    }

    public void decrementFood(){
        food = food -1;
    }
}
