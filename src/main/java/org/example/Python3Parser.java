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
		T__0=1, EQUAL=2, BREAK=3, CONTINUE=4, IF=5, COLON=6, ELIF=7, ELSE=8, WHILE=9, 
		MUL=10, DIV=11, MOD=12, ADD=13, SUB=14, LT=15, GT=16, LE=17, GE=18, EQUAL_EQUAL=19, 
		NOT_EQUAL=20, PRINT=21, NOT=22, AND=23, OR=24, TYPE=25, STRING=26, NUMBER=27, 
		INTEGER=28, BOOLEAN=29, NEWLINE=30, END=31, NAME=32, STRING_LITERAL=33, 
		DECIMAL_INTEGER=34, FLOAT_NUMBER=35, OPEN_PAREN=36, CLOSE_PAREN=37, OPEN_BRACK=38, 
		CLOSE_BRACK=39, OPEN_BRACE=40, CLOSE_BRACE=41, SKIP_=42, UNKNOWN_CHAR=43, 
		INDENT=44, DEDENT=45;
	public static final int
		RULE_file_input = 0, RULE_stmt = 1, RULE_assignment_stmt = 2, RULE_print_stmt = 3, 
		RULE_expr = 4, RULE_logical_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"file_input", "stmt", "assignment_stmt", "print_stmt", "expr", "logical_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'string'", "'='", "'break'", "'continue'", "'if'", "':'", "'elif'", 
			"'else'", "'while'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'print'", "'!'", "'and'", "'or'", null, 
			null, null, null, null, null, "'end'", null, null, null, null, "'('", 
			"')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", 
			"WHILE", "MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "NOT", "AND", "OR", "TYPE", "STRING", "NUMBER", 
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 109156761602L) != 0) {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(12);
					match(NEWLINE);
					}
					break;
				case T__0:
				case NOT:
				case TYPE:
				case NUMBER:
				case BOOLEAN:
				case NAME:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
					{
					setState(13);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
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
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				logical_expr(0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStringContext extends Assignment_stmtContext {
		public TerminalNode NAME() { return getToken(Python3Parser.NAME, 0); }
		public TerminalNode EQUAL() { return getToken(Python3Parser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(Python3Parser.STRING, 0); }
		public AssignmentStringContext(Assignment_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitAssignmentString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_stmt);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(TYPE);
				setState(27);
				match(NAME);
				setState(28);
				match(EQUAL);
				setState(29);
				expr(0);
				}
				break;
			case T__0:
				_localctx = new AssignmentStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__0);
				setState(31);
				match(NAME);
				setState(32);
				match(EQUAL);
				setState(33);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(36);
			match(PRINT);
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(37);
				match(STRING);
				}
				break;
			case NUMBER:
			case BOOLEAN:
			case NAME:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
				{
				setState(38);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(Python3Parser.BOOLEAN, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Python3Visitor ) return ((Python3Visitor<? extends T>)visitor).visitBoolean(this);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(42);
				match(OPEN_PAREN);
				setState(43);
				expr(0);
				setState(44);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				{
				_localctx = new FloatNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(FLOAT_NUMBER);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(52);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(53);
						match(MUL);
						setState(54);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(56);
						match(DIV);
						setState(57);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(59);
						match(ADD);
						setState(60);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(62);
						match(SUB);
						setState(63);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				match(NOT);
				setState(71);
				match(OPEN_PAREN);
				setState(72);
				logical_expr(0);
				setState(73);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(OPEN_PAREN);
				setState(76);
				logical_expr(0);
				setState(77);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				expr(0);
				setState(80);
				match(GT);
				setState(81);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				expr(0);
				setState(84);
				match(LT);
				setState(85);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				expr(0);
				setState(88);
				match(GE);
				setState(89);
				expr(0);
				}
				break;
			case 6:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				expr(0);
				setState(92);
				match(LE);
				setState(93);
				expr(0);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				expr(0);
				setState(96);
				match(EQUAL_EQUAL);
				setState(97);
				expr(0);
				}
				break;
			case 8:
				{
				_localctx = new NeqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				expr(0);
				setState(100);
				match(NOT_EQUAL);
				setState(101);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						match(AND);
						setState(107);
						logical_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new Logical_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expr);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						match(OR);
						setState(110);
						logical_expr(8);
						}
						break;
					}
					} 
				}
				setState(115);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
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
		"\u0004\u0001-u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n\u0000"+
		"\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003(\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00043\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004A\b"+
		"\u0004\n\u0004\f\u0004D\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t"+
		"\u0005\u0001\u0005\u0000\u0002\b\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u0000\u0085\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000"+
		"\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000"+
		"\u0000\b2\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\f\u000f\u0005"+
		"\u001e\u0000\u0000\r\u000f\u0003\u0002\u0001\u0000\u000e\f\u0001\u0000"+
		"\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000"+
		"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000"+
		"\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000"+
		"\u0000\u0015\u0019\u0003\u0004\u0002\u0000\u0016\u0019\u0003\b\u0004\u0000"+
		"\u0017\u0019\u0003\n\u0005\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0019\u0000\u0000\u001b"+
		"\u001c\u0005 \u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d#\u0003"+
		"\b\u0004\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0005 \u0000"+
		"\u0000 !\u0005\u0002\u0000\u0000!#\u0005\u001a\u0000\u0000\"\u001a\u0001"+
		"\u0000\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000#\u0005\u0001\u0000"+
		"\u0000\u0000$\'\u0005\u0015\u0000\u0000%(\u0005\u001a\u0000\u0000&(\u0003"+
		"\b\u0004\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000("+
		"\u0007\u0001\u0000\u0000\u0000)*\u0006\u0004\uffff\uffff\u0000*+\u0005"+
		"$\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005%\u0000\u0000-3\u0001\u0000"+
		"\u0000\u0000.3\u0005 \u0000\u0000/3\u0005\u001b\u0000\u000003\u0005#\u0000"+
		"\u000013\u0005\u001d\u0000\u00002)\u0001\u0000\u0000\u00002.\u0001\u0000"+
		"\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001"+
		"\u0000\u0000\u00003B\u0001\u0000\u0000\u000045\n\b\u0000\u000056\u0005"+
		"\n\u0000\u00006A\u0003\b\u0004\t78\n\u0007\u0000\u000089\u0005\u000b\u0000"+
		"\u00009A\u0003\b\u0004\b:;\n\u0006\u0000\u0000;<\u0005\r\u0000\u0000<"+
		"A\u0003\b\u0004\u0007=>\n\u0005\u0000\u0000>?\u0005\u000e\u0000\u0000"+
		"?A\u0003\b\u0004\u0006@4\u0001\u0000\u0000\u0000@7\u0001\u0000\u0000\u0000"+
		"@:\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0006\u0005\uffff\uffff\u0000"+
		"FG\u0005\u0016\u0000\u0000GH\u0005$\u0000\u0000HI\u0003\n\u0005\u0000"+
		"IJ\u0005%\u0000\u0000Jh\u0001\u0000\u0000\u0000KL\u0005$\u0000\u0000L"+
		"M\u0003\n\u0005\u0000MN\u0005%\u0000\u0000Nh\u0001\u0000\u0000\u0000O"+
		"P\u0003\b\u0004\u0000PQ\u0005\u0010\u0000\u0000QR\u0003\b\u0004\u0000"+
		"Rh\u0001\u0000\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005\u000f\u0000\u0000"+
		"UV\u0003\b\u0004\u0000Vh\u0001\u0000\u0000\u0000WX\u0003\b\u0004\u0000"+
		"XY\u0005\u0012\u0000\u0000YZ\u0003\b\u0004\u0000Zh\u0001\u0000\u0000\u0000"+
		"[\\\u0003\b\u0004\u0000\\]\u0005\u0011\u0000\u0000]^\u0003\b\u0004\u0000"+
		"^h\u0001\u0000\u0000\u0000_`\u0003\b\u0004\u0000`a\u0005\u0013\u0000\u0000"+
		"ab\u0003\b\u0004\u0000bh\u0001\u0000\u0000\u0000cd\u0003\b\u0004\u0000"+
		"de\u0005\u0014\u0000\u0000ef\u0003\b\u0004\u0000fh\u0001\u0000\u0000\u0000"+
		"gE\u0001\u0000\u0000\u0000gK\u0001\u0000\u0000\u0000gO\u0001\u0000\u0000"+
		"\u0000gS\u0001\u0000\u0000\u0000gW\u0001\u0000\u0000\u0000g[\u0001\u0000"+
		"\u0000\u0000g_\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000hq\u0001"+
		"\u0000\u0000\u0000ij\n\b\u0000\u0000jk\u0005\u0017\u0000\u0000kp\u0003"+
		"\n\u0005\tlm\n\u0007\u0000\u0000mn\u0005\u0018\u0000\u0000np\u0003\n\u0005"+
		"\boi\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u000b\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000\u000b\u000e\u0010\u0018\""+
		"\'2@Bgoq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}