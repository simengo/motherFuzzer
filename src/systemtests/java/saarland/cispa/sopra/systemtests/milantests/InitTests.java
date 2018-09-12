package saarland.cispa.sopra.systemtests.milantests;

import saarland.cispa.sopra.systemtests.GameInfo;
import saarland.cispa.sopra.systemtests.SystemTest;
import saarland.cispa.sopra.systemtests.WorldInfo;

public class InitTests extends SystemTest {

    public static String sense1() {

        return "2\n2\n" +
            "AB\n" +
            "B.";
    }

    public static String senseFood() {

        return "2\n2\n" +
            "A1\n" +
            "B.";
    }

    public static String sense3() {

        return "2\n2\n" +
            "AA\n" +
            "B.";
    }

    public static String senseRock() {

        return "2\n2\n" +
            "A#\n" +
            "B.";
    }

    public static String sense5() {

        return "2\n2\n" +
            "A#\n" +
            "B.";
    }

    public static String sense6() {

        return "2\n2\n" +
            "AA\n" +
            "B.";
    }


    public static String kill() {

        return "4\n4\n" +
            "#AAA\n" +
            "#CB#\n" +
            "#DDD\n" +
            "####";
    }

    public static String selfmurkTP() {

        return "6\n6\n" +
            "######\n" +
            "#AAA##\n" +
            "##BCA#\n" +
            "##BB##\n" +
            "######\n" +
            "######";

    }

    public static String selfmurk() {

        return "6\n6\n" +
            "######\n" +
            "#AAA##\n" +
            "#AAA##\n" +
            "#AAA##\n" +
            "##B###\n" +
            "######";

    }


    public static String baufA() {

        return "6\n6\n" +
            "######\n" +
            "##AA##\n" +
            "#A.A.#\n" +
            "#ABA#.\n" +
            "#AAAAA\n" +
            "######";
    }

    public static String miniMarker() {

        return "2\n2\n" +
            "..\n" +
            "AB";
    }

    public static String miniMarkerFood() {

        return "2\n2\n" +
            "11\n" +
            "AB";
    }


    public static String fightFood() {

        return "6\n6\n" +
            "######\n" +
            "#AAA##\n" +
            "##A.A#\n" +
            "##A1A#\n" +
            "####B#\n" +
            "######";
    }

    public static String swarmCheck() {

        return "4\n4\n" +
            "ABCD\n" +
            "....\n" +
            "....\n" +
            "....";

    }

    public static String foodDrop() {

        return "4\n4\n" +
            "....\n" +
            "....\n" +
            "....\n" +
            "....";

    }

    public static String getTypeCheck() {

        return "4\n4\n" +
            "A#1.\n" +
            "....\n" +
            "....\n" +
            "....";

    }

    public static String illegalFutter() {

        return "4\n4\n" +
            "...1.\n" +
            "A.B.\n" +
            "A#1A\n" +
            "AAA.";
    }

    public static String illegalBreite() {

        return "4\n4\n" +
            ".A1..\n" +
            "A.B.\n" +
            "A#1A\n" +
            "AAA.";
    }

    public static String illegalHeight() {

        return "4\n4\n" +
            ".A1.\n" +
            "A.B.\n" +
            "A#1A\n" +
            "AAA.\n" +
            "....";
    }


    public static String fullMap() {

        return "6\n6\n" +
            "AAAAAA\n" +
            "AAAAAA\n" +
            "AAAAAA\n" +
            "AAAAAA\n" +
            "AAAAAA\n" +
            "BAAAAA";
    }

    public static String illegalMap() {

        return "6\n6\n" +
            "A.....\n" +
            "..C...\n" +
            ".X....\n" +
            "......\n" +
            "......\n" +
            "......";
    }

    public static String brokenMap() {

        return "6\n6\n" +
            "......\n" +
            "..A...\n" +
            ".B....\n" +
            "...B..\n" +
            "...A..\n" +
            "......";
    }

    public static String senseMap() {

        return "4\n4\n" +
            ".A1.\n" +
            "A.B.\n" +
            "A#1A\n" +
            "AAA.";

    }

    public static String warteMap() {

        return "4\n4\n" +
            ".#..\n" +
            ".A..\n" +
            ".B..\n" +
            "....";
    }

    public static String markMap() {

        return "4\n4\n" +
            "..A.\n" +
            "....\n" +
            "....\n" +
            ".AAB\n";
    }

    public static String foodMap1() {

        return "4\n4\n" +
            "A2..\n" +
            "A1..\n" +
            "B...\n" +
            "....";

    }

    public static String full() {

        return "4\n4\n" +
            "AAAA\n" +
            "....\n" +
            "BBBB\n" +
            "....";

    }

    public static String fightMap1() {

        return "6\n6\n" +
            "######\n" +
            "#AB###\n" +
            "#AB###\n" +
            "#AA###\n" +
            "######\n" +
            "......";

    }

    public static String fightMap2() {

        return "6\n6\n" +
            "######\n" +
            "#AA###\n" +
            "#AB###\n" +
            "#AA###\n" +
            "######\n" +
            "......";

    }


    public static String fightMapUeberRand() {

        return "4\n4\n" +
            "ABA#\n" +
            "#A##\n" +
            "####\n" +
            "AAA#";

    }

    public static String hindernisMap() {

        return "6\n6\n" +
            "######\n" +
            "#AB.##\n" +
            "#...##\n" +
            "#...##\n" +
            "######\n" +
            "######";
    }

    public static String moveMapWEST() {

        return "10\n10\n" +
            "A.........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "....B.....";

    }

    public static String moveMapEAST() {

        return "10\n10\n" +
            ".........A\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "..........\n" +
            "......B...";

    }

    public static int countAnt(String map) {

        int result = 0;

        for (int i = 0; i < map.length(); i++) {

            boolean small = map.charAt(i) >= 'a' && map.charAt(i) <= 'z';
            boolean big = map.charAt(i) >= 'A' && map.charAt(i) <= 'Z';

            if (small || big) {
                result++;
            }

        }

        return result;
    }

    public static String createMap(int w, int h) {

        StringBuilder result = new StringBuilder(w + "\n" + h + "\n");

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {

                if (y == 0) {
                    result.append('A');
                }
                if (y == 1) {
                    result.append('B');
                }
                result.append('.');
            }

            if (y < h - 1) {
                result.append('\n');
            }

        }

        return result.toString();

    }

    private void checkMap(int w, int h, WorldInfo informationen) {


        if (informationen.getWidth() != w || informationen.getHeight() != h) {

            fail("Ungueltige Hoehe / Breite");

        }

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {

                if (x < w)

                    if (informationen.getFieldAt(x, y).getType() != '.') {
                        fail("Falsches Zeichen verwendet");
                    }

            }
        }
    }

    @Override
    protected void test(GameInfo gameInfo) {

        String brain = "brain \"sample\" {" +
            "\nset 0" +
            "\njump 0" +
            "\njump 0" +
            "\n}";

        String map = "4\n4\n" +
            "AAAA\n" +
            "....\n" +
            "BBBB\n" +
            "....";


        WorldInfo welt = gameInfo.simulate(1, 42, map, brain, brain);

        if (welt.getFieldAt(0, 0).getAnt().get().getId() != 0) {
            fail("ID-Fehler0");
        }

        if (welt.getFieldAt(1, 0).getAnt().get().getId() != 1) {
            fail("ID-Fehler1");
        }
        if (welt.getFieldAt(2, 0).getAnt().get().getId() != 2) {
            fail("ID-Fehler2");
        }

        if (welt.getFieldAt(3, 0).getAnt().get().getId() != 3) {
            fail("ID-Fehler3");
        }

        if (welt.getFieldAt(0, 2).getAnt().get().getId() != 4) {
            fail("ID-Fehler4");
        }

        if (welt.getFieldAt(1, 2).getAnt().get().getId() != 5) {
            fail("ID-Fehler5");
        }

        if (welt.getFieldAt(2, 2).getAnt().get().getId() != 6) {
            fail("ID-Fehler6");
        }

        if (welt.getFieldAt(3, 2).getAnt().get().getId() != 7) {
            fail("ID-Fehler7");
        }


        /*
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (welt.getFieldAt(x, y).getAnt().isPresent()) {
                   if (!"northwest".equals(welt.getFieldAt(x, y).getAnt().get().getDirection())) {
                        fail("Initiale Blickrichtung ungleich Nordwesten");                    }
                    for (int i = 0; i < 6; i++) {
                        if (welt.getFieldAt(x, y).getAnt().get().getRegister()[i]) {
                            fail("Register initial auf true");
                        }}                  }              }}  }
*/
    }
}
