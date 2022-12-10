package org.example;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyVisitor <T> extends Python3BaseVisitor<T>{
    @Override
    public T visitSingle_input(Python3Parser.Single_inputContext ctx) {
        return null;
    }

    @Override
    public T visitFile_input(Python3Parser.File_inputContext ctx) {
        System.out.println("DUUUPPAA file");
        return null;
    }

    @Override
    public T visitStmt(Python3Parser.StmtContext ctx) {
        return null;
    }

    @Override
    public T visitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitSmall_stmt(Python3Parser.Small_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitAssignment_stmt(Python3Parser.Assignment_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitDeclaration(Python3Parser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public T visitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitBreak_stmt(Python3Parser.Break_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitIf_stmt(Python3Parser.If_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitWhile_stmt(Python3Parser.While_stmtContext ctx) {
        return null;
    }

    @Override
    public T visitSuite(Python3Parser.SuiteContext ctx) {
        return null;
    }

    @Override
    public T visitCond_expression(Python3Parser.Cond_expressionContext ctx) {
        return null;
    }

    @Override
    public T visitMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitRelationalExpression(Python3Parser.RelationalExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitEqualityExpression(Python3Parser.EqualityExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitPrint_stmt(Python3Parser.Print_stmtContext ctx) {
        System.out.println(ctx.STRING().toString());
        System.out.println("DUPPPPPPPPPPPA");
        return null;
    }

    @Override
    public T visitExpr(Python3Parser.ExprContext ctx) {

        int childrenCount = ctx.getChildCount();
        if (childrenCount == 1) {
            return (T) ctx.getChild(TerminalNode.class, 0);
        }
        return null;
    }

    @Override
    public T visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public T visitTerminal(TerminalNode terminalNode) {
        return (T) terminalNode.getSymbol().getText();
    }

    @Override
    public T visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
