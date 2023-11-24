import java.io.IOException;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;

public class HphLexer {
    public static void main(String[] args){
        String filename = "D:\\Ufla\\Compiladores\\Trabalho-de-Compiladores\\codigo.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename); 
            hphGramaticaLexer lexer = new hphGramaticaLexer(input);
            Token token;
            while (!lexer._hitEOF) {
                token =  lexer.nextToken();
                System.out.println("Token: "+ token.toString());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
