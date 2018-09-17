package saarland.cispa.sopra.systemtests;

public class BrainTestM extends SystemTest {

    @Override
    protected void test(GameInfo gameInfo) {


        String map = "4\n4\n" +
            ".BB.\n" +
            "B=A.\n" +
            ".BB.\n" +
            "....";

        String brainA = "brain \"sample\" {\njump 0\n}"; //r
        String brainB = "brain \"sample\" {\njump 0 \n\n\n\r\r jump      0\n\n\n}";
        String brainC = "brain \"sample\" {\njump 0 \n\n\n\r\r jump 0\n}"; //r
        String brainD = "brain \"sample\" {\njump 0/*hadäpfaekmüdmao\n*/jump 0\n}"; //r
        String brainE = "brain \"sample\" {\njump 0/*hadäpfaekmüdmao*/jump 0\n}"; //f
        String brainF = "brain \"sample\" {\njump 0\njump\t0\n}"; //r
        String brainG = "brain \"sample\" {\njump 0\njump\n0\n}"; //f
        String brainH = "brain \"sample\" {\njump 0\r\r\r\r jump 0\n}"; //r
        String brainI = "\nbrain \"sample\" {\njump 0\n jump   0\n}"; //f
        String brainJ = "brain \"sample\" {\njump /*hadäpfaekmüdmao\n*/ 0\njump 0\n}"; //f
        String brainK = "brain \"sample\" {\njump \r0\n jump   0\n}"; //f
        String brainL = " brain \"sample\" {\njump 0\n jump 0\n}"; //f
        String brainM = "brain \n\n\"sample\" \n\n{\n\njump 0\n jump 0\n\n}\n\n//hallo\n"; //r
        String brainN = "brain \n\"sample\" {jump 0\r}"; //r
        String brainO = "brain \"sample\" {\njump 0\n} /* */ */"; //f
        String brainP = "brain \n\"sample\" /* \n // */ \n */ \n {\njump 0\n}"; //f
        String brainQ = "brain \"sample\" {\njump 0 \n} // "; //f
        String brainR = "brain \"sample\" // /* \n {\njump 0\n}"; //r
        String brainS = "brain \"sample\" // */ \n {\njump 0 \n}"; //r
        String brainT = "brain \"sample\" {\njump /*ha\r*/ 0\njump 0\n}"; //f
        String brainU = "brain \"sample\" {\njump 1 \ntest 0 \n else 3\n jump 0 \n}"; //f
        String brainV = "brain \"sample\" {\njump 1 \nsense ahead \n marker 3 else 0\njump 0 \n}"; //f
        String brainW = "brain \"sample\" {\njump 1 \n flip 1000 \r else 3\njump 0 \n}"; //f
        String brainX = "brain \"else\" {\njump 0 \n}"; //f
        String brainY = "brain \"mark\" {\njump 0\n}"; //f
        String brainZ = "brain \"sam\nple\" {\njump 0\n}"; //f
        String brainA2 = "brain \"name\" {\r\n\r\njump 0\n}"; //r
        String brainB2 = "brain \"sam ple\" {\njump 0\n}"; //f
        String brainC2 = "brain \"aa\" { jump 0\n\n\n\njump \t0\n }"; //r

        gameInfo.simulate(10,23,map,brainA,brainB);
        gameInfo.simulate(10,23,map,brainC,brainB);
        gameInfo.simulate(10,23,map,brainD,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainE,brainB));
        gameInfo.simulate(10,23,map,brainF,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainG,brainB));
        gameInfo.simulate(10,23,map,brainH,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainI,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainJ,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainK,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainL,brainB));
        gameInfo.simulate(10,23,map,brainM,brainB);
        gameInfo.simulate(10,23,map,brainN,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainO,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainP,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainQ,brainB));
        gameInfo.simulate(10,23,map,brainR,brainB);
        gameInfo.simulate(10,23,map,brainS,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainT,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainU,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainV,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainW,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainX,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainY,brainB));
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainZ,brainB));
        gameInfo.simulate(10,23,map,brainA2,brainB);
        expect(IllegalArgumentException.class, () -> gameInfo.simulate(10, 10,map,brainB2,brainB));
        gameInfo.simulate(10,23,map,brainC2,brainC2);

    }


}
