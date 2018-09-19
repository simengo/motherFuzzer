package saarland.cispa.sopra;

import java.util.*;

public final class InstructionInserter {

    private static Random generator = new Random();

    public static void insertInstruction(Brain brain, Instruction instruction) {

        int maxPC = brain.getBrain().length;
        if (maxPC > 500) {
            deleteInstruction(brain);
        }
        int insertPC = generator.nextInt(maxPC);
        LinkedList<Instruction> instructionList = new LinkedList<>(Arrays.asList(brain.getBrain()));
        Instruction insert = checkInstruction(instruction, maxPC);
        instructionList.add(insertPC, insert);
        brain.setBrain(instructionList.toArray(new Instruction[instructionList.size()]));
    }

    private static void deleteInstruction(Brain brain) {

        int deletePC = generator.nextInt(brain.getBrain().length);
        LinkedList<Instruction> instructionList = new LinkedList<>(Arrays.asList(brain.getBrain()));
        instructionList.remove(deletePC);
        brain.setBrain(instructionList.toArray(new Instruction[instructionList.size()]));

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
