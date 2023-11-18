import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        try {
            GoControl goControl = new GoControl();

            GoLexer goLexer = new GoLexer(CharStreams.fromFileName("input/input.txt"));
            CommonTokenStream tokenStream = new CommonTokenStream(goLexer);

            GoParser goParser = new GoParser(tokenStream);
            ParseTree goTree = goParser.sourceFile();

            Translator<Object> loader = new Translator<>();
            loader.visit(goTree);

            List<String> translation = Translator.translatedCode;

            String objectiveCode = goControl.IndentationController(translation);
            System.out.println(objectiveCode);

        } catch (Exception e){
            System.err.println("Error during translation: " + e.getCause());
            throw e;
        }
    }
}