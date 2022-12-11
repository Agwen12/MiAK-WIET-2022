package org.example.languageElements;

import org.antlr.v4.runtime.Token;
import org.example.Python3BaseVisitor;
import org.example.Python3Parser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AntlrToStmt extends Python3BaseVisitor<Stmt> {

    private final List<String> vars;
    private final List<String> semanticErrors;

    public AntlrToStmt(List<String> semanticErrors) {
        this.vars = new LinkedList<>();
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Stmt visitStmt(Python3Parser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Stmt visitAssignment(Python3Parser.AssignmentContext ctx) {
        String type = ctx.getChild(0).getText();
        Token nameToken = ctx.NAME().getSymbol();
        int line = nameToken.getLine();
        int col = nameToken.getCharPositionInLine() + 1;
        String name = ctx.getChild(1).getText();
        if (vars.contains(name)) {
            semanticErrors.add("Error variable " + name + "has already been" +
                    " declared in line: " + line + "col: " + col);
        } else {
            vars.add(name);
        }


        Stmt exp = visit(ctx.getChild(3));

        return new Assignment(type, name, exp);
    }

    @Override
    public Stmt visitPrint(Python3Parser.PrintContext ctx) {
        Stmt content = visit(ctx.getChild(1));
        return new Print(content);
    }

    @Override
    public Stmt visitMultiplication(Python3Parser.MultiplicationContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Multiplication(left, right);
    }

    @Override
    public Stmt visitAddition(Python3Parser.AdditionContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Addition(left, right);
    }

    @Override
    public Stmt visitVariable(Python3Parser.VariableContext ctx) {
        String name = ctx.getChild(0).getText();
        Token nameToken = ctx.NAME().getSymbol();
        int line = nameToken.getLine();
        int col = nameToken.getCharPositionInLine() + 1;
        if (!vars.contains(name)) {
            semanticErrors.add("Error: variable " + name +
                    " is not declared ( line: " + line +
                    " col: " + col + ")");
        }

        return new Variable(name);
    }

    @Override
    public Stmt visitSubtraction(Python3Parser.SubtractionContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));

        return new Subtraction(left, right);
    }

    @Override
    public Stmt visitNumber(Python3Parser.NumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);
        return new Number(num);
    }

    @Override
    public Stmt visitExprParen(Python3Parser.ExprParenContext ctx) {
        return new ExprParen(visit(ctx.getChild(1)));
    }

    //    @Override
//    public Stmt visitExpression(Python3Parser.ExpressionContext ctx) {
//        return super.visitExpression(ctx);
//    }

    @Override
    public Stmt visitFloatNumber(Python3Parser.FloatNumberContext ctx) {
        return super.visitFloatNumber(ctx);
    }

    @Override
    public Stmt visitDivision(Python3Parser.DivisionContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));

        return new Division(left, right);
    }

    @Override
    public Stmt visitBoolean(Python3Parser.BooleanContext ctx) {
        return super.visitBoolean(ctx);
    }
}
