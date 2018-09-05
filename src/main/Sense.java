import saarland.cispa.sopra.systemtests.FieldInfo;

public class Sense extends Instruction {

    SenseDir direction;
    Target target;
    int marker;
    int jumpPC;

    public Sense(SenseDir dir, Target target, int marker, int jumpPC) {
        this.direction = dir;
        this.target = target;
        this.marker = marker;
        this.jumpPC = jumpPC;
    }


    @Override
    public void execute(World world, Ant ant) {




        switch (direction) {
            case left:

                String antDirLeft = ant.getDirection();
                String newDirectionLeft;
                switch (antDirLeft){
                    case "northwest":
                        newDirectionLeft ="west";
                    case "northeast":
                        newDirectionLeft = "northwest";
                    case "east":
                        newDirectionLeft = "northeast";
                    case "southeast":
                        newDirectionLeft = "east";
                    case "southwest":
                        newDirectionLeft = "southeast";
                    case "west":
                        newDirectionLeft = "southwest";
                    default: newDirectionLeft = "Baum";




                }
                if(world.getFieldInDirection(ant.getField(),newDirectionLeft) == '.'){
                    Normal field = world.getFieldInDirection(ant.getField(),newDirectionLeft);
                }
                if(world.getFieldInDirection(ant.getField(),newDirectionLeft) != '#' && world.getFieldInDirection(ant.getField(),newDirectionLeft) != '='){
                    Base field = world.getFieldInDirection(ant.getField(),newDirectionLeft);;
                }

            case right:

                String antDirRight = ant.getDirection();
                String newDirectionRight;
                switch (antDirRight) {
                    case "northwest":
                        newDirectionRight = "northeast";
                    case "northeast":
                        newDirectionRight = "east";
                    case "east":
                        newDirectionRight = "northeast";
                    case "southeast":
                        newDirectionRight = "east";
                    case "southwest":
                        newDirectionRight = "southeast";
                    case "west":
                        newDirectionRight = "southwest";
                }

            case ahead:
                if(world.getFieldInDirection(ant.getField(),ant.getDirection()) == '.'){
                    Normal field = world.getFieldInDirection(ant.getField(),ant.getDirection());
                }
                if(world.getFieldInDirection(ant.getField(),ant.getDirection()) != '#' && world.getFieldInDirection(ant.getField(),ant.getDirection()) != '='){
                    Base field = world.getFieldInDirection(ant.getField(),ant.getDirection());;
                }




            case here:
                if(ant.getField().getType() == '.'){
                    Normal field = ant.getField();
                }
                if(ant.getField().getType() != '#' && ant.getField().getType() != '='){
                    Base field = ant.getField();
                }
        }
    }
}
