package saarland.cispa.sopra.gen;// Generated from /home/wep/IdeaProjects/group22/src/main/ressources/Acola.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AcolaParser}.
 */
public interface AcolaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AcolaParser#brain}.
	 * @param ctx the parse tree
	 */
	void enterBrain(AcolaParser.BrainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#brain}.
	 * @param ctx the parse tree
	 */
	void exitBrain(AcolaParser.BrainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AcolaParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AcolaParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMark(AcolaParser.MarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMark(AcolaParser.MarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#unmark}.
	 * @param ctx the parse tree
	 */
	void enterUnmark(AcolaParser.UnmarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#unmark}.
	 * @param ctx the parse tree
	 */
	void exitUnmark(AcolaParser.UnmarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#turn}.
	 * @param ctx the parse tree
	 */
	void enterTurn(AcolaParser.TurnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#turn}.
	 * @param ctx the parse tree
	 */
	void exitTurn(AcolaParser.TurnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(AcolaParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(AcolaParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#sense}.
	 * @param ctx the parse tree
	 */
	void enterSense(AcolaParser.SenseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#sense}.
	 * @param ctx the parse tree
	 */
	void exitSense(AcolaParser.SenseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(AcolaParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(AcolaParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#unset}.
	 * @param ctx the parse tree
	 */
	void enterUnset(AcolaParser.UnsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#unset}.
	 * @param ctx the parse tree
	 */
	void exitUnset(AcolaParser.UnsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#pickup}.
	 * @param ctx the parse tree
	 */
	void enterPickup(AcolaParser.PickupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#pickup}.
	 * @param ctx the parse tree
	 */
	void exitPickup(AcolaParser.PickupContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(AcolaParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(AcolaParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterJump(AcolaParser.JumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitJump(AcolaParser.JumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#flip}.
	 * @param ctx the parse tree
	 */
	void enterFlip(AcolaParser.FlipContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#flip}.
	 * @param ctx the parse tree
	 */
	void exitFlip(AcolaParser.FlipContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(AcolaParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(AcolaParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#directions}.
	 * @param ctx the parse tree
	 */
	void enterDirections(AcolaParser.DirectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#directions}.
	 * @param ctx the parse tree
	 */
	void exitDirections(AcolaParser.DirectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AcolaParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(AcolaParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AcolaParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(AcolaParser.DirectionContext ctx);
}
