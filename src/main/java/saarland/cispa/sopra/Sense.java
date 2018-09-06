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


    private String toTheRight(String antLooking,  String[] dirs1){



        String newAntLooking;
        switch (antLooking){
            case "northwest":
                newAntLooking = dirs1[1];
                break;
            case "east":
                newAntLooking = dirs1[3];
                break;
            case "northeast":
                newAntLooking = dirs1[2];
                break;
            case "southeast":
                newAntLooking= dirs1[4];
                break;
            case "southwest":
                newAntLooking = dirs1[5];
                break;
            case "west":
                newAntLooking =dirs1[0];
                break;
            default: throw new IllegalArgumentException();


        }

return newAntLooking;
    }

    private String toTheLeft(String antLooking,String[] dirs1){

String newAntLooking;
        switch (antLooking){
            case "northwest":
                newAntLooking = dirs1[5];
                break;
            case "northeast":
                newAntLooking = dirs1[0];
                break;
            case "east":
                newAntLooking = dirs1[1];
                break;
            case "west":
                newAntLooking = dirs1[4];
                break;
            case "southeast":
                newAntLooking = dirs1[2];
                break;
            case "southwest":
                newAntLooking = dirs1[3];
                break;
            default: throw new IllegalArgumentException();

        }
        return newAntLooking;
    }

    public Field getMyField(World world, Ant ant){
        final String[] directionsSense = new String[6];

        directionsSense[0] = "northwest";
        directionsSense[1] = "northeast";
        directionsSense[2] = "east";
        directionsSense[3] = "southeast";
        directionsSense[4] = "southwest";
        directionsSense[5] = "west";



        Field field;

        switch (direction) {
            case left:
                String antDirLeft = ant.getDirection();
                String newDirectionLeft;
                newDirectionLeft = toTheLeft(antDirLeft,directionsSense);
                field =  world.getFieldInDirection((Field) ant.getField(),newDirectionLeft);
                break;
            case right:
                String antDirRight = ant.getDirection();
                String newDirectionRight;
                newDirectionRight = toTheRight(antDirRight,directionsSense);
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
        return field;
    }

    public void senseFriendOrFoe(Ant ant,Field field,boolean friendFoe){
        //wenn true dann wird nach freund geschaut, bei false nach feind
        if(friendFoe && field.getAnt().isPresent() && field.getAnt().get().getSwarm() == ant.getSwarm()){
            ant.increasePC();return;}
            if(!(friendFoe) && field.getAnt().isPresent() && field.getAnt().get().getSwarm() != ant.getSwarm()){
                ant.increasePC();return;}
                ant.setPc(jumpPC);


    }

    private void senseFoeMarkers (World world,Field field, Ant ant){
        Map<Character,boolean[]> markers = field.getMarkers();
        for (Character key : markers.keySet()) {
            if(key !=ant.getSwarm()){
                if(field.getMarker(key,marker)){
                    ant.increasePC();
                    return;
                }
            }
        }
        ant.setPc(jumpPC);
    }

    private void doIt(World world,Field field,Ant ant){
        switch(target){
            case friend:
                senseFriendOrFoe(ant,field,true);
                break;
            case foe:
                senseFriendOrFoe(ant,field,false);
                break;
            case food:
                if(field.getFood() != 0 ){ant.increasePC();break;}
                ant.setPc(jumpPC);
                break;
            case rock:
                char rock = '#';
                if(field.getType() == rock){ant.increasePC(); break;}
                ant.setPc(jumpPC);
                break;
            case home:
                if(field.getType() == ant.getSwarm()){
                    ant.increasePC();
                    break;
                }
                ant.setPc(jumpPC);
                break;
            case foehome:
                if(field.getType() != ant.getSwarm() && field.getType() != '#' && field.getType() != '=' && field.getType() != '.'){
                    ant.increasePC(); break;}
                ant.setPc(jumpPC);
                break;
            case marker:
                if(field.getMarker(ant.getSwarm(),marker)){
                    ant.increasePC();
                    break;
                }
                ant.setPc(jumpPC);
                break;
            case foemarker:

                senseFoeMarkers(world,field,ant);
                break;

            case friendfood:
                if(field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() == ant.getSwarm()){ant.increasePC();break;}
                ant.setPc(jumpPC);
                break;
            case foefood:
                if(field.getAnt().isPresent() && field.getAnt().get().hasFood() && field.getAnt().get().getSwarm() != ant.getSwarm()){ant.increasePC();break;}
                ant.setPc(jumpPC);
                break;
            case antlion:
                if(field.getType() == '=' || field.getIsNextToAntlion()){
                    ant.increasePC();
                    break;
                }
                ant.setPc(jumpPC);
                break;
        }

    }

    @Override
    public void execute(World world, Ant ant) {


        Field field =  getMyField(world,ant);

        //switch on target
        //friend, foe, food, rock, home, foehome, marker,foemarker,friendfood,foefood,antlion

        doIt(world,field,ant);

        Field field1 = (Field) ant.getField();
        field1.setChanged();

    }
    @Override
    public String toString(){
        if(target == Target.marker) {
            return "sense" + direction + "marker" + marker + "else" + jumpPC;
        }
        else {return "sense" + direction + target + "else" + jumpPC;}
    }
}
