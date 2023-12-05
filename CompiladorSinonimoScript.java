import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CompiladorSinonimoScript {
    public static void main(String[] args) {
        sinonimoScriptParser parser = getParser("codigo.txt");

        ParseTree ast = parser.program();

        System.out.println(ast.toStringTree());

        MyListener listener = new MyListener();

        ParseTreeWalker.DEFAULT.walk(listener, ast);

        System.out.println(listener.getTabelaSimbolos().toString());
    }

    private static sinonimoScriptParser getParser(String filename){
        sinonimoScriptParser parser = null;

        try{
            CharStream input = CharStreams.fromFileName(filename);
            sinonimoScriptLexer lexer = new sinonimoScriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new sinonimoScriptParser(tokens);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return parser;
    }
}
