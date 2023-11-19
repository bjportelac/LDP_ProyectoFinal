// Generated from D:/Universidad/Lenguajes/IntroANTLR/LDP_ProyectoFinal/grammar/GraphicaLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GraphicaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Graphica=1, Begin=2, Graph=3, Circle=4, Rectangle=5, Square=6, Line=7, 
		Draw=8, L_Paren=9, R_Paren=10, L_Curly=11, R_Curly=12, Comma=13, Period=14, 
		Semicolon=15, NL=16, WS=17, COMMENT=18, LINE_COMMENT=19, Integer=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Graphica", "Begin", "Graph", "Circle", "Rectangle", "Square", "Line", 
			"Draw", "L_Paren", "R_Paren", "L_Curly", "R_Curly", "Comma", "Period", 
			"Semicolon", "NL", "WS", "COMMENT", "LINE_COMMENT", "Digit", "Integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Graphica'", "'begin'", "'graph'", "'circle'", "'rectangle'", 
			"'square'", "'line'", "'draw'", "'('", "')'", "'{'", "'}'", "','", "'.'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Graphica", "Begin", "Graph", "Circle", "Rectangle", "Square", 
			"Line", "Draw", "L_Paren", "R_Paren", "L_Curly", "R_Curly", "Comma", 
			"Period", "Semicolon", "NL", "WS", "COMMENT", "LINE_COMMENT", "Integer"
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


	public GraphicaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphicaLexer.g4"; }

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
		"\u0004\u0000\u0014\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000fr\b\u000f\u000b\u000f\f\u000fs\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010y\b\u0010\u000b\u0010\f\u0010z\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0083"+
		"\b\u0011\n\u0011\f\u0011\u0086\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0091\b\u0012\n\u0012\f\u0012\u0094\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u009b\b\u0014\u000b"+
		"\u0014\f\u0014\u009c\u0001\u0084\u0000\u0015\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0000)\u0014\u0001\u0000\u0003\u0002\u0000\n\n\r\r\u0002"+
		"\u0000\t\t  \u0001\u000009\u00a1\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001"+
		"+\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u0005:\u0001"+
		"\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000"+
		"\u0000\u000bQ\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000\u000f"+
		"]\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013d\u0001"+
		"\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000"+
		"\u0000\u0019j\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001d"+
		"n\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000!x\u0001\u0000"+
		"\u0000\u0000#~\u0001\u0000\u0000\u0000%\u008c\u0001\u0000\u0000\u0000"+
		"\'\u0097\u0001\u0000\u0000\u0000)\u009a\u0001\u0000\u0000\u0000+,\u0005"+
		"G\u0000\u0000,-\u0005r\u0000\u0000-.\u0005a\u0000\u0000./\u0005p\u0000"+
		"\u0000/0\u0005h\u0000\u000001\u0005i\u0000\u000012\u0005c\u0000\u0000"+
		"23\u0005a\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005b\u0000\u0000"+
		"56\u0005e\u0000\u000067\u0005g\u0000\u000078\u0005i\u0000\u000089\u0005"+
		"n\u0000\u00009\u0004\u0001\u0000\u0000\u0000:;\u0005g\u0000\u0000;<\u0005"+
		"r\u0000\u0000<=\u0005a\u0000\u0000=>\u0005p\u0000\u0000>?\u0005h\u0000"+
		"\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005c\u0000\u0000AB\u0005i\u0000"+
		"\u0000BC\u0005r\u0000\u0000CD\u0005c\u0000\u0000DE\u0005l\u0000\u0000"+
		"EF\u0005e\u0000\u0000F\b\u0001\u0000\u0000\u0000GH\u0005r\u0000\u0000"+
		"HI\u0005e\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005t\u0000\u0000KL\u0005"+
		"a\u0000\u0000LM\u0005n\u0000\u0000MN\u0005g\u0000\u0000NO\u0005l\u0000"+
		"\u0000OP\u0005e\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005s\u0000"+
		"\u0000RS\u0005q\u0000\u0000ST\u0005u\u0000\u0000TU\u0005a\u0000\u0000"+
		"UV\u0005r\u0000\u0000VW\u0005e\u0000\u0000W\f\u0001\u0000\u0000\u0000"+
		"XY\u0005l\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005d\u0000\u0000^_\u0005"+
		"r\u0000\u0000_`\u0005a\u0000\u0000`a\u0005w\u0000\u0000a\u0010\u0001\u0000"+
		"\u0000\u0000bc\u0005(\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005"+
		")\u0000\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005{\u0000\u0000g\u0016"+
		"\u0001\u0000\u0000\u0000hi\u0005}\u0000\u0000i\u0018\u0001\u0000\u0000"+
		"\u0000jk\u0005,\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005.\u0000"+
		"\u0000m\u001c\u0001\u0000\u0000\u0000no\u0005;\u0000\u0000o\u001e\u0001"+
		"\u0000\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u000f\u0000\u0000v \u0001\u0000"+
		"\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0006\u0010\u0000\u0000}\"\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005/\u0000\u0000\u007f\u0080\u0005*\u0000\u0000\u0080"+
		"\u0084\u0001\u0000\u0000\u0000\u0081\u0083\t\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005*\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0006\u0011\u0000\u0000\u008b$\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u008e\u0005/\u0000\u0000\u008e"+
		"\u0092\u0001\u0000\u0000\u0000\u008f\u0091\b\u0000\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0006\u0012\u0000\u0000\u0096&\u0001\u0000\u0000\u0000\u0097\u0098\u0007"+
		"\u0002\u0000\u0000\u0098(\u0001\u0000\u0000\u0000\u0099\u009b\u0003\'"+
		"\u0013\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d*\u0001\u0000\u0000\u0000\u0006\u0000sz\u0084\u0092"+
		"\u009c\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}