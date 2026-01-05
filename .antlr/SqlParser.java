// Generated from e:/SQL Compiler/SqlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, ALTER=2, DROP=3, TRUNCATE=4, TABLE=5, VIEW=6, INDEX=7, SELECT=8, 
		INSERT=9, UPDATE=10, DELETE=11, INTO=12, VALUES=13, SET=14, FROM=15, WHERE=16, 
		GROUP=17, BY=18, HAVING=19, ORDER=20, LIMIT=21, OFFSET=22, JOIN=23, INNER=24, 
		LEFT=25, RIGHT=26, FULL=27, OUTER=28, ON=29, USING=30, AND=31, OR=32, 
		NOT=33, PRIMARY=34, KEY=35, FOREIGN=36, REFERENCES=37, NULL=38, UNIQUE=39, 
		CHECK=40, DEFAULT=41, AUTO_INCREMENT=42, INTEGER=43, INT=44, SMALLINT=45, 
		BIGINT=46, DECIMAL=47, NUMERIC=48, FLOAT=49, REAL=50, DOUBLE=51, CHAR=52, 
		VARCHAR=53, TEXT=54, DATE=55, TIME=56, TIMESTAMP=57, BOOLEAN=58, AS=59, 
		DISTINCT=60, ALL=61, ANY=62, SOME=63, EXISTS=64, IN=65, BETWEEN=66, LIKE=67, 
		IS=68, CASE=69, WHEN=70, THEN=71, ELSE=72, END=73, TRUE=74, FALSE=75, 
		COUNT=76, SUM=77, AVG=78, MIN=79, MAX=80, COALESCE=81, NULLIF=82, CAST=83, 
		CONVERT=84, CUME_DIST=85, PERCENT_RANK=86, UNION=87, INTERSECT=88, EXCEPT=89, 
		ASC=90, DESC=91, COLLATE=92, WITH=93, OVER=94, PARTITION=95, WINDOW=96, 
		ROW_NUMBER=97, RANK=98, DENSE_RANK=99, NTILE=100, LAG=101, LEAD=102, FIRST_VALUE=103, 
		LAST_VALUE=104, DECLARE=105, BEGIN=106, IF=107, TRY=108, CATCH=109, ADD=110, 
		CONSTRAINT=111, GO=112, OBJECT_ID=113, OBJECT_NAME=114, OBJECT_SCHEMA_NAME=115, 
		QUOTENAME=116, INFORMATION_SCHEMA=117, TABLES=118, SP_EXECUTESQL=119, 
		VARIABLE=120, IDENTIFIER=121, QUOTED_IDENTIFIER=122, BACKTICK_QUOTED_IDENTIFIER=123, 
		NUMBER=124, STRING=125, DATE_LITERAL=126, EQUALS=127, NOTEQUALS=128, LESSTHAN=129, 
		GREATERTHAN=130, LESSTHANOREQ=131, GREATERTHANOREQ=132, MULTIPLY=133, 
		PLUS=134, MINUS=135, DIVIDE=136, MODULO=137, CONCAT=138, ARROW=139, LPAREN=140, 
		RPAREN=141, COMMA=142, SEMICOLON=143, DOT=144, OPENSQUAREBRACKET=145, 
		CLOSESQUAREBRACKET=146, WS=147, COMMENT=148, MULTILINE_COMMENT=149;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_selectStatement = 2, RULE_expression = 3, 
		RULE_variable = 4, RULE_functionCall = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "selectStatement", "expression", "variable", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'='", null, "'<'", "'>'", 
			"'<='", "'>='", "'*'", "'+'", "'-'", "'/'", "'%'", "'||'", "'->'", "'('", 
			"')'", "','", "';'", "'.'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "ALTER", "DROP", "TRUNCATE", "TABLE", "VIEW", "INDEX", 
			"SELECT", "INSERT", "UPDATE", "DELETE", "INTO", "VALUES", "SET", "FROM", 
			"WHERE", "GROUP", "BY", "HAVING", "ORDER", "LIMIT", "OFFSET", "JOIN", 
			"INNER", "LEFT", "RIGHT", "FULL", "OUTER", "ON", "USING", "AND", "OR", 
			"NOT", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", "NULL", "UNIQUE", "CHECK", 
			"DEFAULT", "AUTO_INCREMENT", "INTEGER", "INT", "SMALLINT", "BIGINT", 
			"DECIMAL", "NUMERIC", "FLOAT", "REAL", "DOUBLE", "CHAR", "VARCHAR", "TEXT", 
			"DATE", "TIME", "TIMESTAMP", "BOOLEAN", "AS", "DISTINCT", "ALL", "ANY", 
			"SOME", "EXISTS", "IN", "BETWEEN", "LIKE", "IS", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "TRUE", "FALSE", "COUNT", "SUM", "AVG", "MIN", "MAX", 
			"COALESCE", "NULLIF", "CAST", "CONVERT", "CUME_DIST", "PERCENT_RANK", 
			"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "COLLATE", "WITH", "OVER", 
			"PARTITION", "WINDOW", "ROW_NUMBER", "RANK", "DENSE_RANK", "NTILE", "LAG", 
			"LEAD", "FIRST_VALUE", "LAST_VALUE", "DECLARE", "BEGIN", "IF", "TRY", 
			"CATCH", "ADD", "CONSTRAINT", "GO", "OBJECT_ID", "OBJECT_NAME", "OBJECT_SCHEMA_NAME", 
			"QUOTENAME", "INFORMATION_SCHEMA", "TABLES", "SP_EXECUTESQL", "VARIABLE", 
			"IDENTIFIER", "QUOTED_IDENTIFIER", "BACKTICK_QUOTED_IDENTIFIER", "NUMBER", 
			"STRING", "DATE_LITERAL", "EQUALS", "NOTEQUALS", "LESSTHAN", "GREATERTHAN", 
			"LESSTHANOREQ", "GREATERTHANOREQ", "MULTIPLY", "PLUS", "MINUS", "DIVIDE", 
			"MODULO", "CONCAT", "ARROW", "LPAREN", "RPAREN", "COMMA", "SEMICOLON", 
			"DOT", "OPENSQUAREBRACKET", "CLOSESQUAREBRACKET", "WS", "COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "SqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statement();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SELECT );
			setState(17);
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
	public static class StatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SqlParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			selectStatement();
			setState(20);
			match(SEMICOLON);
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
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(SELECT);
			setState(23);
			expression();
			setState(24);
			match(FROM);
			setState(25);
			match(IDENTIFIER);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26);
				match(WHERE);
				setState(27);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public TerminalNode MULTIPLY() { return getToken(SqlParser.MULTIPLY, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(MULTIPLY);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				functionCall();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SqlParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(VARIABLE);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(LPAREN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 8243L) != 0)) {
				{
				setState(42);
				expression();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(43);
					match(COMMA);
					setState(44);
					expression();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(52);
			match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00957\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u001d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		".\b\u0005\n\u0005\f\u00051\t\u0005\u0003\u00053\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000"+
		"\u00009\u0000\r\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000"+
		"\b&\u0001\u0000\u0000\u0000\n(\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001"+
		"\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002\u0000"+
		"\u0014\u0015\u0005\u008f\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0005\b\u0000\u0000\u0017\u0018\u0003\u0006\u0003\u0000\u0018"+
		"\u0019\u0005\u000f\u0000\u0000\u0019\u001c\u0005y\u0000\u0000\u001a\u001b"+
		"\u0005\u0010\u0000\u0000\u001b\u001d\u0003\u0006\u0003\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u0005"+
		"\u0001\u0000\u0000\u0000\u001e%\u0005y\u0000\u0000\u001f%\u0005|\u0000"+
		"\u0000 %\u0005}\u0000\u0000!%\u0005\u0085\u0000\u0000\"%\u0003\b\u0004"+
		"\u0000#%\u0003\n\u0005\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001"+
		"\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0007\u0001\u0000"+
		"\u0000\u0000&\'\u0005x\u0000\u0000\'\t\u0001\u0000\u0000\u0000()\u0005"+
		"y\u0000\u0000)2\u0005\u008c\u0000\u0000*/\u0003\u0006\u0003\u0000+,\u0005"+
		"\u008e\u0000\u0000,.\u0003\u0006\u0003\u0000-+\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u00002*\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0005"+
		"\u008d\u0000\u00005\u000b\u0001\u0000\u0000\u0000\u0005\u000f\u001c$/"+
		"2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}