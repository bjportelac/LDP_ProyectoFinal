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
	 * Visit a parse tree produced by {@link GraphicaParser#canva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanva(GraphicaParser.CanvaContext ctx);
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
}