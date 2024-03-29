// Generated from java-escape by ANTLR 4.11.1
                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level
package org.example;

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
	 * Visit a parse tree produced by the {@code FileInput}
	 * labeled alternative in {@link Python3Parser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileInput(Python3Parser.FileInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Python3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Python3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReAssignment}
	 * labeled alternative in {@link Python3Parser#reassignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReAssignment(Python3Parser.ReAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link Python3Parser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Python3Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(Python3Parser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(Python3Parser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(Python3Parser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Python3Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShadowVariable}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShadowVariable(Python3Parser.ShadowVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(Python3Parser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Python3Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Python3Parser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatNumber}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatNumber(Python3Parser.FloatNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(Python3Parser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringWord}
	 * labeled alternative in {@link Python3Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringWord(Python3Parser.StringWordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(Python3Parser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(Python3Parser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(Python3Parser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Get}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(Python3Parser.GetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lt}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(Python3Parser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenLog}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenLog(Python3Parser.ExprParenLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(Python3Parser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neq}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(Python3Parser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(Python3Parser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Gt}
	 * labeled alternative in {@link Python3Parser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(Python3Parser.GtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Python3Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(Python3Parser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Python3Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#scope_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_block(Python3Parser.Scope_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Python3Parser#whilee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilee(Python3Parser.WhileeContext ctx);
}