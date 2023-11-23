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
		From=1, Import=2, Graphica=3, New=4, Basic=5, Objects=6, Begin=7, Graph=8, 
		Coordinates=9, Obj_Circle=10, Fill=11, RGB=12, Stroke=13, FillType=14, 
		IStyle=15, Circle=16, Rectangle=17, Square=18, Ellipse=19, Line=20, Polyline=21, 
		Draw=22, L_Paren=23, R_Paren=24, L_Curly=25, R_Curly=26, Comma=27, Period=28, 
		Semicolon=29, Assign=30, Quote=31, NL=32, WS=33, COMMENT=34, LINE_COMMENT=35, 
		Integer=36, Double=37, ID=38;
	public static final int
		RULE_sourceFile = 0, RULE_importStatements = 1, RULE_libraries = 2, RULE_lib = 3, 
		RULE_initialize = 4, RULE_canvas = 5, RULE_point = 6, RULE_sentences = 7, 
		RULE_sentence = 8, RULE_basicFigures = 9, RULE_drawCircle = 10, RULE_drawSquare = 11, 
		RULE_drawEllipse = 12, RULE_drawRect = 13, RULE_drawLine = 14, RULE_drawPolyline = 15, 
		RULE_coordinate = 16, RULE_objectsLibElem = 17, RULE_rgbColor = 18, RULE_fill = 19, 
		RULE_stroke = 20, RULE_istyle = 21, RULE_shape = 22, RULE_circle = 23, 
		RULE_objsectsLibFunctions = 24, RULE_dotDraw = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importStatements", "libraries", "lib", "initialize", "canvas", 
			"point", "sentences", "sentence", "basicFigures", "drawCircle", "drawSquare", 
			"drawEllipse", "drawRect", "drawLine", "drawPolyline", "coordinate", 
			"objectsLibElem", "rgbColor", "fill", "stroke", "istyle", "shape", "circle", 
			"objsectsLibFunctions", "dotDraw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'Graphica'", "'new'", "'Basic'", "'Objects'", 
			"'begin'", "'graph'", "'Coordinate'", "'Circle'", "'Fill'", "'RGB'", 
			"'Stroke'", null, "'IStyle'", "'circle'", "'rectangle'", "'square'", 
			"'ellipse'", "'line'", "'polyline'", "'draw'", "'('", "')'", "'{'", "'}'", 
			"','", "'.'", "';'", "'='", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "From", "Import", "Graphica", "New", "Basic", "Objects", "Begin", 
			"Graph", "Coordinates", "Obj_Circle", "Fill", "RGB", "Stroke", "FillType", 
			"IStyle", "Circle", "Rectangle", "Square", "Ellipse", "Line", "Polyline", 
			"Draw", "L_Paren", "R_Paren", "L_Curly", "R_Curly", "Comma", "Period", 
			"Semicolon", "Assign", "Quote", "NL", "WS", "COMMENT", "LINE_COMMENT", 
			"Integer", "Double", "ID"
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
		public InitializeContext initialize() {
			return getRuleContext(InitializeContext.class,0);
		}
		public List<ImportStatementsContext> importStatements() {
			return getRuleContexts(ImportStatementsContext.class);
		}
		public ImportStatementsContext importStatements(int i) {
			return getRuleContext(ImportStatementsContext.class,i);
		}
		public List<CoordinateContext> coordinate() {
			return getRuleContexts(CoordinateContext.class);
		}
		public CoordinateContext coordinate(int i) {
			return getRuleContext(CoordinateContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				importStatements();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==From );
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Coordinates) {
				{
				{
				setState(57);
				coordinate();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			initialize();
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
	public static class ImportStatementsContext extends ParserRuleContext {
		public TerminalNode From() { return getToken(GraphicaParser.From, 0); }
		public TerminalNode Graphica() { return getToken(GraphicaParser.Graphica, 0); }
		public TerminalNode Import() { return getToken(GraphicaParser.Import, 0); }
		public TerminalNode L_Curly() { return getToken(GraphicaParser.L_Curly, 0); }
		public LibrariesContext libraries() {
			return getRuleContext(LibrariesContext.class,0);
		}
		public TerminalNode R_Curly() { return getToken(GraphicaParser.R_Curly, 0); }
		public ImportStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitImportStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementsContext importStatements() throws RecognitionException {
		ImportStatementsContext _localctx = new ImportStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(From);
			setState(66);
			match(Graphica);
			setState(67);
			match(Import);
			setState(68);
			match(L_Curly);
			setState(69);
			libraries();
			setState(70);
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
	public static class LibrariesContext extends ParserRuleContext {
		public List<LibContext> lib() {
			return getRuleContexts(LibContext.class);
		}
		public LibContext lib(int i) {
			return getRuleContext(LibContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public LibrariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraries; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitLibraries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibrariesContext libraries() throws RecognitionException {
		LibrariesContext _localctx = new LibrariesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_libraries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			lib();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(73);
				match(Comma);
				setState(74);
				lib();
				}
				}
				setState(79);
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
	public static class LibContext extends ParserRuleContext {
		public TerminalNode Basic() { return getToken(GraphicaParser.Basic, 0); }
		public TerminalNode Objects() { return getToken(GraphicaParser.Objects, 0); }
		public LibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lib; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitLib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibContext lib() throws RecognitionException {
		LibContext _localctx = new LibContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lib);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Basic:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Basic);
				}
				break;
			case Objects:
			case R_Curly:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Objects) {
					{
					setState(81);
					match(Objects);
					}
				}

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
	public static class InitializeContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(GraphicaParser.Begin, 0); }
		public TerminalNode Period() { return getToken(GraphicaParser.Period, 0); }
		public TerminalNode Graph() { return getToken(GraphicaParser.Graph, 0); }
		public CanvasContext canvas() {
			return getRuleContext(CanvasContext.class,0);
		}
		public TerminalNode L_Curly() { return getToken(GraphicaParser.L_Curly, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode R_Curly() { return getToken(GraphicaParser.R_Curly, 0); }
		public InitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializeContext initialize() throws RecognitionException {
		InitializeContext _localctx = new InitializeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Begin);
			setState(87);
			match(Period);
			setState(88);
			match(Graph);
			setState(89);
			canvas();
			setState(90);
			match(L_Curly);
			setState(91);
			sentences();
			setState(92);
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
	public static class CanvasContext extends ParserRuleContext {
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public TerminalNode Comma() { return getToken(GraphicaParser.Comma, 0); }
		public CanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CanvasContext canvas() throws RecognitionException {
		CanvasContext _localctx = new CanvasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_canvas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(L_Paren);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer) {
				{
				setState(95);
				match(Integer);
				setState(96);
				match(Comma);
				setState(97);
				match(Integer);
				}
			}

			setState(100);
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
	public static class PointContext extends ParserRuleContext {
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public TerminalNode Comma() { return getToken(GraphicaParser.Comma, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(L_Paren);
			setState(103);
			match(Integer);
			setState(104);
			match(Comma);
			setState(105);
			match(Integer);
			setState(106);
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
		public List<ObjectsLibElemContext> objectsLibElem() {
			return getRuleContexts(ObjectsLibElemContext.class);
		}
		public ObjectsLibElemContext objectsLibElem(int i) {
			return getRuleContext(ObjectsLibElemContext.class,i);
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
		enterRule(_localctx, 14, RULE_sentences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Draw) {
				{
				{
				setState(108);
				sentence();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877955072L) != 0)) {
				{
				{
				setState(114);
				objectsLibElem();
				}
				}
				setState(119);
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
		public List<BasicFiguresContext> basicFigures() {
			return getRuleContexts(BasicFiguresContext.class);
		}
		public BasicFiguresContext basicFigures(int i) {
			return getRuleContext(BasicFiguresContext.class,i);
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
		enterRule(_localctx, 16, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Draw);
			setState(121);
			match(Period);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				basicFigures();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0) );
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
	public static class BasicFiguresContext extends ParserRuleContext {
		public DrawSquareContext drawSquare() {
			return getRuleContext(DrawSquareContext.class,0);
		}
		public DrawCircleContext drawCircle() {
			return getRuleContext(DrawCircleContext.class,0);
		}
		public DrawEllipseContext drawEllipse() {
			return getRuleContext(DrawEllipseContext.class,0);
		}
		public DrawRectContext drawRect() {
			return getRuleContext(DrawRectContext.class,0);
		}
		public DrawLineContext drawLine() {
			return getRuleContext(DrawLineContext.class,0);
		}
		public DrawPolylineContext drawPolyline() {
			return getRuleContext(DrawPolylineContext.class,0);
		}
		public BasicFiguresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFigures; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitBasicFigures(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicFiguresContext basicFigures() throws RecognitionException {
		BasicFiguresContext _localctx = new BasicFiguresContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicFigures);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Square:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				drawSquare();
				}
				break;
			case Circle:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				drawCircle();
				}
				break;
			case Ellipse:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				drawEllipse();
				}
				break;
			case Rectangle:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				drawRect();
				}
				break;
			case Line:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				drawLine();
				}
				break;
			case Polyline:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				drawPolyline();
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
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
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
		enterRule(_localctx, 20, RULE_drawCircle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(Circle);
			setState(136);
			match(L_Paren);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(137);
				match(Integer);
				setState(138);
				match(Comma);
				setState(139);
				match(Integer);
				setState(140);
				match(Comma);
				setState(141);
				match(Integer);
				}
				}
				break;
			case ID:
				{
				{
				setState(142);
				match(ID);
				setState(143);
				match(Comma);
				setState(144);
				match(Integer);
				}
				}
				break;
			case L_Paren:
				{
				{
				setState(145);
				point();
				setState(146);
				match(Comma);
				setState(147);
				match(Integer);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(151);
			match(R_Paren);
			setState(152);
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
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
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
		enterRule(_localctx, 22, RULE_drawSquare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(Square);
			setState(155);
			match(L_Paren);
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(156);
				match(Integer);
				setState(157);
				match(Comma);
				setState(158);
				match(Integer);
				setState(159);
				match(Comma);
				setState(160);
				match(Integer);
				}
				}
				break;
			case ID:
				{
				{
				setState(161);
				match(ID);
				setState(162);
				match(Comma);
				setState(163);
				match(Integer);
				}
				}
				break;
			case L_Paren:
				{
				{
				setState(164);
				point();
				setState(165);
				match(Comma);
				setState(166);
				match(Integer);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(170);
			match(R_Paren);
			setState(171);
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
	public static class DrawEllipseContext extends ParserRuleContext {
		public TerminalNode Ellipse() { return getToken(GraphicaParser.Ellipse, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public DrawEllipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawEllipse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawEllipse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawEllipseContext drawEllipse() throws RecognitionException {
		DrawEllipseContext _localctx = new DrawEllipseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drawEllipse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Ellipse);
			setState(174);
			match(L_Paren);
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				setState(175);
				match(Integer);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(Comma);
					setState(177);
					match(Integer);
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				break;
			case L_Paren:
				{
				{
				setState(182);
				point();
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					match(Comma);
					setState(184);
					match(Integer);
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case ID:
				{
				{
				setState(189);
				match(ID);
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					match(Comma);
					setState(191);
					match(Integer);
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			match(R_Paren);
			setState(199);
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
	public static class DrawRectContext extends ParserRuleContext {
		public TerminalNode Rectangle() { return getToken(GraphicaParser.Rectangle, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public DrawRectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawRect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawRect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawRectContext drawRect() throws RecognitionException {
		DrawRectContext _localctx = new DrawRectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drawRect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Rectangle);
			setState(202);
			match(L_Paren);
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(203);
				match(Integer);
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					match(Comma);
					setState(205);
					match(Integer);
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case ID:
				{
				setState(210);
				match(ID);
				setState(211);
				match(Comma);
				{
				setState(212);
				match(Integer);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					match(Comma);
					setState(214);
					match(Integer);
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case L_Paren:
				{
				setState(219);
				point();
				setState(220);
				match(Comma);
				{
				setState(221);
				match(Integer);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					match(Comma);
					setState(223);
					match(Integer);
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			match(R_Paren);
			setState(231);
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
	public static class DrawLineContext extends ParserRuleContext {
		public TerminalNode Line() { return getToken(GraphicaParser.Line, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public List<TerminalNode> ID() { return getTokens(GraphicaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphicaParser.ID, i);
		}
		public DrawLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawLineContext drawLine() throws RecognitionException {
		DrawLineContext _localctx = new DrawLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_drawLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Line);
			setState(234);
			match(L_Paren);
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(235);
				match(Integer);
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					match(Comma);
					setState(237);
					match(Integer);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 2:
				{
				{
				setState(242);
				point();
				setState(243);
				match(Comma);
				{
				setState(244);
				match(Integer);
				setState(245);
				match(Comma);
				setState(246);
				match(Integer);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(248);
				point();
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(249);
					match(Comma);
					setState(250);
					point();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 4:
				{
				{
				setState(255);
				match(ID);
				setState(258); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					match(Comma);
					setState(257);
					match(ID);
					}
					}
					setState(260); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 5:
				{
				{
				setState(262);
				match(ID);
				setState(263);
				match(Comma);
				{
				setState(264);
				match(Integer);
				setState(265);
				match(Comma);
				setState(266);
				match(Integer);
				}
				}
				}
				break;
			}
			setState(269);
			match(R_Paren);
			setState(270);
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
	public static class DrawPolylineContext extends ParserRuleContext {
		public TerminalNode Polyline() { return getToken(GraphicaParser.Polyline, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public DrawPolylineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawPolyline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDrawPolyline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawPolylineContext drawPolyline() throws RecognitionException {
		DrawPolylineContext _localctx = new DrawPolylineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_drawPolyline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Polyline);
			setState(273);
			match(L_Paren);
			{
			setState(274);
			point();
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(275);
				match(Comma);
				setState(276);
				point();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
			setState(281);
			match(R_Paren);
			setState(282);
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
	public static class CoordinateContext extends ParserRuleContext {
		public List<TerminalNode> Coordinates() { return getTokens(GraphicaParser.Coordinates); }
		public TerminalNode Coordinates(int i) {
			return getToken(GraphicaParser.Coordinates, i);
		}
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public TerminalNode Comma() { return getToken(GraphicaParser.Comma, 0); }
		public CoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateContext coordinate() throws RecognitionException {
		CoordinateContext _localctx = new CoordinateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_coordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Coordinates);
			setState(285);
			match(ID);
			setState(286);
			match(Assign);
			setState(287);
			match(New);
			setState(288);
			match(Coordinates);
			setState(289);
			match(L_Paren);
			{
			setState(290);
			match(Integer);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(291);
				match(Comma);
				setState(292);
				match(Integer);
				}
			}

			}
			setState(295);
			match(R_Paren);
			setState(296);
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
	public static class ObjectsLibElemContext extends ParserRuleContext {
		public RgbColorContext rgbColor() {
			return getRuleContext(RgbColorContext.class,0);
		}
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public StrokeContext stroke() {
			return getRuleContext(StrokeContext.class,0);
		}
		public IstyleContext istyle() {
			return getRuleContext(IstyleContext.class,0);
		}
		public ShapeContext shape() {
			return getRuleContext(ShapeContext.class,0);
		}
		public ObjsectsLibFunctionsContext objsectsLibFunctions() {
			return getRuleContext(ObjsectsLibFunctionsContext.class,0);
		}
		public ObjectsLibElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectsLibElem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitObjectsLibElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsLibElemContext objectsLibElem() throws RecognitionException {
		ObjectsLibElemContext _localctx = new ObjectsLibElemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectsLibElem);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RGB:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				rgbColor();
				}
				break;
			case Fill:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				fill();
				}
				break;
			case Stroke:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				stroke();
				}
				break;
			case IStyle:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				istyle();
				}
				break;
			case Obj_Circle:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				shape();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				objsectsLibFunctions();
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
	public static class RgbColorContext extends ParserRuleContext {
		public List<TerminalNode> RGB() { return getTokens(GraphicaParser.RGB); }
		public TerminalNode RGB(int i) {
			return getToken(GraphicaParser.RGB, i);
		}
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
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
		public RgbColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgbColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitRgbColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbColorContext rgbColor() throws RecognitionException {
		RgbColorContext _localctx = new RgbColorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rgbColor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(RGB);
			setState(307);
			match(ID);
			setState(308);
			match(Assign);
			setState(309);
			match(New);
			setState(310);
			match(RGB);
			setState(311);
			match(L_Paren);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer) {
				{
				setState(312);
				match(Integer);
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313);
					match(Comma);
					setState(314);
					match(Integer);
					}
					}
					setState(317); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
			}

			}
			setState(321);
			match(R_Paren);
			setState(322);
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
	public static class FillContext extends ParserRuleContext {
		public List<TerminalNode> Fill() { return getTokens(GraphicaParser.Fill); }
		public TerminalNode Fill(int i) {
			return getToken(GraphicaParser.Fill, i);
		}
		public List<TerminalNode> ID() { return getTokens(GraphicaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphicaParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
		public List<TerminalNode> L_Paren() { return getTokens(GraphicaParser.L_Paren); }
		public TerminalNode L_Paren(int i) {
			return getToken(GraphicaParser.L_Paren, i);
		}
		public List<TerminalNode> R_Paren() { return getTokens(GraphicaParser.R_Paren); }
		public TerminalNode R_Paren(int i) {
			return getToken(GraphicaParser.R_Paren, i);
		}
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public TerminalNode Double() { return getToken(GraphicaParser.Double, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(Fill);
			setState(325);
			match(ID);
			setState(326);
			match(Assign);
			setState(327);
			match(New);
			setState(328);
			match(Fill);
			setState(329);
			match(L_Paren);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_Paren || _la==ID) {
				{
				setState(340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_Paren:
					{
					{
					setState(330);
					match(L_Paren);
					{
					setState(331);
					match(Integer);
					setState(334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(332);
						match(Comma);
						setState(333);
						match(Integer);
						}
						}
						setState(336); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					}
					setState(338);
					match(R_Paren);
					}
					}
					break;
				case ID:
					{
					setState(339);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				match(Comma);
				setState(343);
				match(Double);
				}
			}

			}
			setState(346);
			match(R_Paren);
			setState(347);
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
	public static class StrokeContext extends ParserRuleContext {
		public List<TerminalNode> Stroke() { return getTokens(GraphicaParser.Stroke); }
		public TerminalNode Stroke(int i) {
			return getToken(GraphicaParser.Stroke, i);
		}
		public List<TerminalNode> ID() { return getTokens(GraphicaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphicaParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
		public List<TerminalNode> L_Paren() { return getTokens(GraphicaParser.L_Paren); }
		public TerminalNode L_Paren(int i) {
			return getToken(GraphicaParser.L_Paren, i);
		}
		public List<TerminalNode> R_Paren() { return getTokens(GraphicaParser.R_Paren); }
		public TerminalNode R_Paren(int i) {
			return getToken(GraphicaParser.R_Paren, i);
		}
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public List<TerminalNode> Double() { return getTokens(GraphicaParser.Double); }
		public TerminalNode Double(int i) {
			return getToken(GraphicaParser.Double, i);
		}
		public List<TerminalNode> Quote() { return getTokens(GraphicaParser.Quote); }
		public TerminalNode Quote(int i) {
			return getToken(GraphicaParser.Quote, i);
		}
		public TerminalNode FillType() { return getToken(GraphicaParser.FillType, 0); }
		public List<TerminalNode> Integer() { return getTokens(GraphicaParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(GraphicaParser.Integer, i);
		}
		public StrokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stroke; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitStroke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrokeContext stroke() throws RecognitionException {
		StrokeContext _localctx = new StrokeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stroke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(Stroke);
			setState(350);
			match(ID);
			setState(351);
			match(Assign);
			setState(352);
			match(New);
			setState(353);
			match(Stroke);
			setState(354);
			match(L_Paren);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_Paren || _la==ID) {
				{
				setState(365);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_Paren:
					{
					{
					setState(355);
					match(L_Paren);
					{
					setState(356);
					match(Integer);
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(357);
						match(Comma);
						setState(358);
						match(Integer);
						}
						}
						setState(361); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					}
					setState(363);
					match(R_Paren);
					}
					}
					break;
				case ID:
					{
					setState(364);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(367);
				match(Comma);
				setState(368);
				match(Double);
				setState(369);
				match(Comma);
				setState(370);
				match(Double);
				setState(371);
				match(Comma);
				{
				setState(372);
				match(Quote);
				setState(373);
				match(FillType);
				setState(374);
				match(Quote);
				}
				}
			}

			}
			setState(377);
			match(R_Paren);
			setState(378);
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
	public static class IstyleContext extends ParserRuleContext {
		public List<TerminalNode> IStyle() { return getTokens(GraphicaParser.IStyle); }
		public TerminalNode IStyle(int i) {
			return getToken(GraphicaParser.IStyle, i);
		}
		public List<TerminalNode> ID() { return getTokens(GraphicaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphicaParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
		public TerminalNode L_Paren() { return getToken(GraphicaParser.L_Paren, 0); }
		public TerminalNode R_Paren() { return getToken(GraphicaParser.R_Paren, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(GraphicaParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(GraphicaParser.Comma, i);
		}
		public TerminalNode Double() { return getToken(GraphicaParser.Double, 0); }
		public IstyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istyle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitIstyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IstyleContext istyle() throws RecognitionException {
		IstyleContext _localctx = new IstyleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_istyle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IStyle);
			setState(381);
			match(ID);
			setState(382);
			match(Assign);
			setState(383);
			match(New);
			setState(384);
			match(IStyle);
			setState(385);
			match(L_Paren);
			{
			setState(386);
			match(ID);
			setState(387);
			match(Comma);
			setState(388);
			match(ID);
			setState(389);
			match(Comma);
			setState(390);
			match(Double);
			}
			setState(392);
			match(R_Paren);
			setState(393);
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
	public static class ShapeContext extends ParserRuleContext {
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public ShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeContext shape() throws RecognitionException {
		ShapeContext _localctx = new ShapeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			circle();
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
	public static class CircleContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Circle() { return getTokens(GraphicaParser.Obj_Circle); }
		public TerminalNode Obj_Circle(int i) {
			return getToken(GraphicaParser.Obj_Circle, i);
		}
		public List<TerminalNode> ID() { return getTokens(GraphicaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GraphicaParser.ID, i);
		}
		public TerminalNode Assign() { return getToken(GraphicaParser.Assign, 0); }
		public TerminalNode New() { return getToken(GraphicaParser.New, 0); }
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
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_circle);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(Obj_Circle);
			setState(398);
			match(ID);
			setState(399);
			match(Assign);
			setState(400);
			match(New);
			setState(401);
			match(Obj_Circle);
			setState(402);
			match(L_Paren);
			{
			setState(403);
			match(Integer);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(Comma);
					setState(405);
					match(Integer);
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(411);
			match(Comma);
			setState(412);
			match(ID);
			}
			setState(414);
			match(R_Paren);
			setState(415);
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
	public static class ObjsectsLibFunctionsContext extends ParserRuleContext {
		public DotDrawContext dotDraw() {
			return getRuleContext(DotDrawContext.class,0);
		}
		public ObjsectsLibFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objsectsLibFunctions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitObjsectsLibFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjsectsLibFunctionsContext objsectsLibFunctions() throws RecognitionException {
		ObjsectsLibFunctionsContext _localctx = new ObjsectsLibFunctionsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_objsectsLibFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			dotDraw();
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
	public static class DotDrawContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphicaParser.ID, 0); }
		public TerminalNode Period() { return getToken(GraphicaParser.Period, 0); }
		public TerminalNode Draw() { return getToken(GraphicaParser.Draw, 0); }
		public TerminalNode Semicolon() { return getToken(GraphicaParser.Semicolon, 0); }
		public DotDrawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotDraw; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitDotDraw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotDrawContext dotDraw() throws RecognitionException {
		DotDrawContext _localctx = new DotDrawContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dotDraw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ID);
			setState(420);
			match(Period);
			setState(421);
			match(Draw);
			setState(422);
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
		"\u0004\u0001&\u01a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003S\b\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0005\u0007n\b\u0007\n\u0007\f\u0007q\t\u0007"+
		"\u0001\u0007\u0005\u0007t\b\u0007\n\u0007\f\u0007w\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0004\b|\b\b\u000b\b\f\b}\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0086\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0096\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u00b3\b\f\u000b\f\f\f\u00b4\u0001\f\u0001\f"+
		"\u0001\f\u0004\f\u00ba\b\f\u000b\f\f\f\u00bb\u0001\f\u0001\f\u0001\f\u0004"+
		"\f\u00c1\b\f\u000b\f\f\f\u00c2\u0003\f\u00c5\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00cf\b\r\u000b\r\f"+
		"\r\u00d0\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00d8\b\r\u000b"+
		"\r\f\r\u00d9\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00e1\b\r"+
		"\u000b\r\f\r\u00e2\u0003\r\u00e5\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00ef\b\u000e"+
		"\u000b\u000e\f\u000e\u00f0\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00fc\b\u000e\u000b\u000e\f\u000e\u00fd\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u0103\b\u000e\u000b\u000e\f\u000e\u0104\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010c\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u0116\b\u000f\u000b\u000f\f\u000f"+
		"\u0117\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0126\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0131\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u013c"+
		"\b\u0012\u000b\u0012\f\u0012\u013d\u0003\u0012\u0140\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u014f\b\u0013\u000b\u0013\f\u0013\u0150\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0155\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0159"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0004\u0014\u0168\b\u0014\u000b\u0014\f\u0014\u0169"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u016e\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0178\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u0197\b\u0017\n\u0017\f\u0017\u019a\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0000"+
		"\u01c1\u00005\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004"+
		"H\u0001\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bV\u0001\u0000"+
		"\u0000\u0000\n^\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000e"+
		"o\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012\u0085\u0001"+
		"\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u009a\u0001"+
		"\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a\u00c9\u0001"+
		"\u0000\u0000\u0000\u001c\u00e9\u0001\u0000\u0000\u0000\u001e\u0110\u0001"+
		"\u0000\u0000\u0000 \u011c\u0001\u0000\u0000\u0000\"\u0130\u0001\u0000"+
		"\u0000\u0000$\u0132\u0001\u0000\u0000\u0000&\u0144\u0001\u0000\u0000\u0000"+
		"(\u015d\u0001\u0000\u0000\u0000*\u017c\u0001\u0000\u0000\u0000,\u018b"+
		"\u0001\u0000\u0000\u0000.\u018d\u0001\u0000\u0000\u00000\u01a1\u0001\u0000"+
		"\u0000\u00002\u01a3\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u0000"+
		"54\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008<\u0001\u0000\u0000\u00009;\u0003 \u0010"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?@\u0003\b\u0004\u0000@\u0001\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0001\u0000\u0000BC\u0005\u0003\u0000\u0000CD\u0005\u0002\u0000"+
		"\u0000DE\u0005\u0019\u0000\u0000EF\u0003\u0004\u0002\u0000FG\u0005\u001a"+
		"\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HM\u0003\u0006\u0003\u0000"+
		"IJ\u0005\u001b\u0000\u0000JL\u0003\u0006\u0003\u0000KI\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PU\u0005\u0005\u0000\u0000QS\u0005\u0006\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TP\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000"+
		"VW\u0005\u0007\u0000\u0000WX\u0005\u001c\u0000\u0000XY\u0005\b\u0000\u0000"+
		"YZ\u0003\n\u0005\u0000Z[\u0005\u0019\u0000\u0000[\\\u0003\u000e\u0007"+
		"\u0000\\]\u0005\u001a\u0000\u0000]\t\u0001\u0000\u0000\u0000^b\u0005\u0017"+
		"\u0000\u0000_`\u0005$\u0000\u0000`a\u0005\u001b\u0000\u0000ac\u0005$\u0000"+
		"\u0000b_\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000de\u0005\u0018\u0000\u0000e\u000b\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0017\u0000\u0000gh\u0005$\u0000\u0000hi\u0005\u001b\u0000\u0000"+
		"ij\u0005$\u0000\u0000jk\u0005\u0018\u0000\u0000k\r\u0001\u0000\u0000\u0000"+
		"ln\u0003\u0010\b\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pu\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rt\u0003\"\u0011\u0000sr\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"xy\u0005\u0016\u0000\u0000y{\u0005\u001c\u0000\u0000z|\u0003\u0012\t\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0011\u0001\u0000\u0000\u0000\u007f"+
		"\u0086\u0003\u0016\u000b\u0000\u0080\u0086\u0003\u0014\n\u0000\u0081\u0086"+
		"\u0003\u0018\f\u0000\u0082\u0086\u0003\u001a\r\u0000\u0083\u0086\u0003"+
		"\u001c\u000e\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u007f\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0013\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0095\u0005"+
		"\u0017\u0000\u0000\u0089\u008a\u0005$\u0000\u0000\u008a\u008b\u0005\u001b"+
		"\u0000\u0000\u008b\u008c\u0005$\u0000\u0000\u008c\u008d\u0005\u001b\u0000"+
		"\u0000\u008d\u0096\u0005$\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f"+
		"\u0090\u0005\u001b\u0000\u0000\u0090\u0096\u0005$\u0000\u0000\u0091\u0092"+
		"\u0003\f\u0006\u0000\u0092\u0093\u0005\u001b\u0000\u0000\u0093\u0094\u0005"+
		"$\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0089\u0001\u0000"+
		"\u0000\u0000\u0095\u008e\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0018"+
		"\u0000\u0000\u0098\u0099\u0005\u001d\u0000\u0000\u0099\u0015\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b\u00a8\u0005\u0017"+
		"\u0000\u0000\u009c\u009d\u0005$\u0000\u0000\u009d\u009e\u0005\u001b\u0000"+
		"\u0000\u009e\u009f\u0005$\u0000\u0000\u009f\u00a0\u0005\u001b\u0000\u0000"+
		"\u00a0\u00a9\u0005$\u0000\u0000\u00a1\u00a2\u0005&\u0000\u0000\u00a2\u00a3"+
		"\u0005\u001b\u0000\u0000\u00a3\u00a9\u0005$\u0000\u0000\u00a4\u00a5\u0003"+
		"\f\u0006\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6\u00a7\u0005$"+
		"\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u009c\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0018"+
		"\u0000\u0000\u00ab\u00ac\u0005\u001d\u0000\u0000\u00ac\u0017\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0013\u0000\u0000\u00ae\u00c4\u0005\u0017"+
		"\u0000\u0000\u00af\u00b2\u0005$\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000"+
		"\u0000\u00b1\u00b3\u0005$\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00c5\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b9\u0003\f\u0006\u0000\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8"+
		"\u00ba\u0005$\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc\u00c5\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0005&\u0000\u0000\u00be\u00bf\u0005\u001b\u0000\u0000\u00bf\u00c1\u0005"+
		"$\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00af\u0001\u0000"+
		"\u0000\u0000\u00c4\u00b6\u0001\u0000\u0000\u0000\u00c4\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0018"+
		"\u0000\u0000\u00c7\u00c8\u0005\u001d\u0000\u0000\u00c8\u0019\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0011\u0000\u0000\u00ca\u00e4\u0005\u0017"+
		"\u0000\u0000\u00cb\u00ce\u0005$\u0000\u0000\u00cc\u00cd\u0005\u001b\u0000"+
		"\u0000\u00cd\u00cf\u0005$\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00e5\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005&\u0000\u0000\u00d3\u00d4\u0005\u001b\u0000\u0000\u00d4"+
		"\u00d7\u0005$\u0000\u0000\u00d5\u00d6\u0005\u001b\u0000\u0000\u00d6\u00d8"+
		"\u0005$\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00e5\u0001\u0000\u0000\u0000\u00db\u00dc\u0003"+
		"\f\u0006\u0000\u00dc\u00dd\u0005\u001b\u0000\u0000\u00dd\u00e0\u0005$"+
		"\u0000\u0000\u00de\u00df\u0005\u001b\u0000\u0000\u00df\u00e1\u0005$\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00cb\u0001\u0000\u0000"+
		"\u0000\u00e4\u00d2\u0001\u0000\u0000\u0000\u00e4\u00db\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0018\u0000"+
		"\u0000\u00e7\u00e8\u0005\u001d\u0000\u0000\u00e8\u001b\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0014\u0000\u0000\u00ea\u010b\u0005\u0017\u0000"+
		"\u0000\u00eb\u00ee\u0005$\u0000\u0000\u00ec\u00ed\u0005\u001b\u0000\u0000"+
		"\u00ed\u00ef\u0005$\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u010c\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0003\f\u0006\u0000\u00f3\u00f4\u0005\u001b\u0000\u0000\u00f4\u00f5"+
		"\u0005$\u0000\u0000\u00f5\u00f6\u0005\u001b\u0000\u0000\u00f6\u00f7\u0005"+
		"$\u0000\u0000\u00f7\u010c\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003\f"+
		"\u0006\u0000\u00f9\u00fa\u0005\u001b\u0000\u0000\u00fa\u00fc\u0003\f\u0006"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u010c\u0001\u0000\u0000\u0000\u00ff\u0102\u0005&\u0000\u0000"+
		"\u0100\u0101\u0005\u001b\u0000\u0000\u0101\u0103\u0005&\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u010c\u0001\u0000\u0000\u0000\u0106\u0107\u0005&\u0000\u0000\u0107\u0108"+
		"\u0005\u001b\u0000\u0000\u0108\u0109\u0005$\u0000\u0000\u0109\u010a\u0005"+
		"\u001b\u0000\u0000\u010a\u010c\u0005$\u0000\u0000\u010b\u00eb\u0001\u0000"+
		"\u0000\u0000\u010b\u00f2\u0001\u0000\u0000\u0000\u010b\u00f8\u0001\u0000"+
		"\u0000\u0000\u010b\u00ff\u0001\u0000\u0000\u0000\u010b\u0106\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0018"+
		"\u0000\u0000\u010e\u010f\u0005\u001d\u0000\u0000\u010f\u001d\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005\u0015\u0000\u0000\u0111\u0112\u0005\u0017"+
		"\u0000\u0000\u0112\u0115\u0003\f\u0006\u0000\u0113\u0114\u0005\u001b\u0000"+
		"\u0000\u0114\u0116\u0003\f\u0006\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0018\u0000\u0000\u011a\u011b\u0005\u001d\u0000\u0000"+
		"\u011b\u001f\u0001\u0000\u0000\u0000\u011c\u011d\u0005\t\u0000\u0000\u011d"+
		"\u011e\u0005&\u0000\u0000\u011e\u011f\u0005\u001e\u0000\u0000\u011f\u0120"+
		"\u0005\u0004\u0000\u0000\u0120\u0121\u0005\t\u0000\u0000\u0121\u0122\u0005"+
		"\u0017\u0000\u0000\u0122\u0125\u0005$\u0000\u0000\u0123\u0124\u0005\u001b"+
		"\u0000\u0000\u0124\u0126\u0005$\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005\u0018\u0000\u0000\u0128\u0129\u0005\u001d\u0000"+
		"\u0000\u0129!\u0001\u0000\u0000\u0000\u012a\u0131\u0003$\u0012\u0000\u012b"+
		"\u0131\u0003&\u0013\u0000\u012c\u0131\u0003(\u0014\u0000\u012d\u0131\u0003"+
		"*\u0015\u0000\u012e\u0131\u0003,\u0016\u0000\u012f\u0131\u00030\u0018"+
		"\u0000\u0130\u012a\u0001\u0000\u0000\u0000\u0130\u012b\u0001\u0000\u0000"+
		"\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131#\u0001\u0000\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000"+
		"\u0133\u0134\u0005&\u0000\u0000\u0134\u0135\u0005\u001e\u0000\u0000\u0135"+
		"\u0136\u0005\u0004\u0000\u0000\u0136\u0137\u0005\f\u0000\u0000\u0137\u013f"+
		"\u0005\u0017\u0000\u0000\u0138\u013b\u0005$\u0000\u0000\u0139\u013a\u0005"+
		"\u001b\u0000\u0000\u013a\u013c\u0005$\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0138\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0018"+
		"\u0000\u0000\u0142\u0143\u0005\u001d\u0000\u0000\u0143%\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\u000b\u0000\u0000\u0145\u0146\u0005&\u0000\u0000"+
		"\u0146\u0147\u0005\u001e\u0000\u0000\u0147\u0148\u0005\u0004\u0000\u0000"+
		"\u0148\u0149\u0005\u000b\u0000\u0000\u0149\u0158\u0005\u0017\u0000\u0000"+
		"\u014a\u014b\u0005\u0017\u0000\u0000\u014b\u014e\u0005$\u0000\u0000\u014c"+
		"\u014d\u0005\u001b\u0000\u0000\u014d\u014f\u0005$\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0155\u0005\u0018\u0000\u0000\u0153\u0155"+
		"\u0005&\u0000\u0000\u0154\u014a\u0001\u0000\u0000\u0000\u0154\u0153\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005"+
		"\u001b\u0000\u0000\u0157\u0159\u0005%\u0000\u0000\u0158\u0154\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005\u0018\u0000\u0000\u015b\u015c\u0005\u001d"+
		"\u0000\u0000\u015c\'\u0001\u0000\u0000\u0000\u015d\u015e\u0005\r\u0000"+
		"\u0000\u015e\u015f\u0005&\u0000\u0000\u015f\u0160\u0005\u001e\u0000\u0000"+
		"\u0160\u0161\u0005\u0004\u0000\u0000\u0161\u0162\u0005\r\u0000\u0000\u0162"+
		"\u0177\u0005\u0017\u0000\u0000\u0163\u0164\u0005\u0017\u0000\u0000\u0164"+
		"\u0167\u0005$\u0000\u0000\u0165\u0166\u0005\u001b\u0000\u0000\u0166\u0168"+
		"\u0005$\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016e\u0005"+
		"\u0018\u0000\u0000\u016c\u016e\u0005&\u0000\u0000\u016d\u0163\u0001\u0000"+
		"\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0005\u001b\u0000\u0000\u0170\u0171\u0005%\u0000"+
		"\u0000\u0171\u0172\u0005\u001b\u0000\u0000\u0172\u0173\u0005%\u0000\u0000"+
		"\u0173\u0174\u0005\u001b\u0000\u0000\u0174\u0175\u0005\u001f\u0000\u0000"+
		"\u0175\u0176\u0005\u000e\u0000\u0000\u0176\u0178\u0005\u001f\u0000\u0000"+
		"\u0177\u016d\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0018\u0000\u0000"+
		"\u017a\u017b\u0005\u001d\u0000\u0000\u017b)\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005\u000f\u0000\u0000\u017d\u017e\u0005&\u0000\u0000\u017e\u017f"+
		"\u0005\u001e\u0000\u0000\u017f\u0180\u0005\u0004\u0000\u0000\u0180\u0181"+
		"\u0005\u000f\u0000\u0000\u0181\u0182\u0005\u0017\u0000\u0000\u0182\u0183"+
		"\u0005&\u0000\u0000\u0183\u0184\u0005\u001b\u0000\u0000\u0184\u0185\u0005"+
		"&\u0000\u0000\u0185\u0186\u0005\u001b\u0000\u0000\u0186\u0187\u0005%\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0018\u0000"+
		"\u0000\u0189\u018a\u0005\u001d\u0000\u0000\u018a+\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0003.\u0017\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\n\u0000\u0000\u018e\u018f\u0005&\u0000\u0000\u018f\u0190\u0005"+
		"\u001e\u0000\u0000\u0190\u0191\u0005\u0004\u0000\u0000\u0191\u0192\u0005"+
		"\n\u0000\u0000\u0192\u0193\u0005\u0017\u0000\u0000\u0193\u0198\u0005$"+
		"\u0000\u0000\u0194\u0195\u0005\u001b\u0000\u0000\u0195\u0197\u0005$\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u001b\u0000\u0000\u019c\u019d\u0005&\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0018\u0000\u0000"+
		"\u019f\u01a0\u0005\u001d\u0000\u0000\u01a0/\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u00032\u0019\u0000\u01a21\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005"+
		"&\u0000\u0000\u01a4\u01a5\u0005\u001c\u0000\u0000\u01a5\u01a6\u0005\u0016"+
		"\u0000\u0000\u01a6\u01a7\u0005\u001d\u0000\u0000\u01a73\u0001\u0000\u0000"+
		"\u0000$7<MRTbou}\u0085\u0095\u00a8\u00b4\u00bb\u00c2\u00c4\u00d0\u00d9"+
		"\u00e2\u00e4\u00f0\u00fd\u0104\u010b\u0117\u0125\u0130\u013d\u013f\u0150"+
		"\u0154\u0158\u0169\u016d\u0177\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}