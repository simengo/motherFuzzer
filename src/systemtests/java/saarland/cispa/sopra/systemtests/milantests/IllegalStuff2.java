package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
public class IllegalStuff2 extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {

        String map = InitTests.miniMarkerFood();
        String brain = "brain \"stan11dby\" {\nset -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain1 = "brain \"stan11dby\" {" +
            "\nset 6\npickup else 2\ndrop else 2\njump 0\n}";
        String brain2 = "brain \"stan11dby\" {" +
            "\nmark -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain3 = "brain \"stan11dby\" {" +
            "\nmark 8\npickup else 2\ndrop else 2\njump 0\n}";
        String brain4 = "brain \"stan11dby\" {\nunset 6\npickup else 2\ndrop else 2\njump 0\n}";
        String brain5 = "brain \"stan11dby\" {" +
            "\nunset -1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain6 = "brain \"stan11dby\" {" +
            "\ntest -1 else 1\npickup else 2\ndrop else 2\njump 2\n}";
        String brain7 = "brain \"stan11dby\" {" +
            "\ntest 6 else 1\npickup else 2\ndrop else 2\njump 0\n}";
        String brain8 = "brain \"stan11dby\" {" +
            "\nsett 17\npickup else 2\ndrop else 2\njump 0\n}";
        String brain9 = "brain \"stan11dby\" {" +
            "\nahead else 2" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        String brain10 = "brain \"stan11dby\" {" +
            "\nsense back ahead else 2" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";
        String brain11 = "brain \"stan11dby\" {" +
            "\nflip 1,3" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\n}";

        String brain12 = "brain \"stan11dby\" {" +
            "\nflip -1" +
            "\npickup else 2" +
            "\ndrop else 2" +
            "\njump 0" +
            "\njump 0" +
            "\n}";

        String brain13 = "brain \"stan11dby\" {" +
            "\nturn north\npickup else 2\ndrop else 2\njump 0\n}";

        String brain14 = "brain \"stan11dby\" {\nfriend\npickup else 2\ndrop else 2\njump 0\n}";
        String brain15 = "brain \"stan11dby\" {" +
            "\nnorth\npickup else 2\ndrop else 2\njump 0\n}";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain, brain));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain1, brain1));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain2, brain2));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain3, brain3));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain4, brain4));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain5, brain5));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain6, brain6));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain7, brain7));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain8, brain8));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain9, brain9));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain10, brain10));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain11, brain11));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain12, brain12));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain13, brain13));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain13, brain13));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain14, brain14));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(2, 1, map, brain15, brain15));
    }
}
