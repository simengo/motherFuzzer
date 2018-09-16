package saarland.cispa.sopra;

import org.antlr.v4.runtime.tree.ParseTree;
import saarland.cispa.sopra.antlr.AcolaBaseVisitor;
import saarland.cispa.sopra.antlr.AcolaParser;

import java.util.List;

public class BrainVisitor extends AcolaBaseVisitor<String> {

    @Override
    public String visitBrain(AcolaParser.BrainContext ctx) {
        List<AcolaParser.InstructionContext> list = ctx.instruction();
        StringBuilder builder = new StringBuilder();
        for (AcolaParser.InstructionContext context : list) {
            builder.append(visitInstruction(context)).append("\n ");
        }
        return builder.toString();
    }

    @Override
    public String visitInstruction(AcolaParser.InstructionContext ctx) {
        visitChildren(ctx);
        StringBuilder result = new StringBuilder();
        int num = ctx.getChildCount();
        String childString;
        String comment = "/";
        String tab = "\t";
        for (int iterator = 0; iterator < num; iterator++) {
            ParseTree tree = ctx.getChild(iterator);
            for (int x=0; x<tree.getChildCount();x++){
                childString = tree.getChild(x).getText();
                if(comment.equals(childString.substring(0,1))||tab.equals(childString.substring(0,1))){
                    continue;
                }
                result.append(childString).append(' ');
            }
        }
        return result.toString();
    }
}
