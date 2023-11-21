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
	 * Visit a parse tree produced by {@link GraphicaParser#coordinate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoordinate(GraphicaParser.CoordinateContext ctx);
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
}