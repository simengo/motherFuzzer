package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class IllegalInit extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map ="4\n4\n"+
                    "A.B.\n"+
                    "..A.\n"+
                    "B...\n"+
                    "....";

        String brain = "brain \"sample\" {\nturn left\njump 0\n}";

        expect(IllegalArgumentException.class, ()->gameInfo.simulate(1,1,map,brain,brain));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,1,InitTests.createMap(-1, -1)));


        String illegalbrain = "brain \"s\"{}";

        expect(IllegalArgumentException.class, () ->gameInfo.simulate(1,1,InitTests.createMap(4,4),illegalbrain));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(-1, -1), brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(-1, -1), brain, brain));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,1,InitTests.createMap(129, 129)));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(128, 128), brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(128, 128), brain, brain));

        //   String genauRichtig = createMap(60, 60);

        //   checkMap(60, 60, gameInfo.simulate(1, 42, genauRichtig));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,1,InitTests.createMap(1, 1)));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(1, 1), brain, brain));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1,1,InitTests.createMap(3, 3)));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(3, 3), brain, brain));

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, InitTests.createMap(4, 4), brain, brain));
    }
}
