package saarland.cispa.sopra.systemtests.simontests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class TooBigMapTest extends SystemTest {
    @Override

    public void test(GameInfo gameInfo) {
        String brain = "brain \"sample\"{\njump 0\n}";

        //tooBig map
        String tooBig = "129\n2\n" +
            "A................................................................................................................................\n" +
            "................................................................................................................................B";
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, tooBig, brain, brain));

        //tooBig map2
        String tooBig2 = "129\n129\n" + mapBuilder();

        expect(IllegalArgumentException.class, () -> gameInfo.simulate(1, 42, tooBig2, brain));
    }

    public String mapBuilder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 130; i++) {
            for (int j = 0; j < 130; j++) {
                result.append('.');
                if (j == 129) {
                    if (!(j == 129 && i == 129)) {
                        result.append('\n');
                    }
                }
            }
        }


        return result.toString();
    }
}
