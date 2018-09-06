package saarland.cispa.sopra;

import saarland.cispa.sopra.gen.AcolaParser;

import java.io.File;
import java.util.HashMap;

public class BrainParser {
    public static HashMap<Character, Swarm> parse(File[] brains) {
        //AcolaParser parser = ;
        for (File brain : brains) {
            //TODO get string out of file
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
                }
                case "sense": {
                    instruction = new Sense(dir, target, marker, jumpPC);
                }
                case ("flip"): {
                    instruction = new Flip(max,jumpPC);
                }
                case ("mark"): {
                    instruction = new Mark(marker);
                }
                case ("unmark"): {
                    instruction = new Unmark(marker);
                }
                case ("set"): {
                    instruction = new Set(reg);
                }
                case ("unset"): {
                    instruction = new Unset(reg);
                }
                case ("drop"): {
                    instruction = new Drop(jumpPC);
                }
                case ("pickup"): {
                    instruction = new Pickup(jumpPC);
                }
                case ("direction"): {
                    instruction = new Direction(jumpPC, direction);
                }
                case ("jump"): {
                    instruction = new Jump(jumpPC);
                }
                case ("breed"): {
                    instruction = new Breed(jumpPC);
                }
                case ("turn"): {
                    instruction = new Turn(turn);
                }
                case ("test"): {
                    instruction = new Test(reg,jumpPC);
                }
            }
            //Instruction[] outBrain = new Instruction[];
        }

        return new HashMap<>();
    }
}
