package saarland.cispa.sopra;

public class Turn extends Instruction {
    private final TurnDirection direction;
    public Turn(TurnDirection dir) {
        this.direction=dir;
    }

    private void turnToTheRight(Ant ant,  String[] dirs){
        String antDir = ant.getDirection();
        String end;


        switch (antDir){
            case "northwest":
                end = dirs[1];
                break;
            case "northeast":
                end = dirs[2];
                break;
            case "east":
                end = dirs[3];
                break;
            case "southeast":
                end = dirs[4];
                break;
            case "southwest":
                end = dirs[5];
                break;
            case "west":
                end = dirs[0];
                break;
            default: throw new IllegalArgumentException();


        }
        ant.setDirection(end);


    }

    private void turnToTheLeft(Ant ant,String[] dirs){
        String antDir = ant.getDirection();
        String end;

        switch (antDir){
            case "northwest":
                end = dirs[5];
                break;
            case "northeast":
                end = dirs[0];
                break;
            case "east":
                end = dirs[1];
                break;
            case "southeast":
                end = dirs[2];
                break;
            case "southwest":
                end = dirs[3];
                break;
            case "west":
                end = dirs[4];
                break;
            default: throw new IllegalArgumentException();

        }
        ant.setDirection(end);
    }




    @Override
    public void execute(World world, Ant ant) {

        final String[] directions = new String[6];

        directions[0] = "northwest";
        directions[1] = "northeast";
        directions[2] = "east";
        directions[3] = "southeast";
        directions[4] = "southwest";
        directions[5] = "west";

        if(direction == TurnDirection.left){
            turnToTheLeft(ant,directions);
        }
else
        {turnToTheRight(ant,directions);}


        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged(true);

    }
    @Override
    public String toString(){
        return "turn" + " " + direction;
    }
}
