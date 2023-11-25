// Generated from D:/Universidad/Lenguajes/IntroANTLR/LDP_ProyectoFinal/grammar/GraphicaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphicaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(GraphicaParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#importStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatements(GraphicaParser.ImportStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#libraries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraries(GraphicaParser.LibrariesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#lib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLib(GraphicaParser.LibContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#initialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialize(GraphicaParser.InitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#canvas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanvas(GraphicaParser.CanvasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(GraphicaParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(GraphicaParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(GraphicaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#basicFigures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicFigures(GraphicaParser.BasicFiguresContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawCircle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawCircle(GraphicaParser.DrawCircleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawSquare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawSquare(GraphicaParser.DrawSquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawEllipse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawEllipse(GraphicaParser.DrawEllipseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawRect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawRect(GraphicaParser.DrawRectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawLine(GraphicaParser.DrawLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#drawPolyline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawPolyline(GraphicaParser.DrawPolylineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(GraphicaParser.CoordinateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#objectsLibElem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectsLibElem(GraphicaParser.ObjectsLibElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#rgbColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgbColor(GraphicaParser.RgbColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill(GraphicaParser.FillContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#stroke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStroke(GraphicaParser.StrokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#istyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIstyle(GraphicaParser.IstyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(GraphicaParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(GraphicaParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#square}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(GraphicaParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#rect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRect(GraphicaParser.RectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#ellipse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipse(GraphicaParser.EllipseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(GraphicaParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#polyline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolyline(GraphicaParser.PolylineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#polygon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolygon(GraphicaParser.PolygonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#objsectsLibFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjsectsLibFunctions(GraphicaParser.ObjsectsLibFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphicaParser#dotDraw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotDraw(GraphicaParser.DotDrawContext ctx);
}