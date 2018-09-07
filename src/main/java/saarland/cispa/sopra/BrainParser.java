package saarland.cispa.sopra;

import com.ibm.icu.impl.IllegalIcuArgumentException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import saarland.cispa.sopra.antlr.AcolaLexer;
import saarland.cispa.sopra.antlr.AcolaParser;

public final class BrainParser {

    private BrainParser(){}

    public static Map<Character, Swarm> parse(File[] brains) throws IOException {

        int currentBrain = 0;
        List<String> name = new ArrayList<>();
        Instruction[][] brainArray = new Instruction[0][];
        for (File brain : brains) {
            CharStream input = CharStreams.fromPath(brain.toPath());
            AcolaLexer lexer = new AcolaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AcolaParser parser = new AcolaParser(tokens);

            AcolaParser.BrainContext brainContext = parser.brain();
            BrainVisitor visitor = new BrainVisitor();
            List<AcolaParser.InstructionContext> instructionContextList = (List<AcolaParser.InstructionContext>) visitor.visitBrain(brainContext);

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
        int j = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            brainMap.put((char) i, new Swarm((char) i, brainArray[j], name.get(i)));
            j++;
        }
        return brainMap;
    }

    private static Instruction switchTarget(String dir, Target target, int jumpPC){
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
        }
        return instruction;
    }

    private static Instruction switchInstruction(String instr, String[] instructionStringArr) throws IOException {
        Instruction instruction = null;
        Target target = null; //TODO get all the stuff
        int marker = 0;
        String direction = "";
        String dir = "";
        int max = 0;
        TurnDirection turn = null;
        int register;
        int jumpPC;

        switch (instr) {
            case "move": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Move(jumpPC);
                break;
            }
            case "sense": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);

                switch (instructionStringArr[1]) {
                    case "foe": {
                        target = Target.foe;
                        break;
                    }
                    case "food": {
                        target = Target.food;
                        break;
                    }
                    case "rock": {
                        target = Target.rock;
                        break;
                    }
                    case "home": {
                        target = Target.home;
                        break;
                    }
                    case "foehome": {
                        target = Target.foehome;
                        break;
                    }
                    case "marker": {
                        target = Target.marker;
                        break;
                    }
                    case "foemarker": {
                        target = Target.foemarker;
                        break;
                    }
                    case "antlion": {
                        target = Target.antlion;
                        break;
                    }
                    case "foefood": {
                        target = Target.foefood;
                        break;
                    }
                    case "friendfood": {
                        target = Target.friendfood;
                        break;
                    }
                    case "friend": {
                        target = Target.friend;
                        break;
                    }
                    default: {
                        throw new IOException("brain error");
                    }
                }
                if (instructionStringArr[2].equals("marker")) {
                    dir = instructionStringArr[2];
                    marker = Integer.parseInt(instructionStringArr[3]);
                    instruction = new SenseMarker(dir, target, marker, jumpPC);
                } else {
                    dir = instructionStringArr[2];
                    instruction=switchTarget(dir, target, jumpPC);
                }
                break;
            }
            case "flip": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Flip(max, jumpPC);
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
            case "set": {
                register = Integer.parseInt(instructionStringArr[2]);
                instruction = new Set(register);
                break;
            }
            case "unset": {
                register = Integer.parseInt(instructionStringArr[2]);
                instruction = new Unset(register);
                break;
            }
            case "drop": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Drop(jumpPC);
                break;
            }
            case "pickup": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Pickup(jumpPC);
                break;
            }
            case "direction": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Direction(jumpPC, direction);
                break;
            }
            case "jump": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Jump(jumpPC);
                break;
            }
            case "breed": {
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Breed(jumpPC);
                break;
            }
            case "turn": {
                instruction = new Turn(turn);
                break;
            }
            case "test": {
                register = Integer.parseInt(instructionStringArr[2]);
                jumpPC = Integer.parseInt(instructionStringArr[instructionStringArr.length - 1]);
                instruction = new Test(register, jumpPC);
                break;
            }
            default: {
                throw new IllegalIcuArgumentException("");
            }
        }
        return instruction;
    }
}
