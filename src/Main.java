import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {

    public static void main(String[] args)  {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            grammarEPNLexer lexer = new grammarEPNLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            grammarEPNParser parser = new grammarEPNParser(tokens);
            ParseTree tree = parser.expr();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }

}