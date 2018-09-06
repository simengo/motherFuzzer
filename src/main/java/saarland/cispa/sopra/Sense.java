package saarland.cispa.sopra;

import java.util.Map;

public class Sense extends Instruction {

    private final SenseDir direction;
    private final  Target target;
    private final  int marker;
    private final int jumpPC;

    public Sense(SenseDir dir, Target target, int marker, int jumpPC) {
        this.direction = dir;
        this.target = target;
        this.marker = marker;
        this.jumpPC = jumpPC;
    }


    @Override
    public void execute(World world, Ant ant) {



        Field field;

        switch (direction) {
            case left:

                String antDirLeft = ant.getDirection();
                String newDirectionLeft;
                switch (antDirLeft){
                    case "northwest":
                        newDirectionLeft ="west";
                        break;
                    case "northeast":
                        newDirectionLeft = "northwest";
                        break;
                    case "east":
                        newDirectionLeft = "northeast";
                        break;
                    case "southeast":
                        newDirectionLeft = "east";
                        break;
                    case "southwest":
                        newDirectionLeft = "southeast";
                        break;
                    case "west":
                        newDirectionLeft = "southwest";
                        break;
                    default:
                        throw new IllegalArgumentException();





                }

                    field =  world.getFieldInDirection((Field) ant.getField(),newDirectionLeft);
                break;

            case right:

                String antDirRight = ant.getDirection();
                String newDirectionRight;
                switch (antDirRight) {
                    case "northwest":
                        newDirectionRight = "northeast";
                        break;
                    case "northeast":
                        newDirectionRight = "east";
                        break;
                    case "east":
                        newDirectionRight = "northeast";
                        break;
                    case "southeast":
                        newDirectionRight = "east";
                        break;
                    case "southwest":
                        newDirectionRight = "southeast";
                        break;
                    case "west":
                        newDirectionRight = "southwest";
                        break;
                    default:
                        throw new IllegalArgumentException();

                }

                   field =  world.getFieldInDirection((Field) ant.getField(), newDirectionRight);

                    break;
            case ahead:
                   field = world.getFieldInDirection((Field) ant.getField(), ant.getDirection());




                break;
            case here:

                    field = (Field) ant.getField();

                break;
            default:
                throw new IllegalArgumentException();
        }

        //switch on target
        //friend, foe, food, rock, home, foehome, marker,foemarker,friendfood,foefood,antlion
        switch(target){
            case friend:
                if(!(field.getAnt().isPresent())){
                    ant.setPc(jumpPC);}
                    else {
                    if (field.getAnt().get().getSwarm() == ant.getSwarm()) {
                        ant.increasePC();
                    } else {
                        ant.setPc(jumpPC);
                    }
                }


                break;
            case foe:
                if(!(field.getAnt().isPresent())){
                    ant.setPc(jumpPC);}
                else {
                    if (field.getAnt().get().getSwarm() != ant.getSwarm()) {
                        ant.increasePC();
                    } else {
                        ant.setPc(jumpPC);
                    }
                }
                break;
            case food:
                if(field.getFood() != 0 ){ant.increasePC();}
                else{ant.setPc(jumpPC);}
                break;
            case rock:
                if(field.getType() == '#'){ant.increasePC();}
                else{ant.setPc(jumpPC);}
                break;
            case home:
                if(field.getType() == ant.getSwarm()){
                    ant.increasePC();
                }
                else{ant.setPc(jumpPC);}
                break;
            case foehome:
                if(field.getType() != ant.getSwarm() && field.getType() != '#' && field.getType() != '=' && field.getType() != '.'){
                    ant.increasePC();}
                else{ant.setPc(jumpPC);}
                break;
            case marker:
                if(field.getMarker(ant.getSwarm(),marker)){
                    ant.increasePC();
                }
                else{
                    ant.setPc(jumpPC);
                }
                break;
            case foemarker:
                Map<Character,boolean[]> markers = field.getMarkers();
                for (Character key : markers.keySet()) {
                    if(key !=ant.getSwarm()){
                        if(field.getMarker(key,marker)){
                            ant.increasePC();
                            break;
                        }
                    }
                }
                ant.setPc(jumpPC);
                break;

            case friendfood:
                if(field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() == ant.getSwarm()){ant.increasePC();}
                else{ant.setPc(jumpPC);}
                break;
            case foefood:
                if(field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() != ant.getSwarm()){ant.increasePC();}
                else{ant.setPc(jumpPC);}
                break;
            case antlion:
                if(field.getType() == '=' || field.getIsNextToAntlion()){
                    ant.increasePC();
                }
                else{ant.setPc(jumpPC);}
                break;
        }

        Field field1 = (Field) ant.getField();
        field1.setChanged();

    }
    @Override
    public String toString(){
        if(target == Target.marker) {
            return "sense" + direction + "marker" + marker + "else" + jumpPC;
        }
        else return "sense" + direction + target + "else" + jumpPC;
    }
}
