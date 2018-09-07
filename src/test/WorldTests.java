package saarland.cispa.sopra;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;



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
        Game world = new Game("");

        world.simulate(1, 42, map, brainDumb, brainDumb);


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
    Normal field = (Normal) world.getField(0,0);
    Normal test = (Normal) world.getField(8,6);
    Normal test2 = (Normal) world.getField(1,0);

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
        Normal field = (Normal) world.getField(0,0);
        Field[] fields = world.getNeighbours(field);
        Normal fieldNW = (Normal) world.getField(8,6);
        Normal fieldNE = (Normal) world.getField(0,6);
        Normal fieldE = (Normal) world.getField(1,0);
        Normal fieldSE = (Normal) world.getField(0,1);
        Normal fieldSW = (Normal) world.getField(0,6);
        Normal fieldW = (Normal) world.getField(8,0);

        assert(fieldNW == fields[0]);
        assert(fieldNE == fields[1]);
        assert(fieldE == fields[2]);
        assert(fieldSE == fields[3]);
        assert(fieldSW == fields[4]);
        assert(fieldW == fields[5]);
    }

    @Test
    public void setAntLion(){

        Normal field = (Normal) world.getField(0,0);
        world.setAntLion(field);


        assert(world.getField(8,6).getIsNextToAntLion);
        assert(world.getField(0,6).getIsNextToAntLion);
        assert(world.getField(1,0).getIsNextToAntLion);
        assert(world.getField(0,1).getIsNextToAntLion);
        assert(world.getField(0,6).getIsNextToAntLion);
        assert(world.getField(8,0).getIsNextToAntLion);

    }



}
