import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception{
        try {
            GoControl goControl = new GoControl();
            /*
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> code = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line= scanner.nextLine();
                code.add(line);
            }

            String program = String.join("\n", code);

            scanner.close();
            code.clear();


            TypeScriptLexer TSlexer = new TypeScriptLexer(CharStreams.fromString(program));*/
            TypeScriptLexer TSlexer = new TypeScriptLexer(CharStreams.fromFileName("input/input.txt"));
            CommonTokenStream tokenStream = new CommonTokenStream(TSlexer);

            TypeScriptParser TSparser = new TypeScriptParser(tokenStream);
            ParseTree tree = TSparser.program();

            Translator loader = new Translator();
            loader.visit(tree);

            List<String> translation = Translator.translatedCode;
            translation.toString();

            /*Move translation to string interpreter to handle indentation
             and new lines*/

            String goLangCode = goControl.IndentationController(translation);
            System.out.println(goLangCode);

        } catch (Exception e){
            System.err.println("Error during translation: " + e.getCause());
            throw e;
        }
    }
}