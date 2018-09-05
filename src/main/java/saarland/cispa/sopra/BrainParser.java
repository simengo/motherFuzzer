package saarland.cispa.sopra;

import java.io.File;
import java.util.HashMap;

public class BrainParser {
    public static HashMap<Character, Swarm> parse(File[] brains) {
        AcolaParser parser = new AcolaParser();
        for (File brain : brains) {
            //TODO get string out of file
            String instr = "move";
            int jumpPC = 0;
            int max = 0;
            int marker;
            Target target;
            String direction;
            Instruction instruction;
            switch (instr) {
                case "move": {
                    instruction = new Move(jumpPC);
                }
                case "sense": {
                    instruction = new Sense(direction, target, marker, jumpPC);
                }
                case ("flip"): {
                    instruction = new Flip(max);
                }
                case ("mark"): {
                    instruction = new Mark();
                }
                case ("unmark"): {
                    instruction = new Unmark();
                }
                case ("set"): {
                    instruction = new Set();
                }
                case ("unset"): {
                    instruction = new Unset();
                }
                case ("drop"): {
                    instruction = new Drop(jumpPC);
                }
                case ("pickup"): {
                    instruction = new Pickup();
                }
                case ("direction"): {
                    instruction = new Direction(jumpPC);
                }
                case ("jump"): {
                    instruction = new Jump(jumpPC);
                }
                case ("breed"): {
                    instruction = new Breed(jumpPC);
                }
                case ("turn"): {
                    instruction = new Turn();
                }
                case ("test"): {
                    instruction = new Test();
                }
            }
            //Instruction[] outBrain = new Instruction[];
        }

        return new HashMap<>();
    }
}
