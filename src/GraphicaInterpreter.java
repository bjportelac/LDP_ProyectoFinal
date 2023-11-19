import java.util.ArrayList;
import java.util.List;

public class GraphicaInterpreter<Void>  extends  GraphicaParserBaseVisitor<Void>{

    private List<String> graphicaCode = new ArrayList<>();

    @Override
    public Void visitSourceFile(GraphicaParser.SourceFileContext ctx) {
        if(ctx != null){
            if(ctx.Graphica() != null){
                graphicaCode.add("<!DOCTYPE html>");
                graphicaCode.add("<html>");
                if(ctx.Begin() != null && ctx.Graph() != null){
                    graphicaCode.add("<body>");
                    if(ctx.canva() != null){
                        visitCanva(ctx.canva());
                        if(ctx.sentences() != null){
                            visitSentences(ctx.sentences());
                        }
                        graphicaCode.add("</svg>");
                    }
                    graphicaCode.add("</body>");
                }
                graphicaCode.add("</html>");
            }

        }
        return null;
    }

    @Override
    public Void visitCanva(GraphicaParser.CanvaContext ctx) {
        if(ctx != null){
            if(ctx.Integer() != null && ctx.Integer().size() == 2){
                String svgBegin = "<svg width = \"" + ctx.Integer(0) + "\" height=\"" + ctx.Integer(1) + "\">";
                graphicaCode.add(svgBegin);
            }else{
                graphicaCode.add("<svg>");
            }
        }
        return null;
    }

    @Override
    public Void visitSentences(GraphicaParser.SentencesContext ctx) {
        if(ctx != null){
            if(ctx.sentence() != null){
                for(int i = 0; i<ctx.sentence().size() ;i++){
                    visitSentence(ctx.sentence(i));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitSentence(GraphicaParser.SentenceContext ctx) {
        if(ctx != null){
            if(ctx.drawCircle() != null){
                for(int i = 0; i<ctx.drawCircle().size(); i++){
                    visitDrawCircle(ctx.drawCircle(i));
                }
            }
            if(ctx.drawSquare() != null){
                for(int i = 0; i<ctx.drawSquare().size(); i++){
                    visitDrawSquare(ctx.drawSquare(i));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitDrawCircle(GraphicaParser.DrawCircleContext ctx) {
        if(ctx != null){
            if(ctx.Integer() != null && ctx.Integer().size() == 3) {
                String doCircle = "<circle cx=\"" + ctx.Integer(0) + "\" cy=\"" + ctx.Integer(1) + "\" r=\"" + ctx.Integer(2) + "\"/>";
                graphicaCode.add(doCircle);
            }
        }
        return null;
    }

    @Override
    public Void visitDrawSquare(GraphicaParser.DrawSquareContext ctx) {
        if(ctx != null){
            if(ctx.Integer() != null && ctx.Integer().size() == 3){
                String doCircle = "<rect x=\"" + ctx.Integer(0) + "\" y=\"" + ctx.Integer(1) + "\" width=\"" + ctx.Integer(2) +"\" height=\"" + ctx.Integer(2) + "\"/>";
                graphicaCode.add(doCircle);
            }
        }
        return null;
    }

    public List<String> getGraphicaCode() {
        return graphicaCode;
    }
}
