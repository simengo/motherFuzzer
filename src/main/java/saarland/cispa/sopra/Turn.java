package saarland.cispa.sopra;

public class Turn extends Instruction {
    private TurnDirection direction;
    public Turn(TurnDirection dir) {
        this.direction=dir;
    }

    @Override
    public void execute(World world, Ant ant) {

        String antDir = ant.getDirection();

        switch (direction){

            case left:
                switch (antDir){
                    case "northwest":
                        ant.setDirection("west");
                        break;
                    case "northeast":
                        ant.setDirection("northwest");
                        break;
                    case "east":
                        ant.setDirection("northeast");
                        break;
                    case "southeast":
                        ant.setDirection("east");
                        break;
                    case "southwest":
                        ant.setDirection("southeast");
                        break;
                    case "west":
                        ant.setDirection("southwest");
                        break;
                     default: throw new IllegalArgumentException();

                }
                break;
            case right:
                switch (antDir){
                    case "northwest":
                        ant.setDirection("northeast");
                        break;
                    case "northeast":
                        ant.setDirection("east");
                        break;
                    case "east":
                        ant.setDirection("southeast");
                        break;
                    case "southeast":
                        ant.setDirection("southwest");
                        break;
                    case "southwest":
                        ant.setDirection("west");
                        break;
                    case "west":
                        ant.setDirection("northwest");
                        break;
                    default: throw new IllegalArgumentException();

                }



        }

        ant.increasePC();

        Field field = (Field) ant.getField();
        field.setChanged();

    }public String toString(){
        return "turn" + direction;
    }
}
