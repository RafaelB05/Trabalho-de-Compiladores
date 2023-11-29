// Generated from hphGramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hphGramaticaParser}.
 */
public interface hphGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(hphGramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(hphGramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(hphGramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(hphGramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#expl}.
	 * @param ctx the parse tree
	 */
	void enterExpl(hphGramaticaParser.ExplContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#expl}.
	 * @param ctx the parse tree
	 */
	void exitExpl(hphGramaticaParser.ExplContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(hphGramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(hphGramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(hphGramaticaParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(hphGramaticaParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(hphGramaticaParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(hphGramaticaParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(hphGramaticaParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(hphGramaticaParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#repet}.
	 * @param ctx the parse tree
	 */
	void enterRepet(hphGramaticaParser.RepetContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#repet}.
	 * @param ctx the parse tree
	 */
	void exitRepet(hphGramaticaParser.RepetContext ctx);
	/**
	 * Enter a parse tree produced by {@link hphGramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(hphGramaticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link hphGramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(hphGramaticaParser.PrintContext ctx);
}