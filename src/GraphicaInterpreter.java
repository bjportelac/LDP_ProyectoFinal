import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphicaInterpreter<Void>  extends  GraphicaParserBaseVisitor<Void>{

    List<String> graphicaCode = new ArrayList<>();

    GraphicaLibraries graphicaLibraries = new GraphicaLibraries();

    //Graphica Objects Handle
    HashMap<String, GraphicaCoordinates> coordinatesHashMap = new HashMap<>();


    //SourceFile
    @Override
    public Void visitSourceFile(GraphicaParser.SourceFileContext ctx) {
        if(ctx != null){
            if(ctx.importStatements() != null){
                for(int i = 0; i < ctx.importStatements().size(); i++){
                    visitImportStatements(ctx.importStatements(i));
                }
            }else{
                //Raise Error: 'Basic' library is required.
            }

            if(ctx.coordinate() != null){
                for(int i = 0; i < ctx.coordinate().size(); i++){
                    visitCoordinate(ctx.coordinate(i));
                }
            }

            if(ctx.initialize() != null){
                visitInitialize(ctx.initialize());
            }else{
                //Raise Error: initialization is required
            }
        }
        return null;
    }

    //importStatements, libraries, lib
    @Override
    public Void visitImportStatements(GraphicaParser.ImportStatementsContext ctx) {
        if(ctx != null){
            if(ctx.Graphica() != null && ctx.libraries() != null){
                visitLibraries(ctx.libraries());
            }else{
                //Raise Error: libraries may not be properly declared
            }
        }
        return null;
    }

    @Override
    public Void visitLibraries(GraphicaParser.LibrariesContext ctx) {
        if(ctx != null){
            if(ctx.lib() != null){
                for(int i = 0; i < ctx.lib().size(); i++){
                    visitLib(ctx.lib(i));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitLib(GraphicaParser.LibContext ctx) {
        if(ctx != null){
            if(ctx.Basic() != null){
                graphicaLibraries.setBasic(Boolean.TRUE);
            } else if (ctx.Objects() != null) {
                graphicaLibraries.setObjects(Boolean.TRUE);
            } else{
                //Raise Error: Library does not belong to this package
            }
        }
        return null;
    }

    //Initialization
    @Override
    public Void visitInitialize(GraphicaParser.InitializeContext ctx) {
        if(ctx != null){
            if(ctx.Begin() != null && ctx.canvas()!= null){
                graphicaCode.add("<!DOCTYPE html>");
                graphicaCode.add("<html>");
                graphicaCode.add("<body>");
                visitCanvas(ctx.canvas());
                if(ctx.sentences() != null){
                    visitSentences(ctx.sentences());
                }
                graphicaCode.add("</svg>");
                graphicaCode.add("</body>");
                graphicaCode.add("</html>");
            }else{
                //Raise Error: Graphical area may not be declared
            }
        }
        return null;
    }

    //Visit Canva
    @Override
    public Void visitCanvas(GraphicaParser.CanvasContext ctx) {
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

    //Sentences and sentence
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
            if(ctx.basicFigures() != null){
                for(int i = 0; i < ctx.basicFigures().size() ; i++){
                    visitBasicFigures(ctx.basicFigures(i));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitBasicFigures(GraphicaParser.BasicFiguresContext ctx) {
        if(ctx != null){
            if(ctx.drawCircle() != null){
                visitDrawCircle(ctx.drawCircle());
            }
            if(ctx.drawSquare() != null){
                visitDrawSquare(ctx.drawSquare());
            }
            if(ctx.drawEllipse() != null){
                visitDrawEllipse(ctx.drawEllipse());
            }
            if(ctx.drawRect() != null){
                visitDrawRect(ctx.drawRect());
            }
            if(ctx.drawLine() != null){
                visitDrawLine(ctx.drawLine());
            }
            if(ctx.drawPolyline() != null){
                visitDrawPolyline(ctx.drawPolyline());
            }
        }
        return null;
    }

    //Circle
    @Override
    public Void visitDrawCircle(GraphicaParser.DrawCircleContext ctx) {
        if(ctx != null){
            String doCircle;
            if(ctx.Integer() != null && ctx.Integer().size() == 3 && ctx.ID() == null) {
                doCircle = "<circle cx=\"" + ctx.Integer(0) + "\" cy=\"" + ctx.Integer(1) + "\" r=\"" + ctx.Integer(2) + "\"/>";
                graphicaCode.add(doCircle);
            }
            if(ctx.point() != null & ctx.Integer().size() == 1){
                doCircle = "<circle cx=\"" + ctx.point().Integer(0)+ "\" cy=\"" + ctx.point().Integer(1) + "\" r=\"" + ctx.Integer(0) + "\"/>";
                graphicaCode.add(doCircle);
            }
            if(ctx.ID() != null && ctx.Integer().size() == 1 && graphicaLibraries.getObjects()){
                if(!ctx.ID().getText().isEmpty()){
                    String id = ctx.ID().getText();
                    GraphicaCoordinates coordinates = null;
                    if(coordinatesHashMap.get(id) != null){
                        coordinates = coordinatesHashMap.get(id);
                        doCircle = "<circle cx=\"" + coordinates.getX() + "\" cy=\"" + coordinates.getY() + "\" r=\"" + ctx.Integer(0) + "\"/>";
                        graphicaCode.add(doCircle);
                    }
                }
            }
        }
        return null;
    }

    //Square
    @Override
    public Void visitDrawSquare(GraphicaParser.DrawSquareContext ctx) {
        if(ctx != null){
            String doSquare;
            if(ctx.Integer() != null && ctx.Integer().size() == 3 && ctx.ID() == null) {
                doSquare = "<rect x=\"" + ctx.Integer(0) + "\" y=\"" + ctx.Integer(1) + "\" width=\"" + ctx.Integer(2) +"\" height=\"" + ctx.Integer(2) + "\"/>";
                graphicaCode.add(doSquare);
            }
            if(ctx.point() != null & ctx.Integer().size() == 1){
                doSquare = "<rect x=\"" + ctx.point().Integer(0)+ "\" y=\"" + ctx.point().Integer(1) + "\" width=\"" + ctx.Integer(0) +"\" height=\"" + ctx.Integer(0) + "\"/>";
                graphicaCode.add(doSquare);
            }
            if(ctx.ID() != null && ctx.Integer().size() == 1 && graphicaLibraries.getObjects()){
                if(!ctx.ID().getText().isEmpty()){
                    String id = ctx.ID().getText();
                    GraphicaCoordinates coordinates = null;
                    if(coordinatesHashMap.get(id) != null){
                        coordinates = coordinatesHashMap.get(id);
                        doSquare = "<rect x=\"" + coordinates.getX()+ "\" y=\"" + coordinates.getY() + "\" width=\"" + ctx.Integer(0) +"\" height=\"" + ctx.Integer(0) + "\"/>";
                        graphicaCode.add(doSquare);
                    }
                }
            }
        }
        return null;
    }

    //Ellipse
    @Override
    public Void visitDrawEllipse(GraphicaParser.DrawEllipseContext ctx) {
        if(ctx != null){
            String doEllipse;
            if(ctx.Integer() != null && ctx.Integer().size() == 4){
                doEllipse = "<ellipse cx=\"" + ctx.Integer(0) + "\" cy=\"" + ctx.Integer(1) + "\" rx=\"" + ctx.Integer(2) + "\" ry=\"" + ctx.Integer(3) + "\"/>";
                graphicaCode.add(doEllipse);
            }
            if(ctx.point() != null && ctx.Integer().size() ==2){
                doEllipse = "<ellipse cx=\"" + ctx.point().Integer(0) + "\" cy=\"" + ctx.point().Integer(1) + "\" rx=\"" + ctx.Integer(0) + "\" ry=\"" + ctx.Integer(1) + "\"/>";
                graphicaCode.add(doEllipse);
            }
            if(graphicaLibraries.getObjects()){
                if(ctx.ID() != null && ctx.Integer().size() == 2){
                    String id = ctx.ID().getText();
                    GraphicaCoordinates coordinates = null;
                    if(coordinatesHashMap.get(id) != null){
                        coordinates = coordinatesHashMap.get(id);
                        doEllipse = "<ellipse cx=\"" + coordinates.getX() + "\" cy=\"" + coordinates.getY() + "\" rx=\"" + ctx.Integer(0) + "\" ry=\"" + ctx.Integer(1) + "\"/>";
                        graphicaCode.add(doEllipse);
                    }
                }

            }
        }
        return null;
    }

    //Rectangle
    @Override
    public Void visitDrawRect(GraphicaParser.DrawRectContext ctx) {
        if(ctx != null){
            String doRect;
            if(ctx.ID() == null && ctx.point() == null && ctx.Integer() != null){
                if(ctx.Integer().size() == 6){
                    doRect = "<rect x=\"" + ctx.Integer(0) + "\" y=\"" + ctx.Integer(1)
                            + "\" rx=\"" + ctx.Integer(2) + "\" ry=\"" + ctx.Integer(3)
                            + "\" width=\"" + ctx.Integer(4) + "\" height=\"" + ctx.Integer(5)
                            + "\"/>";
                    graphicaCode.add(doRect);
                }
                if(ctx.Integer().size() == 4){
                    doRect = "<rect x=\"" + ctx.Integer(0) + "\" y=\"" + ctx.Integer(1)
                            + "\" rx=\"" + 0 + "\" ry=\"" + 0
                            + "\" width=\"" + ctx.Integer(2) + "\" height=\"" + ctx.Integer(3)
                            + "\"/>";
                    graphicaCode.add(doRect);
                }
            }

            if(graphicaLibraries.getObjects()){
                if(ctx.ID() != null && ctx.point() == null && ctx.Integer() != null){
                    String id = ctx.ID().getText();
                    GraphicaCoordinates coordinates;
                    if(coordinatesHashMap.get(id) != null){
                        coordinates = coordinatesHashMap.get(id);
                        if(ctx.Integer().size() == 4){
                            doRect = "<rect x=\"" + coordinates.getX() + "\" y=\"" + coordinates.getY()
                                    + "\" rx=\"" + ctx.Integer(0) + "\" ry=\"" + ctx.Integer(1)
                                    + "\" width=\"" + ctx.Integer(2) + "\" height=\"" + ctx.Integer(3)
                                    + "\"/>";
                            graphicaCode.add(doRect);
                        }
                        if(ctx.Integer().size() == 2){
                            doRect = "<rect x=\"" + coordinates.getX() + "\" y=\"" + coordinates.getY()
                                    + "\" rx=\"" + 0 + "\" ry=\"" + 0
                                    + "\" width=\"" + ctx.Integer(0) + "\" height=\"" + ctx.Integer(1)
                                    + "\"/>";
                            graphicaCode.add(doRect);
                        }
                    }
                }
            }

            if(ctx.ID() == null && ctx.point() != null && ctx.Integer() != null){
                if(ctx.Integer().size() == 4){
                    doRect = "<rect x=\"" + ctx.point().Integer(0)+ "\" y=\"" + ctx.point().Integer(1)
                            + "\" rx=\"" + ctx.Integer(0) + "\" ry=\"" + ctx.Integer(1)
                            + "\" width=\"" + ctx.Integer(2) + "\" height=\"" + ctx.Integer(3)
                            + "\"/>";
                    graphicaCode.add(doRect);
                }
                if(ctx.Integer().size() == 2){
                    doRect = "<rect x=\"" + ctx.point().Integer(0) + "\" y=\"" + ctx.point().Integer(1)
                            + "\" rx=\"" + 0 + "\" ry=\"" + 0
                            + "\" width=\"" + ctx.Integer(0) + "\" height=\"" + ctx.Integer(1)
                            + "\"/>";
                    graphicaCode.add(doRect);
                }
            }
        }
        return null;
    }

    //Line
    @Override
    public Void visitDrawLine(GraphicaParser.DrawLineContext ctx) {
        if(ctx != null){
            String doLine;
            String x1,y1,x2,y2;

            String id1,id2;
            GraphicaCoordinates coor1, coor2;
            if(ctx.Integer() != null && ctx.Integer().size() == 4){
                x1 = ctx.Integer(0).getText();
                y1 = ctx.Integer(1).getText();
                x2 = ctx.Integer(2).getText();
                y2 = ctx.Integer(3).getText();
                doLine = "<line x1=\"" + x1 + "\" x2=\"" + x2 + "\" y1=\"" + y1 + "\" y2=\"" + y2 +"\" stroke=\"black\" stroke-width=\"1\"/>";
                graphicaCode.add(doLine);
            }
            if(ctx.point() != null && ctx.point().size() == 1 && ctx.Integer() != null && ctx.Integer().size() == 2){
                x1 = ctx.point(0).Integer(0).getText();
                y1 = ctx.point(0).Integer(1).getText();
                x2 = ctx.Integer(0).getText();
                y2 = ctx.Integer(1).getText();
                doLine = "<line x1=\"" + x1 + "\" x2=\"" + x2 + "\" y1=\"" + y1 + "\" y2=\"" + y2 +"\" stroke=\"black\" stroke-width=\"1\"/>";
                graphicaCode.add(doLine);
            }
            if(ctx.point() != null && ctx.point().size()==2){
                x1 = ctx.point(0).Integer(0).getText();
                y1 = ctx.point(0).Integer(1).getText();
                x2 = ctx.point(1).Integer(0).getText();
                y2 = ctx.point(1).Integer(1).getText();
                doLine = "<line x1=\"" + x1 + "\" x2=\"" + x2 + "\" y1=\"" + y1 + "\" y2=\"" + y2 +"\" stroke=\"black\" stroke-width=\"1\"/>";
                graphicaCode.add(doLine);
            }
            if(graphicaLibraries.getObjects()){
                if(ctx.ID() != null && ctx.ID().size()==2){
                    id1 = ctx.ID(0).getText();
                    id2 = ctx.ID(1).getText();
                    if(coordinatesHashMap.get(id1) != null && coordinatesHashMap.get(id2) != null){
                        coor1 = coordinatesHashMap.get(id1);
                        coor2 = coordinatesHashMap.get(id2);
                        x1 = coor1.getX().toString();
                        y1 = coor1.getY().toString();
                        x2 = coor2.getX().toString();
                        y2 = coor2.getY().toString();
                        doLine = "<line x1=\"" + x1 + "\" x2=\"" + x2 + "\" y1=\"" + y1 + "\" y2=\"" + y2 +"\" stroke=\"black\" stroke-width=\"1\"/>";
                        graphicaCode.add(doLine);
                    }

                }
                if(ctx.ID() != null && ctx.ID().size()==1 && ctx.Integer() != null && ctx.Integer().size() == 2){
                    id1 = ctx.ID(0).getText();
                    if(coordinatesHashMap.get(id1) != null){
                        coor1 = coordinatesHashMap.get(id1);
                        x1 = coor1.getX().toString();
                        y1 = coor1.getY().toString();
                        x2 = ctx.Integer(0).getText();
                        y2 = ctx.Integer(1).getText();
                        doLine = "<line x1=\"" + x1 + "\" x2=\"" + x2 + "\" y1=\"" + y1 + "\" y2=\"" + y2 +"\" stroke=\"black\" stroke-width=\"1\"/>";
                        graphicaCode.add(doLine);
                    }
                }
            }
        }
        return null;
    }

    //Polyline
    /*//<polyline points="60, 110 65, 120 70, 115 75, 130 80, 125 85, 140 90, 135 95, 150 100, 145"/>
drawPolyline: Polyline L_Paren (point (Comma point)+) R_Paren Semicolon;*/
    @Override
    public Void visitDrawPolyline(GraphicaParser.DrawPolylineContext ctx) {
        if(ctx != null){
            StringBuilder doPolyline;
            if(ctx.point() != null && ctx.point().size() >= 2 ){
                doPolyline = new StringBuilder("<polyline points =\" ");
                for(int i = 0; i < ctx.point().size(); i++){
                    doPolyline.append(ctx.point(i).Integer(0)).append(",").append(ctx.point(i).Integer(1)).append(" ");
                }
                doPolyline.append("\"/>");
                graphicaCode.add(doPolyline.toString());
            }
        }
        return null;
    }

    //Visit Coordinates
    @Override
    public Void visitCoordinate(GraphicaParser.CoordinateContext ctx) {
        if(ctx != null && graphicaLibraries.getObjects()){
            if(ctx.ID() != null && ctx.Integer() != null){
                String identifier = ctx.ID().getText();
                GraphicaCoordinates coordinates = null;
                if(ctx.Integer().size() <=2){
                    if(ctx.Integer().isEmpty()){
                        coordinates = new GraphicaCoordinates();
                    }
                    if(ctx.Integer().size() == 1){
                        Integer value = Integer.valueOf(ctx.Integer(0).getText());
                        coordinates = new GraphicaCoordinates(value);
                    }
                    if(ctx.Integer().size() == 2){
                        Integer x = Integer.valueOf(ctx.Integer(0).getText());
                        Integer y = Integer.valueOf(ctx.Integer(1).getText());
                        coordinates = new GraphicaCoordinates(x,y);
                    }
                } else {
                    //RaiseError: Too many parameters
                }

                if(!identifier.isEmpty() && coordinates != null){
                    if(coordinatesHashMap.get(identifier) == null){
                        coordinatesHashMap.put(identifier,coordinates);
                    }else{
                        //RaiseError: Object already declared
                    }

                }
            }
        }
        return null;
    }


    public List<String> getGraphicaCode() {
        return graphicaCode;
    }
}
