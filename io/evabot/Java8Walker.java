package io.evabot;

public class Java8Walker extends Java8BaseListener {
  public void enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {
    System.out.println(ctx.Identifier().getText());
  }
}
