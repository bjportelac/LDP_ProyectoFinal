import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

class Main {
    public static void main(String[] args) throws Exception{
        try {

            GraphicaLexer graphicaLexer = new GraphicaLexer(CharStreams.fromFileName("input/input.txt"));
            CommonTokenStream tokenStream = new CommonTokenStream(graphicaLexer);

            GraphicaParser graphicaParser = new GraphicaParser(tokenStream);
            ParseTree graphicaTree = graphicaParser.sourceFile();

            GraphicaInterpreter<Void> interpreter = new GraphicaInterpreter<>();
            interpreter.visit(graphicaTree);

            StringBuilder objectiveCode = new StringBuilder();
            List<String>  graphicaCode = interpreter.getGraphicaCode();
            if(graphicaCode != null && !graphicaCode.isEmpty()){
                for(String s : graphicaCode){
                    objectiveCode.append(s).append("\n");
                }
            }

            System.out.println(objectiveCode.toString());

        } catch (Exception e){
            System.err.println("Error during translation: " + e.getCause());
            throw e;
        }
    }
}