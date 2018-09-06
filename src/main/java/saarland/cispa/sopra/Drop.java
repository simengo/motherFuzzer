package saarland.cispa.sopra;




import java.util.Map;

public class Drop extends Instruction {
    private final int jumpPC;

    public Drop(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {


        if(ant.hasFood()) {     //kein Food in der Ant
            char point = '.';
            if(ant.getField().getType() == point){
                Normal field = (Normal) ant.getField();

                field.addFood(1);
                ant.setHasFood(false);
                ant.increasePC();

            }
            if(ant.getField().getType() != '=' && ant.getField().getType() == '#'){
                char baseType = ant.getField().getType();

                Map<Character,Integer> points =  world.getPoints();
                if(points.containsKey(baseType)){

                    int altPoints = points.get(baseType);
                    altPoints = altPoints + 1;
                    points.replace(baseType,altPoints);
                    ant.setHasFood(false);
                    ant.increasePC();


                }

            }
            ant.setPc(jumpPC);
        }

            else{
            ant.setPc(jumpPC);

            }

            Field field = (Field) ant.getField();
            field.setChanged();
        }

    @Override
    public String toString(){
        return "drop" + "else" + jumpPC;
    }
    }

