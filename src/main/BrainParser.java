import java.io.File;
import java.util.HashMap;

public class BrainParser {
    public static HashMap<Character, Swarm> parse(File[] brains) {
        for (File brain : brains) {
            //TODO get string out of file
            String instr = "";
            int jumpPC = 0;
            Instruction instruction;
            if (instr == "move") {
                instruction = new Move(jumpPC);
            }
            if (instr == "sense") {
                instruction = new Sense();
            }
            if (instr == "flip") {
                instruction = new Flip();
            }
            if (instr == "mark") {
                instruction = new Mark();
            }
            if (instr == "unmark") {
                instruction = new Unmark();
            }
            if (instr == "set") {
                instruction = new Set();
            }
            if (instr == "unset") {
                instruction = new Unset();
            }
            if (instr == "drop") {
                instruction = new Drop();
            }
            if (instr == "pickup") {
                instruction = new Pickup();
            }
            if (instr == "direction") {
                instruction = new Direction();
            }
            if (instr == "jump"){
                instruction = new Jump();
            }
            if (instr == "breed"){
                instruction = new Breed(jumpPC);
            }
            if (instr == "turn"){
                instruction = new Turn();
            }
            if (instr == "test"){
                instruction = new Test();
            }
            //Instruction[] outBrain = new Instruction[];
        }

        return new HashMap<>();
    }
}
