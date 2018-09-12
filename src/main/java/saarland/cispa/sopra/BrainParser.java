package saarland.cispa.sopra;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CharStreams;
import saarland.cispa.sopra.antlr.AcolaLexer;
import saarland.cispa.sopra.antlr.AcolaParser;

public final class BrainParser {

    private BrainParser() {
    }

    public static Map<Character, Swarm> parse(String[] brains) throws IOException {
        int maxBrains = 26;
        if (brains.length > maxBrains) {
            throw new IllegalArgumentException("to many brains");
        }
        int currentBrain = 0;
        List<String> name = new ArrayList<>(2);
        Instruction[][] brainArray;
        BrainVisitor visitor = new BrainVisitor();
        brainArray = new Instruction[brains.length][];  //create the brains array
        CharStream input;
        for (String brain : brains) {

            input = CharStreams.fromString(brain);

            AcolaLexer lexer = new AcolaLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);
            if (parser.getNumberOfSyntaxErrors() != 0) {
                throw new IllegalArgumentException("brain has syntax errors");
            }

            AcolaParser.BrainContext brainContext = parser.brain();

            name.add(brainContext.IDENTIFIER().getText());      // add the name of the brain to the name array
            int currentInstruction = 0;                         //iteration variable for initialising the brains array
            String[] instructionStringArr = visitor.visitBrain(brainContext).split("[\\n][ ]"); //
            int length = instructionStringArr.length;
            brainArray[currentBrain] = new Instruction[length];
            for (String instr : instructionStringArr) {         //create all instructions and add them to the brain array
                //String[] instrArray = addSpaces(instr);
                String[] instrArray = instr.split(" ");
                Instruction instruction = switchInstruction(instrArray[0], instrArray, length);
                if (instruction == null) {
                    throw new IllegalArgumentException("instruction is null");
                }
                brainArray[currentBrain][currentInstruction] = instruction;
                currentInstruction++;
            }
            if (brainArray[currentBrain][brainArray[currentBrain].length - 1].getClass() != Jump.class || brainArray[currentBrain].length > 2500) {
                throw new IllegalArgumentException("last instruction wasn't a jump or brain was longer than 2500");
            }
            currentBrain++;
        }
        HashMap<Character, Swarm> brainMap = new HashMap<>();
        for (int iterator = 0; iterator < brainArray.length; iterator++) {
            brainMap.put((char) ('A' + iterator), new Swarm((char) ('A' + iterator), brainArray[iterator], name.get(iterator)));
        }
        return brainMap;
    }

    private static Instruction switchTarget(String dir, Target target, int jumpPC) throws IOException {
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
                throw new IOException();
        }
    }

    private static Instruction switchInstruction(String instr, String[] instructionStringArr, int length) throws IOException {
        switch (instr) {
            case "move":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[2]), length);
                return new Move(Integer.parseInt(instructionStringArr[2]));
            case "sense":
                return createSense(instructionStringArr, length);
            case "flip":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[3]), length);
                return new Flip(Integer.parseInt(instructionStringArr[1]), Integer.parseInt(instructionStringArr[3]));
            case "mark":
                return new Mark(Integer.parseInt(instructionStringArr[1]));
            case "unmark":
                return new Unmark(Integer.parseInt(instructionStringArr[1]));
            default:
                return switchInstruction2(instr, instructionStringArr, length);
        }
    }

    private static Instruction switchInstruction2(String instr, String[] instructionStringArr, int length) {
        switch (instr) {
            case "set":
                return new Set(Integer.parseInt(instructionStringArr[1]));
            case "unset":
                return new Unset(Integer.parseInt(instructionStringArr[1]));
            case "drop":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[2]), length);
                return new Drop(Integer.parseInt(instructionStringArr[2]));
            case "pickup":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[2]), length);
                return new Pickup(Integer.parseInt(instructionStringArr[2]));
            case "direction":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[3]), length);
                return new Direction(Integer.parseInt(instructionStringArr[3]), instructionStringArr[1]);
            case "jump":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[1]), length);
                return new Jump(Integer.parseInt(instructionStringArr[1]));
            case "breed":
                checkOutOfBounds(Integer.parseInt(instructionStringArr[2]), length);
                return new Breed(Integer.parseInt(instructionStringArr[2]));
            case "turn":
                if ("left".equals(instructionStringArr[1])) {
                    return new Turn(TurnDirection.left);
                } else {
                    return new Turn(TurnDirection.right);
                }
            case "test":
                return new Test(Integer.parseInt(instructionStringArr[1]), Integer.parseInt(instructionStringArr[3]));
            default:
                throw new IllegalArgumentException();
        }
    }

    private static Instruction createSense(String[] instructionStringArr, int length) throws IOException {
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
            checkOutOfBounds(Integer.parseInt(instructionStringArr[5]), length);
            return new SenseMarker(instructionStringArr[1], target, Integer.parseInt(instructionStringArr[3]), Integer.parseInt(instructionStringArr[5]));
        } else {
            checkOutOfBounds(Integer.parseInt(instructionStringArr[4]), length);
            return switchTarget(instructionStringArr[1], target, Integer.parseInt(instructionStringArr[4]));
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
                throw new IllegalArgumentException("illigal target");
        }
    }

    private static void checkOutOfBounds(int x, int instructionStringArrLength) {
        if (x >= instructionStringArrLength) {
            throw new IllegalArgumentException("index out of bounds");
        }
    }

//    private static String[] addSpaces(String instructioninput) {
//        String[] instrArray;
//        String instruction = instructioninput.replace(" ", "");
//
//        instrArray = instruction.split("sense");
//        if (instrArray.length == 2) {
//            return addSenseSpaces(instrArray);
//        }
//        instrArray = instruction.split("jump");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "jump");
//        }
//        instrArray = instruction.split("unset");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "unset");
//        }
//        instrArray = instruction.split("set");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "set");
//        }
//        instrArray = instruction.split("turn");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "turn");
//        }
//        instrArray = instruction.split("move");
//        if (instrArray.length == 2) {
//            return splitmove(instruction, "move");
//        }
//        instrArray = instruction.split("pickup");
//        if (instrArray.length == 2) {
//            return splitmove(instruction, "pickup");
//        }
//        return addSpaces2(instruction);
//    }
//
//
//    private static String[] addSpaces2(String instruction) {
//        String[] instrArray;
//
//        instrArray = instruction.split("drop");
//        if (instrArray.length == 2) {
//            return splitmove(instruction, "drop");
//        }
//        instrArray = instruction.split("breed");
//        if (instrArray.length == 2) {
//            return splitmove(instruction, "breed");
//        }
//
//        instrArray = instruction.split("flip");
//        if (instrArray.length == 2) {
//            return splitflip(instruction, "flip");
//        }
//        instrArray = instruction.split("test");
//        if (instrArray.length == 2) {
//            return splitflip(instruction, "test");
//        }
//        instrArray = instruction.split("direction");
//        if (instrArray.length == 2) {
//            return splitflip(instruction, "direction");
//        }
//
//        instrArray = instruction.split("unmark");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "unmark");
//        }
//        instrArray = instruction.split("mark");
//        if (instrArray.length == 2) {
//            return splitjump(instruction, "mark");
//        }
//        throw new IllegalArgumentException("no such instruction");
//    }
//
//
//    private static String[] addSenseSpaces(String[] instrArrayinput) {
//        String sense = "sense";
//        instrArrayinput[0] = sense;
//        String instrBody = instrArrayinput[1];
//
//        String[] instrArray = new String[5];
//        instrArray[0] = sense;
//        instrArray[1] = instrBody;
//
//        splitTarDir("ahead", instrArray, 1);
//        splitTarDir("here", instrArray, 1);
//        splitTarDir("left", instrArray, 1);
//        splitTarDir("right", instrArray, 1);
//
//        splitTarDir("foehome", instrArray, 2);
//        splitTarDir("foemarker", instrArray, 2);
//        splitTarDir("foefood", instrArray, 2);
//        splitTarDir("foe", instrArray, 2);
//        splitTarDir("home", instrArray, 2);
//        splitTarDir("food", instrArray, 2);
//        splitTarDir("friendfood", instrArray, 2);
//        splitTarDir("friend", instrArray, 2);
//        splitTarDir("antlion", instrArray, 2);
//        splitTarDir("rock", instrArray, 2);
//        splitTarDir("marker", instrArray, 2);
//
//        String els = "else";
//        instrArray[4] = instrArray[3].split(els)[1];
//        instrArray[3] = instrArray[3].split(els)[0];
//        return instrArray;
//    }
//
//
//    private static String[] splitjump(String instruction, String regex) {
//        String[] instrArray = new String[2];
//        instrArray[0] = regex;
//        instrArray[1] = instruction.split(regex)[0];
//        instrArray[1] = instruction.split(regex)[1];
//        return instrArray;
//    }
//
//    private static String[] splitmove(String instruction, String regex) {
//        String[] instrArray = new String[3];
//        instrArray[0] = regex;
//        instrArray[1] = instruction.split(regex)[1];
//        instrArray[1] = instrArray[1].split("else")[1];
//        return instrArray;
//    }
//
//    private static String[] splitflip(String instruction, String regex) {
//        String[] instrArray = new String[3];
//        instrArray[0] = regex;
//        instrArray[1] = instruction.split(regex)[1];
//        String els = "else";
//        instrArray[2] = instrArray[1].split(els)[1];
//        instrArray[1] = instrArray[1].split(els)[0];
//        return instrArray;
//    }
//
//    private static void splitTarDir(String target, String[] instrArray, int index) {
//        String[] tester = instrArray[index].split(target);
//        if (tester.length > 1) {
//            instrArray[index + 1] = tester[1];
//            instrArray[index] = target;
//        }
//    }
}
