package saarland.cispa.sopra
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WorldTests {

    @BeforeEach
    public void doBefore () {
        String map = "8\n6\n" +
            "........\n" +
            "...BB...\n" +
            "........\n" +
            "........\n" +
            "...AA...\n" +
            "........";

        String brainDumb = "brain \"sample\" {\njump 0\n}";
        World world = (World) gameInfo.simulate(1, 42, map, brainDumb, brainDumb);


        // Do nothing
    }

    @BeforeAll
    public void doBeforeAll () {
        // Do nothing
    }

    @Test
    public void emptyTest() {
        // Do nothing
    }

    @Test
    public void getFieldInDirectionTest(){
    Field field = (Field) world.getField(0,0);
    Field test = (Field) world.getField(8,6);
    Field test2 = (Field) world.getField(1,0);

        assert (test == world.getFieldInDirection(field,"northwest"));
        assert (test2 == world.getFieldInDirection(field,"east"));
    }


    @Test
    public void increasePoints() {
        world.increasePoints('A', 5);
        assert (world.getScore('A') == 5);
    }

    @Test
    public void getNeighbours(){
        Field field = (Field) world.getField(0,0);
        Field[] fields = world.getNeighbours(field);
        Field fieldNW = (Field) world.getField(8,6);
        Field fieldNE = (Field) world.getField(0,6);
        Field fieldE = (Field) world.getField(1,0);
        Field fieldSE = (Field) world.getField(0,1);
        Field fieldSW = (Field) world.getField(0,6);
        Field fieldW = (Field) world.getField(8,0);

        assert(fieldNW == fields[0]);
        assert(fieldNE == fields[1]);
        assert(fieldE == fields[2]);
        assert(fieldSE == fields[3]);
        assert(fieldSW == fields[4]);
        assert(fieldW == fields[5]);
    }

    @Test
    public void setAntLion(){

        Field field = (Field) world.getField(0,0);
        field.setAntLion();
        Field[] fields = world.getNeighbours(field);
        Field fieldNW = (Field) world.getField(8,6);
        Field fieldNE = (Field) world.getField(0,6);
        Field fieldE = (Field) world.getField(1,0);
        Field fieldSE = (Field) world.getField(0,1);
        Field fieldSW = (Field) world.getField(0,6);
        Field fieldW = (Field) world.getField(8,0);


        assert(world.getField(8,6).getIsNextToAntLion);
        assert(world.getField(0,6).getIsNextToAntLion);
        assert(world.getField(1,0).getIsNextToAntLion);
        assert(world.getField(0,1).getIsNextToAntLion);
        assert(world.getField(0,6).getIsNextToAntLion);
        assert(world.getField(8,0).getIsNextToAntLion);

    }



}
