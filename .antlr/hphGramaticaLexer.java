// Generated from d:/Ufla/Compiladores/Trabalho-de-Compiladores/hphGramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class hphGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TIPO=2, ATR=3, AB=4, FB=5, OPA=6, OPL=7, ENDL=8, IF=9, ELSE=10, 
		WHILE=11, ID=12, NUM=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "TIPO", "ATR", "AB", "FB", "OPA", "OPL", "ENDL", "IF", "ELSE", 
			"WHILE", "ID", "NUM", "LETRA", "DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", null, "'<-'", "'('", "')'", null, null, "'::'", "'aah'", 
			"'colecao'", "'quando?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TIPO", "ATR", "AB", "FB", "OPA", "OPL", "ENDL", "IF", "ELSE", 
			"WHILE", "ID", "NUM"
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


	public hphGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hphGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\r\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bj\b\u000b\n\u000b\f\u000bm\t\u000b\u0001\f\u0004"+
		"\fp\b\f\u000b\f\f\fq\u0001\f\u0001\f\u0004\fv\b\f\u000b\f\f\fw\u0003\f"+
		"z\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d"+
		"\u0000\u0001\u0000\u0004\u0004\u0000%%*+--||\u0002\u0000<<>>\u0002\u0000"+
		"AZaz\u0001\u000009\u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003;\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000"+
		"\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bD\u0001"+
		"\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000"+
		"\u0000\u0011R\u0001\u0000\u0000\u0000\u0013V\u0001\u0000\u0000\u0000\u0015"+
		"^\u0001\u0000\u0000\u0000\u0017f\u0001\u0000\u0000\u0000\u0019o\u0001"+
		"\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000"+
		"\u0000\u001f \u0005 \u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005"+
		"c\u0000\u0000\"#\u0005o\u0000\u0000#$\u0005l\u0000\u0000$%\u0005e\u0000"+
		"\u0000%&\u0005t\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005d\u0000\u0000"+
		"(<\u0005o\u0000\u0000)*\u0005d\u0000\u0000*+\u0005o\u0000\u0000+,\u0005"+
		"l\u0000\u0000,-\u0005a\u0000\u0000-<\u0005r\u0000\u0000./\u0005d\u0000"+
		"\u0000/0\u0005i\u0000\u000001\u0005s\u0000\u000012\u0005t\u0000\u0000"+
		"23\u0005a\u0000\u000034\u0005n\u0000\u000045\u0005c\u0000\u000056\u0005"+
		"i\u0000\u00006<\u0005a\u0000\u000078\u0005j\u0000\u000089\u0005u\u0000"+
		"\u00009:\u0005i\u0000\u0000:<\u0005z\u0000\u0000;!\u0001\u0000\u0000\u0000"+
		";)\u0001\u0000\u0000\u0000;.\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000"+
		"\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005<\u0000\u0000>?\u0005-\u0000"+
		"\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005(\u0000\u0000A\b\u0001\u0000"+
		"\u0000\u0000BC\u0005)\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0007\u0000"+
		"\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005>\u0000\u0000GN\u0005<"+
		"\u0000\u0000HI\u0005<\u0000\u0000IN\u0005>\u0000\u0000JN\u0007\u0001\u0000"+
		"\u0000KL\u0005=\u0000\u0000LN\u0005?\u0000\u0000MF\u0001\u0000\u0000\u0000"+
		"MH\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000N\u000e\u0001\u0000\u0000\u0000OP\u0005:\u0000\u0000PQ\u0005:\u0000"+
		"\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005a\u0000\u0000ST\u0005a\u0000"+
		"\u0000TU\u0005h\u0000\u0000U\u0012\u0001\u0000\u0000\u0000VW\u0005c\u0000"+
		"\u0000WX\u0005o\u0000\u0000XY\u0005l\u0000\u0000YZ\u0005e\u0000\u0000"+
		"Z[\u0005c\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005o\u0000\u0000]\u0014"+
		"\u0001\u0000\u0000\u0000^_\u0005q\u0000\u0000_`\u0005u\u0000\u0000`a\u0005"+
		"a\u0000\u0000ab\u0005n\u0000\u0000bc\u0005d\u0000\u0000cd\u0005o\u0000"+
		"\u0000de\u0005?\u0000\u0000e\u0016\u0001\u0000\u0000\u0000fk\u0003\u001b"+
		"\r\u0000gj\u0003\u001d\u000e\u0000hj\u0003\u001b\r\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0018\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000np\u0003\u001d\u000e\u0000on\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000ry\u0001\u0000\u0000\u0000su\u0005,\u0000\u0000tv\u0003"+
		"\u001d\u000e\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000ys\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u001a\u0001"+
		"\u0000\u0000\u0000{|\u0007\u0002\u0000\u0000|\u001c\u0001\u0000\u0000"+
		"\u0000}~\u0007\u0003\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\b\u0000"+
		";Mikqwy\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}