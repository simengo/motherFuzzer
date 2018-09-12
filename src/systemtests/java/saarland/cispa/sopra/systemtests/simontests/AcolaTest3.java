package saarland.cispa.sopra.systemtests.simontests;
import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

import java.util.NoSuchElementException;
public class AcolaTest3 extends SystemTest {
    @Override
    public void test(GameInfo gameInfo) {
        String map = "2\n2\n" +
            ".A\n" +
            "B.";
        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class,()->gameInfo.simulate(-1,42,map,brain,brain));
        WorldInfo world = gameInfo.simulate(1,42,map,brain,brain);
        expect(NoSuchElementException.class,()->world.getAnt(-1));
        if(world.getAnt(0).getRestTime() != 0){
            fail("at the beginning resttime is 0");
        }

        String aBrain = "brain \"sample\" {\nturn rechts\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,aBrain,aBrain));
        String bBrain = "brain \"sample\" {\nflip -8\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,bBrain,bBrain));
        String cBrain = "brain \"sample\" {\nturn left\njump -1\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,cBrain,cBrain));
        String dBrain = "brain \"sample\" {\nset 8\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,dBrain,dBrain));
        String eBrain = "brain \"sample\" {\nsense here marker else 0\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,eBrain,eBrain));
        String fBrain = "brain \"sample\" {\ntest 7\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,fBrain,fBrain));
        String gBrain ="brain \"sample\" {\nmark 8\njump 0\n}";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map,gBrain,gBrain));
        String map1 = "...."+
            "AA..\n"+
            "BB..\n"+
            "....\n"+
            "....";
        expect(IllegalArgumentException.class,()->gameInfo.simulate(1,42,map1,brain,brain));
        }


    }

