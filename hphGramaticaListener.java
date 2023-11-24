// Generated from hphGramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hphGramaticaParser}.
 */
public interface hphGramaticaListener extends ParseTreeListener {
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
}