package saarland.cispa.sopra;

import java.util.*;

public final class InstructionInserter {

    private static Random generator = new Random();

    public static Instruction[] insertInstruction(Instruction[] instructions, Instruction instruction) {

        int maxPC = instructions.length;
        int insertPC = generator.nextInt(maxPC);
        List<Instruction> instructionList = Arrays.asList(instructions);
        instructionList.add(insertPC, checkInstruction(instruction, maxPC));
        return (Instruction[]) instructionList.toArray();
    }

    private static Instruction checkInstruction(Instruction instruction, int maxPC) {

        if (instruction instanceof Drop) {
            Drop drop = (Drop) instruction;
            drop.setJumpPC(generator.nextInt(maxPC));
            return drop;
        }

        if (instruction instanceof Pickup) {
            Pickup pickup = (Pickup) instruction;
            pickup.setJumpPC(generator.nextInt(maxPC));
            return pickup;
        }

        if (instruction instanceof Test) {

            Test test = (Test) instruction;
            test.setJumpPC(generator.nextInt(maxPC));
            return test;

        }

        if (instruction instanceof Flip) {
            Flip flip = (Flip) instruction;
            flip.setJumpPC(generator.nextInt(maxPC));
            return flip;

        }

        if (instruction instanceof Direction) {
            Direction direction = (Direction) instruction;
            direction.setJumpPC(generator.nextInt(maxPC));
            return direction;
        }

        if (instruction instanceof Jump) {
            Jump jump = (Jump) instruction;
            jump.setJumpPC(generator.nextInt(maxPC));
            return jump;
        }

        if (instruction instanceof SenseField) {
            SenseField sense = (SenseField) instruction;
            sense.setJumpPC(generator.nextInt(maxPC));
            return sense;
        }

        if (instruction instanceof SenseFood) {
            SenseFood sense = (SenseFood) instruction;
            sense.setJumpPC(generator.nextInt(maxPC));
            return sense;

        }

        if (instruction instanceof SenseMarker) {
            SenseMarker sense = (SenseMarker) instruction;
            sense.setJumpPC(generator.nextInt(maxPC));
            return sense;

        }

        if (instruction instanceof Move) {
            Move move = (Move) instruction;
            move.setJumpPC(generator.nextInt(maxPC));
            return move;
        }

        if (instruction instanceof Breed) {
            Breed breed = (Breed) instruction;
            breed.setJumpPC(generator.nextInt(maxPC));
            return breed;
        } else {
            return instruction;
        }

    }


}
