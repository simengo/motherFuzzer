import org.junit.jupiter.api.Test;
import saarland.cispa.sopra.Instruction;
import saarland.cispa.sopra.InstructionGenerator;
import java.util.ArrayList;

public class test {

    @Test
    public void InstructionGeneratorTest() {
        ArrayList<Instruction> instructions = new ArrayList<>();
        Instruction instruction;
        for (int i = 0; i<10; i++){
            instruction = InstructionGenerator.createInstruction(100);
            instructions.add(instruction);
        }
    }
}
