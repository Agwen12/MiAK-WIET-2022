// Generated from java-escape by ANTLR 4.11.1
package org.example;
                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Python3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(Python3Parser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(Python3Parser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Python3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Python3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterCond_expression(Python3Parser.Cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitCond_expression(Python3Parser.Cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Python3Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Python3Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Python3Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Python3Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(Python3Parser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(Python3Parser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Python3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Python3Parser.ExprContext ctx);
}