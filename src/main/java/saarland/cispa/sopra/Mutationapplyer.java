package saarland.cispa.sopra;

import java.util.ArrayList;
import java.util.Random;

public final class Mutationapplyer {

    private static final Random generator = new Random();

    public static ArrayList<Brain> applyMutations(ArrayList<Brain> brains) {

        ArrayList<Brain> copy = new ArrayList<>(brains);

        int position = generator.nextInt(copy.get(3).getBrain().length);

        Instruction winnerInstruction = copy.get(3).getBrain()[position];
        Instruction mutatedInstruction = InstructionGenerator.createInstruction(copy.get(3).getBrain().length);

        InstructionInserter.insertInstruction(copy.get(0), winnerInstruction);
        InstructionInserter.insertInstruction(copy.get(1), winnerInstruction);
        InstructionInserter.insertInstruction(copy.get(2), winnerInstruction);
        InstructionInserter.insertInstruction(copy.get(3), mutatedInstruction);

        return copy;
    }


}
