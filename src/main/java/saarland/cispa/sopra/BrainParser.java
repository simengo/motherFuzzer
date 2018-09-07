package saarland.cispa.sopra;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import saarland.cispa.sopra.antlr.AcolaLexer;
import saarland.cispa.sopra.antlr.AcolaParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class BrainParser {

    private BrainParser() {
    }

    public static Map<Character, Swarm> parse(File[] brains) throws IOException {

        int currentBrain = 0;
        List<String> name = new ArrayList<>(2);
        Instruction[][] brainArray = new Instruction[0][];

        BrainVisitor visitor = new BrainVisitor();
        for (File brain : brains) {
            CharStream input = CharStreams.fromPath(brain.toPath());
            AcolaLexer lexer = new AcolaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);

            AcolaParser.BrainContext brainContext = parser.brain();

            List<AcolaParser.InstructionContext> instructionContextList = visitor.visitBrain(brainContext);

            name.add("");

            brainArray = new Instruction[brains.length - 1][];
            int currentInstruction = 0;
            for (AcolaParser.InstructionContext context : instructionContextList) {

                String[] instructionStringArr = context.getText().split(" ");
                Instruction instruction = switchInstruction(instructionStringArr[0], instructionStringArr);
                if (instruction == null) {
                    throw new IllegalArgumentException("instruction is null");
                }
                brainArray[currentBrain][currentInstruction] = instruction;
                currentInstruction++;
            }
            currentBrain++;
        }
        HashMap<Character, Swarm> brainMap = new HashMap<>();
        int jiterator = 0;
        for (int iterator = 'A'; iterator <= 'Z'; iterator++) {
            brainMap.put((char) iterator, new Swarm((char) iterator, brainArray[jiterator], name.get(iterator)));
            jiterator++;
        }
        return brainMap;
    }

    private static Instruction switchTarget(String dir, Target target, int jumpPC) throws IOException {
        Instruction instruction = null;
        switch (target) {
            case foe:
                instruction = new SenseAnt(dir, target, jumpPC);
                break;
            case friend:
                instruction = new SenseAnt(dir, target, jumpPC);
                break;
            case home:
                instruction = new SenseField(dir, target, jumpPC);
                break;
            case foehome:
                instruction = new SenseField(dir, target, jumpPC);
                break;
            case rock:
                instruction = new SenseField(dir, target, jumpPC);
                break;
            case antlion:
                instruction = new SenseField(dir, target, jumpPC);
                break;
            case friendfood:
                instruction = new SenseFood(dir, target, jumpPC);
                break;
            case foefood:
                instruction = new SenseFood(dir, target, jumpPC);
                break;
            case food:
                instruction = new SenseFood(dir, target, jumpPC);
                break;
            default:
                throw new IOException();
        }
        return instruction;
    }

    private static Instruction switchInstruction(String instr, String[] instructionStringArr) throws IOException {
        Instruction instruction = null;
        //TODO get all the stuff
        int marker = 0;
        int max = 0;

        switch (instr) {
            case "move": {
                instruction = new Move(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;
            }
            case "sense": {
                instruction = createSense(instructionStringArr);
                break;
            }
            case "flip": {
                instruction = new Flip(max, Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;
            }
            case "mark": {
                instruction = new Mark(marker);
                break;
            }
            case "unmark": {
                instruction = new Unmark(marker);
                break;
            }
            default: {
                instruction = switchInstruction2(instr, instructionStringArr);
                break;
            }
        }
        return instruction;
    }

    private static Instruction switchInstruction2(String instr, String[] instructionStringArr) {
        Instruction instruction;
        String direction = "";
        TurnDirection turn = null;
        switch (instr) {
            case "set":
                instruction = new Set(Integer.parseInt(instructionStringArr[2]));
                break;

            case "unset":
                instruction = new Unset(Integer.parseInt(instructionStringArr[2]));
                break;

            case "drop":
                instruction = new Drop(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;

            case "pickup":
                instruction = new Pickup(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;

            case "direction":
                instruction = new Direction(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]), direction);
                break;

            case "jump":
                instruction = new Jump(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;

            case "breed":
                instruction = new Breed(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;

            case "turn":
                instruction = new Turn(turn);
                break;

            case "test":
                instruction = new Test(Integer.parseInt(instructionStringArr[2]), Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
                break;

            default:
                throw new IllegalArgumentException();
        }
        return instruction;
    }

    private static Instruction createSense(String[] instructionStringArr) throws IOException {
        Target target;
        switch (instructionStringArr[1]) {
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
            return new SenseMarker(instructionStringArr[2], target, Integer.parseInt(instructionStringArr[3]), Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
        } else {
            return switchTarget(instructionStringArr[2], target, Integer.parseInt(instructionStringArr[instructionStringArr.length - 1])); // jumpPC =  Integer.parseInt(instructionStringArr[instructionStringArr.length - 1])
        }
    }

    private static Target createSense2(String[] instructionStringArr) throws IOException {
        Target target;
        switch (instructionStringArr[1]) {
            case "foemarker":
                target = Target.foemarker;
                break;

            case "antlion":
                target = Target.antlion;
                break;

            case "foefood":
                target = Target.foefood;
                break;

            case "friendfood":
                target = Target.friendfood;
                break;

            case "friend":
                target = Target.friend;
                break;

            default:
                throw new IOException("brain error");

        }
        return target;
    }
}
