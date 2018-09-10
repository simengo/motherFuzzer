package saarland.cispa.sopra.systemtests.dennistests;

//import java.util.NoSuchElementException;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public abstract class OberklasseTests extends SystemTest {
    public String initMapSt(char var1, char var2) {
        return String.format("12%n12%n" +
            "############%n" +
            "#......%c...#%n" +
            "#.......A..#%n" +
            "#..........#%n" +
            "#..........#%n" +
            "#..........#%n" +
            "#..........#%n" +
            "#..........#%n" +
            "#......%c...#%n" +
            "#.......B..#%n" +
            "#..........#%n" +
            "############", var1, var2);
    }

    /*public void checkField(WorldInfo world, int x, int y, Integer antID) {
        var field = world.getFieldAt(x, y);
        if (antID == null) {
            field.getAnt().ifPresent(ant -> fail("There is an ant on a wrong field but it should not"));
        } else {
            var isAnt = field.getAnt();
            if (isAnt.isPresent()) {
                if (antID != isAnt.get().getId()) {
                    fail("Wrong Ant on this field");
                }

            }
        }
    }*/

    public String createField(int x, int y) {

        char punkt = '.';
        char zeile = '\n';
        var start = x + "\n" + y + "\n";
        StringBuilder initMap = new StringBuilder(start);
        StringBuilder mapA = new StringBuilder("A");
        StringBuilder mapB = new StringBuilder("B");
        for(int i=0;i<x-1;i++){
            mapA.append(punkt);
            mapB.append(punkt);
        }
        mapA.append(zeile);
        for(int i=0;i<y-1;i++){
            initMap.append(mapA);

        }
        return initMap.append(mapB).toString();


    }

    public void tryCatchTrue(String map, String brain, GameInfo gameInfo) {
        try {
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException error) {
            fail("Incorrect MapSize");
        }
    }

    public void tryCatchFalse(String map, String brain, GameInfo gameInfo) {
        try {
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException error) {
            return;
        }
        fail("Incorrect MapSize");
    }


    public void tryCatchFalse2(String map, String brain, GameInfo gameInfo) {
        try {
            gameInfo.simulate(1, 42, map, brain, brain);
        } catch (IllegalArgumentException error) {
            return;
        }
        fail("Incorrect Map");
    }

        public void tryCatchWrongBrain(String map, String brain, GameInfo gameInfo) {
            try {
                gameInfo.simulate(1, 42, map, brain,brain);
            } catch (IllegalArgumentException error) {
                return;
            }
            fail("Brain was not recognized as broken");
    }

    public String abartigesBrain(int n){
        StringBuilder brainus = new StringBuilder("brain \"sample3\" {\n" );
        for (int i =0; i<=n; i++) {
            brainus.append("jump 0\n");
        }
            return brainus.toString()+ "}";
        }
    }


