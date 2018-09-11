package saarland.cispa.sopra;


import java.io.File;
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

    public static Map<Character, Swarm> parse(File[] brains) throws IOException {
        int currentBrain = 0;
        List<String> name = new ArrayList<>(2);
        Instruction[][] brainArray = new Instruction[brains.length - 1][];
        BrainVisitor visitor = new BrainVisitor();
        for (File brain : brains) {
            CharStream input = CharStreams.fromPath(brain.toPath()); //parse each brain file into a usable form
            AcolaLexer lexer = new AcolaLexer(input);
            TokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);
            AcolaParser.BrainContext brainContext = parser.brain();

            name.add(brainContext.IDENTIFIER().getText());      // add the name of the brain to the name array
            brainArray = new Instruction[brains.length - 1][];  //create the brains array

            int currentInstruction = 0;                         //iteration variable for initialising the brains array
            String[] instructionStringArr = visitor.visitBrain(brainContext).split("\\n"); //
            brainArray[currentBrain]= new Instruction[instructionStringArr.length-1];
            for (String instr : instructionStringArr) {         //create all instructions and add them to the brain array
                String[] instrArray = addSpaces(instr);
                Instruction instruction = switchInstruction(instrArray[0], instrArray);
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

    private static Instruction switchInstruction(String instr, String[] instructionStringArr) throws IOException {
        //TODO get all the stuff
        int max = 0;

        switch (instr) {
            case "move":
                return new Move(Integer.parseInt(instructionStringArr[1]));
            case "sense":
                return createSense(instructionStringArr);
            case "flip":
                return new Flip(max, Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
            case "mark":
                return new Mark(Integer.parseInt(instructionStringArr[1]));
            case "unmark":
                return new Unmark(Integer.parseInt(instructionStringArr[1]));
            default:
                return switchInstruction2(instr, instructionStringArr);
        }
    }

    private static Instruction switchInstruction2(String instr, String[] instructionStringArr) {
        String direction = "";
        TurnDirection turn = null;
        switch (instr) {
            case "set":
                return new Set(Integer.parseInt(instructionStringArr[0]));
            case "unset":
                return new Unset(Integer.parseInt(instructionStringArr[0]));
            case "drop":
                return new Drop(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
            case "pickup":
                return new Pickup(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
            case "direction":
                return new Direction(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]), direction);
            case "jump":
                return new Jump(Integer.parseInt(instructionStringArr[1].split(" ")[0]));
            case "breed":
                return new Breed(Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
            case "turn":
                return new Turn(turn);
            case "test":
                return new Test(Integer.parseInt(instructionStringArr[0]), Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]));
            default:
                throw new IllegalArgumentException();
        }
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
        switch (instructionStringArr[1]) {
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
                throw new IOException("brain error");
        }
    }

    private static String[] addSpaces(String instruction){
        String[] instrArray;

        instruction = instruction.replace(" ","");
        instrArray = instruction.split("jump");
        if (instrArray.length==2){
            return splitjump(instruction,"jump");
        }
        instrArray = instruction.split("unmark");
        if (instrArray.length==2){
            return splitjump(instruction,"unmark");
        }
        instrArray = instruction.split("mark");
        if (instrArray.length==2){
            return splitjump(instruction,"mark");
        }
        instrArray = instruction.split("unset");
        if (instrArray.length==2){
            return splitjump(instruction,"unset");
        }
        instrArray = instruction.split("set");
        if (instrArray.length==2){
            return splitjump(instruction,"set");
        }
        instrArray = instruction.split("turn");
        if (instrArray.length==2){
            return splitjump(instruction,"turn");
        }


        instrArray = instruction.split("move");
        if (instrArray.length==2){
            return splitmove(instruction,"move");
        }
        instrArray = instruction.split("pickup");
        if (instrArray.length==2){
            return splitmove(instruction,"pickup");
        }
        instrArray = instruction.split("drop");
        if (instrArray.length==2){
            return splitmove(instruction,"drop");
        }
        instrArray = instruction.split("breed");
        if (instrArray.length==2){
            return splitmove(instruction,"breed");
        }

        instrArray = instruction.split("flip");
        if (instrArray.length==2){
            return splitflip(instruction,"flip");
        }
        instrArray = instruction.split("test");
        if (instrArray.length==2){
            return splitflip(instruction,"test");
        }
        instrArray = instruction.split("direction");
        if (instrArray.length==2){
            return splitflip(instruction,"direction");
        }

        instrArray = instruction.split("sense");
        if (instrArray.length==2){
            instrArray[2] = instrArray[1].split("here")[1];
            instrArray[1] = instrArray[1].split("ahead|left|right|here")[0];
            instrArray[3] = instrArray[2].split("foe|foehome|friend|food|antlion|rock|foefood|foemarker|marker")[1];
            instrArray[2] = instrArray[2].split("foe|foehome|friend|food|antlion|rock|foefood|foemarker|marker")[0];
            instrArray[4] = instrArray[3].split("else|0|1|2|3|4|5|6")[1];
            instrArray[3] = instrArray[3].split("else|0|1|2|3|4|5|6")[0];
            instrArray[5] = instrArray[4].split("else|0|1|2|3|4|5|6")[1];
            instrArray[4] = instrArray[4].split("else|0|1|2|3|4|5|6")[0];

            return instrArray;
        }
        throw new IllegalArgumentException("no such instruction");
    }

    private static String[] splitjump(String instruction, String regex) {
        String[] instrArray = new String[2];
        instrArray[0] = regex;
        instrArray[1] = instruction.split(regex)[0];
        instrArray[1] = instruction.split(regex)[1];
        return instrArray;
    }

    private static String[] splitmove(String instruction, String regex) {
        String[] instrArray = new String[3];
        instrArray[0] = regex;
        instrArray[1] = instruction.split(regex)[1];
        instrArray[1] = instrArray[1].split("else")[1];
        return instrArray;
    }

    private static String[] splitflip(String instruction, String regex){
        String[] instrArray = new String[3];
        instrArray[0] = regex;
        instrArray[1] = instruction.split(regex)[0];
        instrArray[2] = instrArray[1].split("else")[1];
        instrArray[1] = instrArray[1].split("else")[0];
        return instrArray;
    }
}
