package io.evabot;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class IsValidJavaCheck {
  public static void main(String[] args)
    throws IOException
  {
    Java8Lexer lexer = new Java8Lexer(new ANTLRFileStream(args[0]));
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Java8Parser parser = new Java8Parser(tokens);
    parser.setErrorHandler(new BailErrorStrategy());
    ParseTree tree = parser.compilationUnit();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new Java8BaseListener(), tree);
  }
}
