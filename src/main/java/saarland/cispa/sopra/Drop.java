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
            else {
                if (ant.getField().getType() != '=' && ant.getField().getType() != '#') {
                    char baseType = ant.getField().getType();

                    Map<Character, Integer> points = world.getPoints();
                    Integer punkte = points.get(baseType);
                    if (punkte != null) {

                        int altPoints;
                        altPoints = points.get(baseType);
                        altPoints = altPoints + 1;
                        points.replace(baseType, altPoints);
                        ant.setHasFood(false);
                        ant.increasePC();


                    }

                }

            }

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

