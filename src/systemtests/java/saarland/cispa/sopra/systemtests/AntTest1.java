package saarland.cispa.sopra.systemtests;



// test AntID
public class AntTest1 extends BaseTest{

@Override
    public void test(GameInfo gameInfo) {



        String map = "6\n6\n" +
            "A.AAAA\n" +
            "AAA...\n" +
            "B.....\n" +
            "BB....\n" +
            ".B....\n" +
            "......";

        String brain = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(1,2,map,brain,brain);
        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);
        AntInfo ant5 = winfo.getAnt(5);
        AntInfo ant8 = winfo.getAnt(8);
        AntInfo ant9 = winfo.getAnt(9);


        if (ant0.getId() != 0 || ant1.getId() != 1 || ant5.getId() != 5 || ant8.getId() != 8 || ant9.getId() != 9){

            fail("Ant Id's are wrong !");
        }

        if(ant0.getField() != winfo.getFieldAt(0,0)){
            fail(String.format("Ant with ID: %d is on wrong Field -> wrong id ?",0));
        }


        if(ant1.getField() != winfo.getFieldAt(2,0)){
            fail(String.format("Ant with ID: %d is on wrong Field -> wrong id ?",1));
        }


        if(ant5.getField() != winfo.getFieldAt(0,1)){
            fail(String.format("Ant with ID: %d is on wrong Field -> wrong id ?",5));
        }

        if(ant8.getField() != winfo.getFieldAt(0,2)){
            fail(String.format("Ant with ID: %d is on wrong Field -> wrong id ?",8));
        }


        if(ant9.getField() != winfo.getFieldAt(0,3)){
            fail(String.format("Ant with ID: %d is on wrong Field -> wrong id ?",9));
        }





    }
}
