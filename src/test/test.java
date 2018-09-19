import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.*;

import java.util.ArrayList;

public class test {

    @Test
    public void InstructionGeneratorTest() {
        ArrayList<Instruction> instructions = new ArrayList<>();
        Instruction instruction;
        for (int i = 0; i < 100000; i++) {
            instruction = InstructionGenerator.createInstruction(100);
            instructions.add(instruction);
        }

        for (int i = 0; i < 100; i++) {
            if (instructions.get(i) instanceof Drop) {
                Drop drop = (Drop) instructions.get(i);
                assert (drop.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Pickup) {
                Pickup pickup = (Pickup) instructions.get(i);
                assert (pickup.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Move) {
                Move move = (Move) instructions.get(i);
                assert (move.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Breed) {
                Breed breed = (Breed) instructions.get(i);
                assert (breed.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Direction) {
                Direction direction = (Direction) instructions.get(i);
                assert (direction.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Flip) {
                Flip flip = (Flip) instructions.get(i);
                assert (flip.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof saarland.cispa.sopra.Test) {
                saarland.cispa.sopra.Test test = (saarland.cispa.sopra.Test) instructions.get(i);
                assert (test.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof Jump) {
                Jump jump = (Jump) instructions.get(i);
                assert (jump.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof SenseAnt) {
                SenseAnt senseAnt = (SenseAnt) instructions.get(i);
                assert (senseAnt.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof SenseField) {
                SenseField senseField = (SenseField) instructions.get(i);
                assert (senseField.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof SenseFood) {
                SenseFood senseFood = (SenseFood) instructions.get(i);
                assert (senseFood.getJumpPC() <= 100);
            }
            if (instructions.get(i) instanceof SenseMarker) {
                SenseMarker senseMarker = (SenseMarker) instructions.get(i);
                assert (senseMarker.getJumpPC() <= 100);
            }
        }
    }
}
