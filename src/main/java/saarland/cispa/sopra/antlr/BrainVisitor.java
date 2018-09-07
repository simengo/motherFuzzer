package saarland.cispa.sopra.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import saarland.cispa.sopra.antlr.AcolaParser;

import java.util.List;

public class BrainVisitor implements saarland.cispa.sopra.antlr.AcolaVisitor {
    @Override
    public Object visitStart_rule(AcolaParser.Start_ruleContext ctx) {
        return null;
    }

    @Override
    public List<AcolaParser.InstructionContext> visitBrain(AcolaParser.BrainContext ctx) {
        return ctx.instruction();
    }

    @Override
    public String visitInstruction(AcolaParser.InstructionContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitMark(AcolaParser.MarkContext ctx) {
        return ctx.children;
    }

    @Override
    public Object visitUnmark(AcolaParser.UnmarkContext ctx) {
        return null;
    }

    @Override
    public Object visitTurn(AcolaParser.TurnContext ctx) {
        return null;
    }

    @Override
    public Object visitMove(AcolaParser.MoveContext ctx) {
        return null;
    }

    @Override
    public Object visitSense(AcolaParser.SenseContext ctx) {
        return null;
    }

    @Override
    public Object visitSensemarker(AcolaParser.SensemarkerContext ctx) {
        return null;
    }

    @Override
    public Object visitSet(AcolaParser.SetContext ctx) {
        return null;
    }

    @Override
    public Object visitUnset(AcolaParser.UnsetContext ctx) {
        return null;
    }

    @Override
    public Object visitPickup(AcolaParser.PickupContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop(AcolaParser.DropContext ctx) {
        return null;
    }

    @Override
    public Object visitJump(AcolaParser.JumpContext ctx) {
        return null;
    }

    @Override
    public Object visitFlip(AcolaParser.FlipContext ctx) {
        return null;
    }

    @Override
    public Object visitTest(AcolaParser.TestContext ctx) {
        return null;
    }

    @Override
    public Object visitDirections(AcolaParser.DirectionsContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree tree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
