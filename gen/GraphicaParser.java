// Generated from D:/Universidad/Lenguajes/IntroANTLR/LDP_ProyectoFinal/grammar/GraphicaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GraphicaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Graphica=1, Begin=2, Graph=3, Circle=4, Rectangle=5, Square=6, Line=7, 
		Draw=8, L_Paren=9, R_Paren=10, L_Curly=11, R_Curly=12, Comma=13, Period=14, 
		Semicolon=15, NL=16, WS=17, COMMENT=18, LINE_COMMENT=19, Integer=20;
	public static final int
		RULE_sourceFile = 0, RULE_canva = 1, RULE_sentences = 2, RULE_sentence = 3, 
		RULE_drawCircle = 4, RULE_drawSquare = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "canva", "sentences", "sentence", "drawCircle", "drawSquare"
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

	@Override
	public String getGrammarFileName() { return "GraphicaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceFileContext extends ParserRuleContext {
		public TerminalNode Graphica() { return getToken(GraphicaParser.Graphica, 0); }
		public TerminalNode Begin() { return getToken(GraphicaParser.Begin, 0); }
		public TerminalNode Period() { return getToken(GraphicaParser.Period, 0); }
		public TerminalNode Graph() { return getToken(GraphicaParser.Graph, 0); }
		public CanvaContext canva() {
			return getRuleContext(CanvaContext.class,0);
		}
		public TerminalNode L_Curly() { return getToken(GraphicaParser.L_Curly, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode R_Curly() { return getToken(GraphicaParser.R_Curly, 0); }
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Graphica);
			setState(13);
			match(Begin);
			setState(14);
			match(Period);
			setState(15);
			match(Graph);
			setState(16);
			canva();
			setState(17);
			match(L_Curly);
			setState(18);
			sentences();
			setState(19);
			match(R_Curly);
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
	public static class CanvaContext extends ParserRuleContext {
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public TerminalNode Comma() { return getToken(GraphicaParser.Comma, 0); }
		public CanvaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canva; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitCanva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvaContext canva() throws RecognitionException {
		CanvaContext _localctx = new CanvaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_canva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(L_Paren);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer) {
				{
				setState(22);
				match(Integer);
				setState(23);
				match(Comma);
				setState(24);
				match(Integer);
				}
			}

			setState(27);
			match(R_Paren);
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
	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitSentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Draw) {
				{
				{
				setState(29);
				sentence();
				}
				}
				setState(34);
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
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode Draw() { return getToken(GraphicaParser.Draw, 0); }
		public TerminalNode Period() { return getToken(GraphicaParser.Period, 0); }
		public List<DrawCircleContext> drawCircle() {
			return getRuleContexts(DrawCircleContext.class);
		}
		public DrawCircleContext drawCircle(int i) {
			return getRuleContext(DrawCircleContext.class,i);
		}
		public List<DrawSquareContext> drawSquare() {
			return getRuleContexts(DrawSquareContext.class);
		}
		public DrawSquareContext drawSquare(int i) {
			return getRuleContext(DrawSquareContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(GraphicaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(GraphicaParser.NL, i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(Draw);
			setState(36);
			match(Period);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Circle || _la==Square) {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Circle:
					{
					setState(37);
					drawCircle();
					}
					break;
				case Square:
					{
					setState(38);
					drawSquare();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(44);
				match(NL);
				}
				}
				setState(49);
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
	public static class DrawCircleContext extends ParserRuleContext {
		public TerminalNode Circle() { return getToken(GraphicaParser.Circle, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public DrawCircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawCircle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawCircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawCircleContext drawCircle() throws RecognitionException {
		DrawCircleContext _localctx = new DrawCircleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_drawCircle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Circle);
			setState(51);
			match(L_Paren);
			{
			setState(52);
			match(Integer);
			setState(53);
			match(Comma);
			setState(54);
			match(Integer);
			setState(55);
			match(Comma);
			setState(56);
			match(Integer);
			}
			setState(58);
			match(R_Paren);
			setState(59);
			match(Semicolon);
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
	public static class DrawSquareContext extends ParserRuleContext {
		public TerminalNode Square() { return getToken(GraphicaParser.Square, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public DrawSquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawSquare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawSquareContext drawSquare() throws RecognitionException {
		DrawSquareContext _localctx = new DrawSquareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_drawSquare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Square);
			setState(62);
			match(L_Paren);
			{
			setState(63);
			match(Integer);
			setState(64);
			match(Comma);
			setState(65);
			match(Integer);
			setState(66);
			match(Comma);
			setState(67);
			match(Integer);
			}
			setState(69);
			match(R_Paren);
			setState(70);
			match(Semicolon);
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
		"\u0004\u0001\u0014I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0005\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003(\b\u0003"+
		"\n\u0003\f\u0003+\t\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u0003"+
		"1\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000G\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004 \u0001\u0000"+
		"\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000"+
		"\n=\u0001\u0000\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e\u0005"+
		"\u0002\u0000\u0000\u000e\u000f\u0005\u000e\u0000\u0000\u000f\u0010\u0005"+
		"\u0003\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005"+
		"\u000b\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0005"+
		"\f\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0019\u0005\t"+
		"\u0000\u0000\u0016\u0017\u0005\u0014\u0000\u0000\u0017\u0018\u0005\r\u0000"+
		"\u0000\u0018\u001a\u0005\u0014\u0000\u0000\u0019\u0016\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005\n\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000#$\u0005\b\u0000\u0000$)\u0005\u000e\u0000\u0000%(\u0003\b\u0004"+
		"\u0000&(\u0003\n\u0005\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*/\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",.\u0005\u0010\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0007\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u0000"+
		"34\u0005\t\u0000\u000045\u0005\u0014\u0000\u000056\u0005\r\u0000\u0000"+
		"67\u0005\u0014\u0000\u000078\u0005\r\u0000\u000089\u0005\u0014\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000;<\u0005\u000f\u0000\u0000"+
		"<\t\u0001\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000>?\u0005\t\u0000"+
		"\u0000?@\u0005\u0014\u0000\u0000@A\u0005\r\u0000\u0000AB\u0005\u0014\u0000"+
		"\u0000BC\u0005\r\u0000\u0000CD\u0005\u0014\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0005\n\u0000\u0000FG\u0005\u000f\u0000\u0000G\u000b\u0001\u0000"+
		"\u0000\u0000\u0005\u0019 \')/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}