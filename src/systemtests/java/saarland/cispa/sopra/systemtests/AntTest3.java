package saarland.cispa.sopra.systemtests;

public class AntTest3 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            "...A\n" +
            "....\n" +
            "....\n" +
            "B...";

        String brainA = "brain \"sample\" {\n set 0 \n set 1 \n unset 1 \n jump 3\n}";
        String brainB = "brain \"sample\" {\n set 0 \n set 4 \n set 5 \n test 4 else 0 \n turn left \n jump 0 \n}";

        WorldInfo winfo = gameInfo.simulate(0,4,map,brainA,brainB);

        AntInfo ant0 = winfo.getAnt(0);
        AntInfo ant1 = winfo.getAnt(1);


        boolean[]  reg0 = ant0.getRegister();
        boolean[]  reg1 = ant1.getRegister();

        for(boolean reg : reg0){
            if (reg){
                fail("Register weren't initially false");
            }
        }

        for(boolean reg : reg1){
            if (reg){
                fail("Register weren't initially false");
            }
        }



        WorldInfo winfo2 = gameInfo.simulate(4,4,map,brainA,brainB);

        ant0 = winfo2.getAnt(0);

        reg0 = ant0.getRegister();

        if(!reg0[0] || reg0[1]  || reg0[2]  || reg0[3]  || reg0[4]  || reg0[5]){

            fail("Registers are wrong set or unset!");
        }



        WorldInfo winfo3 = gameInfo.simulate(5,4,map,brainA,brainB);

        ant1 = winfo3.getAnt(1);
        if(!"west".equals(ant1.getDirection())){

            fail("Registers are wrong set or unset!");

        }
    }
}
