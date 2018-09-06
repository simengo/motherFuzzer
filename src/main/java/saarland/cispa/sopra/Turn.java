package saarland.cispa.sopra;

public class Turn extends Instruction {
    private final TurnDirection direction;
    public Turn(TurnDirection dir) {
        this.direction=dir;
    }

    private void turnToTheRight(Ant ant,  String[] dirs){
        String antDir = ant.getDirection();



        switch (antDir){
            case "northwest":
                ant.setDirection(dirs[1]);
                break;
            case "northeast":
                ant.setDirection(dirs[2]);
                break;
            case "east":
                ant.setDirection(dirs[3]);
                break;
            case "southeast":
                ant.setDirection(dirs[4]);
                break;
            case "southwest":
                ant.setDirection(dirs[5]);
                break;
            case "west":
                ant.setDirection(dirs[0]);
                break;
            default: throw new IllegalArgumentException();


        }


    }

    private void turnToTheLeft(Ant ant,String[] dirs){
        String antDir = ant.getDirection();

        switch (antDir){
            case "northwest":
                ant.setDirection(dirs[5]);
                break;
            case "northeast":
                ant.setDirection(dirs[0]);
                break;
            case "east":
                ant.setDirection(dirs[1]);
                break;
            case "southeast":
                ant.setDirection(dirs[2]);
                break;
            case "southwest":
                ant.setDirection(dirs[3]);
                break;
            case "west":
                ant.setDirection(dirs[4]);
                break;
            default: throw new IllegalArgumentException();

        }

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
        field.setChanged();

    }
    @Override
    public String toString(){
        return "turn" + direction;
    }
}
