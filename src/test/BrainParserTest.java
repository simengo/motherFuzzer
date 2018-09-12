import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.BrainParser;

import java.io.IOException;

public class BrainParserTest {

    @Test
    public void emptyTest() {
        test("brain \"beso\" {\\nsense here marker 0 else 2\\nset 0\\nsense ahead friend else 4\\nset 1\\nsense right friend else 6\\nset 2\\nturn left\\njump 6\\n}\n");
        test("brain/**/\"ant\"/**/{jump/**/0\n" +
            "}");
        test("brain \"ant\" {jump 0\n" +
            "}");
        test("brain \"ant\" {jump/*\\u2345\\u2124\\u4531\\u1345*/0\n" +
            "}");
        test("brain \n" +
            "\"ant\" \n" +
            "{\t\n" +
            "jump 0\n" +
            "}\n" +
            "\n" +
            "\n" +
            "//\\u2345\\u1344\n");
        test("brain\n" +
            "\"ant\"\n" +
            "{\n" +
            "jump 0//\\u5413\n" +
            "}");
        test("brain\n" +
            "\"ant\"\n" +
            "{\n" +
            "jump 0/*\n" +
            "*/}");
        test("brain\n" +
            "\"ant\"\n" +
            "{\n" +
            "jump 0/*\n" +
            "*/}");
    }

    private void test(String brainA) {
        String[] brains = new String[2];
        brains[0] = brainA;
        brains[1] = brainA;


        BrainParser.parse(brains);

    }
}
