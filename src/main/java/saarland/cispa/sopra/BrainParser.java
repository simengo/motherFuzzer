package saarland.cispa.sopra;

import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import saarland.cispa.sopra.antlr.AcolaLexer;
import saarland.cispa.sopra.antlr.AcolaParser;

public final class BrainParser {

    private BrainParser() {
    }

    public static Map<Character, Swarm> parse(String[] brains) {
        int maxBrains = 26;
        if (brains.length > maxBrains || brains.length < 2) {
            throw new IllegalArgumentException("num of brains error");
        }
        BrainParserHelper.checkBrainContent(brains);
        int currentBrain = 0;
        List<String> name = new ArrayList<>(2);
        Instruction[][] brainArray;
        BrainVisitor visitor = new BrainVisitor();
        brainArray = new Instruction[brains.length][];  //create the brains array
        CharStream input;
        for (String brain : brains) {
            input = CharStreams.fromString(brain);
            AcolaLexer lexer = new AcolaLexer(input);
            lexer.addErrorListener(new ANTLRErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException exc) {
                    throw new IllegalArgumentException(exc);
                }

                @Override
                public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
                    //             throw new IllegalArgumentException("");
                }

                @Override
                public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
                    //             throw new IllegalArgumentException("");
                }

                @Override
                public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
                    //             throw new IllegalArgumentException("");
                }
            });
            TokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);
            AcolaParser.BrainContext brainContext = parser.brain();

            name.add(brainContext.IDENTIFIER().getText());
            String[] instructionStringArr = visitor.visitBrain(brainContext).split("\n"); //
            int currentInstruction = 0;                         //iteration variable for initialising the brains array
            instructionStringArr = BrainParserHelper.removeEmpty(instructionStringArr);
            int length = BrainParserHelper.checkLength(instructionStringArr);
            brainArray[currentBrain] = new Instruction[length];
            for (String instr : instructionStringArr) {         //create all instructions and add them to the brain array
                String[] instrArray = instr.split(" ");
                instrArray = BrainParserHelper.removeEmpty(instrArray);
                brainArray[currentBrain][currentInstruction] = switchInstruction(instrArray[0], instrArray, length);
                currentInstruction++;
            }
            if (brainArray[currentBrain][brainArray[currentBrain].length - 1].getClass() != Jump.class || brainArray[currentBrain].length > 2500) {
                throw new IllegalArgumentException("last instruction wasn't a jump or brain was longer than 2500");
            }
            currentBrain++;
        }
        HashMap<Character, Swarm> brainMap = new HashMap<>();
        return BrainParserHelper.checkForBrokenBrain(brainArray, brainMap, name);
    }

    private static Instruction switchTarget(String dir, Target target, int jumpPC) {
        switch (target) {
            case foe:
                return new SenseAnt(dir, target, jumpPC);
            case friend:
                return new SenseAnt(dir, target, jumpPC);
            case home:
                return new SenseField(dir, target, jumpPC);
            case foehome:
                return new SenseField(dir, target, jumpPC);
            case rock:
                return new SenseField(dir, target, jumpPC);
            case antlion:
                return new SenseField(dir, target, jumpPC);
            case friendfood:
                return new SenseFood(dir, target, jumpPC);
            case foefood:
                return new SenseFood(dir, target, jumpPC);
            case food:
                return new SenseFood(dir, target, jumpPC);
            default:
                throw new IllegalArgumentException();
        }
    }

    private static Instruction switchInstruction(String instr, String[] instructionStringArr, int length) {
        switch (instr) {
            case "move":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[2]), length - 1);
                return new Move(Integer.parseInt(instructionStringArr[2]));
            case "sense":
                return createSense(instructionStringArr, length);
            case "flip":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[3]), length - 1);
                return new Flip(Integer.parseInt(instructionStringArr[1]), Integer.parseInt(instructionStringArr[3]));
            case "mark":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), 6);
                return new Mark(Integer.parseInt(instructionStringArr[1]));
            case "unmark":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), 6);
                return new Unmark(Integer.parseInt(instructionStringArr[1]));
            default:
                return switchInstruction2(instr, instructionStringArr, length);
        }
    }

    private static Instruction switchInstruction2(String instr, String[] instructionStringArr, int length) {
        switch (instr) {
            case "set":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), 5);
                return new Set(Integer.parseInt(instructionStringArr[1]));
            case "unset":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), 5);
                return new Unset(Integer.parseInt(instructionStringArr[1]));
            case "drop":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[2]), length - 1);
                return new Drop(Integer.parseInt(instructionStringArr[2]));
            case "pickup":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[2]), length - 1);
                return new Pickup(Integer.parseInt(instructionStringArr[2]));
            case "direction":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[3]), length - 1);
                return new Direction(Integer.parseInt(instructionStringArr[3]), instructionStringArr[1]);
            case "jump":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), length - 1);
                return new Jump(Integer.parseInt(instructionStringArr[1]));
            case "breed":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[2]), length - 1);
                return new Breed(Integer.parseInt(instructionStringArr[2]));
            case "turn":
                if ("left".equals(instructionStringArr[1])) {
                    return new Turn(TurnDirection.left);
                } else {
                    return new Turn(TurnDirection.right);
                }
            case "test":
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[1]), 6);
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[3]), length - 1);
                return new Test(Integer.parseInt(instructionStringArr[1]), Integer.parseInt(instructionStringArr[3]));
            default:
                throw new IllegalArgumentException();
        }
    }

    private static Instruction createSense(String[] instructionStringArr, int length) {
        Target target;
        switch (instructionStringArr[2]) {
            case "foe":
                target = Target.foe;
                break;
            case "food":
                target = Target.food;
                break;
            case "rock":
                target = Target.rock;
                break;
            case "home":
                target = Target.home;
                break;
            case "foehome":
                target = Target.foehome;
                break;
            case "marker":
                target = Target.marker;
                break;
            default:
                target = createSense2(instructionStringArr);
                break;
        }
        if ("marker".equals(instructionStringArr[2])) {
            BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[5]), length - 1);
            return new SenseMarker(instructionStringArr[1], target, Integer.parseInt(instructionStringArr[3]), Integer.parseInt(instructionStringArr[5]));
        } else {
            if ("foemarker".equals(instructionStringArr[2])) {
                return new SenseMarker(instructionStringArr[1], target, 0, Integer.parseInt(instructionStringArr[4]));
            } else {
                BrainParserHelper.checkForIllegal(Integer.parseInt(instructionStringArr[4]), length - 1);
                return switchTarget(instructionStringArr[1], target, Integer.parseInt(instructionStringArr[4]));
            }
        }
    }

    private static Target createSense2(String[] instructionStringArr) {
        switch (instructionStringArr[2]) {
            case "foemarker":
                return Target.foemarker;
            case "antlion":
                return Target.antlion;
            case "foefood":
                return Target.foefood;
            case "friendfood":
                return Target.friendfood;
            case "friend":
                return Target.friend;
            default:
                throw new IllegalArgumentException("illegal target");
        }
    }
}
