package saarland.cispa.sopra.systemtests.dennistests;

import saarland.cispa.sopra.systemtests.GameInfo;

public class BrainTests1 extends OberklasseTests {
    @Override
    protected void test(GameInfo gameInfo) {

        //Zu langes brain
        String langesBrain =abartigesBrain(2501);

        String map = "2\n2\n" +
            ".A\n" +
            "B.";

        String brainTrue = "brain \"sample\" {\nset 0\njump 0\n}";
        String brain = "brain \"sample\" {\nset 0\nkot 0\n}";
        String brain1 = "brain \"brain\" {\nset 0\nunset 0\n}";
        String brainMark = "brain \"sample1\" {\nmark 7\njump 0\n}";
        String brainMark1 = "brain \"sample1\" {\nmark -1\njump 0\n}";
        String brainUnmark = "brain \"sampl2e\" {\nunset 7\njump 0\n}";
        String brainUnmark1 = "brain \"sampl2e\" {\nunset -1\njump 0\n}";
        String brainSet = "brain \"sample3\" {\nset 6\njump 0\n}";
        String brainSet1 = "brain \"sample3\" {\nset -1\njump 0\n}";
        String brainUnset = "brain \"sampl4e\" {\nunset 6\njump 0\n}";
        String brainUnset1 = "brain \"sampl4e\" {\nunset -1\njump 0\n}";
        String brainTest = "brain \"sampl5e\" {\ntest 0 else 2\njump 0\n}";
        String brainTest1 = "brain \"sampl5e\" {\ntest -1 else 1\njump 0\n}"; //Letzte aenderung
        String brainTest2 = "brain \"sampl6e\" {\ntest 6 else 0\njump 0\n}";
        String brainTurn = "brain \"sampl7e\" {\nturn blub\njump 0\n}";
        String brainMove = "brain \"sample8\" {\nmove else 2\njump 0\n}";
        String brainSense = "brain \"sample9\" {\nsense ahead marker 7 else 2\njump 0\n}";
        String brainSense2 = "brain \"sample10\" {\nsense lef foe else 2\njump 0\n}";
        String brainJump = "brain \"sample11\" {\nset 0\nset 1\n}";
        String brainBrain = "\"sample12\" {\nset 0\njump 0\n}";
        String brainOhneName = "brain \"\" {\nset 0\njump 0\n}";
        String brainOhneBefehle = "brain \"sample12\" {\n\n}";
        String brainPickup = "brain \"sample13\" {\npickup 0 else 2\njump 0\n}";
        String brainDrop = "brain \"sample14\" {\ndrop 0 else 2\njump 0\n}";
        String brainFlip = "brain \"sample15\" {\nflip 0 else 2\njump 0\n}";
        String brainJump2 = "brain \"sample16\" {\npickup 0 else 2\njump 2\n}";
        String brainDirection = "brain \"sample13\" {\ndirection east else 2\njump 0\n}";
        String brainLeft = "brain \"left\" {\njump 0\n}";
        String brainRight = "brain \"right\" {\njump 0\n}";
        String brainJumpnix = "brain \"right\" {\njump \n}";
        String brainDirection1 = "brain \"sample13\" {\ndirection east else -1\njump 0\n}";
        String brainDirection2 = "brain \"sample13\" {\ndirection blub else 1\njump 0\n}";

        String brainVorne = "brainz \"brain\" {\nset 0\nunset 0\n}";


        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainDirection1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainDirection2,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(2600, 42, map, brainJumpnix,brainTrue));


        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainUnmark1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainSet1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(2600, 42, map, brainUnset1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainTest1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainMark1,brainTrue));





        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brain,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brain1,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(2600, 42, map, langesBrain,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainMark,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainUnmark,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainSet,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainUnset,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainTest,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainTest2,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainTurn,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainMove,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainSense,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainSense2,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainJump,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainBrain,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainOhneName,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainOhneBefehle,brainTrue));

        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainPickup,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainDrop,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainFlip,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainJump2,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainDirection,brainTrue));

        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainLeft,brainTrue));
        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainRight,brainTrue));


        expect(Exception.class, ()-> gameInfo.simulate(1, 42, map, brainVorne,brainTrue));

    }
}
