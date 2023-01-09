package org.example.languageElements;

import org.antlr.v4.runtime.Token;
import org.example.Python3BaseVisitor;
import org.example.Python3Parser;
import org.example.languageElements.comparisons.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
//        if (vars.contains(name)) {
//            semanticErrors.add("Error variable " + name + " has already been" +
//                    " declared in line: " + line + "col: " + col);
//        } else {
            vars.add(name);
//        }


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

    @Override
    public Stmt visitGt(Python3Parser.GtContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Gt(left, right);
    }

    @Override
    public Stmt visitLt(Python3Parser.LtContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Lt(left, right);
    }

    @Override
    public Stmt visitGet(Python3Parser.GetContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Get(left, right);
    }

    @Override
    public Stmt visitLet(Python3Parser.LetContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Let(left, right);
    }

    @Override
    public Stmt visitEq(Python3Parser.EqContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Eq(left, right);
    }

    @Override
    public Stmt visitNeq(Python3Parser.NeqContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));
        return new Neq(left, right);
    }

    @Override
    public Stmt visitFloatNumber(Python3Parser.FloatNumberContext ctx) {
        String numText = ctx.getChild(0).getText();
        float num = Float.parseFloat(numText);
        return new FloatNumber(num);
    }

    @Override
    public Stmt visitDivision(Python3Parser.DivisionContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));

        return new Division(left, right);
    }

    @Override
    public Stmt visitNot(Python3Parser.NotContext ctx) {
        return new Not(visit(ctx.getChild(2)));
    }

    @Override
    public Stmt visitOr(Python3Parser.OrContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));

        return new Or(left, right);
    }

    @Override
    public Stmt visitAnd(Python3Parser.AndContext ctx) {
        Stmt left = visit(ctx.getChild(0));
        Stmt right = visit(ctx.getChild(2));

        return new And(left, right);
    }

    @Override
    public Stmt visitExprParenLog(Python3Parser.ExprParenLogContext ctx) {
        return new ExprParenLog(visit(ctx.getChild(1)));
    }

    @Override
    public Stmt visitBool(Python3Parser.BoolContext ctx)  {
        String numText = ctx.getChild(0).getText();
        int num = "true".equals(numText) ? 1 : 0;
        return new Number(num);
    }

    @Override
    public Stmt visitStringWord(Python3Parser.StringWordContext ctx) {
        String numText = ctx.getChild(0).getText();
        return new Striing(numText);
    }

//    @Override
//    public Stmt visitCondition(Python3Parser.ConditionContext ctx) {
//        List<Python3Parser.Condition_blockContext> conditions =  ctx.condition_block();
//
//        boolean evaluatedBlock = false;
//
//        for(Python3Parser.Condition_blockContext condition : conditions) {
//
//            Stmt evaluated = this.visit(condition.logical_expr());
//
//            if(evaluated) {
//                evaluatedBlock = true;
//                this.visit(condition.block());
//                break;
//            }
//        }
//
//        if(!evaluatedBlock && ctx.block() != null) {
//            this.visit(ctx.block());
//        }
//
//        return new Void();
//    }
//
//    @Override
//    public Stmt visitCondition_block(Python3Parser.Condition_blockContext ctx) {
//
//    }
//
//    @Override
//    public Stmt  visitBlock(Python3Parser.BlockContext ctx) {
//
//    }


    @Override
    public Stmt visitScope_block(Python3Parser.Scope_blockContext ctx) {
        String name = ctx.getChild(0).getText();
        name = name.substring(1, name.length() - 1);
        List<Stmt> stmts = new LinkedList<>();

        for (int j = 1; j < ctx.getChildCount() - 1; j++) {
            stmts.add(visit(ctx.getChild(j)));
        }

        return new ScopeBlock(name, stmts);
    }
}
