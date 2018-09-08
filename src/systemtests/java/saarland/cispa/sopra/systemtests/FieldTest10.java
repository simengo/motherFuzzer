package saarland.cispa.sopra.systemtests;




// Ant on every BaseField and right Swarm
public class FieldTest10 extends BaseTest {

    @Override
    public void test(GameInfo gameInfo) {

        String map = "4\n2\n" +
            "BBAA\n" +
            "BB.C";

        String brain = "brain \"sample\" {\n jump 0\n}";

        WorldInfo winfo = gameInfo.simulate(5, 23, map, brain, brain, brain);
        testInitialBaseField(winfo,0,0,'B');
        testInitialBaseField(winfo,1,0,'B');
        testInitialBaseField(winfo,2,0,'A');
        testInitialBaseField(winfo,3,0,'A');
        testInitialBaseField(winfo,0,1,'B');
        testInitialBaseField(winfo,1,1,'B');
        testInitialBaseField(winfo,3,1,'C');

    }

}
