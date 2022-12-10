package org.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener implements Python3Listener{

    private final OurFileWriter writer;
    public MyListener(OurFileWriter writer) {
        this.writer = writer;
    }
    @Override
    public void enterSingle_input(Python3Parser.Single_inputContext ctx) {
        writer.addData("#include <stdio.h>");
        writer.addData("int main(int argc, char *argv[]) {");
    }

    @Override
    public void exitSingle_input(Python3Parser.Single_inputContext ctx) {
        writer.addData("return 0;");
        writer.addData("}");
    }

    @Override
    public void enterFile_input(Python3Parser.File_inputContext ctx) {
        writer.addData("#include <stdio.h>");
        writer.addData("int main(int argc, char *argv[]) {");
    }

    @Override
    public void exitFile_input(Python3Parser.File_inputContext ctx) {
        writer.addData("return 0;");
        writer.addData("}");
    }

    @Override
    public void enterStmt(Python3Parser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(Python3Parser.StmtContext ctx) {

    }

    @Override
    public void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx) {

    }

    @Override
    public void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx) {

    }

    @Override
    public void enterSmall_stmt(Python3Parser.Small_stmtContext ctx) {

    }

    @Override
    public void exitSmall_stmt(Python3Parser.Small_stmtContext ctx) {

    }

    @Override
    public void enterAssignment_stmt(Python3Parser.Assignment_stmtContext ctx) {

    }

    @Override
    public void exitAssignment_stmt(Python3Parser.Assignment_stmtContext ctx) {

    }

    @Override
    public void enterDeclaration(Python3Parser.DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(Python3Parser.DeclarationContext ctx) {

    }

    @Override
    public void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx) {

    }

    @Override
    public void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx) {

    }

    @Override
    public void enterBreak_stmt(Python3Parser.Break_stmtContext ctx) {

    }

    @Override
    public void exitBreak_stmt(Python3Parser.Break_stmtContext ctx) {

    }

    @Override
    public void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx) {

    }

    @Override
    public void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx) {

    }

    @Override
    public void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx) {

    }

    @Override
    public void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx) {

    }

    @Override
    public void enterIf_stmt(Python3Parser.If_stmtContext ctx) {
//        writer.addData("if (" + ctx.cond_expression().);
    }

    @Override
    public void exitIf_stmt(Python3Parser.If_stmtContext ctx) {

    }

    @Override
    public void enterWhile_stmt(Python3Parser.While_stmtContext ctx) {
        writer.addData("while (");

    }

    @Override
    public void exitWhile_stmt(Python3Parser.While_stmtContext ctx) {
        writer.addData("end");
    }

    @Override
    public void enterSuite(Python3Parser.SuiteContext ctx) {

    }

    @Override
    public void exitSuite(Python3Parser.SuiteContext ctx) {

    }

    @Override
    public void enterCond_expression(Python3Parser.Cond_expressionContext ctx) {

    }

    @Override
    public void exitCond_expression(Python3Parser.Cond_expressionContext ctx) {

    }

    @Override
    public void enterMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void exitMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx) {

    }

    @Override
    public void enterAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void exitAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx) {

    }

    @Override
    public void enterRelationalExpression(Python3Parser.RelationalExpressionContext ctx) {

    }

    @Override
    public void exitRelationalExpression(Python3Parser.RelationalExpressionContext ctx) {

    }

    @Override
    public void enterEqualityExpression(Python3Parser.EqualityExpressionContext ctx) {

    }

    @Override
    public void exitEqualityExpression(Python3Parser.EqualityExpressionContext ctx) {

    }

    @Override
    public void enterLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void exitLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx) {

    }

    @Override
    public void enterLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void exitLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx) {

    }

    @Override
    public void enterPrint_stmt(Python3Parser.Print_stmtContext ctx) {
        String str = ctx.children.get(1).toString();
        writer.addData("printf(\"%s\\n\");".formatted(str.substring(1, str.length() - 1)));

    }

    @Override
    public void exitPrint_stmt(Python3Parser.Print_stmtContext ctx) {

    }

    @Override
    public void enterExpr(Python3Parser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(Python3Parser.ExprContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
