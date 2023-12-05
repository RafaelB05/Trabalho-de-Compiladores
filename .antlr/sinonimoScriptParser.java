// Generated from d:/Ufla/Compiladores/Trabalho-de-Compiladores/sinonimoScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sinonimoScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATR=2, AP=3, FP=4, AC=5, FC=6, OPA=7, OPL=8, OPC=9, ENDL=10, BOOL=11, 
		IF=12, ELSE=13, WHILE=14, PRINT=15, ID=16, NUM=17, STRING=18, WS=19;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expl = 2, RULE_exp = 3, RULE_atr = 4, 
		RULE_dec = 5, RULE_cond = 6, RULE_repet = 7, RULE_print = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expl", "exp", "atr", "dec", "cond", "repet", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<-'", "'('", "')'", "'{'", "'}'", null, null, null, "'::'", 
			null, "'assumindo'", "'entretanto'", "'durante'", "'registre'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "ATR", "AP", "FP", "AC", "FC", "OPA", "OPL", "OPC", "ENDL", 
			"BOOL", "IF", "ELSE", "WHILE", "PRINT", "ID", "NUM", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "sinonimoScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sinonimoScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NProgramContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(sinonimoScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NProgramContext(ProgramContext ctx) { copyFrom(ctx); }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new NProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0) );
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NStatementContext extends StatementContext {
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(sinonimoScriptParser.ENDL, 0); }
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public RepetContext repet() {
			return getRuleContext(RepetContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public NStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new NStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(25);
				atr();
				setState(26);
				match(ENDL);
				}
				break;
			case 2:
				{
				setState(28);
				dec();
				setState(29);
				match(ENDL);
				}
				break;
			case 3:
				{
				setState(31);
				cond();
				}
				break;
			case 4:
				{
				setState(32);
				repet();
				}
				break;
			case 5:
				{
				setState(33);
				print();
				setState(34);
				match(ENDL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplContext extends ParserRuleContext {
		public ExplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expl; }
	 
		public ExplContext() { }
		public void copyFrom(ExplContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NExpressaoLogicaContext extends ExplContext {
		public List<TerminalNode> ID() { return getTokens(sinonimoScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sinonimoScriptParser.ID, i);
		}
		public TerminalNode BOOL() { return getToken(sinonimoScriptParser.BOOL, 0); }
		public TerminalNode OPL() { return getToken(sinonimoScriptParser.OPL, 0); }
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode OPC() { return getToken(sinonimoScriptParser.OPC, 0); }
		public List<TerminalNode> NUM() { return getTokens(sinonimoScriptParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(sinonimoScriptParser.NUM, i);
		}
		public NExpressaoLogicaContext(ExplContext ctx) { copyFrom(ctx); }
	}

	public final ExplContext expl() throws RecognitionException {
		ExplContext _localctx = new ExplContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expl);
		int _la;
		try {
			_localctx = new NExpressaoLogicaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(38);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				match(OPC);
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==BOOL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPL) {
				{
				setState(44);
				match(OPL);
				setState(45);
				expl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NExpressaoContext extends ExpContext {
		public TerminalNode ID() { return getToken(sinonimoScriptParser.ID, 0); }
		public TerminalNode NUM() { return getToken(sinonimoScriptParser.NUM, 0); }
		public TerminalNode OPA() { return getToken(sinonimoScriptParser.OPA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NExpressaoContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		int _la;
		try {
			_localctx = new NExpressaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPA) {
				{
				setState(49);
				match(OPA);
				setState(50);
				exp();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtrContext extends ParserRuleContext {
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	 
		public AtrContext() { }
		public void copyFrom(AtrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NAtribuicaoContext extends AtrContext {
		public TerminalNode ATR() { return getToken(sinonimoScriptParser.ATR, 0); }
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode ID() { return getToken(sinonimoScriptParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode STRING() { return getToken(sinonimoScriptParser.STRING, 0); }
		public NAtribuicaoContext(AtrContext ctx) { copyFrom(ctx); }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atr);
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				{
				setState(53);
				dec();
				}
				break;
			case ID:
				{
				setState(54);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(57);
			match(ATR);
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(58);
				exp();
				}
				break;
			case 2:
				{
				setState(59);
				expl();
				}
				break;
			case 3:
				{
				setState(60);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NDeclaracaoContext extends DecContext {
		public TerminalNode TIPO() { return getToken(sinonimoScriptParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(sinonimoScriptParser.ID, 0); }
		public NDeclaracaoContext(DecContext ctx) { copyFrom(ctx); }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec);
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(TIPO);
			setState(64);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends CondContext {
		public TerminalNode IF() { return getToken(sinonimoScriptParser.IF, 0); }
		public TerminalNode AP() { return getToken(sinonimoScriptParser.AP, 0); }
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode FP() { return getToken(sinonimoScriptParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(sinonimoScriptParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(sinonimoScriptParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(sinonimoScriptParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(sinonimoScriptParser.FC, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(sinonimoScriptParser.ELSE, 0); }
		public CondicionalContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			_localctx = new CondicionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IF);
			setState(67);
			match(AP);
			setState(68);
			expl();
			setState(69);
			match(FP);
			setState(70);
			match(AC);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(FC);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(78);
				match(ELSE);
				setState(79);
				match(AC);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
					{
					{
					setState(80);
					statement();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(FC);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepetContext extends ParserRuleContext {
		public RepetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repet; }
	 
		public RepetContext() { }
		public void copyFrom(RepetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends RepetContext {
		public TerminalNode WHILE() { return getToken(sinonimoScriptParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(sinonimoScriptParser.AP, 0); }
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode FP() { return getToken(sinonimoScriptParser.FP, 0); }
		public TerminalNode AC() { return getToken(sinonimoScriptParser.AC, 0); }
		public TerminalNode FC() { return getToken(sinonimoScriptParser.FC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepeticaoContext(RepetContext ctx) { copyFrom(ctx); }
	}

	public final RepetContext repet() throws RecognitionException {
		RepetContext _localctx = new RepetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repet);
		int _la;
		try {
			_localctx = new RepeticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(WHILE);
			setState(90);
			match(AP);
			setState(91);
			expl();
			setState(92);
			match(FP);
			setState(93);
			match(AC);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NPrintContext extends PrintContext {
		public TerminalNode PRINT() { return getToken(sinonimoScriptParser.PRINT, 0); }
		public TerminalNode AP() { return getToken(sinonimoScriptParser.AP, 0); }
		public TerminalNode FP() { return getToken(sinonimoScriptParser.FP, 0); }
		public TerminalNode ID() { return getToken(sinonimoScriptParser.ID, 0); }
		public TerminalNode NUM() { return getToken(sinonimoScriptParser.NUM, 0); }
		public NPrintContext(PrintContext ctx) { copyFrom(ctx); }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			_localctx = new NPrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PRINT);
			setState(103);
			match(AP);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013l\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"/\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u00048\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006I\b\u0006\n\u0006\f\u0006L\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006R\b\u0006\n\u0006\f\u0006U\t"+
		"\u0006\u0001\u0006\u0003\u0006X\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007`\b\u0007\n\u0007"+
		"\f\u0007c\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0002\u0001\u0000\u0010\u0011\u0002\u0000\u000b\u000b\u0010\u0010"+
		"q\u0000\u0013\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\b7\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fB\u0001\u0000\u0000\u0000\u000e"+
		"Y\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0003"+
		"\b\u0004\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b%\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e\u0005\n\u0000\u0000"+
		"\u001e%\u0001\u0000\u0000\u0000\u001f%\u0003\f\u0006\u0000 %\u0003\u000e"+
		"\u0007\u0000!\"\u0003\u0010\b\u0000\"#\u0005\n\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\u0019\u0001\u0000\u0000\u0000$\u001c\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0007\u0000\u0000\u0000"+
		"\'(\u0005\t\u0000\u0000(+\u0007\u0000\u0000\u0000)+\u0007\u0001\u0000"+
		"\u0000*&\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,-\u0005\b\u0000\u0000-/\u0003\u0004\u0002\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u0000"+
		"03\u0007\u0000\u0000\u000012\u0005\u0007\u0000\u000024\u0003\u0006\u0003"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0007\u0001"+
		"\u0000\u0000\u000058\u0003\n\u0005\u000068\u0005\u0010\u0000\u000075\u0001"+
		"\u0000\u0000\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9=\u0005\u0002\u0000\u0000:>\u0003\u0006\u0003\u0000;>\u0003\u0004\u0002"+
		"\u0000<>\u0005\u0012\u0000\u0000=:\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0001\u0000\u0000@A\u0005\u0010\u0000\u0000A\u000b\u0001\u0000\u0000"+
		"\u0000BC\u0005\f\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u0004\u0002"+
		"\u0000EF\u0005\u0004\u0000\u0000FJ\u0005\u0005\u0000\u0000GI\u0003\u0002"+
		"\u0001\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MW\u0005\u0006\u0000\u0000NO\u0005\r\u0000\u0000"+
		"OS\u0005\u0005\u0000\u0000PR\u0003\u0002\u0001\u0000QP\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0005"+
		"\u0006\u0000\u0000WN\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\r\u0001\u0000\u0000\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\u0003\u0000"+
		"\u0000[\\\u0003\u0004\u0002\u0000\\]\u0005\u0004\u0000\u0000]a\u0005\u0005"+
		"\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0006\u0000"+
		"\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\u000f\u0000\u0000gh\u0005"+
		"\u0003\u0000\u0000hi\u0007\u0000\u0000\u0000ij\u0005\u0004\u0000\u0000"+
		"j\u0011\u0001\u0000\u0000\u0000\u000b\u0015$*.37=JSWa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}