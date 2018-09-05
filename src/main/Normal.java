
public class Normal  extends Field {
    int food;
    public Normal(int x, int y, int food){
        super('.',x,y);
        this.food = food;
    }
    public void addFood(int i){
        this.food =+ i;
    }

    public void removeFood(){
        this.food--;
    }

}
