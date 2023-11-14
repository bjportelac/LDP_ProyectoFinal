import java.util.ArrayList;
import java.util.List;

public class Translator<T> extends TypeScriptParserBaseVisitor<T>{

    //Arraylist to store the translated code
    public static List<String> translatedCode = new ArrayList<>();

    //Visit Program instance
    @Override
    public T visitProgram(TypeScriptParser.ProgramContext ctx) {
        if(ctx != null){
            translatedCode.add("package main \n");
            translatedCode.add("import \"fmt\"");
            translatedCode.add("\n\n");
            translatedCode.add("func main() ");
            translatedCode.add("{");
            translatedCode.add("/*Comment in golang*/\n");
            //Visit everything else in the tree...
            translatedCode.add("}");
        }
        return null;
    }
}
