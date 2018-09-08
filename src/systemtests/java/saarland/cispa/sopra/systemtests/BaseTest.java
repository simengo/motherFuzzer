package saarland.cispa.sopra.systemtests;

import java.util.Optional;

public abstract class BaseTest extends SystemTest {

    public void testAntField(WorldInfo winfo, int x0aim, int y0aim, int x1aim, int y1aim) {


        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);

        int xCoord = ant0.getField().getX();
        int yCoord = ant0.getField().getY();

        if (!(xCoord == x0aim && yCoord == y0aim)) {
            fail(String.format("Ant 0 made a wrong move! Is on field (%d,%d) instead of (%d,%d)!", xCoord, yCoord, x0aim, y0aim));
        }

        xCoord = ant1.getField().getX();
        yCoord = ant1.getField().getY();

        if (!(xCoord == x1aim && yCoord == y1aim)) {
            fail(String.format("Ant 0 made a wrong move! Is on field (%d,%d) instead of (%d,%d)!", xCoord, yCoord, x1aim, y1aim));
        }


    }


    public void testAntField(WorldInfo winfo, int antId, int x0aim, int y0aim) {


        AntInfo ainfo = winfo.getAnt(antId);
        int x = ainfo.getField().getX();
        int y = ainfo.getField().getY();
        if (!(x == x0aim && y == y0aim)) {
            fail(String.format("Ant 1 made a wrong move! Is on field (%d,%d) instead of (0,2)!", x, y));
        }


    }



    public void testFieldType(WorldInfo winfo, int xCoord, int yCoord, char expectedType) {


        FieldInfo field = winfo.getFieldAt(xCoord, yCoord);

        if (field.getType() != expectedType) {
            fail(String.format("Wrong FieldType! Expected: %c , but is %c", expectedType, field.getType()));


        }

    }



    public void testInitialBaseField(WorldInfo winfo, int x, int y, char expectedSwarm){

        FieldInfo finfo = winfo.getFieldAt(x,y);
        Optional<AntInfo> ant = finfo.getAnt();
        boolean a = ant.isPresent();

        if (a){
            AntInfo ant1 = ant.get();

            if(ant1.getSwarm()!= expectedSwarm){
                fail(String.format("Ant on Field (%d,%d) expected swarm: %c , but is %c !",x,y,expectedSwarm,ant1.getSwarm()));
            }
        } else {

            fail(String.format("No Ant on BaseField : (%d,%d)",x,y));
        }
    }



}
