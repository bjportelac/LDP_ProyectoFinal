import GraphicaObjectsModule.GraphicaCoordinates;
import GraphicaObjectsModule.Shapes.Circle;
import GraphicaObjectsModule.Shapes.Shape;
import GraphicaObjectsModule.Style.Fill;
import GraphicaObjectsModule.Style.IStyle;
import GraphicaObjectsModule.Style.RGB;
import GraphicaObjectsModule.Style.Stroke;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphicaInterpreter<Void>  extends  GraphicaParserBaseVisitor<Void>{

    List<String> graphicaCode = new ArrayList<>();

    GraphicaLibraries graphicaLibraries = new GraphicaLibraries();

    //Graphica Objects Handle
    HashMap<String, GraphicaCoordinates> coordinatesHashMap = new HashMap<>();
    HashMap<String, RGB> colorsHashMap = new HashMap<>();
    HashMap<String, Fill> fillHashMap = new HashMap<>();
    HashMap<String, Stroke> strokeHashMap = new HashMap<>();
    HashMap<String, IStyle> iStyleHashMap = new HashMap<>();
    HashMap<String, Shape> shapeHashMap = new HashMap<>();
    //shapeHashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

    //SourceFile
    @Override
    public Void visitSourceFile(GraphicaParser.SourceFileContext ctx) {
        if(ctx != null){
            if(ctx.importStatements() != null){
                for(int i = 0; i < ctx.importStatements().size(); i++){
                    visitImportStatements(ctx.importStatements(i));
                }
            }

            if(ctx.coordinate() != null){
                for(int i = 0; i < ctx.coordinate().size(); i++){
                    visitCoordinate(ctx.coordinate(i));
                }
            }

            if(ctx.initialize() != null){
                visitInitialize(ctx.initialize());
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
            if(ctx.objectsLibElem() != null){
                for(int i = 0; i<ctx.objectsLibElem().size() ;i++){
                    visitObjectsLibElem(ctx.objectsLibElem(i));
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
                    GraphicaCoordinates coordinates;
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
                    GraphicaCoordinates coordinates;
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
                    GraphicaCoordinates coordinates;
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

    //----------------------OBJECTS MODULE ELEMENTS---------------------------------

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
                }

                if(!identifier.isEmpty() && coordinates != null){
                    coordinatesHashMap.putIfAbsent(identifier, coordinates);

                }
            }
        }
        return null;
    }

    @Override
    public Void visitObjectsLibElem(GraphicaParser.ObjectsLibElemContext ctx) {
        if(ctx != null && graphicaLibraries.getObjects()){
            if(ctx.rgbColor() != null){
                visitRgbColor(ctx.rgbColor());
            }
            if(ctx.fill() != null){
                visitFill(ctx.fill());
            }
            if(ctx.stroke() != null){
                visitStroke(ctx.stroke());
            }
            if(ctx.istyle() != null){
                visitIstyle(ctx.istyle());
            }
            if(ctx.shape() != null){
                visitShape(ctx.shape());
            }
            if(ctx.objsectsLibFunctions() != null){
                visitObjsectsLibFunctions(ctx.objsectsLibFunctions());
            }
        }
        return null;
    }

    //RGB colors
    @Override
    public Void visitRgbColor(GraphicaParser.RgbColorContext ctx) {
        if(ctx != null){;
            if(ctx.ID() != null && ctx.Integer() != null){
                String identifier = ctx.ID().getText();
                RGB rgb = null;

                if(ctx.Integer().isEmpty()){
                    rgb = new RGB();
                }
                if(ctx.Integer().size() == 3){
                    rgb = new RGB(Integer.valueOf(ctx.Integer(0).getText()),Integer.valueOf(ctx.Integer(1).getText()),Integer.valueOf(ctx.Integer(2).getText()));
                }

                if(!identifier.isEmpty() && rgb != null){
                    colorsHashMap.putIfAbsent(identifier, rgb);
                }
            }
        }
        return null;
    }

    //Fill
    @Override
    public Void visitFill(GraphicaParser.FillContext ctx) {
        if(ctx != null){
            Fill fill = null;
            String identifier = null;
            if(ctx.ID() != null){

                RGB rgb = null;
                Double opacity = null;

                identifier = ctx.ID(0).getText();
                if(ctx.ID().size() == 1 && ctx.ID(0) != null && ctx.Integer().size() == 3 && ctx.Double() != null){
                    rgb = new RGB(Integer.valueOf(ctx.Integer(0).getText()),Integer.valueOf(ctx.Integer(1).getText()),Integer.valueOf(ctx.Integer(2).getText()));
                    opacity = Double.parseDouble(ctx.Double().getText());
                    fill = new Fill(rgb,opacity);
                }
                if(ctx.ID().size() == 2 && ctx.ID(0) != null && ctx.Double() != null){
                    rgb = colorsHashMap.get(ctx.ID(1).getText());
                    if(rgb != null){
                        opacity = Double.parseDouble(ctx.Double().getText());
                        fill = new Fill(rgb,opacity);
                    }
                }
                if(ctx.Integer().isEmpty() && ctx.Double() == null){
                    fill = new Fill();
                }

                if(!identifier.isEmpty() && fill != null){
                    fillHashMap.putIfAbsent(identifier, fill);
                }

            }
        }
        return null;
    }

    @Override
    public Void visitStroke(GraphicaParser.StrokeContext ctx) {
        if(ctx != null){
            if(ctx.ID() != null){
                Stroke stroke = null;
                String identifier,linecap = null;
                RGB rgb = null;
                Double width = null, opacity = null;
                identifier = ctx.ID(0).getText();
                if(ctx.Integer() != null && ctx.Integer().size() == 3){
                    rgb = new RGB(Integer.valueOf(ctx.Integer(0).getText()),Integer.valueOf(ctx.Integer(1).getText()),Integer.valueOf(ctx.Integer(2).getText()));
                }
                if(ctx.ID(1) != null){
                    rgb = colorsHashMap.get(ctx.ID(1).getText());
                }
                if(ctx.Double() != null && ctx.Double().size() == 2){
                    opacity = Double.parseDouble(ctx.Double(0).getText());
                    width = Double.parseDouble(ctx.Double(1).getText());
                }
                if(ctx.FillType() != null){
                    linecap = ctx.FillType().getText();
                }
                if(rgb != null && identifier != null && linecap != null && width != null && opacity != null){
                    stroke = new Stroke(rgb,opacity,width,linecap);
                }else{
                    stroke = new Stroke();
                }
                strokeHashMap.putIfAbsent(identifier,stroke);
            }
        }
        return null;
    }

    //IStyle
    @Override
    public Void visitIstyle(GraphicaParser.IstyleContext ctx) {
        if(ctx != null){
            if(ctx.ID() != null &&ctx.Double() != null){
                String identifier = null;
                Fill fill = null;
                Stroke stroke = null;
                IStyle iStyle = null;
                Double opacity = null;

                if(ctx.ID(0) != null){
                    identifier = ctx.ID(0).getText();
                }
                if(ctx.ID(1) != null && ctx.ID(2) != null){
                    if(fillHashMap.get(ctx.ID(1).getText()) != null){
                        fill = fillHashMap.get(ctx.ID(1).getText());
                    }
                    if(strokeHashMap.get(ctx.ID(2).getText()) != null){
                        stroke = strokeHashMap.get(ctx.ID(2).getText());
                    }
                }
                opacity = Double.parseDouble(ctx.Double().getText());

                if(identifier != null && stroke != null && fill != null){
                    iStyle = new IStyle(fill,stroke,opacity);
                }

                iStyleHashMap.putIfAbsent(identifier,iStyle);
            }
        }
        return null;
    }

    //Shapes
    @Override
    public Void visitShape(GraphicaParser.ShapeContext ctx) {
        if(ctx != null){
            if(ctx.circle() != null){
                visitCircle(ctx.circle());
            }
        }
        return null;
    }

    @Override
    public Void visitCircle(GraphicaParser.CircleContext ctx) {
        if(ctx != null){
            if(ctx.Integer() != null && ctx.Integer().size() == 3 && ctx.ID() != null && ctx.ID().size() == 2){
                Circle circle = null;
                String identifier = null;
                IStyle iStyle = null;

                identifier = ctx.ID(0).getText();
                if(identifier != null){
                    iStyle = iStyleHashMap.get(ctx.ID(1).getText());
                    if(iStyle != null){
                        circle = new Circle(Integer.valueOf(ctx.Integer(0).getText()),Integer.valueOf(ctx.Integer(1).getText()),Integer.valueOf(ctx.Integer(2).getText()));
                        circle.setStyle(iStyle);
                    }
                }

                shapeHashMap.putIfAbsent(identifier,circle);
            }
        }
        return null;
    }

    @Override
    public Void visitObjsectsLibFunctions(GraphicaParser.ObjsectsLibFunctionsContext ctx) {
        if(ctx != null){
            if(ctx.dotDraw() != null){
                visitDotDraw(ctx.dotDraw());
            }
        }
        return null;
    }

    @Override
    public Void visitDotDraw(GraphicaParser.DotDrawContext ctx) {
        if(ctx != null){
            Shape shape = null;
            StringBuilder sb = new StringBuilder();
            if(ctx.ID() != null){
                if(shapeHashMap.get(ctx.ID().toString()) != null){
                    shape = shapeHashMap.get(ctx.ID().toString());
                    if(shape instanceof Circle){
                        Circle c = (Circle) shape;
                        if(c.getCx() != null && c.getCy() != null && c.getR() != null)
                            // doCircle = "<circle cx=\"" + ctx.Integer(0) + "\" cy=\"" + ctx.Integer(1) + "\" r=\"" + ctx.Integer(2) + "\"/>";
                            sb.append("<circle cx=\"")
                                    .append(c.getCx())
                                    .append("\" cy=\"")
                                    .append(c.getCy())
                                    .append("\" r=\"")
                                    .append(c.getR());
                        if(c.getStyle() != null){
                            if(c.getStyle().getFill() != null){
                                Fill f = c.getStyle().getFill();
                                if(f.getFillColor() != null){
                                    RGB rgb  = f.getFillColor();
                                    sb.append("\" fill=\"").append("rgb(").append(rgb.getRed()).append(",").append(rgb.getGreen()).append(",").append(rgb.getBlue()).append(")\"");
                                }
                                if(f.getOpacity() != null){
                                    sb.append(" fill-opacity=\"").append(f.getOpacity()).append("\"");
                                }
                            }
                            if(c.getStyle().getStroke() != null){
                                Stroke s = c.getStyle().getStroke();
                                if(s.getStrokeColor() != null){
                                    RGB rgb = s.getStrokeColor();
                                    sb.append(" stroke=\"rgb(").append(rgb.getRed()).append(",").append(rgb.getGreen()).append(",").append(rgb.getBlue()).append(")\"");
                                }
                                if(s.getStrokeOpacity() != null){
                                    sb.append(" stroke-opacity=\"").append(s.getStrokeOpacity()).append("\"");
                                }
                                if(s.getStrokeWidth() != null){
                                    sb.append(" stroke-width=\"").append(s.getStrokeWidth()).append("\"");
                                }
                                if(s.getLinecap() != null){
                                    sb.append(" stroke-linecap=\"").append(s.getLinecap()).append("\"");
                                }
                            }
                            sb.append("/>");
                        }else{
                            sb.append("/>");
                        }

                        graphicaCode.add(sb.toString());
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
