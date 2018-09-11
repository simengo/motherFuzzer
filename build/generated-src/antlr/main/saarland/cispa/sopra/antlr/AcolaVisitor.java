// Generated from Acola.g4 by ANTLR 4.7.1
package saarland.cispa.sopra.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AcolaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AcolaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AcolaParser#brain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrain(AcolaParser.BrainContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AcolaParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMark(AcolaParser.MarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#unmark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmark(AcolaParser.UnmarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#turn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurn(AcolaParser.TurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(AcolaParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#sense}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSense(AcolaParser.SenseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#sensemarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSensemarker(AcolaParser.SensemarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(AcolaParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#unset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnset(AcolaParser.UnsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#pickup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickup(AcolaParser.PickupContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(AcolaParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump(AcolaParser.JumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#flip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlip(AcolaParser.FlipContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(AcolaParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(AcolaParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AcolaParser#breed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreed(AcolaParser.BreedContext ctx);
}