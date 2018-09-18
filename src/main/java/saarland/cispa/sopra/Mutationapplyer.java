package saarland.cispa.sopra;

import java.util.ArrayList;
import java.util.Random;

public final class Mutationapplyer {

    private static final Random generator = new Random();

    public static ArrayList<Instruction[]> applyMutations(ArrayList<Instruction[]> brains) {

        int position = generator.nextInt(brains.get(3).length);

        Instruction winnerInstruction = brains.get(3)[position];
        Instruction mutatedInstruction = InstructionGenerator.createInstruction(brains.get(3).length);

        InstructionInserter.insertInstruction(brains.get(0), winnerInstruction);
        InstructionInserter.insertInstruction(brains.get(1), winnerInstruction);
        InstructionInserter.insertInstruction(brains.get(2), winnerInstruction);
        InstructionInserter.insertInstruction(brains.get(3), mutatedInstruction);

        return brains;
    }

}
