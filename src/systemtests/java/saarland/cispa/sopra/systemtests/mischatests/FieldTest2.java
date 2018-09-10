package saarland.cispa.sopra.systemtests.mischatests;

/* TestFieldType */

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class FieldTest2 extends BaseTest {


    @Override
    public void test(GameInfo gameInfo){

    String map = "4\n6\n" +
        "2351\n" +
        "9A22\n" +
        "#..#\n" +
        "#B.#\n" +
        "#.C#\n" +
        "####\n" ;


    String brain = "brain \"sample\" {\n jump 0\n}";
    WorldInfo winfo = gameInfo.simulate(100,23,map,brain,brain,brain);
    testFieldType(winfo,1,0,'.');
    testFieldType(winfo,3,0,'.');
    testFieldType(winfo,0,1,'.');
    testFieldType(winfo,1,1,'A');
    testFieldType(winfo,1,3,'B');
    testFieldType(winfo,2,4,'C');
    testFieldType(winfo,3,5,'#');
    testFieldType(winfo,1,4,'.');
    }





}
