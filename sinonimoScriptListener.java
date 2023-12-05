// Generated from sinonimoScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sinonimoScriptParser}.
 */
public interface sinonimoScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NProgram}
	 * labeled alternative in {@link sinonimoScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterNProgram(sinonimoScriptParser.NProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NProgram}
	 * labeled alternative in {@link sinonimoScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitNProgram(sinonimoScriptParser.NProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NStatement}
	 * labeled alternative in {@link sinonimoScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNStatement(sinonimoScriptParser.NStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NStatement}
	 * labeled alternative in {@link sinonimoScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNStatement(sinonimoScriptParser.NStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpressaoLogica}
	 * labeled alternative in {@link sinonimoScriptParser#expl}.
	 * @param ctx the parse tree
	 */
	void enterNExpressaoLogica(sinonimoScriptParser.NExpressaoLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpressaoLogica}
	 * labeled alternative in {@link sinonimoScriptParser#expl}.
	 * @param ctx the parse tree
	 */
	void exitNExpressaoLogica(sinonimoScriptParser.NExpressaoLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link sinonimoScriptParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNExpressao(sinonimoScriptParser.NExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NExpressao}
	 * labeled alternative in {@link sinonimoScriptParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNExpressao(sinonimoScriptParser.NExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link sinonimoScriptParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(sinonimoScriptParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link sinonimoScriptParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(sinonimoScriptParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link sinonimoScriptParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(sinonimoScriptParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link sinonimoScriptParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(sinonimoScriptParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condicional}
	 * labeled alternative in {@link sinonimoScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(sinonimoScriptParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condicional}
	 * labeled alternative in {@link sinonimoScriptParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(sinonimoScriptParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Repeticao}
	 * labeled alternative in {@link sinonimoScriptParser#repet}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(sinonimoScriptParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Repeticao}
	 * labeled alternative in {@link sinonimoScriptParser#repet}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(sinonimoScriptParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NPrint}
	 * labeled alternative in {@link sinonimoScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void enterNPrint(sinonimoScriptParser.NPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NPrint}
	 * labeled alternative in {@link sinonimoScriptParser#print}.
	 * @param ctx the parse tree
	 */
	void exitNPrint(sinonimoScriptParser.NPrintContext ctx);
}