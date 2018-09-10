import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;
import saarland.cispa.sopra.systemtests.AntInfo;

import java.util.HashMap;
import java.util.Optional;

public class FieldTests {

    @Test
    public void emptyTest() {


        Field[][] spielfeld = new Field[2][2];
        Field field00 = new Base('A', 0, 0);
        Field field01 = new Normal(0, 1, 0);
        Field field10 = new Normal(1, 0, 9);
        Field field11 = new Base('B', 1, 1);
        spielfeld[0][0] = field00;
        spielfeld[0][1] = field01;
        spielfeld[1][0] = field10;
        spielfeld[1][1] = field11;
        Instruction[] brainA = new Instruction[3];
        brainA[0] = new Set(3);
        brainA[1] = new Set(5);
        brainA[2] = new Jump(0);
        Swarm swarmA = new Swarm('A', brainA, "brainA");
        Swarm swarmB = new Swarm('B', brainA, "brainB");
        HashMap<Character, Swarm> swarms = new HashMap<>();
        swarms.put('A', swarmA);
        swarms.put('B', swarmB);
        Ant antA = new Ant(swarmA, 0, spielfeld[0][0]);
        Ant antB = new Ant(swarmB, 1, spielfeld[1][1]);
        spielfeld[0][0].setAnt(antA);
        spielfeld[1][1].setAnt(antB);

        spielfeld[0][0].setNextToAntlion(true);

        Optional<AntInfo> opAnt = spielfeld[0][0].getAnt();
        Optional<AntInfo> opAnt1 = spielfeld[0][1].getAnt();
        Optional<AntInfo> opAnt2 = spielfeld[1][0].getAnt();
        Optional<AntInfo> opAnt3 = spielfeld[1][1].getAnt();


        assert(opAnt.isPresent() == true);
        assert(opAnt1.isPresent() == false);
        assert(opAnt2.isPresent() == false);
        assert(opAnt3.isPresent() == true);

        assert(spielfeld[0][0].getIsNextToAntlion() == true);
        assert(spielfeld[0][0].getChanged() == false);
        assert(spielfeld[0][1].getChanged() == false);
        assert(spielfeld[1][0].getChanged() == false);
        assert(spielfeld[1][1].getChanged() == false);

        assert(spielfeld[0][0].isAccessible() == false);
        assert(spielfeld[0][1].isAccessible() == true);
        assert(spielfeld[1][0].isAccessible() == true);
        assert(spielfeld[1][1].isAccessible() == false);

        assert(spielfeld[0][0].getType() == 'A');
        assert(spielfeld[1][0].getType() == '.');
        assert(spielfeld[0][1].getType() == '.');
        assert(spielfeld[1][1].getType() == 'B');

        assert(spielfeld[0][0].getX() == 0 && spielfeld[0][0].getY() == 0);
        assert(spielfeld[0][1].getX() == 0 && spielfeld[0][1].getY() == 1);
        assert(spielfeld[1][0].getX() == 1 && spielfeld[1][0].getY() == 0);
        assert(spielfeld[1][1].getX() == 1 && spielfeld[1][1].getY() == 1);

        assert(spielfeld[0][0].getFood() == 0);
        assert(spielfeld[1][0].getFood() == 9);
        assert(spielfeld[0][1].getFood() == 0);
        assert(spielfeld[1][1].getFood() == 0);

        spielfeld[0][1].setChanged(true);
        assert(spielfeld[0][1].getChanged() == true);
        spielfeld[0][1].setChanged(false);


        spielfeld[0][0].removeAnt();
        Optional<AntInfo> aO = spielfeld[0][0].getAnt();
        assert(aO.isPresent() == false);
        spielfeld[0][0].setAnt(antA);
        aO = spielfeld[0][0].getAnt();
        assert(aO.isPresent() == true);






    }



}

