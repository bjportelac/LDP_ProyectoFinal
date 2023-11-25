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
		Coordinates=9, Obj_Circle=10, Obj_Square=11, Obj_Rect=12, Obj_Ellipse=13, 
		Obj_Line=14, Obj_Polyline=15, Obj_Polygon=16, Fill=17, RGB=18, Stroke=19, 
		FillType=20, IStyle=21, Circle=22, Rectangle=23, Square=24, Ellipse=25, 
		Line=26, Polyline=27, Draw=28, L_Paren=29, R_Paren=30, L_Curly=31, R_Curly=32, 
		Comma=33, Period=34, Semicolon=35, Assign=36, Quote=37, NL=38, WS=39, 
		COMMENT=40, LINE_COMMENT=41, Integer=42, Double=43, ID=44;
	public static final int
		RULE_sourceFile = 0, RULE_importStatements = 1, RULE_libraries = 2, RULE_lib = 3, 
		RULE_initialize = 4, RULE_canvas = 5, RULE_point = 6, RULE_sentences = 7, 
		RULE_sentence = 8, RULE_basicFigures = 9, RULE_drawCircle = 10, RULE_drawSquare = 11, 
		RULE_drawEllipse = 12, RULE_drawRect = 13, RULE_drawLine = 14, RULE_drawPolyline = 15, 
		RULE_coordinate = 16, RULE_objectsLibElem = 17, RULE_rgbColor = 18, RULE_fill = 19, 
		RULE_stroke = 20, RULE_istyle = 21, RULE_shape = 22, RULE_circle = 23, 
		RULE_square = 24, RULE_rect = 25, RULE_ellipse = 26, RULE_line = 27, RULE_polyline = 28, 
		RULE_polygon = 29, RULE_objsectsLibFunctions = 30, RULE_dotDraw = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "importStatements", "libraries", "lib", "initialize", "canvas", 
			"point", "sentences", "sentence", "basicFigures", "drawCircle", "drawSquare", 
			"drawEllipse", "drawRect", "drawLine", "drawPolyline", "coordinate", 
			"objectsLibElem", "rgbColor", "fill", "stroke", "istyle", "shape", "circle", 
			"square", "rect", "ellipse", "line", "polyline", "polygon", "objsectsLibFunctions", 
			"dotDraw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'Graphica'", "'new'", "'Basic'", "'Objects'", 
			"'begin'", "'graph'", "'Coordinate'", "'Circle'", "'Square'", "'Rect'", 
			"'Ellipse'", "'Line'", "'Polyline'", "'Polygon'", "'Fill'", "'RGB'", 
			"'Stroke'", null, "'IStyle'", "'circle'", "'rectangle'", "'square'", 
			"'ellipse'", "'line'", "'polyline'", "'draw'", "'('", "')'", "'{'", "'}'", 
			"','", "'.'", "';'", "'='", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "From", "Import", "Graphica", "New", "Basic", "Objects", "Begin", 
			"Graph", "Coordinates", "Obj_Circle", "Obj_Square", "Obj_Rect", "Obj_Ellipse", 
			"Obj_Line", "Obj_Polyline", "Obj_Polygon", "Fill", "RGB", "Stroke", "FillType", 
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
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				importStatements();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==From );
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Coordinates) {
				{
				{
				setState(69);
				coordinate();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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
			setState(77);
			match(From);
			setState(78);
			match(Graphica);
			setState(79);
			match(Import);
			setState(80);
			match(L_Curly);
			setState(81);
			libraries();
			setState(82);
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
			setState(84);
			lib();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(85);
				match(Comma);
				setState(86);
				lib();
				}
				}
				setState(91);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Basic:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(Basic);
				}
				break;
			case Objects:
			case R_Curly:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Objects) {
					{
					setState(93);
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
			setState(98);
			match(Begin);
			setState(99);
			match(Period);
			setState(100);
			match(Graph);
			setState(101);
			canvas();
			setState(102);
			match(L_Curly);
			setState(103);
			sentences();
			setState(104);
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
			setState(106);
			match(L_Paren);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer) {
				{
				setState(107);
				match(Integer);
				setState(108);
				match(Comma);
				setState(109);
				match(Integer);
				}
			}

			setState(112);
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
			setState(114);
			match(L_Paren);
			setState(115);
			match(Integer);
			setState(116);
			match(Comma);
			setState(117);
			match(Integer);
			setState(118);
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
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Draw) {
				{
				{
				setState(120);
				sentence();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592189189120L) != 0)) {
				{
				{
				setState(126);
				objectsLibElem();
				}
				}
				setState(131);
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
			setState(132);
			match(Draw);
			setState(133);
			match(Period);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				basicFigures();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0) );
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Square:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				drawSquare();
				}
				break;
			case Circle:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				drawCircle();
				}
				break;
			case Ellipse:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				drawEllipse();
				}
				break;
			case Rectangle:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				drawRect();
				}
				break;
			case Line:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				drawLine();
				}
				break;
			case Polyline:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
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
			setState(147);
			match(Circle);
			setState(148);
			match(L_Paren);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(149);
				match(Integer);
				setState(150);
				match(Comma);
				setState(151);
				match(Integer);
				setState(152);
				match(Comma);
				setState(153);
				match(Integer);
				}
				}
				break;
			case ID:
				{
				{
				setState(154);
				match(ID);
				setState(155);
				match(Comma);
				setState(156);
				match(Integer);
				}
				}
				break;
			case L_Paren:
				{
				{
				setState(157);
				point();
				setState(158);
				match(Comma);
				setState(159);
				match(Integer);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(R_Paren);
			setState(164);
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
			setState(166);
			match(Square);
			setState(167);
			match(L_Paren);
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(168);
				match(Integer);
				setState(169);
				match(Comma);
				setState(170);
				match(Integer);
				setState(171);
				match(Comma);
				setState(172);
				match(Integer);
				}
				}
				break;
			case ID:
				{
				{
				setState(173);
				match(ID);
				setState(174);
				match(Comma);
				setState(175);
				match(Integer);
				}
				}
				break;
			case L_Paren:
				{
				{
				setState(176);
				point();
				setState(177);
				match(Comma);
				setState(178);
				match(Integer);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			match(R_Paren);
			setState(183);
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
			setState(185);
			match(Ellipse);
			setState(186);
			match(L_Paren);
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				setState(187);
				match(Integer);
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					match(Comma);
					setState(189);
					match(Integer);
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				break;
			case L_Paren:
				{
				{
				setState(194);
				point();
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(195);
					match(Comma);
					setState(196);
					match(Integer);
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case ID:
				{
				{
				setState(201);
				match(ID);
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(202);
					match(Comma);
					setState(203);
					match(Integer);
					}
					}
					setState(206); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			match(R_Paren);
			setState(211);
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
			setState(213);
			match(Rectangle);
			setState(214);
			match(L_Paren);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				{
				{
				setState(215);
				match(Integer);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					match(Comma);
					setState(217);
					match(Integer);
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case ID:
				{
				setState(222);
				match(ID);
				setState(223);
				match(Comma);
				{
				setState(224);
				match(Integer);
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(Comma);
					setState(226);
					match(Integer);
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case L_Paren:
				{
				setState(231);
				point();
				setState(232);
				match(Comma);
				{
				setState(233);
				match(Integer);
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(Comma);
					setState(235);
					match(Integer);
					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			match(R_Paren);
			setState(243);
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
			setState(245);
			match(Line);
			setState(246);
			match(L_Paren);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				{
				setState(247);
				match(Integer);
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					match(Comma);
					setState(249);
					match(Integer);
					}
					}
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 2:
				{
				{
				setState(254);
				point();
				setState(255);
				match(Comma);
				{
				setState(256);
				match(Integer);
				setState(257);
				match(Comma);
				setState(258);
				match(Integer);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(260);
				point();
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(261);
					match(Comma);
					setState(262);
					point();
					}
					}
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 4:
				{
				{
				setState(267);
				match(ID);
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(268);
					match(Comma);
					setState(269);
					match(ID);
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
				}
				break;
			case 5:
				{
				{
				setState(274);
				match(ID);
				setState(275);
				match(Comma);
				{
				setState(276);
				match(Integer);
				setState(277);
				match(Comma);
				setState(278);
				match(Integer);
				}
				}
				}
				break;
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
			setState(284);
			match(Polyline);
			setState(285);
			match(L_Paren);
			{
			setState(286);
			point();
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				match(Comma);
				setState(288);
				point();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
			setState(293);
			match(R_Paren);
			setState(294);
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
			setState(296);
			match(Coordinates);
			setState(297);
			match(ID);
			setState(298);
			match(Assign);
			setState(299);
			match(New);
			setState(300);
			match(Coordinates);
			setState(301);
			match(L_Paren);
			{
			setState(302);
			match(Integer);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(303);
				match(Comma);
				setState(304);
				match(Integer);
				}
			}

			}
			setState(307);
			match(R_Paren);
			setState(308);
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
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RGB:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				rgbColor();
				}
				break;
			case Fill:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				fill();
				}
				break;
			case Stroke:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				stroke();
				}
				break;
			case IStyle:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				istyle();
				}
				break;
			case Obj_Circle:
			case Obj_Square:
			case Obj_Rect:
			case Obj_Ellipse:
			case Obj_Line:
			case Obj_Polyline:
			case Obj_Polygon:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				shape();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
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
			setState(318);
			match(RGB);
			setState(319);
			match(ID);
			setState(320);
			match(Assign);
			setState(321);
			match(New);
			setState(322);
			match(RGB);
			setState(323);
			match(L_Paren);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Integer) {
				{
				setState(324);
				match(Integer);
				setState(327); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(325);
					match(Comma);
					setState(326);
					match(Integer);
					}
					}
					setState(329); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				}
			}

			}
			setState(333);
			match(R_Paren);
			setState(334);
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
			setState(336);
			match(Fill);
			setState(337);
			match(ID);
			setState(338);
			match(Assign);
			setState(339);
			match(New);
			setState(340);
			match(Fill);
			setState(341);
			match(L_Paren);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_Paren || _la==ID) {
				{
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_Paren:
					{
					{
					setState(342);
					match(L_Paren);
					{
					setState(343);
					match(Integer);
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(344);
						match(Comma);
						setState(345);
						match(Integer);
						}
						}
						setState(348); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					}
					setState(350);
					match(R_Paren);
					}
					}
					break;
				case ID:
					{
					setState(351);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(354);
				match(Comma);
				setState(355);
				match(Double);
				}
			}

			}
			setState(358);
			match(R_Paren);
			setState(359);
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
			setState(361);
			match(Stroke);
			setState(362);
			match(ID);
			setState(363);
			match(Assign);
			setState(364);
			match(New);
			setState(365);
			match(Stroke);
			setState(366);
			match(L_Paren);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_Paren || _la==ID) {
				{
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_Paren:
					{
					{
					setState(367);
					match(L_Paren);
					{
					setState(368);
					match(Integer);
					setState(371); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(369);
						match(Comma);
						setState(370);
						match(Integer);
						}
						}
						setState(373); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Comma );
					}
					setState(375);
					match(R_Paren);
					}
					}
					break;
				case ID:
					{
					setState(376);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(379);
				match(Comma);
				setState(380);
				match(Double);
				setState(381);
				match(Comma);
				setState(382);
				match(Double);
				setState(383);
				match(Comma);
				{
				setState(384);
				match(Quote);
				setState(385);
				match(FillType);
				setState(386);
				match(Quote);
				}
				}
			}

			}
			setState(389);
			match(R_Paren);
			setState(390);
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
			setState(392);
			match(IStyle);
			setState(393);
			match(ID);
			setState(394);
			match(Assign);
			setState(395);
			match(New);
			setState(396);
			match(IStyle);
			setState(397);
			match(L_Paren);
			{
			setState(398);
			match(ID);
			setState(399);
			match(Comma);
			setState(400);
			match(ID);
			setState(401);
			match(Comma);
			setState(402);
			match(Double);
			}
			setState(404);
			match(R_Paren);
			setState(405);
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
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public RectContext rect() {
			return getRuleContext(RectContext.class,0);
		}
		public EllipseContext ellipse() {
			return getRuleContext(EllipseContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public PolylineContext polyline() {
			return getRuleContext(PolylineContext.class,0);
		}
		public PolygonContext polygon() {
			return getRuleContext(PolygonContext.class,0);
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
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Obj_Circle:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				circle();
				}
				break;
			case Obj_Square:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				square();
				}
				break;
			case Obj_Rect:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				rect();
				}
				break;
			case Obj_Ellipse:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				ellipse();
				}
				break;
			case Obj_Line:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				line();
				}
				break;
			case Obj_Polyline:
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				polyline();
				}
				break;
			case Obj_Polygon:
				enterOuterAlt(_localctx, 7);
				{
				setState(413);
				polygon();
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
			setState(416);
			match(Obj_Circle);
			setState(417);
			match(ID);
			setState(418);
			match(Assign);
			setState(419);
			match(New);
			setState(420);
			match(Obj_Circle);
			setState(421);
			match(L_Paren);
			{
			setState(422);
			match(Integer);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					match(Comma);
					setState(424);
					match(Integer);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(430);
			match(Comma);
			setState(431);
			match(ID);
			}
			setState(433);
			match(R_Paren);
			setState(434);
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
	public static class SquareContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Square() { return getTokens(GraphicaParser.Obj_Square); }
		public TerminalNode Obj_Square(int i) {
			return getToken(GraphicaParser.Obj_Square, i);
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
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_square);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(Obj_Square);
			setState(437);
			match(ID);
			setState(438);
			match(Assign);
			setState(439);
			match(New);
			setState(440);
			match(Obj_Square);
			setState(441);
			match(L_Paren);
			{
			setState(442);
			match(Integer);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(443);
					match(Comma);
					setState(444);
					match(Integer);
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(450);
			match(Comma);
			setState(451);
			match(ID);
			}
			setState(453);
			match(R_Paren);
			setState(454);
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
	public static class RectContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Rect() { return getTokens(GraphicaParser.Obj_Rect); }
		public TerminalNode Obj_Rect(int i) {
			return getToken(GraphicaParser.Obj_Rect, i);
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
		public RectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitRect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectContext rect() throws RecognitionException {
		RectContext _localctx = new RectContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rect);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Obj_Rect);
			setState(457);
			match(ID);
			setState(458);
			match(Assign);
			setState(459);
			match(New);
			setState(460);
			match(Obj_Rect);
			setState(461);
			match(L_Paren);
			{
			setState(462);
			match(Integer);
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(463);
					match(Comma);
					setState(464);
					match(Integer);
					}
					} 
				}
				setState(469);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(470);
			match(Comma);
			setState(471);
			match(ID);
			}
			setState(473);
			match(R_Paren);
			setState(474);
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
	public static class EllipseContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Ellipse() { return getTokens(GraphicaParser.Obj_Ellipse); }
		public TerminalNode Obj_Ellipse(int i) {
			return getToken(GraphicaParser.Obj_Ellipse, i);
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
		public EllipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ellipse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitEllipse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EllipseContext ellipse() throws RecognitionException {
		EllipseContext _localctx = new EllipseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ellipse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(Obj_Ellipse);
			setState(477);
			match(ID);
			setState(478);
			match(Assign);
			setState(479);
			match(New);
			setState(480);
			match(Obj_Ellipse);
			setState(481);
			match(L_Paren);
			{
			setState(482);
			match(Integer);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(Comma);
					setState(484);
					match(Integer);
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(490);
			match(Comma);
			setState(491);
			match(ID);
			}
			setState(493);
			match(R_Paren);
			setState(494);
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
	public static class LineContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Line() { return getTokens(GraphicaParser.Obj_Line); }
		public TerminalNode Obj_Line(int i) {
			return getToken(GraphicaParser.Obj_Line, i);
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(Obj_Line);
			setState(497);
			match(ID);
			setState(498);
			match(Assign);
			setState(499);
			match(New);
			setState(500);
			match(Obj_Line);
			setState(501);
			match(L_Paren);
			{
			setState(502);
			point();
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					match(Comma);
					setState(504);
					point();
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(510);
			match(Comma);
			setState(511);
			match(ID);
			}
			setState(513);
			match(R_Paren);
			setState(514);
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
	public static class PolylineContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Polyline() { return getTokens(GraphicaParser.Obj_Polyline); }
		public TerminalNode Obj_Polyline(int i) {
			return getToken(GraphicaParser.Obj_Polyline, i);
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
		public PolylineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polyline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitPolyline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolylineContext polyline() throws RecognitionException {
		PolylineContext _localctx = new PolylineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_polyline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(Obj_Polyline);
			setState(517);
			match(ID);
			setState(518);
			match(Assign);
			setState(519);
			match(New);
			setState(520);
			match(Obj_Polyline);
			setState(521);
			match(L_Paren);
			{
			setState(522);
			point();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(Comma);
					setState(524);
					point();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(530);
			match(Comma);
			setState(531);
			match(ID);
			}
			setState(533);
			match(R_Paren);
			setState(534);
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
	public static class PolygonContext extends ParserRuleContext {
		public List<TerminalNode> Obj_Polygon() { return getTokens(GraphicaParser.Obj_Polygon); }
		public TerminalNode Obj_Polygon(int i) {
			return getToken(GraphicaParser.Obj_Polygon, i);
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
		public PolygonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygon; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraphicaParserVisitor ) return ((GraphicaParserVisitor<? extends T>)visitor).visitPolygon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolygonContext polygon() throws RecognitionException {
		PolygonContext _localctx = new PolygonContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_polygon);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(Obj_Polygon);
			setState(537);
			match(ID);
			setState(538);
			match(Assign);
			setState(539);
			match(New);
			setState(540);
			match(Obj_Polygon);
			setState(541);
			match(L_Paren);
			{
			setState(542);
			point();
			setState(547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					match(Comma);
					setState(544);
					point();
					}
					} 
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(550);
			match(Comma);
			setState(551);
			match(ID);
			}
			setState(553);
			match(R_Paren);
			setState(554);
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
		enterRule(_localctx, 60, RULE_objsectsLibFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		enterRule(_localctx, 62, RULE_dotDraw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(ID);
			setState(559);
			match(Period);
			setState(560);
			match(Draw);
			setState(561);
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
		"\u0004\u0001,\u0234\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0004\u0000B\b\u0000\u000b\u0000"+
		"\f\u0000C\u0001\u0000\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002X\b\u0002\n\u0002\f\u0002[\t\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0003\u0003a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0005\u0007z\b\u0007\n\u0007\f\u0007}\t\u0007"+
		"\u0001\u0007\u0005\u0007\u0080\b\u0007\n\u0007\f\u0007\u0083\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0004\b\u0088\b\b\u000b\b\f\b\u0089\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0092\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00b5\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u00bf\b\f\u000b\f\f\f"+
		"\u00c0\u0001\f\u0001\f\u0001\f\u0004\f\u00c6\b\f\u000b\f\f\f\u00c7\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u00cd\b\f\u000b\f\f\f\u00ce\u0003\f\u00d1\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u00db\b\r\u000b\r\f\r\u00dc\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0004\r\u00e4\b\r\u000b\r\f\r\u00e5\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00ed\b\r\u000b\r\f\r\u00ee\u0003\r\u00f1\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u00fb\b\u000e\u000b\u000e\f\u000e\u00fc\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u0108\b\u000e\u000b\u000e\f\u000e\u0109"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u010f\b\u000e\u000b\u000e"+
		"\f\u000e\u0110\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0118\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0122\b\u000f"+
		"\u000b\u000f\f\u000f\u0123\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0132\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u013d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0004\u0012\u0148\b\u0012\u000b\u0012\f\u0012\u0149\u0003\u0012\u014c"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0004\u0013\u015b\b\u0013\u000b\u0013\f\u0013\u015c"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0161\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0165\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0174\b\u0014\u000b\u0014"+
		"\f\u0014\u0175\u0001\u0014\u0001\u0014\u0003\u0014\u017a\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0184\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019f"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01aa\b\u0017\n"+
		"\u0017\f\u0017\u01ad\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01be\b\u0018\n\u0018\f\u0018\u01c1\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u01d2\b\u0019\n\u0019\f\u0019\u01d5\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e6\b\u001a\n\u001a\f\u001a"+
		"\u01e9\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01fa\b\u001b"+
		"\n\u001b\f\u001b\u01fd\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u020e\b\u001c\n\u001c\f\u001c\u0211\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0222\b\u001d\n\u001d\f\u001d\u0225\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0000"+
		"\u0252\u0000A\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004"+
		"T\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bb\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e"+
		"{\u0001\u0000\u0000\u0000\u0010\u0084\u0001\u0000\u0000\u0000\u0012\u0091"+
		"\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00a6"+
		"\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000\u0000\u0000\u001a\u00d5"+
		"\u0001\u0000\u0000\u0000\u001c\u00f5\u0001\u0000\u0000\u0000\u001e\u011c"+
		"\u0001\u0000\u0000\u0000 \u0128\u0001\u0000\u0000\u0000\"\u013c\u0001"+
		"\u0000\u0000\u0000$\u013e\u0001\u0000\u0000\u0000&\u0150\u0001\u0000\u0000"+
		"\u0000(\u0169\u0001\u0000\u0000\u0000*\u0188\u0001\u0000\u0000\u0000,"+
		"\u019e\u0001\u0000\u0000\u0000.\u01a0\u0001\u0000\u0000\u00000\u01b4\u0001"+
		"\u0000\u0000\u00002\u01c8\u0001\u0000\u0000\u00004\u01dc\u0001\u0000\u0000"+
		"\u00006\u01f0\u0001\u0000\u0000\u00008\u0204\u0001\u0000\u0000\u0000:"+
		"\u0218\u0001\u0000\u0000\u0000<\u022c\u0001\u0000\u0000\u0000>\u022e\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DH\u0001\u0000\u0000\u0000EG\u0003 \u0010\u0000FE\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0003"+
		"\b\u0004\u0000L\u0001\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000\u0000"+
		"NO\u0005\u0003\u0000\u0000OP\u0005\u0002\u0000\u0000PQ\u0005\u001f\u0000"+
		"\u0000QR\u0003\u0004\u0002\u0000RS\u0005 \u0000\u0000S\u0003\u0001\u0000"+
		"\u0000\u0000TY\u0003\u0006\u0003\u0000UV\u0005!\u0000\u0000VX\u0003\u0006"+
		"\u0003\u0000WU\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\a\u0005\u0005\u0000\u0000]_\u0005\u0006"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001"+
		"\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"a\u0007\u0001\u0000\u0000\u0000bc\u0005\u0007\u0000\u0000cd\u0005\"\u0000"+
		"\u0000de\u0005\b\u0000\u0000ef\u0003\n\u0005\u0000fg\u0005\u001f\u0000"+
		"\u0000gh\u0003\u000e\u0007\u0000hi\u0005 \u0000\u0000i\t\u0001\u0000\u0000"+
		"\u0000jn\u0005\u001d\u0000\u0000kl\u0005*\u0000\u0000lm\u0005!\u0000\u0000"+
		"mo\u0005*\u0000\u0000nk\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0005\u001e\u0000\u0000q\u000b\u0001\u0000"+
		"\u0000\u0000rs\u0005\u001d\u0000\u0000st\u0005*\u0000\u0000tu\u0005!\u0000"+
		"\u0000uv\u0005*\u0000\u0000vw\u0005\u001e\u0000\u0000w\r\u0001\u0000\u0000"+
		"\u0000xz\u0003\u0010\b\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0081\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0003\"\u0011\u0000"+
		"\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u000f\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u001c\u0000\u0000\u0085\u0087\u0005\"\u0000\u0000\u0086\u0088"+
		"\u0003\u0012\t\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u0092\u0003"+
		"\u0016\u000b\u0000\u008c\u0092\u0003\u0014\n\u0000\u008d\u0092\u0003\u0018"+
		"\f\u0000\u008e\u0092\u0003\u001a\r\u0000\u008f\u0092\u0003\u001c\u000e"+
		"\u0000\u0090\u0092\u0003\u001e\u000f\u0000\u0091\u008b\u0001\u0000\u0000"+
		"\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000"+
		"\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0013\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0016\u0000\u0000\u0094\u00a1\u0005\u001d\u0000"+
		"\u0000\u0095\u0096\u0005*\u0000\u0000\u0096\u0097\u0005!\u0000\u0000\u0097"+
		"\u0098\u0005*\u0000\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u00a2\u0005"+
		"*\u0000\u0000\u009a\u009b\u0005,\u0000\u0000\u009b\u009c\u0005!\u0000"+
		"\u0000\u009c\u00a2\u0005*\u0000\u0000\u009d\u009e\u0003\f\u0006\u0000"+
		"\u009e\u009f\u0005!\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u009a"+
		"\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001e\u0000\u0000\u00a4\u00a5"+
		"\u0005#\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0018\u0000\u0000\u00a7\u00b4\u0005\u001d\u0000\u0000\u00a8\u00a9\u0005"+
		"*\u0000\u0000\u00a9\u00aa\u0005!\u0000\u0000\u00aa\u00ab\u0005*\u0000"+
		"\u0000\u00ab\u00ac\u0005!\u0000\u0000\u00ac\u00b5\u0005*\u0000\u0000\u00ad"+
		"\u00ae\u0005,\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b5\u0005"+
		"*\u0000\u0000\u00b0\u00b1\u0003\f\u0006\u0000\u00b1\u00b2\u0005!\u0000"+
		"\u0000\u00b2\u00b3\u0005*\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00a8\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005\u001e\u0000\u0000\u00b7\u00b8\u0005#\u0000\u0000\u00b8"+
		"\u0017\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba"+
		"\u00d0\u0005\u001d\u0000\u0000\u00bb\u00be\u0005*\u0000\u0000\u00bc\u00bd"+
		"\u0005!\u0000\u0000\u00bd\u00bf\u0005*\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00d1\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0003\f\u0006\u0000\u00c3\u00c4\u0005!\u0000"+
		"\u0000\u00c4\u00c6\u0005*\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d1\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0005,\u0000\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cd"+
		"\u0005*\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c2\u0001\u0000\u0000\u0000\u00d0\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"\u001e\u0000\u0000\u00d3\u00d4\u0005#\u0000\u0000\u00d4\u0019\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6\u00f0\u0005\u001d"+
		"\u0000\u0000\u00d7\u00da\u0005*\u0000\u0000\u00d8\u00d9\u0005!\u0000\u0000"+
		"\u00d9\u00db\u0005*\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00f1\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005,\u0000\u0000\u00df\u00e0\u0005!\u0000\u0000\u00e0\u00e3\u0005"+
		"*\u0000\u0000\u00e1\u00e2\u0005!\u0000\u0000\u00e2\u00e4\u0005*\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00f1\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\f\u0006\u0000"+
		"\u00e8\u00e9\u0005!\u0000\u0000\u00e9\u00ec\u0005*\u0000\u0000\u00ea\u00eb"+
		"\u0005!\u0000\u0000\u00eb\u00ed\u0005*\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00d7\u0001\u0000\u0000\u0000\u00f0\u00de\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f4\u0005#\u0000"+
		"\u0000\u00f4\u001b\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u001a\u0000"+
		"\u0000\u00f6\u0117\u0005\u001d\u0000\u0000\u00f7\u00fa\u0005*\u0000\u0000"+
		"\u00f8\u00f9\u0005!\u0000\u0000\u00f9\u00fb\u0005*\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0118"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\f\u0006\u0000\u00ff\u0100\u0005"+
		"!\u0000\u0000\u0100\u0101\u0005*\u0000\u0000\u0101\u0102\u0005!\u0000"+
		"\u0000\u0102\u0103\u0005*\u0000\u0000\u0103\u0118\u0001\u0000\u0000\u0000"+
		"\u0104\u0107\u0003\f\u0006\u0000\u0105\u0106\u0005!\u0000\u0000\u0106"+
		"\u0108\u0003\f\u0006\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0118\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0005,\u0000\u0000\u010c\u010d\u0005!\u0000\u0000\u010d\u010f\u0005,"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"+
		"\u0000\u0000\u0111\u0118\u0001\u0000\u0000\u0000\u0112\u0113\u0005,\u0000"+
		"\u0000\u0113\u0114\u0005!\u0000\u0000\u0114\u0115\u0005*\u0000\u0000\u0115"+
		"\u0116\u0005!\u0000\u0000\u0116\u0118\u0005*\u0000\u0000\u0117\u00f7\u0001"+
		"\u0000\u0000\u0000\u0117\u00fe\u0001\u0000\u0000\u0000\u0117\u0104\u0001"+
		"\u0000\u0000\u0000\u0117\u010b\u0001\u0000\u0000\u0000\u0117\u0112\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"\u001e\u0000\u0000\u011a\u011b\u0005#\u0000\u0000\u011b\u001d\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005\u001b\u0000\u0000\u011d\u011e\u0005\u001d"+
		"\u0000\u0000\u011e\u0121\u0003\f\u0006\u0000\u011f\u0120\u0005!\u0000"+
		"\u0000\u0120\u0122\u0003\f\u0006\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0005\u001e\u0000\u0000\u0126\u0127\u0005#\u0000\u0000\u0127"+
		"\u001f\u0001\u0000\u0000\u0000\u0128\u0129\u0005\t\u0000\u0000\u0129\u012a"+
		"\u0005,\u0000\u0000\u012a\u012b\u0005$\u0000\u0000\u012b\u012c\u0005\u0004"+
		"\u0000\u0000\u012c\u012d\u0005\t\u0000\u0000\u012d\u012e\u0005\u001d\u0000"+
		"\u0000\u012e\u0131\u0005*\u0000\u0000\u012f\u0130\u0005!\u0000\u0000\u0130"+
		"\u0132\u0005*\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005\u001e\u0000\u0000\u0134\u0135\u0005#\u0000\u0000\u0135!\u0001\u0000"+
		"\u0000\u0000\u0136\u013d\u0003$\u0012\u0000\u0137\u013d\u0003&\u0013\u0000"+
		"\u0138\u013d\u0003(\u0014\u0000\u0139\u013d\u0003*\u0015\u0000\u013a\u013d"+
		"\u0003,\u0016\u0000\u013b\u013d\u0003<\u001e\u0000\u013c\u0136\u0001\u0000"+
		"\u0000\u0000\u013c\u0137\u0001\u0000\u0000\u0000\u013c\u0138\u0001\u0000"+
		"\u0000\u0000\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000"+
		"\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d#\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0005\u0012\u0000\u0000\u013f\u0140\u0005,\u0000\u0000"+
		"\u0140\u0141\u0005$\u0000\u0000\u0141\u0142\u0005\u0004\u0000\u0000\u0142"+
		"\u0143\u0005\u0012\u0000\u0000\u0143\u014b\u0005\u001d\u0000\u0000\u0144"+
		"\u0147\u0005*\u0000\u0000\u0145\u0146\u0005!\u0000\u0000\u0146\u0148\u0005"+
		"*\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0144\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\u001e\u0000\u0000\u014e\u014f\u0005#\u0000"+
		"\u0000\u014f%\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0011\u0000\u0000"+
		"\u0151\u0152\u0005,\u0000\u0000\u0152\u0153\u0005$\u0000\u0000\u0153\u0154"+
		"\u0005\u0004\u0000\u0000\u0154\u0155\u0005\u0011\u0000\u0000\u0155\u0164"+
		"\u0005\u001d\u0000\u0000\u0156\u0157\u0005\u001d\u0000\u0000\u0157\u015a"+
		"\u0005*\u0000\u0000\u0158\u0159\u0005!\u0000\u0000\u0159\u015b\u0005*"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0161\u0005\u001e"+
		"\u0000\u0000\u015f\u0161\u0005,\u0000\u0000\u0160\u0156\u0001\u0000\u0000"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005!\u0000\u0000\u0163\u0165\u0005+\u0000\u0000\u0164"+
		"\u0160\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u001e\u0000\u0000\u0167"+
		"\u0168\u0005#\u0000\u0000\u0168\'\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0005\u0013\u0000\u0000\u016a\u016b\u0005,\u0000\u0000\u016b\u016c\u0005"+
		"$\u0000\u0000\u016c\u016d\u0005\u0004\u0000\u0000\u016d\u016e\u0005\u0013"+
		"\u0000\u0000\u016e\u0183\u0005\u001d\u0000\u0000\u016f\u0170\u0005\u001d"+
		"\u0000\u0000\u0170\u0173\u0005*\u0000\u0000\u0171\u0172\u0005!\u0000\u0000"+
		"\u0172\u0174\u0005*\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0176\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u017a\u0005\u001e\u0000\u0000\u0178\u017a\u0005,\u0000\u0000\u0179\u016f"+
		"\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005!\u0000\u0000\u017c\u017d\u0005"+
		"+\u0000\u0000\u017d\u017e\u0005!\u0000\u0000\u017e\u017f\u0005+\u0000"+
		"\u0000\u017f\u0180\u0005!\u0000\u0000\u0180\u0181\u0005%\u0000\u0000\u0181"+
		"\u0182\u0005\u0014\u0000\u0000\u0182\u0184\u0005%\u0000\u0000\u0183\u0179"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u001e\u0000\u0000\u0186\u0187"+
		"\u0005#\u0000\u0000\u0187)\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0015"+
		"\u0000\u0000\u0189\u018a\u0005,\u0000\u0000\u018a\u018b\u0005$\u0000\u0000"+
		"\u018b\u018c\u0005\u0004\u0000\u0000\u018c\u018d\u0005\u0015\u0000\u0000"+
		"\u018d\u018e\u0005\u001d\u0000\u0000\u018e\u018f\u0005,\u0000\u0000\u018f"+
		"\u0190\u0005!\u0000\u0000\u0190\u0191\u0005,\u0000\u0000\u0191\u0192\u0005"+
		"!\u0000\u0000\u0192\u0193\u0005+\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005\u001e\u0000\u0000\u0195\u0196\u0005#\u0000\u0000"+
		"\u0196+\u0001\u0000\u0000\u0000\u0197\u019f\u0003.\u0017\u0000\u0198\u019f"+
		"\u00030\u0018\u0000\u0199\u019f\u00032\u0019\u0000\u019a\u019f\u00034"+
		"\u001a\u0000\u019b\u019f\u00036\u001b\u0000\u019c\u019f\u00038\u001c\u0000"+
		"\u019d\u019f\u0003:\u001d\u0000\u019e\u0197\u0001\u0000\u0000\u0000\u019e"+
		"\u0198\u0001\u0000\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000\u019e"+
		"\u019a\u0001\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f"+
		"-\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\n\u0000\u0000\u01a1\u01a2"+
		"\u0005,\u0000\u0000\u01a2\u01a3\u0005$\u0000\u0000\u01a3\u01a4\u0005\u0004"+
		"\u0000\u0000\u01a4\u01a5\u0005\n\u0000\u0000\u01a5\u01a6\u0005\u001d\u0000"+
		"\u0000\u01a6\u01ab\u0005*\u0000\u0000\u01a7\u01a8\u0005!\u0000\u0000\u01a8"+
		"\u01aa\u0005*\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0005!\u0000\u0000\u01af\u01b0\u0005"+
		",\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005\u001e"+
		"\u0000\u0000\u01b2\u01b3\u0005#\u0000\u0000\u01b3/\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005\u000b\u0000\u0000\u01b5\u01b6\u0005,\u0000\u0000\u01b6"+
		"\u01b7\u0005$\u0000\u0000\u01b7\u01b8\u0005\u0004\u0000\u0000\u01b8\u01b9"+
		"\u0005\u000b\u0000\u0000\u01b9\u01ba\u0005\u001d\u0000\u0000\u01ba\u01bf"+
		"\u0005*\u0000\u0000\u01bb\u01bc\u0005!\u0000\u0000\u01bc\u01be\u0005*"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0005!\u0000\u0000\u01c3\u01c4\u0005,\u0000\u0000"+
		"\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u001e\u0000\u0000"+
		"\u01c6\u01c7\u0005#\u0000\u0000\u01c71\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0005\f\u0000\u0000\u01c9\u01ca\u0005,\u0000\u0000\u01ca\u01cb\u0005"+
		"$\u0000\u0000\u01cb\u01cc\u0005\u0004\u0000\u0000\u01cc\u01cd\u0005\f"+
		"\u0000\u0000\u01cd\u01ce\u0005\u001d\u0000\u0000\u01ce\u01d3\u0005*\u0000"+
		"\u0000\u01cf\u01d0\u0005!\u0000\u0000\u01d0\u01d2\u0005*\u0000\u0000\u01d1"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0005!\u0000\u0000\u01d7\u01d8\u0005,\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0005\u001e\u0000\u0000\u01da\u01db\u0005"+
		"#\u0000\u0000\u01db3\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\r\u0000"+
		"\u0000\u01dd\u01de\u0005,\u0000\u0000\u01de\u01df\u0005$\u0000\u0000\u01df"+
		"\u01e0\u0005\u0004\u0000\u0000\u01e0\u01e1\u0005\r\u0000\u0000\u01e1\u01e2"+
		"\u0005\u001d\u0000\u0000\u01e2\u01e7\u0005*\u0000\u0000\u01e3\u01e4\u0005"+
		"!\u0000\u0000\u01e4\u01e6\u0005*\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005!\u0000\u0000"+
		"\u01eb\u01ec\u0005,\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0005\u001e\u0000\u0000\u01ee\u01ef\u0005#\u0000\u0000\u01ef5\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0005\u000e\u0000\u0000\u01f1\u01f2\u0005"+
		",\u0000\u0000\u01f2\u01f3\u0005$\u0000\u0000\u01f3\u01f4\u0005\u0004\u0000"+
		"\u0000\u01f4\u01f5\u0005\u000e\u0000\u0000\u01f5\u01f6\u0005\u001d\u0000"+
		"\u0000\u01f6\u01fb\u0003\f\u0006\u0000\u01f7\u01f8\u0005!\u0000\u0000"+
		"\u01f8\u01fa\u0003\f\u0006\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005!\u0000\u0000\u01ff\u0200"+
		"\u0005,\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0005"+
		"\u001e\u0000\u0000\u0202\u0203\u0005#\u0000\u0000\u02037\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0005\u000f\u0000\u0000\u0205\u0206\u0005,\u0000\u0000"+
		"\u0206\u0207\u0005$\u0000\u0000\u0207\u0208\u0005\u0004\u0000\u0000\u0208"+
		"\u0209\u0005\u000f\u0000\u0000\u0209\u020a\u0005\u001d\u0000\u0000\u020a"+
		"\u020f\u0003\f\u0006\u0000\u020b\u020c\u0005!\u0000\u0000\u020c\u020e"+
		"\u0003\f\u0006\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0005!\u0000\u0000\u0213\u0214\u0005,\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u001e\u0000"+
		"\u0000\u0216\u0217\u0005#\u0000\u0000\u02179\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005\u0010\u0000\u0000\u0219\u021a\u0005,\u0000\u0000\u021a\u021b"+
		"\u0005$\u0000\u0000\u021b\u021c\u0005\u0004\u0000\u0000\u021c\u021d\u0005"+
		"\u0010\u0000\u0000\u021d\u021e\u0005\u001d\u0000\u0000\u021e\u0223\u0003"+
		"\f\u0006\u0000\u021f\u0220\u0005!\u0000\u0000\u0220\u0222\u0003\f\u0006"+
		"\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0005!\u0000\u0000\u0227\u0228\u0005,\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u001e\u0000\u0000\u022a"+
		"\u022b\u0005#\u0000\u0000\u022b;\u0001\u0000\u0000\u0000\u022c\u022d\u0003"+
		">\u001f\u0000\u022d=\u0001\u0000\u0000\u0000\u022e\u022f\u0005,\u0000"+
		"\u0000\u022f\u0230\u0005\"\u0000\u0000\u0230\u0231\u0005\u001c\u0000\u0000"+
		"\u0231\u0232\u0005#\u0000\u0000\u0232?\u0001\u0000\u0000\u0000+CHY^`n"+
		"{\u0081\u0089\u0091\u00a1\u00b4\u00c0\u00c7\u00ce\u00d0\u00dc\u00e5\u00ee"+
		"\u00f0\u00fc\u0109\u0110\u0117\u0123\u0131\u013c\u0149\u014b\u015c\u0160"+
		"\u0164\u0175\u0179\u0183\u019e\u01ab\u01bf\u01d3\u01e7\u01fb\u020f\u0223";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}