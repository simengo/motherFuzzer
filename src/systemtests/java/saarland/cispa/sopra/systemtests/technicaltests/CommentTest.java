package saarland.cispa.sopra.systemtests.technicaltests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;

public class CommentTest extends SystemTest {

    @Override
    public void test(GameInfo gameInfo) {
        String map = "4\n4\n" +
            "BBB.\n" +
            "....\n" +
            "....\n" +
            "AAA.\n";

        String brain1 = "brain \"sample\" {\nturn left//test comment 123!\nturn left\nturn left\nturn left/*asdf*/\njump 0\n}";
        String brain2 = "brain \"sample\" {\nturn left/*\nturn left\nturn left\nturn left\njump 0\n}";

        try {
            gameInfo.simulate(1, 42, map, brain1, brain1);
        } catch (IllegalArgumentException x){
            fail("Comments are legal in acola programms");
        }
        expect(IllegalArgumentException.class,() -> gameInfo.simulate(1, 42, map, brain2, brain2));
    }
}
