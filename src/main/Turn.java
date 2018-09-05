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
                    case "northeast":
                        ant.setDirection("northwest");
                    case "east":
                        ant.setDirection("northeast");
                    case "southeast":
                        ant.setDirection("east");
                    case "southwest":
                        ant.setDirection("southeast");
                    case "west":
                        ant.setDirection("southwest");
                        default: throw new IllegalArgumentException();

                }
            case right:
                switch (antDir){
                    case "northwest":
                        ant.setDirection("northeast");
                    case "northeast":
                        ant.setDirection("east");
                    case "east":
                        ant.setDirection("southeast");
                    case "southeast":
                        ant.setDirection("southwest");
                    case "southwest":
                        ant.setDirection("west");
                    case "west":
                        ant.setDirection("northwest");
                    default: throw new IllegalArgumentException();

                }



        }

        ant.increasePC();

    }
}
