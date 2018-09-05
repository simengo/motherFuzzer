public class Normal  extends Field {
    int food;
    public Normal(int x, int y, int food){
        super('.',x,y);
        this.food = food;
    }
    public void addFood(int i){
        this.food =+ food;
    }

    public void removeFood(){
        this.food--;
    }


    public int getFood(){
        return food;
    }
    public void addFood(int i){
        this.food = food + i;
    }

    public void removeFood(){
        food = food -1;
    }
}
