package saarland.cispa.sopra;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import gen.AcolaBaseVisitor;
import gen.AcolaLexer;
import gen.AcolaParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class BrainParser {

    public static HashMap<Character, Swarm> parse(File[] brains) throws IOException {
        //AcolaParser parser = ;
        for (File brain : brains) {
            //TODO get string out of file

            CharStream input = CharStreams.fromPath(brain.toPath()); // we'll
            // parse
            // this
            // file
            AcolaLexer lexer = new AcolaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);
            ParseTree tree = parser.brain(); // see the grammar ->   //TODO wtf am i even doing ?
            // starting point for
            // parsing a java file

            ParseTreeVisitor visitor = new AcolaBaseVisitor(); // extends JavaBaseVisitor<Void>
            // and overrides the methods
            // you're interested
            visitor.visit(tree);


            String instr = "move";
            int jumpPC = 0;
            int max = 0;
            int marker = 0;
            Target target = Target.foe;
            String direction = "";
            SenseDir dir = SenseDir.here;
            Instruction instruction = new Move(1);
            String register = "";
            TurnDirection turn = TurnDirection.left;
            int reg = 0;
            switch (instr) {
                case "move": {
                    instruction = new Move(jumpPC);
                    break;
                }
                case "sense": {
                    instruction = new Sense(dir, target, marker, jumpPC);
                    break;
                }
                case ("flip"): {
                    instruction = new Flip(max,jumpPC);
                    break;
                }
                case ("mark"): {
                    instruction = new Mark(marker);
                    break;
                }
                case ("unmark"): {
                    instruction = new Unmark(marker);
                    break;
                }
                case ("set"): {
                    instruction = new Set(reg);
                    break;
                }
                case ("unset"): {
                    instruction = new Unset(reg);
                    break;
                }
                case ("drop"): {
                    instruction = new Drop(jumpPC);
                    break;
                }
                case ("pickup"): {
                    instruction = new Pickup(jumpPC);
                    break;
                }
                case ("direction"): {
                    instruction = new Direction(jumpPC, direction);
                    break;
                }
                case ("jump"): {
                    instruction = new Jump(jumpPC);
                    break;
                }
                case ("breed"): {
                    instruction = new Breed(jumpPC);
                    break;
                }
                case ("turn"): {
                    instruction = new Turn(turn);
                    break;
                }
                case ("test"): {
                    instruction = new Test(reg,jumpPC);
                    break;
                }
                default: {
                    throw new IllegalIcuArgumentException("");
                }
            }
            //Instruction[] outBrain = new Instruction[];
        }

        return new HashMap<>();
    }
}
