// Generated from java-escape by ANTLR 4.11.1
                                                     //*** https://github.com/antlr/antlr4/blob/master/doc/grammars.md#actions-at-the-grammar-level
package org.example;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Python3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, EQUAL=7, BREAK=8, CONTINUE=9, 
		IF=10, COLON=11, ELIF=12, ELSE=13, WHILE=14, MUL=15, DIV=16, MOD=17, ADD=18, 
		SUB=19, LT=20, GT=21, LE=22, GE=23, EQUAL_EQUAL=24, NOT_EQUAL=25, PRINT=26, 
		NOT=27, AND=28, OR=29, SCOPE_BLOCK_NAME=30, SCOPE_BLOCK_END=31, TYPE=32, 
		STRING=33, NUMBER=34, INTEGER=35, BOOLEAN=36, NEWLINE=37, END=38, NAME=39, 
		STRING_LITERAL=40, DECIMAL_INTEGER=41, FLOAT_NUMBER=42, OPEN_PAREN=43, 
		CLOSE_PAREN=44, OPEN_BRACK=45, CLOSE_BRACK=46, OPEN_BRACE=47, CLOSE_BRACE=48, 
		SKIP_=49, UNKNOWN_CHAR=50, INDENT=51, DEDENT=52;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_assignment_stmt = 2, RULE_reassignment_stmt = 3, 
		RULE_function_declaration = 4, RULE_function_call = 5, RULE_return = 6, 
		RULE_print_stmt = 7, RULE_expr = 8, RULE_logical_expr = 9, RULE_condition = 10, 
		RULE_condition_block = 11, RULE_block = 12, RULE_scope_block = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "assignment_stmt", "reassignment_stmt", "function_declaration", 
			"function_call", "return", "print_stmt", "expr", "logical_expr", "condition", 
			"condition_block", "block", "scope_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'=>'", "'$'", "','", "'return'", "'@'", "'='", "'break'", 
			"'continue'", "'if'", "':'", "'elif'", "'else'", "'while'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'print'", 
			"'!'", "'and'", "'or'", null, null, null, null, null, null, null, null, 
			"'end'", null, null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EQUAL", "BREAK", "CONTINUE", 
			"IF", "COLON", "ELIF", "ELSE", "WHILE", "MUL", "DIV", "MOD", "ADD", "SUB", 
			"LT", "GT", "LE", "GE", "EQUAL_EQUAL", "NOT_EQUAL", "PRINT", "NOT", "AND", 
			"OR", "SCOPE_BLOCK_NAME", "SCOPE_BLOCK_END", "TYPE", "STRING", "NUMBER", 
			"INTEGER", "BOOLEAN", "NEWLINE", "END", "NAME", "STRING_LITERAL", "DECIMAL_INTEGER", 
			"FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Python3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class File_inputContext extends ParserRuleContext {
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
	 
		public File_inputContext() { }
		public void copyFrom(File_inputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FileInputContext extends File_inputContext {
		public TerminalNode EOF() { return getToken(Python3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FileInputContext(File_inputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitFileInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			_localctx = new FileInputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 13981393617994L) != 0) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(28);
					match(NEWLINE);
					}
					break;
				case T__0:
				case T__2:
				case T__5:
				case IF:
				case PRINT:
				case NOT:
				case SCOPE_BLOCK_NAME:
				case TYPE:
				case STRING:
				case NUMBER:
				case BOOLEAN:
				case NAME:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
					{
					setState(29);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Reassignment_stmtContext reassignment_stmt() {
			return getRuleContext(Reassignment_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Scope_blockContext scope_block() {
			return getRuleContext(Scope_blockContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				reassignment_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				logical_expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				print_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				scope_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(44);
				function_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assignment_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
	 
		public Assignment_stmtContext() { }
		public void copyFrom(Assignment_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends Assignment_stmtContext {
		public TerminalNode TYPE() { return getToken(Python3Parser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(Python3Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(Assignment_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_stmt);
		try {
			_localctx = new AssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TYPE);
			setState(48);
			match(NAME);
			setState(49);
			match(EQUAL);
			setState(50);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reassignment_stmtContext extends ParserRuleContext {
		public Reassignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassignment_stmt; }
	 
		public Reassignment_stmtContext() { }
		public void copyFrom(Reassignment_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReAssignmentContext extends Reassignment_stmtContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(Python3Parser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReAssignmentContext(Reassignment_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitReAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reassignment_stmtContext reassignment_stmt() throws RecognitionException {
		Reassignment_stmtContext _localctx = new Reassignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reassignment_stmt);
		try {
			_localctx = new ReAssignmentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(NAME);
			setState(53);
			match(EQUAL);
			setState(54);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(Python3Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Python3Parser.NAME, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public List<TerminalNode> TYPE() { return getTokens(Python3Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Python3Parser.TYPE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public TerminalNode END() { return getToken(Python3Parser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(NAME);
			setState(58);
			match(OPEN_PAREN);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(59);
				match(TYPE);
				setState(60);
				match(NAME);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(CLOSE_PAREN);
			setState(67);
			match(T__1);
			setState(68);
			match(TYPE);
			setState(69);
			match(NEWLINE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 13843954664522L) != 0) {
				{
				{
				setState(70);
				stmt();
				setState(71);
				match(NEWLINE);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			return_();
			setState(79);
			match(NEWLINE);
			setState(80);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__2);
			setState(83);
			match(NAME);
			setState(84);
			match(OPEN_PAREN);
			{
			setState(85);
			expr(0);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(86);
				match(T__3);
				{
				setState(87);
				expr(0);
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__4);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(96);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	 
		public Print_stmtContext() { }
		public void copyFrom(Print_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends Print_stmtContext {
		public TerminalNode PRINT() { return getToken(Python3Parser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(Print_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_stmt);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PRINT);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(100);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(101);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Python3Parser.MUL, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Python3Parser.ADD, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExprContext {
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShadowVariableContext extends ExprContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public ShadowVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitShadowVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(Python3Parser.SUB, 0); }
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(Python3Parser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(Python3Parser.BOOLEAN, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatNumberContext extends ExprContext {
		public TerminalNode FLOAT_NUMBER() { return getToken(Python3Parser.FLOAT_NUMBER, 0); }
		public FloatNumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitFloatNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Python3Parser.DIV, 0); }
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringWordContext extends ExprContext {
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public StringWordContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitStringWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105);
				match(OPEN_PAREN);
				setState(106);
				expr(0);
				setState(107);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(NAME);
				}
				break;
			case T__5:
				{
				_localctx = new ShadowVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(T__5);
				setState(111);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				{
				_localctx = new FloatNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(FLOAT_NUMBER);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				_localctx = new StringWordContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(STRING);
				}
				break;
			case T__2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				function_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(120);
						match(MUL);
						setState(121);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(123);
						match(DIV);
						setState(124);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(126);
						match(ADD);
						setState(127);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(129);
						match(SUB);
						setState(130);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_exprContext extends ParserRuleContext {
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	 
		public Logical_exprContext() { }
		public void copyFrom(Logical_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends Logical_exprContext {
		public TerminalNode NOT() { return getToken(Python3Parser.NOT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public NotContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(Python3Parser.OR, 0); }
		public OrContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Logical_exprContext {
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(Python3Parser.AND, 0); }
		public AndContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GE() { return getToken(Python3Parser.GE, 0); }
		public GetContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(Python3Parser.LT, 0); }
		public LtContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenLogContext extends Logical_exprContext {
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public ExprParenLogContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitExprParenLog(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(Python3Parser.LE, 0); }
		public LetContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(Python3Parser.NOT_EQUAL, 0); }
		public NeqContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(Python3Parser.EQUAL_EQUAL, 0); }
		public EqContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends Logical_exprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(Python3Parser.GT, 0); }
		public GtContext(Logical_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		return logical_expr(0);
	}

	private Logical_exprContext logical_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, _parentState);
		Logical_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				match(NOT);
				setState(138);
				match(OPEN_PAREN);
				setState(139);
				logical_expr(0);
				setState(140);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(OPEN_PAREN);
				setState(143);
				logical_expr(0);
				setState(144);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				expr(0);
				setState(147);
				match(GT);
				setState(148);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				expr(0);
				setState(151);
				match(LT);
				setState(152);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				expr(0);
				setState(155);
				match(GE);
				setState(156);
				expr(0);
				}
				break;
			case 6:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				expr(0);
				setState(159);
				match(LE);
				setState(160);
				expr(0);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				expr(0);
				setState(163);
				match(EQUAL_EQUAL);
				setState(164);
				expr(0);
				}
				break;
			case 8:
				{
				_localctx = new NeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				expr(0);
				setState(167);
				match(NOT_EQUAL);
				setState(168);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(172);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(173);
						match(AND);
						setState(174);
						logical_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(175);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(176);
						match(OR);
						setState(177);
						logical_expr(8);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Python3Parser.IF, 0); }
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(Python3Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(Python3Parser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(Python3Parser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IF);
			setState(184);
			condition_block();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(185);
				match(ELIF);
				setState(186);
				condition_block();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(192);
				match(ELSE);
				setState(193);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(Python3Parser.OPEN_PAREN, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(Python3Parser.CLOSE_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(OPEN_PAREN);
			setState(197);
			logical_expr(0);
			setState(198);
			match(CLOSE_PAREN);
			setState(199);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(Python3Parser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(Python3Parser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(COLON);
			setState(202);
			match(NEWLINE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 13843954664522L) != 0) {
				{
				{
				setState(203);
				stmt();
				setState(204);
				match(NEWLINE);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(END);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(212);
				match(NEWLINE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Scope_blockContext extends ParserRuleContext {
		public TerminalNode SCOPE_BLOCK_NAME() { return getToken(Python3Parser.SCOPE_BLOCK_NAME, 0); }
		public TerminalNode SCOPE_BLOCK_END() { return getToken(Python3Parser.SCOPE_BLOCK_END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(Python3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Python3Parser.NEWLINE, i);
		}
		public Scope_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitScope_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scope_blockContext scope_block() throws RecognitionException {
		Scope_blockContext _localctx = new Scope_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_scope_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SCOPE_BLOCK_NAME);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 13981393617994L) != 0) {
				{
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case T__5:
				case IF:
				case PRINT:
				case NOT:
				case SCOPE_BLOCK_NAME:
				case TYPE:
				case STRING:
				case NUMBER:
				case BOOLEAN:
				case NAME:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
					{
					setState(216);
					stmt();
					setState(217);
					match(NEWLINE);
					}
					break;
				case NEWLINE:
					{
					setState(219);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(SCOPE_BLOCK_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean logical_expr_sempred(Logical_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u00e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004>\b"+
		"\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004"+
		"\f\u0004M\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007g\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0084\b\b\n\b\f\b\u0087\t\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ab\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b3\b\t\n\t\f\t\u00b6"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00bc\b\n\n\n\f\n\u00bf\t"+
		"\n\u0001\n\u0001\n\u0003\n\u00c3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00cf\b\f\n\f\f\f\u00d2\t\f\u0001\f\u0001\f\u0003\f\u00d6\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00dd\b\r\n\r\f\r\u00e0\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0000\u0002\u0010\u0012\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u00fd"+
		"\u0000 \u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/"+
		"\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b8\u0001\u0000"+
		"\u0000\u0000\nR\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000e"+
		"c\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u00aa\u0001"+
		"\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00c4\u0001"+
		"\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000\u001a\u00d7\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0005%\u0000\u0000\u001d\u001f\u0003\u0002"+
		"\u0001\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000"+
		"%.\u0003\u0004\u0002\u0000&.\u0003\u0006\u0003\u0000\'.\u0003\u0010\b"+
		"\u0000(.\u0003\u0012\t\u0000).\u0003\u0014\n\u0000*.\u0003\u000e\u0007"+
		"\u0000+.\u0003\u001a\r\u0000,.\u0003\b\u0004\u0000-%\u0001\u0000\u0000"+
		"\u0000-&\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-(\u0001\u0000"+
		"\u0000\u0000-)\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/0\u0005 \u0000\u000001\u0005\'\u0000\u000012\u0005\u0007\u0000"+
		"\u000023\u0003\u0010\b\u00003\u0005\u0001\u0000\u0000\u000045\u0005\'"+
		"\u0000\u000056\u0005\u0007\u0000\u000067\u0003\u0010\b\u00007\u0007\u0001"+
		"\u0000\u0000\u000089\u0005\u0001\u0000\u00009:\u0005\'\u0000\u0000:?\u0005"+
		"+\u0000\u0000;<\u0005 \u0000\u0000<>\u0005\'\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0005,\u0000\u0000CD\u0005\u0002\u0000\u0000DE\u0005 \u0000\u0000E"+
		"K\u0005%\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005%\u0000\u0000HJ"+
		"\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005%"+
		"\u0000\u0000PQ\u0005&\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\u0003"+
		"\u0000\u0000ST\u0005\'\u0000\u0000TU\u0005+\u0000\u0000UZ\u0003\u0010"+
		"\b\u0000VW\u0005\u0004\u0000\u0000WY\u0003\u0010\b\u0000XV\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]^\u0005,\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_a\u0005\u0005\u0000"+
		"\u0000`b\u0005\'\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000b\r\u0001\u0000\u0000\u0000cf\u0005\u001a\u0000\u0000dg\u0005!\u0000"+
		"\u0000eg\u0003\u0010\b\u0000fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0006\b\uffff\uffff\u0000ij\u0005"+
		"+\u0000\u0000jk\u0003\u0010\b\u0000kl\u0005,\u0000\u0000lv\u0001\u0000"+
		"\u0000\u0000mv\u0005\'\u0000\u0000no\u0005\u0006\u0000\u0000ov\u0005\'"+
		"\u0000\u0000pv\u0005\"\u0000\u0000qv\u0005*\u0000\u0000rv\u0005$\u0000"+
		"\u0000sv\u0005!\u0000\u0000tv\u0003\n\u0005\u0000uh\u0001\u0000\u0000"+
		"\u0000um\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000up\u0001\u0000"+
		"\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0085\u0001\u0000\u0000"+
		"\u0000wx\n\u000b\u0000\u0000xy\u0005\u000f\u0000\u0000y\u0084\u0003\u0010"+
		"\b\fz{\n\n\u0000\u0000{|\u0005\u0010\u0000\u0000|\u0084\u0003\u0010\b"+
		"\u000b}~\n\t\u0000\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0084\u0003"+
		"\u0010\b\n\u0080\u0081\n\b\u0000\u0000\u0081\u0082\u0005\u0013\u0000\u0000"+
		"\u0082\u0084\u0003\u0010\b\t\u0083w\u0001\u0000\u0000\u0000\u0083z\u0001"+
		"\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0006\t\uffff"+
		"\uffff\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a\u008b\u0005+\u0000"+
		"\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005,\u0000\u0000"+
		"\u008d\u00ab\u0001\u0000\u0000\u0000\u008e\u008f\u0005+\u0000\u0000\u008f"+
		"\u0090\u0003\u0012\t\u0000\u0090\u0091\u0005,\u0000\u0000\u0091\u00ab"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u0010\b\u0000\u0093\u0094\u0005"+
		"\u0015\u0000\u0000\u0094\u0095\u0003\u0010\b\u0000\u0095\u00ab\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\u0010\b\u0000\u0097\u0098\u0005\u0014\u0000"+
		"\u0000\u0098\u0099\u0003\u0010\b\u0000\u0099\u00ab\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0003\u0010\b\u0000\u009b\u009c\u0005\u0017\u0000\u0000\u009c"+
		"\u009d\u0003\u0010\b\u0000\u009d\u00ab\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0003\u0010\b\u0000\u009f\u00a0\u0005\u0016\u0000\u0000\u00a0\u00a1\u0003"+
		"\u0010\b\u0000\u00a1\u00ab\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0010"+
		"\b\u0000\u00a3\u00a4\u0005\u0018\u0000\u0000\u00a4\u00a5\u0003\u0010\b"+
		"\u0000\u00a5\u00ab\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u0010\b\u0000"+
		"\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u0088\u0001\u0000\u0000\u0000\u00aa"+
		"\u008e\u0001\u0000\u0000\u0000\u00aa\u0092\u0001\u0000\u0000\u0000\u00aa"+
		"\u0096\u0001\u0000\u0000\u0000\u00aa\u009a\u0001\u0000\u0000\u0000\u00aa"+
		"\u009e\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a6\u0001\u0000\u0000\u0000\u00ab\u00b4\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\n\b\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00b3"+
		"\u0003\u0012\t\t\u00af\u00b0\n\u0007\u0000\u0000\u00b0\u00b1\u0005\u001d"+
		"\u0000\u0000\u00b1\u00b3\u0003\u0012\t\b\u00b2\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u0013\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\n\u0000\u0000\u00b8\u00bd\u0003\u0016\u000b\u0000"+
		"\u00b9\u00ba\u0005\f\u0000\u0000\u00ba\u00bc\u0003\u0016\u000b\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00c2\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\r\u0000\u0000\u00c1\u00c3\u0003\u0018\f\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u0015"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005+\u0000\u0000\u00c5\u00c6\u0003"+
		"\u0012\t\u0000\u00c6\u00c7\u0005,\u0000\u0000\u00c7\u00c8\u0003\u0018"+
		"\f\u0000\u00c8\u0017\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u000b\u0000"+
		"\u0000\u00ca\u00d0\u0005%\u0000\u0000\u00cb\u00cc\u0003\u0002\u0001\u0000"+
		"\u00cc\u00cd\u0005%\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0005&\u0000\u0000\u00d4\u00d6\u0005%\u0000\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u0019\u0001"+
		"\u0000\u0000\u0000\u00d7\u00de\u0005\u001e\u0000\u0000\u00d8\u00d9\u0003"+
		"\u0002\u0001\u0000\u00d9\u00da\u0005%\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0005%\u0000\u0000\u00dc\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u001f\u0000\u0000\u00e2\u001b\u0001\u0000\u0000"+
		"\u0000\u0014\u001e -?KZafu\u0083\u0085\u00aa\u00b2\u00b4\u00bd\u00c2\u00d0"+
		"\u00d5\u00dc\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}