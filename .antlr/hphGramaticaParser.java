// Generated from d:/Ufla/Compiladores/Trabalho-de-Compiladores/hphGramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hphGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, ATR=2, AP=3, FP=4, AC=5, FC=6, OPA=7, OPL=8, OPC=9, ENDL=10, BOOL=11, 
		IF=12, ELSE=13, WHILE=14, PRINT=15, ID=16, NUM=17, STRING=18, WS=19;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expl = 2, RULE_exp = 3, RULE_dec = 4, 
		RULE_atr = 5, RULE_cond = 6, RULE_repet = 7, RULE_print = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expl", "exp", "dec", "atr", "cond", "repet", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'('", "')'", "'{'", "'}'", null, null, null, "';'", 
			null, "'if'", "'else'", "'while'", "'print'"
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
	public String getGrammarFileName() { return "hphGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hphGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(hphGramaticaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
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
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public TerminalNode ENDL() { return getToken(hphGramaticaParser.ENDL, 0); }
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				atr();
				setState(26);
				match(ENDL);
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				dec();
				setState(29);
				match(ENDL);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				cond();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				repet();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				print();
				setState(34);
				match(ENDL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<TerminalNode> ID() { return getTokens(hphGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hphGramaticaParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(hphGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(hphGramaticaParser.NUM, i);
		}
		public List<TerminalNode> OPC() { return getTokens(hphGramaticaParser.OPC); }
		public TerminalNode OPC(int i) {
			return getToken(hphGramaticaParser.OPC, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(hphGramaticaParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(hphGramaticaParser.BOOL, i);
		}
		public List<TerminalNode> OPL() { return getTokens(hphGramaticaParser.OPL); }
		public TerminalNode OPL(int i) {
			return getToken(hphGramaticaParser.OPL, i);
		}
		public ExplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expl; }
	}

	public final ExplContext expl() throws RecognitionException {
		ExplContext _localctx = new ExplContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expl);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
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
					setState(43); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPC );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==BOOL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					match(OPL);
					setState(47);
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
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPL );
				}
				break;
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
		public List<TerminalNode> ID() { return getTokens(hphGramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hphGramaticaParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(hphGramaticaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(hphGramaticaParser.NUM, i);
		}
		public List<TerminalNode> OPA() { return getTokens(hphGramaticaParser.OPA); }
		public TerminalNode OPA(int i) {
			return getToken(hphGramaticaParser.OPA, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPA) {
				{
				{
				setState(55);
				match(OPA);
				setState(56);
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
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode TIPO() { return getToken(hphGramaticaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(hphGramaticaParser.ID, 0); }
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(TIPO);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(63);
				match(ID);
				}
				break;
			case 2:
				{
				setState(64);
				atr();
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
	public static class AtrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hphGramaticaParser.ID, 0); }
		public TerminalNode ATR() { return getToken(hphGramaticaParser.ATR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode STRING() { return getToken(hphGramaticaParser.STRING, 0); }
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(ATR);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(69);
				exp();
				}
				break;
			case 2:
				{
				setState(70);
				expl();
				}
				break;
			case 3:
				{
				setState(71);
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(hphGramaticaParser.IF, 0); }
		public TerminalNode AP() { return getToken(hphGramaticaParser.AP, 0); }
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode FP() { return getToken(hphGramaticaParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(hphGramaticaParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(hphGramaticaParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(hphGramaticaParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(hphGramaticaParser.FC, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(hphGramaticaParser.ELSE, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			match(AP);
			setState(76);
			expl();
			setState(77);
			match(FP);
			setState(78);
			match(AC);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(FC);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(86);
				match(ELSE);
				setState(87);
				match(AC);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
					{
					{
					setState(88);
					statement();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
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
		public TerminalNode WHILE() { return getToken(hphGramaticaParser.WHILE, 0); }
		public TerminalNode AP() { return getToken(hphGramaticaParser.AP, 0); }
		public ExplContext expl() {
			return getRuleContext(ExplContext.class,0);
		}
		public TerminalNode FP() { return getToken(hphGramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(hphGramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(hphGramaticaParser.FC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repet; }
	}

	public final RepetContext repet() throws RecognitionException {
		RepetContext _localctx = new RepetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WHILE);
			setState(98);
			match(AP);
			setState(99);
			expl();
			setState(100);
			match(FP);
			setState(101);
			match(AC);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 118786L) != 0)) {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public TerminalNode PRINT() { return getToken(hphGramaticaParser.PRINT, 0); }
		public TerminalNode AP() { return getToken(hphGramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(hphGramaticaParser.FP, 0); }
		public TerminalNode ID() { return getToken(hphGramaticaParser.ID, 0); }
		public TerminalNode NUM() { return getToken(hphGramaticaParser.NUM, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PRINT);
			setState(111);
			match(AP);
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
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
		"\u0004\u0001\u0013t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002*\b\u0002\u000b\u0002\f\u0002+\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u00021\b\u0002\u000b\u0002\f\u00022\u0003\u00025\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003"+
		"=\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006Q\b\u0006\n\u0006\f\u0006T\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t"+
		"\u0006\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007h\b\u0007\n\u0007"+
		"\f\u0007k\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0002\u0001\u0000\u0010\u0011\u0002\u0000\u000b\u000b\u0010\u0010"+
		"z\u0000\u0013\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"4\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b>\u0001\u0000"+
		"\u0000\u0000\nC\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e"+
		"a\u0001\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012\u0014\u0003"+
		"\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0003"+
		"\n\u0005\u0000\u001a\u001b\u0005\n\u0000\u0000\u001b%\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\b\u0004\u0000\u001d\u001e\u0005\n\u0000\u0000"+
		"\u001e%\u0001\u0000\u0000\u0000\u001f%\u0003\f\u0006\u0000 %\u0003\u000e"+
		"\u0007\u0000!\"\u0003\u0010\b\u0000\"#\u0005\n\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\u0019\u0001\u0000\u0000\u0000$\u001c\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000"+
		"\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&)\u0007\u0000\u0000\u0000"+
		"\'(\u0005\t\u0000\u0000(*\u0007\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,5\u0001\u0000\u0000\u0000-0\u0007\u0001\u0000\u0000./\u0005"+
		"\b\u0000\u0000/1\u0007\u0001\u0000\u00000.\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"35\u0001\u0000\u0000\u00004&\u0001\u0000\u0000\u00004-\u0001\u0000\u0000"+
		"\u00005\u0005\u0001\u0000\u0000\u00006;\u0007\u0000\u0000\u000078\u0005"+
		"\u0007\u0000\u00008:\u0007\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u0007\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>A\u0005"+
		"\u0001\u0000\u0000?B\u0005\u0010\u0000\u0000@B\u0003\n\u0005\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0010\u0000\u0000DH\u0005\u0002\u0000\u0000EI\u0003\u0006\u0003"+
		"\u0000FI\u0003\u0004\u0002\u0000GI\u0005\u0012\u0000\u0000HE\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u000b"+
		"\u0001\u0000\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\u0003\u0000\u0000"+
		"LM\u0003\u0004\u0002\u0000MN\u0005\u0004\u0000\u0000NR\u0005\u0005\u0000"+
		"\u0000OQ\u0003\u0002\u0001\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U_\u0005\u0006\u0000\u0000"+
		"VW\u0005\r\u0000\u0000W[\u0005\u0005\u0000\u0000XZ\u0003\u0002\u0001\u0000"+
		"YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^`\u0005\u0006\u0000\u0000_V\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u000e\u0000\u0000"+
		"bc\u0005\u0003\u0000\u0000cd\u0003\u0004\u0002\u0000de\u0005\u0004\u0000"+
		"\u0000ei\u0005\u0005\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u0006\u0000\u0000m\u000f\u0001\u0000\u0000\u0000no\u0005\u000f"+
		"\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0007\u0000\u0000\u0000qr\u0005"+
		"\u0004\u0000\u0000r\u0011\u0001\u0000\u0000\u0000\f\u0015$+24;AHR[_i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}