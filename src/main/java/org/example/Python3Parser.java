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
		EQUAL=1, BREAK=2, CONTINUE=3, IF=4, COLON=5, ELIF=6, ELSE=7, WHILE=8, 
		MUL=9, DIV=10, MOD=11, ADD=12, SUB=13, LT=14, GT=15, LE=16, GE=17, EQUAL_EQUAL=18, 
		NOT_EQUAL=19, PRINT=20, NOT=21, AND=22, OR=23, SCOPE_BLOCK_NAME=24, SCOPE_BLOCK_END=25, 
		TYPE=26, STRING=27, NUMBER=28, INTEGER=29, BOOLEAN=30, NEWLINE=31, END=32, 
		NAME=33, STRING_LITERAL=34, DECIMAL_INTEGER=35, FLOAT_NUMBER=36, OPEN_PAREN=37, 
		CLOSE_PAREN=38, OPEN_BRACK=39, CLOSE_BRACK=40, OPEN_BRACE=41, CLOSE_BRACE=42, 
		SKIP_=43, UNKNOWN_CHAR=44, INDENT=45, DEDENT=46;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_assignment_stmt = 2, RULE_print_stmt = 3, 
		RULE_expr = 4, RULE_logical_expr = 5, RULE_condition = 6, RULE_condition_block = 7, 
		RULE_block = 8, RULE_scope_block = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "assignment_stmt", "print_stmt", "expr", "logical_expr", 
			"condition", "condition_block", "block", "scope_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'break'", "'continue'", "'if'", "':'", "'elif'", "'else'", 
			"'while'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'print'", "'!'", "'and'", "'or'", null, null, null, 
			null, null, null, null, null, "'end'", null, null, null, null, "'('", 
			"')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", "WHILE", 
			"MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "NOT", "AND", "OR", "SCOPE_BLOCK_NAME", "SCOPE_BLOCK_END", 
			"TYPE", "STRING", "NUMBER", "INTEGER", "BOOLEAN", "NEWLINE", "END", "NAME", 
			"STRING_LITERAL", "DECIMAL_INTEGER", "FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", 
			"INDENT", "DEDENT"
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
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 218459275280L) != 0) {
				{
				setState(22);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(20);
					match(NEWLINE);
					}
					break;
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
					setState(21);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				logical_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				print_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				scope_block();
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
			setState(37);
			match(TYPE);
			setState(38);
			match(NAME);
			setState(39);
			match(EQUAL);
			setState(40);
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
		enterRule(_localctx, 6, RULE_print_stmt);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PRINT);
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(44);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48);
				match(OPEN_PAREN);
				setState(49);
				expr(0);
				setState(50);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				{
				_localctx = new FloatNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(FLOAT_NUMBER);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				_localctx = new StringWordContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(60);
						match(MUL);
						setState(61);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(63);
						match(DIV);
						setState(64);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(ADD);
						setState(67);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						match(SUB);
						setState(70);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_logical_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(NOT);
				setState(78);
				match(OPEN_PAREN);
				setState(79);
				logical_expr(0);
				setState(80);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(OPEN_PAREN);
				setState(83);
				logical_expr(0);
				setState(84);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				expr(0);
				setState(87);
				match(GT);
				setState(88);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				expr(0);
				setState(91);
				match(LT);
				setState(92);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				expr(0);
				setState(95);
				match(GE);
				setState(96);
				expr(0);
				}
				break;
			case 6:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				expr(0);
				setState(99);
				match(LE);
				setState(100);
				expr(0);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				expr(0);
				setState(103);
				match(EQUAL_EQUAL);
				setState(104);
				expr(0);
				}
				break;
			case 8:
				{
				_localctx = new NeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				expr(0);
				setState(107);
				match(NOT_EQUAL);
				setState(108);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(112);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(113);
						match(AND);
						setState(114);
						logical_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(115);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(116);
						match(OR);
						setState(117);
						logical_expr(8);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			condition_block();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(125);
				match(ELIF);
				setState(126);
				condition_block();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(133);
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
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OPEN_PAREN);
			setState(137);
			logical_expr(0);
			setState(138);
			match(CLOSE_PAREN);
			setState(139);
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(COLON);
			setState(142);
			match(NEWLINE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 216311791632L) != 0) {
				{
				{
				setState(143);
				stmt();
				setState(144);
				match(NEWLINE);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(END);
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(152);
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
		enterRule(_localctx, 18, RULE_scope_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SCOPE_BLOCK_NAME);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 218459275280L) != 0) {
				{
				setState(160);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
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
					setState(156);
					stmt();
					setState(157);
					match(NEWLINE);
					}
					break;
				case NEWLINE:
					{
					setState(159);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return logical_expr_sempred((Logical_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
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
		"\u0004\u0001.\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005\u0000\u0017\b"+
		"\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"H\b\u0004\n\u0004\f\u0004K\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005"+
		"z\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0080\b\u0006\n\u0006\f\u0006\u0083\t\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0087\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0093\b\b\n\b\f"+
		"\b\u0096\t\b\u0001\b\u0001\b\u0003\b\u009a\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0000\u0002\b\n\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0000\u00bd\u0000\u0018\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b"+
		"9\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\f{\u0001\u0000\u0000"+
		"\u0000\u000e\u0088\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000"+
		"\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u0017\u0005\u001f\u0000"+
		"\u0000\u0015\u0017\u0003\u0002\u0001\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a\u0001\u0000\u0000"+
		"\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000"+
		"\u0000\u001d$\u0003\u0004\u0002\u0000\u001e$\u0003\b\u0004\u0000\u001f"+
		"$\u0003\n\u0005\u0000 $\u0003\f\u0006\u0000!$\u0003\u0006\u0003\u0000"+
		"\"$\u0003\u0012\t\u0000#\u001d\u0001\u0000\u0000\u0000#\u001e\u0001\u0000"+
		"\u0000\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%&\u0005\u001a\u0000\u0000&\'\u0005!\u0000\u0000\'(\u0005"+
		"\u0001\u0000\u0000()\u0003\b\u0004\u0000)\u0005\u0001\u0000\u0000\u0000"+
		"*-\u0005\u0014\u0000\u0000+.\u0005\u001b\u0000\u0000,.\u0003\b\u0004\u0000"+
		"-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0007\u0001\u0000"+
		"\u0000\u0000/0\u0006\u0004\uffff\uffff\u000001\u0005%\u0000\u000012\u0003"+
		"\b\u0004\u000023\u0005&\u0000\u00003:\u0001\u0000\u0000\u00004:\u0005"+
		"!\u0000\u00005:\u0005\u001c\u0000\u00006:\u0005$\u0000\u00007:\u0005\u001e"+
		"\u0000\u00008:\u0005\u001b\u0000\u00009/\u0001\u0000\u0000\u000094\u0001"+
		"\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:I\u0001\u0000\u0000"+
		"\u0000;<\n\t\u0000\u0000<=\u0005\t\u0000\u0000=H\u0003\b\u0004\n>?\n\b"+
		"\u0000\u0000?@\u0005\n\u0000\u0000@H\u0003\b\u0004\tAB\n\u0007\u0000\u0000"+
		"BC\u0005\f\u0000\u0000CH\u0003\b\u0004\bDE\n\u0006\u0000\u0000EF\u0005"+
		"\r\u0000\u0000FH\u0003\b\u0004\u0007G;\u0001\u0000\u0000\u0000G>\u0001"+
		"\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\t\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0006\u0005"+
		"\uffff\uffff\u0000MN\u0005\u0015\u0000\u0000NO\u0005%\u0000\u0000OP\u0003"+
		"\n\u0005\u0000PQ\u0005&\u0000\u0000Qo\u0001\u0000\u0000\u0000RS\u0005"+
		"%\u0000\u0000ST\u0003\n\u0005\u0000TU\u0005&\u0000\u0000Uo\u0001\u0000"+
		"\u0000\u0000VW\u0003\b\u0004\u0000WX\u0005\u000f\u0000\u0000XY\u0003\b"+
		"\u0004\u0000Yo\u0001\u0000\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005"+
		"\u000e\u0000\u0000\\]\u0003\b\u0004\u0000]o\u0001\u0000\u0000\u0000^_"+
		"\u0003\b\u0004\u0000_`\u0005\u0011\u0000\u0000`a\u0003\b\u0004\u0000a"+
		"o\u0001\u0000\u0000\u0000bc\u0003\b\u0004\u0000cd\u0005\u0010\u0000\u0000"+
		"de\u0003\b\u0004\u0000eo\u0001\u0000\u0000\u0000fg\u0003\b\u0004\u0000"+
		"gh\u0005\u0012\u0000\u0000hi\u0003\b\u0004\u0000io\u0001\u0000\u0000\u0000"+
		"jk\u0003\b\u0004\u0000kl\u0005\u0013\u0000\u0000lm\u0003\b\u0004\u0000"+
		"mo\u0001\u0000\u0000\u0000nL\u0001\u0000\u0000\u0000nR\u0001\u0000\u0000"+
		"\u0000nV\u0001\u0000\u0000\u0000nZ\u0001\u0000\u0000\u0000n^\u0001\u0000"+
		"\u0000\u0000nb\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000\u0000nj\u0001"+
		"\u0000\u0000\u0000ox\u0001\u0000\u0000\u0000pq\n\b\u0000\u0000qr\u0005"+
		"\u0016\u0000\u0000rw\u0003\n\u0005\tst\n\u0007\u0000\u0000tu\u0005\u0017"+
		"\u0000\u0000uw\u0003\n\u0005\bvp\u0001\u0000\u0000\u0000vs\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y\u000b\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{|\u0005\u0004\u0000\u0000|\u0081\u0003\u000e\u0007\u0000}~\u0005"+
		"\u0006\u0000\u0000~\u0080\u0003\u000e\u0007\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0086\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0007\u0000"+
		"\u0000\u0085\u0087\u0003\u0010\b\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005%\u0000\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b"+
		"\u0005&\u0000\u0000\u008b\u008c\u0003\u0010\b\u0000\u008c\u000f\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u0005\u0000\u0000\u008e\u0094\u0005"+
		"\u001f\u0000\u0000\u008f\u0090\u0003\u0002\u0001\u0000\u0090\u0091\u0005"+
		"\u001f\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008f\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099\u0005"+
		" \u0000\u0000\u0098\u009a\u0005\u001f\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000"+
		"\u0000\u0000\u009b\u00a2\u0005\u0018\u0000\u0000\u009c\u009d\u0003\u0002"+
		"\u0001\u0000\u009d\u009e\u0005\u001f\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0005\u001f\u0000\u0000\u00a0\u009c\u0001\u0000"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u0013\u0001\u0000"+
		"\u0000\u0000\u0010\u0016\u0018#-9GInvx\u0081\u0086\u0094\u0099\u00a0\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}