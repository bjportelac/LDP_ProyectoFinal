import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Translator<Object> extends GoParserBaseVisitor<Object>{

    //Arraylist to store the translated code
    public static List<String> translatedCode = new ArrayList<>();

    //Hashmap to store variables to assure correct type conversion
    private static HashMap<String,String> variablesControl = new HashMap<>();

    /*
    * fmt is GoLang system library to handle console input and messages -> Console
    * Please, verify if importDecl contains "fmt" and if it does, enable this boolean
    * so fmt sentences are interpreted to console logs.*/
    private Boolean fmtImport = null;

    @Override
    public Object visitSourceFile(GoParser.SourceFileContext ctx) {
        if(ctx != null){//EOS: End of Statements
            if(ctx.packageClause() != null){//Package is mandatory in golang
                visitPackageClause(ctx.packageClause());

                //Visit import declarations
                if(ctx.importDecl() != null){
                    for(int i = 0; i < ctx.importDecl().size(); i++){
                        visitImportDecl(ctx.importDecl(i));
                    }
                }

                //Visit functions
                if(ctx.functionDecl() != null){
                    for(int i = 0; i < ctx.functionDecl().size(); i++){
                        visitFunctionDecl(ctx.functionDecl(i));
                    }
                }

                //Visit Methods
                if(ctx.methodDecl() != null){
                    for(int i = 0; i < ctx.methodDecl().size(); i++){
                        visitMethodDecl(ctx.methodDecl(i));
                    }
                }

                //Visit declarations
                if(ctx.declaration() != null){
                    for(int i = 0; i < ctx.declaration().size(); i++){
                        visitDeclaration(ctx.declaration(i));
                    }
                }

            }
        }
        return null;
    }
}
