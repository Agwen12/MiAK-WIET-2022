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
		T__0=1, EQUAL=2, BREAK=3, CONTINUE=4, IF=5, COLON=6, ELIF=7, ELSE=8, WHILE=9, 
		MUL=10, DIV=11, MOD=12, ADD=13, SUB=14, LT=15, GT=16, LE=17, GE=18, EQUAL_EQUAL=19, 
		NOT_EQUAL=20, PRINT=21, NOT=22, AND=23, OR=24, SCOPE_BLOCK_NAME=25, SCOPE_BLOCK_END=26, 
		TYPE=27, STRING=28, NUMBER=29, INTEGER=30, BOOLEAN=31, NEWLINE=32, END=33, 
		NAME=34, STRING_LITERAL=35, DECIMAL_INTEGER=36, FLOAT_NUMBER=37, OPEN_PAREN=38, 
		CLOSE_PAREN=39, OPEN_BRACK=40, CLOSE_BRACK=41, OPEN_BRACE=42, CLOSE_BRACE=43, 
		SKIP_=44, UNKNOWN_CHAR=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", 
			"WHILE", "MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "NOT", "AND", "OR", "SCOPE_BLOCK_NAME", "SCOPE_BLOCK_END", 
			"TYPE", "STRING", "NUMBER", "INTEGER", "BOOLEAN", "NEWLINE", "END", "NAME", 
			"STRING_LITERAL", "DECIMAL_INTEGER", "FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR", 
			"NON_ZERO_DIGIT", "DIGIT", "SPACES", "COMMENT", "LINE_JOINING", "ID_START", 
			"ID_CONTINUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'='", "'break'", "'continue'", "'if'", "':'", "'elif'", 
			"'else'", "'while'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'print'", "'!'", "'and'", "'or'", null, 
			null, null, null, null, null, null, null, "'end'", null, null, null, 
			null, "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EQUAL", "BREAK", "CONTINUE", "IF", "COLON", "ELIF", "ELSE", 
			"WHILE", "MUL", "DIV", "MOD", "ADD", "SUB", "LT", "GT", "LE", "GE", "EQUAL_EQUAL", 
			"NOT_EQUAL", "PRINT", "NOT", "AND", "OR", "SCOPE_BLOCK_NAME", "SCOPE_BLOCK_END", 
			"TYPE", "STRING", "NUMBER", "INTEGER", "BOOLEAN", "NEWLINE", "END", "NAME", 
			"STRING_LITERAL", "DECIMAL_INTEGER", "FLOAT_NUMBER", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "SKIP_", "UNKNOWN_CHAR"
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
		"\u0004\u0000-\u0161\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u00bd\b\u0018"+
		"\n\u0018\f\u0018\u00c0\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00df\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u00f0\b\u001e\u0001\u001f\u0003\u001f\u00f3\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u00f7\b\u001f\u0001\u001f\u0003\u001f"+
		"\u00fa\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u0102"+
		"\b!\n!\f!\u0105\t!\u0001\"\u0001\"\u0005\"\u0109\b\"\n\"\f\"\u010c\t\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0112\b#\n#\f#\u0115\t#\u0001#\u0004"+
		"#\u0118\b#\u000b#\f#\u0119\u0003#\u011c\b#\u0001$\u0005$\u011f\b$\n$\f"+
		"$\u0122\t$\u0001$\u0001$\u0005$\u0126\b$\n$\f$\u0129\t$\u0001%\u0001%"+
		"\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0003+\u013a\b+\u0001+\u0001+\u0001,\u0001,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0004/\u0145\b/\u000b/\f/\u0146\u00010\u0001"+
		"0\u00050\u014b\b0\n0\f0\u014e\t0\u00011\u00011\u00031\u0152\b1\u00011"+
		"\u00031\u0155\b1\u00011\u00011\u00031\u0159\b1\u00012\u00032\u015c\b2"+
		"\u00013\u00013\u00033\u0160\b3\u0001\u010a\u00004\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[\u0000]\u0000"+
		"_\u0000a\u0000c\u0000e\u0000g\u0000\u0001\u0000\u0006\u0001\u0000AZ\u0001"+
		"\u000019\u0001\u000009\u0002\u0000\t\t  \u0002\u0000\n\n\f\r\u0003\u0000"+
		"AZ__az\u0170\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0001i\u0001\u0000\u0000\u0000\u0003"+
		"k\u0001\u0000\u0000\u0000\u0005m\u0001\u0000\u0000\u0000\u0007s\u0001"+
		"\u0000\u0000\u0000\t|\u0001\u0000\u0000\u0000\u000b\u007f\u0001\u0000"+
		"\u0000\u0000\r\u0081\u0001\u0000\u0000\u0000\u000f\u0086\u0001\u0000\u0000"+
		"\u0000\u0011\u008b\u0001\u0000\u0000\u0000\u0013\u0091\u0001\u0000\u0000"+
		"\u0000\u0015\u0093\u0001\u0000\u0000\u0000\u0017\u0095\u0001\u0000\u0000"+
		"\u0000\u0019\u0097\u0001\u0000\u0000\u0000\u001b\u0099\u0001\u0000\u0000"+
		"\u0000\u001d\u009b\u0001\u0000\u0000\u0000\u001f\u009d\u0001\u0000\u0000"+
		"\u0000!\u009f\u0001\u0000\u0000\u0000#\u00a2\u0001\u0000\u0000\u0000%"+
		"\u00a5\u0001\u0000\u0000\u0000\'\u00a8\u0001\u0000\u0000\u0000)\u00ab"+
		"\u0001\u0000\u0000\u0000+\u00b1\u0001\u0000\u0000\u0000-\u00b3\u0001\u0000"+
		"\u0000\u0000/\u00b7\u0001\u0000\u0000\u00001\u00ba\u0001\u0000\u0000\u0000"+
		"3\u00c4\u0001\u0000\u0000\u00005\u00de\u0001\u0000\u0000\u00007\u00e0"+
		"\u0001\u0000\u0000\u00009\u00e2\u0001\u0000\u0000\u0000;\u00e4\u0001\u0000"+
		"\u0000\u0000=\u00ef\u0001\u0000\u0000\u0000?\u00f6\u0001\u0000\u0000\u0000"+
		"A\u00fb\u0001\u0000\u0000\u0000C\u00ff\u0001\u0000\u0000\u0000E\u0106"+
		"\u0001\u0000\u0000\u0000G\u011b\u0001\u0000\u0000\u0000I\u0120\u0001\u0000"+
		"\u0000\u0000K\u012a\u0001\u0000\u0000\u0000M\u012c\u0001\u0000\u0000\u0000"+
		"O\u012e\u0001\u0000\u0000\u0000Q\u0130\u0001\u0000\u0000\u0000S\u0132"+
		"\u0001\u0000\u0000\u0000U\u0134\u0001\u0000\u0000\u0000W\u0139\u0001\u0000"+
		"\u0000\u0000Y\u013d\u0001\u0000\u0000\u0000[\u013f\u0001\u0000\u0000\u0000"+
		"]\u0141\u0001\u0000\u0000\u0000_\u0144\u0001\u0000\u0000\u0000a\u0148"+
		"\u0001\u0000\u0000\u0000c\u014f\u0001\u0000\u0000\u0000e\u015b\u0001\u0000"+
		"\u0000\u0000g\u015f\u0001\u0000\u0000\u0000ij\u0005@\u0000\u0000j\u0002"+
		"\u0001\u0000\u0000\u0000kl\u0005=\u0000\u0000l\u0004\u0001\u0000\u0000"+
		"\u0000mn\u0005b\u0000\u0000no\u0005r\u0000\u0000op\u0005e\u0000\u0000"+
		"pq\u0005a\u0000\u0000qr\u0005k\u0000\u0000r\u0006\u0001\u0000\u0000\u0000"+
		"st\u0005c\u0000\u0000tu\u0005o\u0000\u0000uv\u0005n\u0000\u0000vw\u0005"+
		"t\u0000\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000\u0000yz\u0005u\u0000"+
		"\u0000z{\u0005e\u0000\u0000{\b\u0001\u0000\u0000\u0000|}\u0005i\u0000"+
		"\u0000}~\u0005f\u0000\u0000~\n\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		":\u0000\u0000\u0080\f\u0001\u0000\u0000\u0000\u0081\u0082\u0005e\u0000"+
		"\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084"+
		"\u0085\u0005f\u0000\u0000\u0085\u000e\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0005e\u0000\u0000\u0087\u0088\u0005l\u0000\u0000\u0088\u0089\u0005s"+
		"\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u0010\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005w\u0000\u0000\u008c\u008d\u0005h\u0000\u0000\u008d"+
		"\u008e\u0005i\u0000\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005"+
		"e\u0000\u0000\u0090\u0012\u0001\u0000\u0000\u0000\u0091\u0092\u0005*\u0000"+
		"\u0000\u0092\u0014\u0001\u0000\u0000\u0000\u0093\u0094\u0005/\u0000\u0000"+
		"\u0094\u0016\u0001\u0000\u0000\u0000\u0095\u0096\u0005%\u0000\u0000\u0096"+
		"\u0018\u0001\u0000\u0000\u0000\u0097\u0098\u0005+\u0000\u0000\u0098\u001a"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005-\u0000\u0000\u009a\u001c\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005<\u0000\u0000\u009c\u001e\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005>\u0000\u0000\u009e \u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005<\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1\""+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005>\u0000\u0000\u00a3\u00a4\u0005"+
		"=\u0000\u0000\u00a4$\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005=\u0000"+
		"\u0000\u00a6\u00a7\u0005=\u0000\u0000\u00a7&\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005!\u0000\u0000\u00a9\u00aa\u0005=\u0000\u0000\u00aa(\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005p\u0000\u0000\u00ac\u00ad\u0005r\u0000"+
		"\u0000\u00ad\u00ae\u0005i\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af"+
		"\u00b0\u0005t\u0000\u0000\u00b0*\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"!\u0000\u0000\u00b2,\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005a\u0000"+
		"\u0000\u00b4\u00b5\u0005n\u0000\u0000\u00b5\u00b6\u0005d\u0000\u0000\u00b6"+
		".\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9\u0005"+
		"r\u0000\u0000\u00b90\u0001\u0000\u0000\u0000\u00ba\u00be\u0005[\u0000"+
		"\u0000\u00bb\u00bd\u0007\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005]\u0000\u0000"+
		"\u00c2\u00c3\u0003?\u001f\u0000\u00c32\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005[\u0000\u0000\u00c5\u00c6\u0003A \u0000\u00c6\u00c7\u0005]\u0000"+
		"\u0000\u00c7\u00c8\u0003?\u001f\u0000\u00c84\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005s\u0000\u0000\u00ca\u00cb\u0005t\u0000\u0000\u00cb\u00cc\u0005"+
		"r\u0000\u0000\u00cc\u00cd\u0005i\u0000\u0000\u00cd\u00ce\u0005n\u0000"+
		"\u0000\u00ce\u00df\u0005g\u0000\u0000\u00cf\u00d0\u0005i\u0000\u0000\u00d0"+
		"\u00d1\u0005n\u0000\u0000\u00d1\u00df\u0005t\u0000\u0000\u00d2\u00d3\u0005"+
		"f\u0000\u0000\u00d3\u00d4\u0005l\u0000\u0000\u00d4\u00d5\u0005o\u0000"+
		"\u0000\u00d5\u00d6\u0005a\u0000\u0000\u00d6\u00df\u0005t\u0000\u0000\u00d7"+
		"\u00d8\u0005b\u0000\u0000\u00d8\u00d9\u0005o\u0000\u0000\u00d9\u00da\u0005"+
		"o\u0000\u0000\u00da\u00db\u0005l\u0000\u0000\u00db\u00dc\u0005e\u0000"+
		"\u0000\u00dc\u00dd\u0005a\u0000\u0000\u00dd\u00df\u0005n\u0000\u0000\u00de"+
		"\u00c9\u0001\u0000\u0000\u0000\u00de\u00cf\u0001\u0000\u0000\u0000\u00de"+
		"\u00d2\u0001\u0000\u0000\u0000\u00de\u00d7\u0001\u0000\u0000\u0000\u00df"+
		"6\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003E\"\u0000\u00e18\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0003;\u001d\u0000\u00e3:\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0003G#\u0000\u00e5<\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005t\u0000\u0000\u00e7\u00e8\u0005r\u0000\u0000\u00e8\u00e9\u0005u"+
		"\u0000\u0000\u00e9\u00f0\u0005e\u0000\u0000\u00ea\u00eb\u0005f\u0000\u0000"+
		"\u00eb\u00ec\u0005a\u0000\u0000\u00ec\u00ed\u0005l\u0000\u0000\u00ed\u00ee"+
		"\u0005s\u0000\u0000\u00ee\u00f0\u0005e\u0000\u0000\u00ef\u00e6\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00f0>\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f3\u0005\r\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0005\n\u0000\u0000\u00f5\u00f7\u0002\f\r\u0000\u00f6\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003_/\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa@\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005e\u0000\u0000\u00fc\u00fd\u0005n\u0000\u0000\u00fd"+
		"\u00fe\u0005d\u0000\u0000\u00feB\u0001\u0000\u0000\u0000\u00ff\u0103\u0003"+
		"e2\u0000\u0100\u0102\u0003g3\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104D\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u010a\u0005\"\u0000\u0000\u0107\u0109"+
		"\t\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010a\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\"\u0000\u0000\u010eF\u0001\u0000"+
		"\u0000\u0000\u010f\u0113\u0003[-\u0000\u0110\u0112\u0003].\u0000\u0111"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u011c\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u00050\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u010f"+
		"\u0001\u0000\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011cH\u0001"+
		"\u0000\u0000\u0000\u011d\u011f\u0003].\u0000\u011e\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0127\u0005.\u0000\u0000"+
		"\u0124\u0126\u0003].\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129"+
		"\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128J\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005(\u0000\u0000\u012bL\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0005)\u0000\u0000\u012dN\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005[\u0000\u0000\u012fP\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"]\u0000\u0000\u0131R\u0001\u0000\u0000\u0000\u0132\u0133\u0005{\u0000"+
		"\u0000\u0133T\u0001\u0000\u0000\u0000\u0134\u0135\u0005}\u0000\u0000\u0135"+
		"V\u0001\u0000\u0000\u0000\u0136\u013a\u0003_/\u0000\u0137\u013a\u0003"+
		"a0\u0000\u0138\u013a\u0003c1\u0000\u0139\u0136\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0006+\u0000\u0000\u013c"+
		"X\u0001\u0000\u0000\u0000\u013d\u013e\t\u0000\u0000\u0000\u013eZ\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0007\u0001\u0000\u0000\u0140\\\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0007\u0002\u0000\u0000\u0142^\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0007\u0003\u0000\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147`\u0001\u0000\u0000\u0000"+
		"\u0148\u014c\u0005#\u0000\u0000\u0149\u014b\b\u0004\u0000\u0000\u014a"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"b\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0151"+
		"\u0005\\\u0000\u0000\u0150\u0152\u0003_/\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0158\u0001\u0000"+
		"\u0000\u0000\u0153\u0155\u0005\r\u0000\u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0005\n\u0000\u0000\u0157\u0159\u0002\f\r\u0000\u0158"+
		"\u0154\u0001\u0000\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159"+
		"d\u0001\u0000\u0000\u0000\u015a\u015c\u0007\u0005\u0000\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015cf\u0001\u0000\u0000\u0000\u015d\u0160\u0003"+
		"e2\u0000\u015e\u0160\u0007\u0002\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160h\u0001\u0000\u0000\u0000"+
		"\u0016\u0000\u00be\u00de\u00ef\u00f2\u00f6\u00f9\u0103\u010a\u0113\u0119"+
		"\u011b\u0120\u0127\u0139\u0146\u014c\u0151\u0154\u0158\u015b\u015f\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}