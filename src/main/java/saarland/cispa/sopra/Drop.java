package saarland.cispa.sopra;

import saarland.cispa.sopra.systemtests.FieldInfo;


import java.util.Map;

public class Drop extends Instruction {
    private final int jumpPC;

    public Drop(int jumpPC) {
        this.jumpPC = jumpPC;
    }

    @Override
    public void execute(World world, Ant ant) {


        if(!(ant.hasFood())) {     //kein Food in der Ant
            ant.setPc(jumpPC);
        }

            else{
                if(ant.getField().getType() == ('.')){
                    Normal field = (Normal) ant.getField();

                    field.addFood(1);
                    ant.setHasFood(false);
                    ant.increasePC();

                }
                if(ant.getField().getType() != ('=') && ant.getField().getType() != ('#')){
                    char BaseType = ant.getField().getType();

                    Map<Character,Integer> points =  world.getPoints();
                    if(points.containsKey(BaseType)){

                        int altPoints = points.get(BaseType);
                        altPoints = altPoints + 1;
                        points.replace(BaseType,altPoints);
                        ant.setHasFood(false);
                        ant.increasePC();


                    }

                }
            }

            Field field = (Field) ant.getField();
            field.setChanged();
        }

    @Override
    public String toString(){
        return "drop" + "else" + jumpPC;
    }
    }

