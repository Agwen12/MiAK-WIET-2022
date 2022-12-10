// Generated from java-escape by ANTLR 4.11.1

package org.example;

import org.antlr.v4.runtime.misc.Interval;
import java.util.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Python3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, BREAK=2, CONTINUE=3, IF=4, COLON=5, ELIF=6, ELSE=7, WHILE=8, 
		MUL=9, DIV=10, MOD=11, ADD=12, SUB=13, LT=14, GT=15, LE=16, GE=17, EQUAL_EQUAL=18, 
		NOT_EQUAL=19, PRINT=20, TYPE=21, STRING=22, NUMBER=23, INTEGER=24, BOOLEAN=25, 
		NEWLINE=26, END=27, AND=28, OR=29, NOT=30, NAME=31, STRING_LITERAL=32, 
		DECIMAL_INTEGER=33, FLOAT_NUMBER=34, OPEN_PAREN=35, CLOSE_PAREN=36, OPEN_BRACK=37, 
		CLOSE_BRACK=38, OPEN_BRACE=39, CLOSE_BRACE=40, SKIP_=41, UNKNOWN_CHAR=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", "WHILE", 
			"MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "TYPE", "STRING", "NUMBER", "INTEGER", "BOOLEAN", 
			"NEWLINE", "END", "AND", "OR", "NOT", "NAME", "STRING_LITERAL", "DECIMAL_INTEGER", 
			"FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", "NON_ZERO_DIGIT", 
			"DIGIT", "SPACES", "COMMENT", "LINE_JOINING", "ID_START", "ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'break'", "'continue'", "'if'", "':'", "'elif'", "'else'", 
			"'while'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'print'", null, null, null, null, null, null, "'end'", 
			"'and'", "'or'", "'!'", null, null, null, null, "'('", "')'", "'['", 
			"']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", "WHILE", 
			"MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "TYPE", "STRING", "NUMBER", "INTEGER", "BOOLEAN", 
			"NEWLINE", "END", "AND", "OR", "NOT", "NAME", "STRING_LITERAL", "DECIMAL_INTEGER", 
			"FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR"
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


	// The stack that keeps track of the indentation lengths
	private Stack<Integer> indentLengths = new Stack<>();
	// A linked list where extra tokens are pushed on
	private LinkedList<Token> pendingTokens = new LinkedList<>();
	// An int that stores the last pending token type (including the inserted INDENT/DEDENT/NEWLINE token types also)
	private int lastPendingTokenType;
	// The amount of opened braces, brackets and parenthesis
	private int opened = 0;
	// Was there space char in the indentations?
	private boolean wasSpaceIndentation = false;
	// Was there tab char in the indentations?
	private boolean wasTabIndentation = false;
	// A String list that stores the lexer warnings
	private List<String> warnings = new ArrayList<>();
	// A String list that stores the lexer error messages
	private List<String> errors = new ArrayList<>();
	// Patterns for the custom error listener to recognize error messages
	public static final String TEXT_LEXER = "lexer --> ";
	public static final String TEXT_INSERTED_INDENT = "inserted INDENT";
	@Override
	public Token nextToken() {
	    if (_input.size() == 0) {
	        return new CommonToken(EOF, "<EOF>"); // processing of the input stream until the first returning EOF
	    } else {
	        checkNextToken();
	        return this.pendingTokens.pollFirst(); // append the token stream with the upcoming pending token
	    }
	}

	private void checkNextToken() {
	    if (this.indentLengths != null) { // after the first incoming EOF token the indentLengths stack will be set to null
	        final int startSize = this.pendingTokens.size();
	        Token curToken;
	        do {
	            curToken = super.nextToken(); // get the next token from the input stream
	            checkStartOfInput(curToken);
	            switch (curToken.getType()) {
	                case OPEN_PAREN:
	                case OPEN_BRACK:
	                case OPEN_BRACE:
	                    this.opened++;
	                    this.pendingTokens.addLast(curToken);
	                    break;
	                case CLOSE_PAREN:
	                case CLOSE_BRACK:
	                case CLOSE_BRACE:
	                    this.opened--;
	                    this.pendingTokens.addLast(curToken);
	                    break;
	                case NEWLINE:
	                    handleNewLineToken(curToken);
	                    break;
	                case EOF:
	                    handleEofToken(curToken); // indentLengths stack will be set to null
	                    break;
	                default:
	                    this.pendingTokens.addLast(curToken); // insert the current token
	            }
	        } while (this.pendingTokens.size() == startSize);
	        this.lastPendingTokenType = curToken.getType();
	    }
	}

	private void checkStartOfInput(Token curToken) {
	    if (indentLengths.size() == 0) { // We're at the first token
	        indentLengths.push(0);  // initialize the stack with default 0 indentation length
	        if (_input.getText(new Interval(0, 0)).trim().length() == 0) { // the first char of the input is a whitespace
	            this.insertLeadingTokens(curToken.getType(), curToken.getStartIndex());
	        }
	    }
	}

	private void handleNewLineToken(Token curToken) {
	    if (this.opened == 0) { //*** https://docs.python.org/3/reference/lexical_analysis.html#implicit-line-joining
	        switch (_input.LA(1) /* next symbol */) { //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/IntStream.html#LA(int)
	            case '\r':
	            case '\n':
	            case '\f':
	            case '#':   //*** https://docs.python.org/3/reference/lexical_analysis.html#blank-lines
	            case EOF:   // skip the trailing inconsistent dedent or the trailing unexpected indent (or the trailing indent)
	                return; // We're on a blank line or before a comment or before the EOF, skip the NEWLINE token
	            default:
	                this.pendingTokens.addLast(curToken); // insert the current NEWLINE token
	                this.insertIndentDedentTokens(this.getIndentationLength(curToken.getText())); //*** https://docs.python.org/3/reference/lexical_analysis.html#indentation
	        }
	    }
	}

	private void handleEofToken(Token curToken) {
	    this.insertTrailingTokens(this.lastPendingTokenType); // indentLengths stack will be null!
	    this.pendingTokens.addLast(curToken); // insert the current EOF token
	    this.checkSpaceAndTabIndentation();
	}

	private void insertLeadingTokens(int type, int startIndex) {
	    if (type != NEWLINE && type != EOF) { // (after a whitespace) The first token is visible, so We insert a NEWLINE and an INDENT token before it to raise an 'unexpected indent' error later by the parser
	        this.insertToken(0, startIndex - 1, "<inserted leading NEWLINE>" + " ".repeat(startIndex), NEWLINE, 1, 0);
	        this.insertToken(startIndex, startIndex - 1, "<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(startIndex) + ">", Python3Parser.INDENT, 1, startIndex);
	        this.indentLengths.push(startIndex);
	    }
	}

	private void insertIndentDedentTokens(int curIndentLength) {
	    int prevIndentLength = this.indentLengths.peek();
	    if (curIndentLength > prevIndentLength) { // insert an INDENT token
	        this.insertToken("<" + TEXT_INSERTED_INDENT + ", " + this.getIndentationDescription(curIndentLength) + ">", Python3Parser.INDENT);
	        this.indentLengths.push(curIndentLength);
	    } else {
	        while (curIndentLength < prevIndentLength) {   // More than 1 DEDENT token may be inserted
	            this.indentLengths.pop();
	            prevIndentLength = this.indentLengths.peek();
	            if (curIndentLength <= prevIndentLength) {
	                this.insertToken("<inserted DEDENT, " + this.getIndentationDescription(prevIndentLength) + ">", Python3Parser.DEDENT);
	            } else {
	                this.insertToken("<inserted inconsistent DEDENT, " + "length=" + curIndentLength + ">", Python3Parser.DEDENT);
	                this.errors.add(TEXT_LEXER + "line " + getLine() + ":" + getCharPositionInLine() + "\t IndentationError: unindent does not match any outer indentation level");
	            }
	        }
	    }
	}

	private void insertTrailingTokens(int type) {
	    if (type != NEWLINE && type != Python3Parser.DEDENT) { // If the last pending token was not a NEWLINE and not a DEDENT then
	        this.insertToken("<inserted trailing NEWLINE>", NEWLINE); // insert an extra trailing NEWLINE token that serves as the end of the statement
	    }

	    while (this.indentLengths.size() > 1) { // Now insert as much trailing DEDENT tokens as needed
	        this.insertToken("<inserted trailing DEDENT, " + this.getIndentationDescription(this.indentLengths.pop()) + ">", Python3Parser.DEDENT);
	    }
	    this.indentLengths = null; // there will be no more token read from the input stream
	}

	private String getIndentationDescription(int lengthOfIndent) {
	    return "length=" + lengthOfIndent + ", level=" + this.indentLengths.size();
	}

	private void insertToken(String text, int type) {
	    final int startIndex = _tokenStartCharIndex + getText().length(); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/Lexer.html#_tokenStartCharIndex
	    this.insertToken(startIndex, startIndex - 1, text, type, getLine(), getCharPositionInLine());
	}

	private void insertToken(int startIndex, int stopIndex, String text, int type, int line, int charPositionInLine) {
	    CommonToken token = new CommonToken(_tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, startIndex, stopIndex); //*** https://www.antlr.org/api/Java/org/antlr/v4/runtime/CommonToken.html
	    token.setText(text);
	    token.setLine(line);
	    token.setCharPositionInLine(charPositionInLine);
	    this.pendingTokens.addLast(token);
	}

	// Calculates the indentation of the provided spaces, taking the
	// following rules into account:
	//
	// "Tabs are replaced (from left to right) by one to eight spaces
	//  such that the total number of characters up to and including
	//  the replacement is a multiple of eight [...]"
	//
	//  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	private int getIndentationLength(String textOfMatchedNEWLINE) {
	    int count = 0;
	    for (char ch : textOfMatchedNEWLINE.toCharArray()) {
	        switch (ch) {
	            case ' ': // A normal space char
	                this.wasSpaceIndentation = true;
	                count++;
	                break;
	            case '\t':
	                this.wasTabIndentation = true;
	                count += 8 - (count % 8);
	                break;
	        }
	    }
	    return count;
	}

	private void checkSpaceAndTabIndentation() {
	    if (this.wasSpaceIndentation && this.wasTabIndentation) {
	        this.warnings.add("Mixture of space and tab were used for indentation.");
	    }
	}

	public List<String> getWarnings() {
	    return this.warnings;
	}

	public List<String> getErrorMessages() {
	    return this.errors;
	}


	public Python3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Python3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000*\u0153\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00c9\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u00d9\b\u0018\u0001\u0019\u0003\u0019\u00dc\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u00e0\b\u0019\u0001\u0019\u0003\u0019\u00e3"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u00f4\b\u001e\n"+
		"\u001e\f\u001e\u00f7\t\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u00fb"+
		"\b\u001f\n\u001f\f\u001f\u00fe\t\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0005 \u0104\b \n \f \u0107\t \u0001 \u0004 \u010a\b \u000b \f"+
		" \u010b\u0003 \u010e\b \u0001!\u0005!\u0111\b!\n!\f!\u0114\t!\u0001!\u0001"+
		"!\u0005!\u0118\b!\n!\f!\u011b\t!\u0001\"\u0001\"\u0001#\u0001#\u0001$"+
		"\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0003(\u012c\b(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001,\u0004,\u0137\b,\u000b,\f,\u0138\u0001-\u0001-\u0005-\u013d\b"+
		"-\n-\f-\u0140\t-\u0001.\u0001.\u0003.\u0144\b.\u0001.\u0003.\u0147\b."+
		"\u0001.\u0001.\u0003.\u014b\b.\u0001/\u0003/\u014e\b/\u00010\u00010\u0003"+
		"0\u0152\b0\u0001\u00fc\u00001\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U\u0000W\u0000Y\u0000[\u0000]\u0000"+
		"_\u0000a\u0000\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0002\u0000"+
		"\t\t  \u0002\u0000\n\n\f\r\u0003\u0000AZ__az\u0163\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0001c\u0001\u0000\u0000"+
		"\u0000\u0003e\u0001\u0000\u0000\u0000\u0005k\u0001\u0000\u0000\u0000\u0007"+
		"t\u0001\u0000\u0000\u0000\tw\u0001\u0000\u0000\u0000\u000by\u0001\u0000"+
		"\u0000\u0000\r~\u0001\u0000\u0000\u0000\u000f\u0083\u0001\u0000\u0000"+
		"\u0000\u0011\u0089\u0001\u0000\u0000\u0000\u0013\u008b\u0001\u0000\u0000"+
		"\u0000\u0015\u008d\u0001\u0000\u0000\u0000\u0017\u008f\u0001\u0000\u0000"+
		"\u0000\u0019\u0091\u0001\u0000\u0000\u0000\u001b\u0093\u0001\u0000\u0000"+
		"\u0000\u001d\u0095\u0001\u0000\u0000\u0000\u001f\u0097\u0001\u0000\u0000"+
		"\u0000!\u009a\u0001\u0000\u0000\u0000#\u009d\u0001\u0000\u0000\u0000%"+
		"\u00a0\u0001\u0000\u0000\u0000\'\u00a3\u0001\u0000\u0000\u0000)\u00c8"+
		"\u0001\u0000\u0000\u0000+\u00ca\u0001\u0000\u0000\u0000-\u00cc\u0001\u0000"+
		"\u0000\u0000/\u00ce\u0001\u0000\u0000\u00001\u00d8\u0001\u0000\u0000\u0000"+
		"3\u00df\u0001\u0000\u0000\u00005\u00e4\u0001\u0000\u0000\u00007\u00e8"+
		"\u0001\u0000\u0000\u00009\u00ec\u0001\u0000\u0000\u0000;\u00ef\u0001\u0000"+
		"\u0000\u0000=\u00f1\u0001\u0000\u0000\u0000?\u00f8\u0001\u0000\u0000\u0000"+
		"A\u010d\u0001\u0000\u0000\u0000C\u0112\u0001\u0000\u0000\u0000E\u011c"+
		"\u0001\u0000\u0000\u0000G\u011e\u0001\u0000\u0000\u0000I\u0120\u0001\u0000"+
		"\u0000\u0000K\u0122\u0001\u0000\u0000\u0000M\u0124\u0001\u0000\u0000\u0000"+
		"O\u0126\u0001\u0000\u0000\u0000Q\u012b\u0001\u0000\u0000\u0000S\u012f"+
		"\u0001\u0000\u0000\u0000U\u0131\u0001\u0000\u0000\u0000W\u0133\u0001\u0000"+
		"\u0000\u0000Y\u0136\u0001\u0000\u0000\u0000[\u013a\u0001\u0000\u0000\u0000"+
		"]\u0141\u0001\u0000\u0000\u0000_\u014d\u0001\u0000\u0000\u0000a\u0151"+
		"\u0001\u0000\u0000\u0000cd\u0005=\u0000\u0000d\u0002\u0001\u0000\u0000"+
		"\u0000ef\u0005b\u0000\u0000fg\u0005r\u0000\u0000gh\u0005e\u0000\u0000"+
		"hi\u0005a\u0000\u0000ij\u0005k\u0000\u0000j\u0004\u0001\u0000\u0000\u0000"+
		"kl\u0005c\u0000\u0000lm\u0005o\u0000\u0000mn\u0005n\u0000\u0000no\u0005"+
		"t\u0000\u0000op\u0005i\u0000\u0000pq\u0005n\u0000\u0000qr\u0005u\u0000"+
		"\u0000rs\u0005e\u0000\u0000s\u0006\u0001\u0000\u0000\u0000tu\u0005i\u0000"+
		"\u0000uv\u0005f\u0000\u0000v\b\u0001\u0000\u0000\u0000wx\u0005:\u0000"+
		"\u0000x\n\u0001\u0000\u0000\u0000yz\u0005e\u0000\u0000z{\u0005l\u0000"+
		"\u0000{|\u0005i\u0000\u0000|}\u0005f\u0000\u0000}\f\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005e\u0000\u0000\u007f\u0080\u0005l\u0000\u0000\u0080"+
		"\u0081\u0005s\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u000e\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005w\u0000\u0000\u0084\u0085\u0005h\u0000"+
		"\u0000\u0085\u0086\u0005i\u0000\u0000\u0086\u0087\u0005l\u0000\u0000\u0087"+
		"\u0088\u0005e\u0000\u0000\u0088\u0010\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005*\u0000\u0000\u008a\u0012\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"/\u0000\u0000\u008c\u0014\u0001\u0000\u0000\u0000\u008d\u008e\u0005%\u0000"+
		"\u0000\u008e\u0016\u0001\u0000\u0000\u0000\u008f\u0090\u0005+\u0000\u0000"+
		"\u0090\u0018\u0001\u0000\u0000\u0000\u0091\u0092\u0005-\u0000\u0000\u0092"+
		"\u001a\u0001\u0000\u0000\u0000\u0093\u0094\u0005<\u0000\u0000\u0094\u001c"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005>\u0000\u0000\u0096\u001e\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005<\u0000\u0000\u0098\u0099\u0005=\u0000"+
		"\u0000\u0099 \u0001\u0000\u0000\u0000\u009a\u009b\u0005>\u0000\u0000\u009b"+
		"\u009c\u0005=\u0000\u0000\u009c\"\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005=\u0000\u0000\u009e\u009f\u0005=\u0000\u0000\u009f$\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005!\u0000\u0000\u00a1\u00a2\u0005=\u0000\u0000"+
		"\u00a2&\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005p\u0000\u0000\u00a4\u00a5"+
		"\u0005r\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005n"+
		"\u0000\u0000\u00a7\u00a8\u0005t\u0000\u0000\u00a8(\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005s\u0000\u0000\u00aa\u00ab\u0005t\u0000\u0000\u00ab\u00ac"+
		"\u0005r\u0000\u0000\u00ac\u00ad\u0005i\u0000\u0000\u00ad\u00ae\u0005n"+
		"\u0000\u0000\u00ae\u00c9\u0005g\u0000\u0000\u00af\u00b0\u0005i\u0000\u0000"+
		"\u00b0\u00b1\u0005n\u0000\u0000\u00b1\u00c9\u0005t\u0000\u0000\u00b2\u00b3"+
		"\u0005l\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4\u00b5\u0005n"+
		"\u0000\u0000\u00b5\u00c9\u0005g\u0000\u0000\u00b6\u00b7\u0005f\u0000\u0000"+
		"\u00b7\u00b8\u0005l\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u00ba"+
		"\u0005a\u0000\u0000\u00ba\u00c9\u0005t\u0000\u0000\u00bb\u00bc\u0005d"+
		"\u0000\u0000\u00bc\u00bd\u0005o\u0000\u0000\u00bd\u00be\u0005u\u0000\u0000"+
		"\u00be\u00bf\u0005b\u0000\u0000\u00bf\u00c0\u0005l\u0000\u0000\u00c0\u00c9"+
		"\u0005e\u0000\u0000\u00c1\u00c2\u0005b\u0000\u0000\u00c2\u00c3\u0005o"+
		"\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4\u00c5\u0005l\u0000\u0000"+
		"\u00c5\u00c6\u0005e\u0000\u0000\u00c6\u00c7\u0005a\u0000\u0000\u00c7\u00c9"+
		"\u0005n\u0000\u0000\u00c8\u00a9\u0001\u0000\u0000\u0000\u00c8\u00af\u0001"+
		"\u0000\u0000\u0000\u00c8\u00b2\u0001\u0000\u0000\u0000\u00c8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c9*\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003?\u001f"+
		"\u0000\u00cb,\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003/\u0017\u0000\u00cd"+
		".\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003A \u0000\u00cf0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005Y\u0000\u0000\u00d1\u00d2\u0005a\u0000\u0000"+
		"\u00d2\u00d3\u0005s\u0000\u0000\u00d3\u00d9\u0005s\u0000\u0000\u00d4\u00d5"+
		"\u0005N\u0000\u0000\u00d5\u00d6\u0005y\u0000\u0000\u00d6\u00d7\u0005e"+
		"\u0000\u0000\u00d7\u00d9\u0005t\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d92\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0005\r\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0005\n\u0000\u0000\u00de\u00e0\u0002\f\r\u0000\u00df\u00db\u0001"+
		"\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0003Y,\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e34\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005e\u0000\u0000\u00e5\u00e6\u0005n\u0000\u0000\u00e6\u00e7"+
		"\u0005d\u0000\u0000\u00e76\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005a"+
		"\u0000\u0000\u00e9\u00ea\u0005n\u0000\u0000\u00ea\u00eb\u0005d\u0000\u0000"+
		"\u00eb8\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005o\u0000\u0000\u00ed\u00ee"+
		"\u0005r\u0000\u0000\u00ee:\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005!"+
		"\u0000\u0000\u00f0<\u0001\u0000\u0000\u0000\u00f1\u00f5\u0003_/\u0000"+
		"\u00f2\u00f4\u0003a0\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6>\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fc\u0005\"\u0000\u0000\u00f9\u00fb\t\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\"\u0000\u0000\u0100@\u0001\u0000\u0000"+
		"\u0000\u0101\u0105\u0003U*\u0000\u0102\u0104\u0003W+\u0000\u0103\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u010e"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a"+
		"\u00050\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0101\u0001"+
		"\u0000\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010eB\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0003W+\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0119\u0005.\u0000\u0000\u0116"+
		"\u0118\u0003W+\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001"+
		"\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011aD\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005(\u0000\u0000\u011dF\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005)\u0000\u0000\u011fH\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005[\u0000\u0000\u0121J\u0001\u0000\u0000\u0000\u0122\u0123\u0005]"+
		"\u0000\u0000\u0123L\u0001\u0000\u0000\u0000\u0124\u0125\u0005{\u0000\u0000"+
		"\u0125N\u0001\u0000\u0000\u0000\u0126\u0127\u0005}\u0000\u0000\u0127P"+
		"\u0001\u0000\u0000\u0000\u0128\u012c\u0003Y,\u0000\u0129\u012c\u0003["+
		"-\u0000\u012a\u012c\u0003].\u0000\u012b\u0128\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e\u0006(\u0000\u0000\u012e"+
		"R\u0001\u0000\u0000\u0000\u012f\u0130\t\u0000\u0000\u0000\u0130T\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0007\u0000\u0000\u0000\u0132V\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0007\u0001\u0000\u0000\u0134X\u0001\u0000\u0000"+
		"\u0000\u0135\u0137\u0007\u0002\u0000\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139Z\u0001\u0000\u0000\u0000"+
		"\u013a\u013e\u0005#\u0000\u0000\u013b\u013d\b\u0003\u0000\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\\\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0005\\\u0000\u0000\u0142\u0144\u0003Y,\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u014a\u0001\u0000"+
		"\u0000\u0000\u0145\u0147\u0005\r\u0000\u0000\u0146\u0145\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u014b\u0005\n\u0000\u0000\u0149\u014b\u0002\f\r\u0000\u014a"+
		"\u0146\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"^\u0001\u0000\u0000\u0000\u014c\u014e\u0007\u0004\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014e`\u0001\u0000\u0000\u0000\u014f\u0152\u0003"+
		"_/\u0000\u0150\u0152\u0007\u0001\u0000\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152b\u0001\u0000\u0000\u0000"+
		"\u0015\u0000\u00c8\u00d8\u00db\u00df\u00e2\u00f5\u00fc\u0105\u010b\u010d"+
		"\u0112\u0119\u012b\u0138\u013e\u0143\u0146\u014a\u014d\u0151\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}