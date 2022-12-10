// Generated from java-escape by ANTLR 4.11.1
package org.example;
                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Python3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Python3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Python3Parser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(Python3Parser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(Python3Parser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(Python3Parser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(Python3Parser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(Python3Parser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Python3Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(Python3Parser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(Python3Parser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(Python3Parser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(Python3Parser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(Python3Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(Python3Parser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(Python3Parser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expression(Python3Parser.Cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Python3Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Python3Parser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Python3Parser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Python3Parser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(Python3Parser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(Python3Parser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(Python3Parser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Python3Parser.ExprContext ctx);
}