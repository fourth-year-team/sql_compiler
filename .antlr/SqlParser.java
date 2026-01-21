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
		SELECT=1, INSERT=2, UPDATE=3, DELETE=4, FROM=5, WHERE=6, GROUP=7, BY=8, 
		HAVING=9, ORDER=10, LIMIT=11, OFFSET=12, INTO=13, VALUES=14, SET=15, CREATE=16, 
		ALTER=17, DROP=18, TRUNCATE=19, TABLE=20, VIEW=21, INDEX=22, ADD=23, COLUMN=24, 
		CONSTRAINT=25, PRIMARY=26, KEY=27, FOREIGN=28, REFERENCES=29, UNIQUE=30, 
		CHECK=31, DEFAULT=32, AUTO_INCREMENT=33, AND=34, OR=35, NOT=36, IN=37, 
		BETWEEN=38, LIKE=39, IS=40, EXISTS=41, NULL=42, TRUE=43, FALSE=44, JOIN=45, 
		INNER=46, LEFT=47, RIGHT=48, FULL=49, OUTER=50, ON=51, USING=52, AS=53, 
		DISTINCT=54, ALL=55, ASC=56, DESC=57, WITH=58, DECLARE=59, BEGIN=60, END=61, 
		IF=62, ELSE=63, TRY=64, CATCH=65, GO=66, CURSOR=67, FOR=68, OPEN=69, FETCH=70, 
		NEXT=71, CLOSE=72, DEALLOCATE=73, EXEC=74, SP_EXECUTESQL=75, CASE=76, 
		WHEN=77, THEN=78, COUNT=79, SUM=80, AVG=81, MIN=82, MAX=83, COALESCE=84, 
		NULLIF=85, CAST=86, CONVERT=87, USE=88, IDENTITY=89, NONCLUSTERED=90, 
		ESCAPE=91, INT=92, INTEGER=93, SMALLINT=94, BIGINT=95, DECIMAL=96, NUMERIC=97, 
		FLOAT=98, REAL=99, DOUBLE=100, CHAR=101, VARCHAR=102, TEXT=103, DATE=104, 
		TIME=105, TIMESTAMP=106, BOOLEAN=107, RECURSIVE=108, UNION=109, WHILE=110, 
		PRINT=111, GLOBAL_VARIABLE=112, NVARCHAR=113, CLUSTERED=114, EQUALS=115, 
		NOTEQUALS=116, LESSTHAN=117, GREATERTHAN=118, LESSTHANOREQ=119, GREATERTHANOREQ=120, 
		PLUS=121, MINUS=122, MULTIPLY=123, DIVIDE=124, MODULO=125, CONCAT=126, 
		LPAREN=127, RPAREN=128, COMMA=129, DOT=130, SEMICOLON=131, NUMBER=132, 
		STRING=133, NSTRING=134, DATE_LITERAL=135, HEX_STRING=136, BIT_STRING=137, 
		BACKTICK_QUOTED_IDENTIFIER=138, QUOTED_IDENTIFIER=139, BRACKETED_IDENTIFIER=140, 
		IDENTIFIER=141, VARIABLE=142, LINE_COMMENT=143, MULTILINE_COMMENT=144, 
		WS=145;
	public static final int
		RULE_sqlScript = 0, RULE_sqlStatement = 1, RULE_useStatement = 2, RULE_cteStatement = 3, 
		RULE_commonTableExpression = 4, RULE_cursorStatement = 5, RULE_declareCursor = 6, 
		RULE_openCursor = 7, RULE_fetchCursor = 8, RULE_closeCursor = 9, RULE_deallocateCursor = 10, 
		RULE_ddlStatement = 11, RULE_createTableStatement = 12, RULE_tableElement = 13, 
		RULE_columnDefinition = 14, RULE_columnConstraint = 15, RULE_tableConstraint = 16, 
		RULE_constraintDefinition = 17, RULE_alterTableStatement = 18, RULE_alterTableAction = 19, 
		RULE_dropStatement = 20, RULE_truncateStatement = 21, RULE_dmlStatement = 22, 
		RULE_selectStatement = 23, RULE_querySpecification = 24, RULE_selectList = 25, 
		RULE_selectItem = 26, RULE_tableSource = 27, RULE_joinClause = 28, RULE_whereClause = 29, 
		RULE_groupByClause = 30, RULE_havingClause = 31, RULE_orderByClause = 32, 
		RULE_orderByItem = 33, RULE_limitClause = 34, RULE_offsetClause = 35, 
		RULE_insertStatement = 36, RULE_valueList = 37, RULE_valueGroup = 38, 
		RULE_updateStatement = 39, RULE_setClause = 40, RULE_deleteStatement = 41, 
		RULE_controlFlowStatement = 42, RULE_ifStatement = 43, RULE_whileStatement = 44, 
		RULE_beginEndBlock = 45, RULE_tryCatchBlock = 46, RULE_printStatement = 47, 
		RULE_variableDeclaration = 48, RULE_variableAssignment = 49, RULE_execStatement = 50, 
		RULE_goStatement = 51, RULE_expression = 52, RULE_logicalOrExpression = 53, 
		RULE_logicalAndExpression = 54, RULE_existsExpression = 55, RULE_comparisonExpression = 56, 
		RULE_comparisonOperator = 57, RULE_castExpression = 58, RULE_additiveExpression = 59, 
		RULE_multiplicativeExpression = 60, RULE_unaryExpression = 61, RULE_primaryExpression = 62, 
		RULE_caseExpression = 63, RULE_functionCall = 64, RULE_functionName = 65, 
		RULE_expressionList = 66, RULE_dataType = 67, RULE_literal = 68, RULE_tableName = 69, 
		RULE_columnName = 70, RULE_columnNameList = 71, RULE_columnReference = 72, 
		RULE_tableAlias = 73, RULE_columnAlias = 74, RULE_identifier = 75, RULE_variableName = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"sqlScript", "sqlStatement", "useStatement", "cteStatement", "commonTableExpression", 
			"cursorStatement", "declareCursor", "openCursor", "fetchCursor", "closeCursor", 
			"deallocateCursor", "ddlStatement", "createTableStatement", "tableElement", 
			"columnDefinition", "columnConstraint", "tableConstraint", "constraintDefinition", 
			"alterTableStatement", "alterTableAction", "dropStatement", "truncateStatement", 
			"dmlStatement", "selectStatement", "querySpecification", "selectList", 
			"selectItem", "tableSource", "joinClause", "whereClause", "groupByClause", 
			"havingClause", "orderByClause", "orderByItem", "limitClause", "offsetClause", 
			"insertStatement", "valueList", "valueGroup", "updateStatement", "setClause", 
			"deleteStatement", "controlFlowStatement", "ifStatement", "whileStatement", 
			"beginEndBlock", "tryCatchBlock", "printStatement", "variableDeclaration", 
			"variableAssignment", "execStatement", "goStatement", "expression", "logicalOrExpression", 
			"logicalAndExpression", "existsExpression", "comparisonExpression", "comparisonOperator", 
			"castExpression", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"primaryExpression", "caseExpression", "functionCall", "functionName", 
			"expressionList", "dataType", "literal", "tableName", "columnName", "columnNameList", 
			"columnReference", "tableAlias", "columnAlias", "identifier", "variableName"
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
			null, null, null, null, null, null, null, "'='", null, "'<'", "'>'", 
			"'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'('", "')'", 
			"','", "'.'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "INSERT", "UPDATE", "DELETE", "FROM", "WHERE", "GROUP", 
			"BY", "HAVING", "ORDER", "LIMIT", "OFFSET", "INTO", "VALUES", "SET", 
			"CREATE", "ALTER", "DROP", "TRUNCATE", "TABLE", "VIEW", "INDEX", "ADD", 
			"COLUMN", "CONSTRAINT", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", "UNIQUE", 
			"CHECK", "DEFAULT", "AUTO_INCREMENT", "AND", "OR", "NOT", "IN", "BETWEEN", 
			"LIKE", "IS", "EXISTS", "NULL", "TRUE", "FALSE", "JOIN", "INNER", "LEFT", 
			"RIGHT", "FULL", "OUTER", "ON", "USING", "AS", "DISTINCT", "ALL", "ASC", 
			"DESC", "WITH", "DECLARE", "BEGIN", "END", "IF", "ELSE", "TRY", "CATCH", 
			"GO", "CURSOR", "FOR", "OPEN", "FETCH", "NEXT", "CLOSE", "DEALLOCATE", 
			"EXEC", "SP_EXECUTESQL", "CASE", "WHEN", "THEN", "COUNT", "SUM", "AVG", 
			"MIN", "MAX", "COALESCE", "NULLIF", "CAST", "CONVERT", "USE", "IDENTITY", 
			"NONCLUSTERED", "ESCAPE", "INT", "INTEGER", "SMALLINT", "BIGINT", "DECIMAL", 
			"NUMERIC", "FLOAT", "REAL", "DOUBLE", "CHAR", "VARCHAR", "TEXT", "DATE", 
			"TIME", "TIMESTAMP", "BOOLEAN", "RECURSIVE", "UNION", "WHILE", "PRINT", 
			"GLOBAL_VARIABLE", "NVARCHAR", "CLUSTERED", "EQUALS", "NOTEQUALS", "LESSTHAN", 
			"GREATERTHAN", "LESSTHANOREQ", "GREATERTHANOREQ", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "CONCAT", "LPAREN", "RPAREN", "COMMA", "DOT", "SEMICOLON", 
			"NUMBER", "STRING", "NSTRING", "DATE_LITERAL", "HEX_STRING", "BIT_STRING", 
			"BACKTICK_QUOTED_IDENTIFIER", "QUOTED_IDENTIFIER", "BRACKETED_IDENTIFIER", 
			"IDENTIFIER", "VARIABLE", "LINE_COMMENT", "MULTILINE_COMMENT", "WS"
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
	public static class SqlScriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SqlParser.EOF, 0); }
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlParser.SEMICOLON, i);
		}
		public SqlScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlScript; }
	}

	public final SqlScriptContext sqlScript() throws RecognitionException {
		SqlScriptContext _localctx = new SqlScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sqlScript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6629298651490385950L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 52776562328537L) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 15L) != 0)) {
				{
				{
				setState(154);
				sqlStatement();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(155);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
	public static class SqlStatementContext extends ParserRuleContext {
		public DdlStatementContext ddlStatement() {
			return getRuleContext(DdlStatementContext.class,0);
		}
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public CteStatementContext cteStatement() {
			return getRuleContext(CteStatementContext.class,0);
		}
		public CursorStatementContext cursorStatement() {
			return getRuleContext(CursorStatementContext.class,0);
		}
		public ControlFlowStatementContext controlFlowStatement() {
			return getRuleContext(ControlFlowStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ExecStatementContext execStatement() {
			return getRuleContext(ExecStatementContext.class,0);
		}
		public GoStatementContext goStatement() {
			return getRuleContext(GoStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public UseStatementContext useStatement() {
			return getRuleContext(UseStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				ddlStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				dmlStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				cteStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				cursorStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				controlFlowStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				variableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				variableAssignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				execStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				goStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				printStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				useStatement();
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
	public static class UseStatementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SqlParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStatement; }
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_useStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(USE);
			setState(179);
			identifier();
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
	public static class CteStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlParser.WITH, 0); }
		public List<CommonTableExpressionContext> commonTableExpression() {
			return getRuleContexts(CommonTableExpressionContext.class);
		}
		public CommonTableExpressionContext commonTableExpression(int i) {
			return getRuleContext(CommonTableExpressionContext.class,i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public CteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteStatement; }
	}

	public final CteStatementContext cteStatement() throws RecognitionException {
		CteStatementContext _localctx = new CteStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WITH);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(182);
				match(RECURSIVE);
				}
			}

			setState(185);
			commonTableExpression();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				commonTableExpression();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(193);
				selectStatement();
				}
				break;
			case INSERT:
				{
				setState(194);
				insertStatement();
				}
				break;
			case UPDATE:
				{
				setState(195);
				updateStatement();
				}
				break;
			case DELETE:
				{
				setState(196);
				deleteStatement();
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
	public static class CommonTableExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SqlParser.LPAREN, i);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SqlParser.RPAREN, i);
		}
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public CommonTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonTableExpression; }
	}

	public final CommonTableExpressionContext commonTableExpression() throws RecognitionException {
		CommonTableExpressionContext _localctx = new CommonTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commonTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			identifier();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(200);
				match(LPAREN);
				setState(201);
				columnNameList();
				setState(202);
				match(RPAREN);
				}
			}

			setState(206);
			match(AS);
			setState(207);
			match(LPAREN);
			setState(208);
			selectStatement();
			setState(209);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CursorStatementContext extends ParserRuleContext {
		public DeclareCursorContext declareCursor() {
			return getRuleContext(DeclareCursorContext.class,0);
		}
		public OpenCursorContext openCursor() {
			return getRuleContext(OpenCursorContext.class,0);
		}
		public FetchCursorContext fetchCursor() {
			return getRuleContext(FetchCursorContext.class,0);
		}
		public CloseCursorContext closeCursor() {
			return getRuleContext(CloseCursorContext.class,0);
		}
		public DeallocateCursorContext deallocateCursor() {
			return getRuleContext(DeallocateCursorContext.class,0);
		}
		public CursorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorStatement; }
	}

	public final CursorStatementContext cursorStatement() throws RecognitionException {
		CursorStatementContext _localctx = new CursorStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cursorStatement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				declareCursor();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				openCursor();
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				fetchCursor();
				}
				break;
			case CLOSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				closeCursor();
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				deallocateCursor();
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
	public static class DeclareCursorContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(SqlParser.DECLARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CURSOR() { return getToken(SqlParser.CURSOR, 0); }
		public TerminalNode FOR() { return getToken(SqlParser.FOR, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public DeclareCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareCursor; }
	}

	public final DeclareCursorContext declareCursor() throws RecognitionException {
		DeclareCursorContext _localctx = new DeclareCursorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declareCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(DECLARE);
			setState(219);
			identifier();
			setState(220);
			match(CURSOR);
			setState(221);
			match(FOR);
			setState(222);
			selectStatement();
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
	public static class OpenCursorContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(SqlParser.OPEN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpenCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCursor; }
	}

	public final OpenCursorContext openCursor() throws RecognitionException {
		OpenCursorContext _localctx = new OpenCursorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_openCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(OPEN);
			setState(225);
			identifier();
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
	public static class FetchCursorContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(SqlParser.FETCH, 0); }
		public TerminalNode NEXT() { return getToken(SqlParser.NEXT, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> GLOBAL_VARIABLE() { return getTokens(SqlParser.GLOBAL_VARIABLE); }
		public TerminalNode GLOBAL_VARIABLE(int i) {
			return getToken(SqlParser.GLOBAL_VARIABLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public FetchCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchCursor; }
	}

	public final FetchCursorContext fetchCursor() throws RecognitionException {
		FetchCursorContext _localctx = new FetchCursorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fetchCursor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(FETCH);
			setState(228);
			match(NEXT);
			setState(229);
			match(FROM);
			setState(230);
			identifier();
			setState(231);
			match(INTO);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(232);
				variableName();
				}
				break;
			case GLOBAL_VARIABLE:
				{
				setState(233);
				match(GLOBAL_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(237);
					variableName();
					}
					break;
				case GLOBAL_VARIABLE:
					{
					setState(238);
					match(GLOBAL_VARIABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class CloseCursorContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(SqlParser.CLOSE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CloseCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCursor; }
	}

	public final CloseCursorContext closeCursor() throws RecognitionException {
		CloseCursorContext _localctx = new CloseCursorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closeCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(CLOSE);
			setState(247);
			identifier();
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
	public static class DeallocateCursorContext extends ParserRuleContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlParser.DEALLOCATE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateCursorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deallocateCursor; }
	}

	public final DeallocateCursorContext deallocateCursor() throws RecognitionException {
		DeallocateCursorContext _localctx = new DeallocateCursorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deallocateCursor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(DEALLOCATE);
			setState(250);
			identifier();
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
	public static class DdlStatementContext extends ParserRuleContext {
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public AlterTableStatementContext alterTableStatement() {
			return getRuleContext(AlterTableStatementContext.class,0);
		}
		public DropStatementContext dropStatement() {
			return getRuleContext(DropStatementContext.class,0);
		}
		public TruncateStatementContext truncateStatement() {
			return getRuleContext(TruncateStatementContext.class,0);
		}
		public DdlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddlStatement; }
	}

	public final DdlStatementContext ddlStatement() throws RecognitionException {
		DdlStatementContext _localctx = new DdlStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ddlStatement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				createTableStatement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				alterTableStatement();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				dropStatement();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				truncateStatement();
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
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(CREATE);
			setState(259);
			match(TABLE);
			setState(260);
			tableName();
			setState(261);
			match(LPAREN);
			setState(262);
			tableElement();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				tableElement();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableElement);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				columnDefinition();
				}
				break;
			case CONSTRAINT:
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				tableConstraint();
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
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			columnName();
			setState(277);
			dataType();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & -9223372036854709003L) != 0)) {
				{
				{
				setState(278);
				columnConstraint();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SqlParser.NONCLUSTERED, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlParser.UNIQUE, 0); }
		public TerminalNode IDENTITY() { return getToken(SqlParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SqlParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(SqlParser.CHECK, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(SqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_columnConstraint);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(NOT);
				setState(285);
				match(NULL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(NULL);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(PRIMARY);
				setState(288);
				match(KEY);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED || _la==CLUSTERED) {
					{
					setState(289);
					_la = _input.LA(1);
					if ( !(_la==NONCLUSTERED || _la==CLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(UNIQUE);
				}
				break;
			case IDENTITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(IDENTITY);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(294);
					match(LPAREN);
					setState(295);
					match(NUMBER);
					setState(296);
					match(COMMA);
					setState(297);
					match(NUMBER);
					setState(298);
					match(RPAREN);
					}
				}

				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(DEFAULT);
				setState(302);
				expression();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				match(CHECK);
				setState(304);
				match(LPAREN);
				setState(305);
				expression();
				setState(306);
				match(RPAREN);
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				match(AUTO_INCREMENT);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 9);
				{
				setState(309);
				match(FOREIGN);
				setState(310);
				match(KEY);
				setState(311);
				match(REFERENCES);
				setState(312);
				tableName();
				setState(313);
				match(LPAREN);
				setState(314);
				columnName();
				setState(315);
				match(RPAREN);
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
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(SqlParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableConstraint);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(CONSTRAINT);
				setState(320);
				identifier();
				setState(321);
				constraintDefinition();
				}
				break;
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				constraintDefinition();
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
	public static class ConstraintDefinitionContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SqlParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SqlParser.LPAREN, i);
		}
		public List<ColumnNameListContext> columnNameList() {
			return getRuleContexts(ColumnNameListContext.class);
		}
		public ColumnNameListContext columnNameList(int i) {
			return getRuleContext(ColumnNameListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SqlParser.RPAREN, i);
		}
		public TerminalNode CLUSTERED() { return getToken(SqlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(SqlParser.NONCLUSTERED, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlParser.UNIQUE, 0); }
		public TerminalNode CHECK() { return getToken(SqlParser.CHECK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(SqlParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ConstraintDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition; }
	}

	public final ConstraintDefinitionContext constraintDefinition() throws RecognitionException {
		ConstraintDefinitionContext _localctx = new ConstraintDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraintDefinition);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(PRIMARY);
				setState(327);
				match(KEY);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NONCLUSTERED || _la==CLUSTERED) {
					{
					setState(328);
					_la = _input.LA(1);
					if ( !(_la==NONCLUSTERED || _la==CLUSTERED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(331);
				match(LPAREN);
				setState(332);
				columnNameList();
				setState(333);
				match(RPAREN);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(UNIQUE);
				setState(336);
				match(LPAREN);
				setState(337);
				columnNameList();
				setState(338);
				match(RPAREN);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(CHECK);
				setState(341);
				match(LPAREN);
				setState(342);
				expression();
				setState(343);
				match(RPAREN);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(FOREIGN);
				setState(346);
				match(KEY);
				setState(347);
				match(LPAREN);
				setState(348);
				columnNameList();
				setState(349);
				match(RPAREN);
				setState(350);
				match(REFERENCES);
				setState(351);
				tableName();
				setState(352);
				match(LPAREN);
				setState(353);
				columnNameList();
				setState(354);
				match(RPAREN);
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
	public static class AlterTableStatementContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTableActionContext alterTableAction() {
			return getRuleContext(AlterTableActionContext.class,0);
		}
		public AlterTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableStatement; }
	}

	public final AlterTableStatementContext alterTableStatement() throws RecognitionException {
		AlterTableStatementContext _localctx = new AlterTableStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alterTableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ALTER);
			setState(359);
			match(TABLE);
			setState(360);
			tableName();
			setState(361);
			alterTableAction();
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
	public static class AlterTableActionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(SqlParser.CONSTRAINT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintDefinitionContext constraintDefinition() {
			return getRuleContext(ConstraintDefinitionContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alterTableAction);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(ADD);
				setState(364);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(ADD);
				setState(366);
				match(CONSTRAINT);
				setState(367);
				identifier();
				setState(368);
				constraintDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(DROP);
				setState(371);
				match(COLUMN);
				setState(372);
				columnName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(DROP);
				setState(374);
				match(CONSTRAINT);
				setState(375);
				identifier();
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
	public static class DropStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SqlParser.DROP, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlParser.VIEW, 0); }
		public TerminalNode INDEX() { return getToken(SqlParser.INDEX, 0); }
		public DropStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropStatement; }
	}

	public final DropStatementContext dropStatement() throws RecognitionException {
		DropStatementContext _localctx = new DropStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dropStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(DROP);
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			tableName();
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
	public static class TruncateStatementContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(SqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateStatement; }
	}

	public final TruncateStatementContext truncateStatement() throws RecognitionException {
		TruncateStatementContext _localctx = new TruncateStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_truncateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(TRUNCATE);
			setState(383);
			match(TABLE);
			setState(384);
			tableName();
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
	public static class DmlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dmlStatement);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				deleteStatement();
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
	public static class SelectStatementContext extends ParserRuleContext {
		public List<QuerySpecificationContext> querySpecification() {
			return getRuleContexts(QuerySpecificationContext.class);
		}
		public QuerySpecificationContext querySpecification(int i) {
			return getRuleContext(QuerySpecificationContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(SqlParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(SqlParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(SqlParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(SqlParser.ALL, i);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			querySpecification();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(393);
				match(UNION);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(394);
					match(ALL);
					}
				}

				setState(397);
				querySpecification();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class QuerySpecificationContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlParser.ALL, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_querySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(SELECT);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(407);
			selectList();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(408);
				match(FROM);
				setState(409);
				tableSource(0);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(410);
					whereClause();
					}
				}

				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(413);
					groupByClause();
					}
				}

				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(416);
					havingClause();
					}
				}

				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(419);
					orderByClause();
					}
				}

				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(422);
					limitClause();
					}
				}

				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(425);
					offsetClause();
					}
				}

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
	public static class SelectListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			selectItem();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				selectItem();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class SelectItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TerminalNode MULTIPLY() { return getToken(SqlParser.MULTIPLY, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_selectItem);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				expression();
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(439);
						match(AS);
						}
					}

					setState(442);
					columnAlias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(MULTIPLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(NUMBER);
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
	public static class TableSourceContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		return tableSource(0);
	}

	private TableSourceContext tableSource(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableSourceContext _localctx = new TableSourceContext(_ctx, _parentState);
		TableSourceContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_tableSource, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(450);
				tableName();
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(451);
						match(AS);
						}
					}

					setState(454);
					tableAlias();
					}
					break;
				}
				}
				break;
			case LPAREN:
				{
				setState(457);
				match(LPAREN);
				setState(458);
				selectStatement();
				setState(459);
				match(RPAREN);
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(460);
						match(AS);
						}
					}

					setState(463);
					tableAlias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TableSourceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tableSource);
					setState(468);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(469);
					joinClause();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SqlParser.JOIN, 0); }
		public TableSourceContext tableSource() {
			return getRuleContext(TableSourceContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode OUTER() { return getToken(SqlParser.OUTER, 0); }
		public TerminalNode INNER() { return getToken(SqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlParser.FULL, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) {
				{
				setState(475);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(478);
				match(OUTER);
				}
			}

			setState(481);
			match(JOIN);
			setState(482);
			tableSource(0);
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(483);
				match(ON);
				setState(484);
				expression();
				}
				break;
			case USING:
				{
				setState(485);
				match(USING);
				setState(486);
				match(LPAREN);
				setState(487);
				columnNameList();
				setState(488);
				match(RPAREN);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(WHERE);
			setState(493);
			expression();
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
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
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
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(GROUP);
			setState(496);
			match(BY);
			setState(497);
			expression();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(498);
				match(COMMA);
				setState(499);
				expression();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(HAVING);
			setState(506);
			expression();
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
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ORDER);
			setState(509);
			match(BY);
			setState(510);
			orderByItem();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(511);
				match(COMMA);
				setState(512);
				orderByItem();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class OrderByItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			expression();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SqlParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LIMIT);
			setState(523);
			expression();
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
	public static class OffsetClauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SqlParser.OFFSET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_offsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(OFFSET);
			setState(526);
			expression();
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
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SqlParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SqlParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlParser.INTO, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public ColumnNameListContext columnNameList() {
			return getRuleContext(ColumnNameListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(INSERT);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(529);
				match(INTO);
				}
			}

			setState(532);
			tableName();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(533);
				match(LPAREN);
				setState(534);
				columnNameList();
				setState(535);
				match(RPAREN);
				}
			}

			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(539);
				match(VALUES);
				setState(540);
				valueList();
				}
				break;
			case SELECT:
				{
				setState(541);
				selectStatement();
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueGroupContext> valueGroup() {
			return getRuleContexts(ValueGroupContext.class);
		}
		public ValueGroupContext valueGroup(int i) {
			return getRuleContext(ValueGroupContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			valueGroup();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(545);
				match(COMMA);
				setState(546);
				valueGroup();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ValueGroupContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ValueGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueGroup; }
	}

	public final ValueGroupContext valueGroup() throws RecognitionException {
		ValueGroupContext _localctx = new ValueGroupContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_valueGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(LPAREN);
			setState(553);
			expression();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(554);
				match(COMMA);
				setState(555);
				expression();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SqlParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlParser.SET, 0); }
		public List<SetClauseContext> setClause() {
			return getRuleContexts(SetClauseContext.class);
		}
		public SetClauseContext setClause(int i) {
			return getRuleContext(SetClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(UPDATE);
			setState(564);
			tableName();
			setState(565);
			match(SET);
			setState(566);
			setClause();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(567);
				match(COMMA);
				setState(568);
				setClause();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(574);
				whereClause();
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
	public static class SetClauseContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			columnName();
			setState(578);
			match(EQUALS);
			setState(579);
			expression();
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
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(DELETE);
			setState(582);
			match(FROM);
			setState(583);
			tableName();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(584);
				whereClause();
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
	public static class ControlFlowStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public BeginEndBlockContext beginEndBlock() {
			return getRuleContext(BeginEndBlockContext.class,0);
		}
		public TryCatchBlockContext tryCatchBlock() {
			return getRuleContext(TryCatchBlockContext.class,0);
		}
		public ControlFlowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlFlowStatement; }
	}

	public final ControlFlowStatementContext controlFlowStatement() throws RecognitionException {
		ControlFlowStatementContext _localctx = new ControlFlowStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_controlFlowStatement);
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				beginEndBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				tryCatchBlock();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<BeginEndBlockContext> beginEndBlock() {
			return getRuleContexts(BeginEndBlockContext.class);
		}
		public BeginEndBlockContext beginEndBlock(int i) {
			return getRuleContext(BeginEndBlockContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode ELSE() { return getToken(SqlParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(IF);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(594);
				match(NOT);
				}
				break;
			}
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(597);
				match(EXISTS);
				setState(598);
				match(LPAREN);
				setState(599);
				selectStatement();
				setState(600);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(602);
				expression();
				}
				break;
			}
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(605);
				sqlStatement();
				}
				break;
			case 2:
				{
				setState(606);
				beginEndBlock();
				}
				break;
			}
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(609);
				match(ELSE);
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(610);
					sqlStatement();
					}
					break;
				case 2:
					{
					setState(611);
					beginEndBlock();
					}
					break;
				}
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SqlParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SqlStatementContext sqlStatement() {
			return getRuleContext(SqlStatementContext.class,0);
		}
		public BeginEndBlockContext beginEndBlock() {
			return getRuleContext(BeginEndBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(WHILE);
			setState(617);
			expression();
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(618);
				sqlStatement();
				}
				break;
			case 2:
				{
				setState(619);
				beginEndBlock();
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
	public static class BeginEndBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SqlParser.END, 0); }
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlParser.SEMICOLON, i);
		}
		public BeginEndBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginEndBlock; }
	}

	public final BeginEndBlockContext beginEndBlock() throws RecognitionException {
		BeginEndBlockContext _localctx = new BeginEndBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_beginEndBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(BEGIN);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6629298651490385950L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 52776562328537L) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 15L) != 0)) {
				{
				{
				setState(623);
				sqlStatement();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(624);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
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
	public static class TryCatchBlockContext extends ParserRuleContext {
		public List<TerminalNode> BEGIN() { return getTokens(SqlParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(SqlParser.BEGIN, i);
		}
		public List<TerminalNode> TRY() { return getTokens(SqlParser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(SqlParser.TRY, i);
		}
		public List<TerminalNode> END() { return getTokens(SqlParser.END); }
		public TerminalNode END(int i) {
			return getToken(SqlParser.END, i);
		}
		public List<TerminalNode> CATCH() { return getTokens(SqlParser.CATCH); }
		public TerminalNode CATCH(int i) {
			return getToken(SqlParser.CATCH, i);
		}
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlParser.SEMICOLON, i);
		}
		public TryCatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchBlock; }
	}

	public final TryCatchBlockContext tryCatchBlock() throws RecognitionException {
		TryCatchBlockContext _localctx = new TryCatchBlockContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_tryCatchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(BEGIN);
			setState(635);
			match(TRY);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6629298651490385950L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 52776562328537L) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 15L) != 0)) {
				{
				{
				setState(636);
				sqlStatement();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(637);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(645);
			match(END);
			setState(646);
			match(TRY);
			setState(647);
			match(BEGIN);
			setState(648);
			match(CATCH);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6629298651490385950L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 52776562328537L) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 15L) != 0)) {
				{
				{
				setState(649);
				sqlStatement();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(650);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			match(END);
			setState(659);
			match(CATCH);
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(SqlParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(PRINT);
			setState(662);
			expression();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(SqlParser.DECLARE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode GLOBAL_VARIABLE() { return getToken(SqlParser.GLOBAL_VARIABLE, 0); }
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(DECLARE);
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(665);
				variableName();
				}
				break;
			case GLOBAL_VARIABLE:
				{
				setState(666);
				match(GLOBAL_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(669);
			dataType();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(670);
				match(EQUALS);
				setState(671);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlParser.SET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode GLOBAL_VARIABLE() { return getToken(SqlParser.GLOBAL_VARIABLE, 0); }
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(SET);
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(675);
				variableName();
				}
				break;
			case GLOBAL_VARIABLE:
				{
				setState(676);
				match(GLOBAL_VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(679);
				match(PLUS);
				setState(680);
				match(EQUALS);
				}
				break;
			case EQUALS:
				{
				setState(681);
				match(EQUALS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(684);
			expression();
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
	public static class ExecStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SP_EXECUTESQL() { return getToken(SqlParser.SP_EXECUTESQL, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode EXEC() { return getToken(SqlParser.EXEC, 0); }
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ExecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStatement; }
	}

	public final ExecStatementContext execStatement() throws RecognitionException {
		ExecStatementContext _localctx = new ExecStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_execStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXEC) {
				{
				setState(686);
				match(EXEC);
				}
			}

			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(689);
				identifier();
				setState(690);
				match(DOT);
				}
				break;
			}
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SP_EXECUTESQL:
				{
				setState(694);
				match(SP_EXECUTESQL);
				}
				break;
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				{
				setState(695);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(698);
			expression();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(699);
				match(COMMA);
				setState(700);
				expression();
				}
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class GoStatementContext extends ParserRuleContext {
		public TerminalNode GO() { return getToken(SqlParser.GO, 0); }
		public GoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStatement; }
	}

	public final GoStatementContext goStatement() throws RecognitionException {
		GoStatementContext _localctx = new GoStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_goStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(GO);
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SqlParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			logicalAndExpression();
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(711);
					match(OR);
					setState(712);
					logicalAndExpression();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<ExistsExpressionContext> existsExpression() {
			return getRuleContexts(ExistsExpressionContext.class);
		}
		public ExistsExpressionContext existsExpression(int i) {
			return getRuleContext(ExistsExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SqlParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(718);
				comparisonExpression();
				}
				break;
			case 2:
				{
				setState(719);
				existsExpression();
				}
				break;
			}
			setState(729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					match(AND);
					setState(725);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(723);
						comparisonExpression();
						}
						break;
					case 2:
						{
						setState(724);
						existsExpression();
						}
						break;
					}
					}
					} 
				}
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
	public static class ExistsExpressionContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(SqlParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public ExistsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsExpression; }
	}

	public final ExistsExpressionContext existsExpression() throws RecognitionException {
		ExistsExpressionContext _localctx = new ExistsExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_existsExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(732);
				match(NOT);
				}
			}

			setState(735);
			match(EXISTS);
			setState(736);
			match(LPAREN);
			setState(737);
			selectStatement();
			setState(738);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(SqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public TerminalNode IN() { return getToken(SqlParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlParser.ESCAPE, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			additiveExpression();
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(741);
				comparisonOperator();
				setState(742);
				additiveExpression();
				}
				break;
			case 2:
				{
				{
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(744);
					match(NOT);
					}
				}

				setState(747);
				match(IN);
				}
				setState(749);
				match(LPAREN);
				setState(752);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case EXISTS:
				case NULL:
				case TRUE:
				case FALSE:
				case CASE:
				case COUNT:
				case SUM:
				case AVG:
				case MIN:
				case MAX:
				case COALESCE:
				case NULLIF:
				case CAST:
				case CONVERT:
				case GLOBAL_VARIABLE:
				case PLUS:
				case MINUS:
				case CONCAT:
				case LPAREN:
				case NUMBER:
				case STRING:
				case NSTRING:
				case DATE_LITERAL:
				case HEX_STRING:
				case BIT_STRING:
				case BACKTICK_QUOTED_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BRACKETED_IDENTIFIER:
				case IDENTIFIER:
				case VARIABLE:
					{
					setState(750);
					expressionList();
					}
					break;
				case SELECT:
					{
					setState(751);
					selectStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(754);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(756);
				match(BETWEEN);
				setState(757);
				additiveExpression();
				setState(758);
				match(AND);
				setState(759);
				additiveExpression();
				}
				break;
			case 4:
				{
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(761);
					match(NOT);
					}
				}

				setState(764);
				match(LIKE);
				setState(765);
				additiveExpression();
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(766);
					match(ESCAPE);
					setState(767);
					additiveExpression();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(770);
				match(IS);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(771);
					match(NOT);
					}
				}

				setState(774);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(SqlParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(SqlParser.NOTEQUALS, 0); }
		public TerminalNode LESSTHAN() { return getToken(SqlParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(SqlParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANOREQ() { return getToken(SqlParser.LESSTHANOREQ, 0); }
		public TerminalNode GREATERTHANOREQ() { return getToken(SqlParser.GREATERTHANOREQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(SqlParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_castExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(CAST);
			setState(780);
			match(LPAREN);
			setState(781);
			expression();
			setState(782);
			match(AS);
			setState(783);
			dataType();
			setState(784);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SqlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SqlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlParser.MINUS, i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(SqlParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(SqlParser.CONCAT, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			multiplicativeExpression();
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(787);
					_la = _input.LA(1);
					if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 35L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(788);
					multiplicativeExpression();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(SqlParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(SqlParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(SqlParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(SqlParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(SqlParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(SqlParser.MODULO, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			unaryExpression();
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(795);
					_la = _input.LA(1);
					if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 7L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(796);
					unaryExpression();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SqlParser.NOT, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT || _la==PLUS || _la==MINUS) {
				{
				setState(802);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(805);
			primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode GLOBAL_VARIABLE() { return getToken(SqlParser.GLOBAL_VARIABLE, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_primaryExpression);
		try {
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				columnReference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				variableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				match(GLOBAL_VARIABLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				caseExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
				castExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(814);
				match(LPAREN);
				setState(815);
				expression();
				setState(816);
				match(RPAREN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(818);
				match(LPAREN);
				setState(819);
				selectStatement();
				setState(820);
				match(RPAREN);
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
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(SqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(SqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(SqlParser.WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(SqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(SqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(SqlParser.ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(CASE);
			setState(830); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(825);
				match(WHEN);
				setState(826);
				expression();
				setState(827);
				match(THEN);
				setState(828);
				expression();
				}
				}
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(834);
				match(ELSE);
				setState(835);
				expression();
				}
			}

			setState(838);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(SqlParser.MULTIPLY, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			functionName();
			setState(841);
			match(LPAREN);
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case EXISTS:
			case NULL:
			case TRUE:
			case FALSE:
			case CASE:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case COALESCE:
			case NULLIF:
			case CAST:
			case CONVERT:
			case GLOBAL_VARIABLE:
			case PLUS:
			case MINUS:
			case CONCAT:
			case LPAREN:
			case NUMBER:
			case STRING:
			case NSTRING:
			case DATE_LITERAL:
			case HEX_STRING:
			case BIT_STRING:
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
			case VARIABLE:
				{
				setState(842);
				expressionList();
				}
				break;
			case MULTIPLY:
				{
				setState(843);
				match(MULTIPLY);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(846);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(SqlParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SqlParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SqlParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(SqlParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public TerminalNode COALESCE() { return getToken(SqlParser.COALESCE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlParser.NULLIF, 0); }
		public TerminalNode CONVERT() { return getToken(SqlParser.CONVERT, 0); }
		public TerminalNode CONCAT() { return getToken(SqlParser.CONCAT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionName);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				identifier();
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(COUNT);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
				match(SUM);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(851);
				match(AVG);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				match(MIN);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				match(MAX);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				match(COALESCE);
				}
				break;
			case NULLIF:
				enterOuterAlt(_localctx, 8);
				{
				setState(855);
				match(NULLIF);
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 9);
				{
				setState(856);
				match(CONVERT);
				}
				break;
			case CONCAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(857);
				match(CONCAT);
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
	public static class ExpressionListContext extends ParserRuleContext {
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			expression();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861);
				match(COMMA);
				setState(862);
				expression();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SqlParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(SqlParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlParser.SMALLINT, 0); }
		public TerminalNode BIGINT() { return getToken(SqlParser.BIGINT, 0); }
		public TerminalNode DECIMAL() { return getToken(SqlParser.DECIMAL, 0); }
		public TerminalNode LPAREN() { return getToken(SqlParser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SqlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SqlParser.NUMBER, i);
		}
		public TerminalNode RPAREN() { return getToken(SqlParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(SqlParser.COMMA, 0); }
		public TerminalNode NUMERIC() { return getToken(SqlParser.NUMERIC, 0); }
		public TerminalNode FLOAT() { return getToken(SqlParser.FLOAT, 0); }
		public TerminalNode REAL() { return getToken(SqlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(SqlParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(SqlParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(SqlParser.VARCHAR, 0); }
		public TerminalNode MAX() { return getToken(SqlParser.MAX, 0); }
		public TerminalNode NVARCHAR() { return getToken(SqlParser.NVARCHAR, 0); }
		public TerminalNode TEXT() { return getToken(SqlParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(SqlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlParser.TIMESTAMP, 0); }
		public TerminalNode BOOLEAN() { return getToken(SqlParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_dataType);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(INTEGER);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(INT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(SMALLINT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				match(BIGINT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				match(DECIMAL);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(873);
					match(LPAREN);
					setState(874);
					match(NUMBER);
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(875);
						match(COMMA);
						setState(876);
						match(NUMBER);
						}
					}

					setState(879);
					match(RPAREN);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(882);
				match(NUMERIC);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(883);
					match(LPAREN);
					setState(884);
					match(NUMBER);
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(885);
						match(COMMA);
						setState(886);
						match(NUMBER);
						}
					}

					setState(889);
					match(RPAREN);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(892);
				match(FLOAT);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(893);
					match(LPAREN);
					setState(894);
					match(NUMBER);
					setState(895);
					match(RPAREN);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(898);
				match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(899);
				match(DOUBLE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(900);
				match(CHAR);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(901);
					match(LPAREN);
					setState(902);
					match(NUMBER);
					setState(903);
					match(RPAREN);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(906);
				match(VARCHAR);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(907);
					match(LPAREN);
					setState(908);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(909);
					match(RPAREN);
					}
				}

				}
				break;
			case NVARCHAR:
				enterOuterAlt(_localctx, 12);
				{
				setState(912);
				match(NVARCHAR);
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(913);
					match(LPAREN);
					setState(914);
					_la = _input.LA(1);
					if ( !(_la==MAX || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(915);
					match(RPAREN);
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 13);
				{
				setState(918);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 14);
				{
				setState(919);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 15);
				{
				setState(920);
				match(TIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 16);
				{
				setState(921);
				match(TIMESTAMP);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 17);
				{
				setState(922);
				match(BOOLEAN);
				}
				break;
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 18);
				{
				setState(923);
				identifier();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public TerminalNode NSTRING() { return getToken(SqlParser.NSTRING, 0); }
		public TerminalNode NUMBER() { return getToken(SqlParser.NUMBER, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(SqlParser.DATE_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(SqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SqlParser.NULL, 0); }
		public TerminalNode HEX_STRING() { return getToken(SqlParser.HEX_STRING, 0); }
		public TerminalNode BIT_STRING() { return getToken(SqlParser.BIT_STRING, 0); }
		public TerminalNode GLOBAL_VARIABLE() { return getToken(SqlParser.GLOBAL_VARIABLE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0) || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 66060289L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TableNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlParser.DOT, i);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(928);
				identifier();
				setState(929);
				match(DOT);
				}
				break;
			}
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(933);
				identifier();
				setState(934);
				match(DOT);
				}
				break;
			}
			setState(938);
			identifier();
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
	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			identifier();
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
	public static class ColumnNameListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlParser.COMMA, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			columnName();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(943);
				match(COMMA);
				setState(944);
				columnName();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ColumnReferenceContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlParser.DOT, 0); }
		public ColumnReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnReference; }
	}

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_columnReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(950);
				tableAlias();
				setState(951);
				match(DOT);
				}
				break;
			}
			setState(955);
			columnName();
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
	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			identifier();
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
	public static class ColumnAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlParser.STRING, 0); }
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_columnAlias);
		try {
			setState(961);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK_QUOTED_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BRACKETED_IDENTIFIER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(959);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(960);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlParser.IDENTIFIER, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlParser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode BACKTICK_QUOTED_IDENTIFIER() { return getToken(SqlParser.BACKTICK_QUOTED_IDENTIFIER, 0); }
		public TerminalNode BRACKETED_IDENTIFIER() { return getToken(SqlParser.BRACKETED_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SqlParser.VARIABLE, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return tableSource_sempred((TableSourceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tableSource_sempred(TableSourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0091\u03c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0001\u0000\u0001\u0000\u0003\u0000\u009d"+
		"\b\u0000\u0005\u0000\u009f\b\u0000\n\u0000\f\u0000\u00a2\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00b1\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b8\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00bd\b\u0003\n\u0003\f\u0003\u00c0\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c6\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00cd\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d9\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00eb\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f0"+
		"\b\b\u0005\b\u00f2\b\b\n\b\f\b\u00f5\t\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0101\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u010a\b\f\n\f\f\f\u010d\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0003\r\u0113\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0118"+
		"\b\u000e\n\u000e\f\u000e\u011b\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0123\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u012c\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u013e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0145\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u014a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0165\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0179\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0187\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u018c\b\u0017\u0001\u0017\u0005\u0017\u018f\b\u0017\n\u0017"+
		"\f\u0017\u0192\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0196\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u019c\b\u0018"+
		"\u0001\u0018\u0003\u0018\u019f\b\u0018\u0001\u0018\u0003\u0018\u01a2\b"+
		"\u0018\u0001\u0018\u0003\u0018\u01a5\b\u0018\u0001\u0018\u0003\u0018\u01a8"+
		"\b\u0018\u0001\u0018\u0003\u0018\u01ab\b\u0018\u0003\u0018\u01ad\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01b2\b\u0019\n\u0019"+
		"\f\u0019\u01b5\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01b9\b\u001a"+
		"\u0001\u001a\u0003\u001a\u01bc\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01c0\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c5\b"+
		"\u001b\u0001\u001b\u0003\u001b\u01c8\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01ce\b\u001b\u0001\u001b\u0003\u001b\u01d1"+
		"\b\u001b\u0003\u001b\u01d3\b\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01d7\b\u001b\n\u001b\f\u001b\u01da\t\u001b\u0001\u001c\u0003\u001c\u01dd"+
		"\b\u001c\u0001\u001c\u0003\u001c\u01e0\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01eb\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01f5\b\u001e\n\u001e\f\u001e\u01f8\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0202\b \n \f \u0205"+
		"\t \u0001!\u0001!\u0003!\u0209\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0003$\u0213\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u021a\b$\u0001$\u0001$\u0001$\u0003$\u021f\b$\u0001%\u0001%\u0001"+
		"%\u0005%\u0224\b%\n%\f%\u0227\t%\u0001&\u0001&\u0001&\u0001&\u0005&\u022d"+
		"\b&\n&\f&\u0230\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u023a\b\'\n\'\f\'\u023d\t\'\u0001\'\u0003\'\u0240\b"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u024a"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0003*\u0250\b*\u0001+\u0001+\u0003+\u0254"+
		"\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u025c\b+\u0001+\u0001"+
		"+\u0003+\u0260\b+\u0001+\u0001+\u0001+\u0003+\u0265\b+\u0003+\u0267\b"+
		"+\u0001,\u0001,\u0001,\u0001,\u0003,\u026d\b,\u0001-\u0001-\u0001-\u0003"+
		"-\u0272\b-\u0005-\u0274\b-\n-\f-\u0277\t-\u0001-\u0001-\u0001.\u0001."+
		"\u0001.\u0001.\u0003.\u027f\b.\u0005.\u0281\b.\n.\f.\u0284\t.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u028c\b.\u0005.\u028e\b.\n.\f.\u0291"+
		"\t.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0003"+
		"0\u029c\b0\u00010\u00010\u00010\u00030\u02a1\b0\u00011\u00011\u00011\u0003"+
		"1\u02a6\b1\u00011\u00011\u00011\u00031\u02ab\b1\u00011\u00011\u00012\u0003"+
		"2\u02b0\b2\u00012\u00012\u00012\u00032\u02b5\b2\u00012\u00012\u00032\u02b9"+
		"\b2\u00012\u00012\u00012\u00052\u02be\b2\n2\f2\u02c1\t2\u00013\u00013"+
		"\u00014\u00014\u00015\u00015\u00015\u00055\u02ca\b5\n5\f5\u02cd\t5\u0001"+
		"6\u00016\u00036\u02d1\b6\u00016\u00016\u00016\u00036\u02d6\b6\u00056\u02d8"+
		"\b6\n6\f6\u02db\t6\u00017\u00037\u02de\b7\u00017\u00017\u00017\u00017"+
		"\u00017\u00018\u00018\u00018\u00018\u00018\u00038\u02ea\b8\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u02f1\b8\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u02fb\b8\u00018\u00018\u00018\u00018\u0003"+
		"8\u0301\b8\u00018\u00018\u00038\u0305\b8\u00018\u00038\u0308\b8\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0005;\u0316\b;\n;\f;\u0319\t;\u0001<\u0001<\u0001<\u0005<\u031e"+
		"\b<\n<\f<\u0321\t<\u0001=\u0003=\u0324\b=\u0001=\u0001=\u0001>\u0001>"+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0003>\u0337\b>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0004?\u033f\b?\u000b?\f?\u0340\u0001?\u0001?\u0003?\u0345\b"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0003@\u034d\b@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u035b\bA\u0001B\u0001B\u0001B\u0005B\u0360\bB\nB\fB\u0363\tB"+
		"\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u036e\bC\u0001C\u0003C\u0371\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u0378\bC\u0001C\u0003C\u037b\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0381"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0389\bC\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u038f\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u0395"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u039d\bC\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0003E\u03a4\bE\u0001E\u0001E\u0001E\u0003E\u03a9"+
		"\bE\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0005G\u03b2\bG\n"+
		"G\fG\u03b5\tG\u0001H\u0001H\u0001H\u0003H\u03ba\bH\u0001H\u0001H\u0001"+
		"I\u0001I\u0001J\u0001J\u0003J\u03c2\bJ\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0000\u00016M\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u0000\r\u0002\u0000ZZrr\u0001\u0000\u0014\u0016\u0001"+
		"\u000067\u0001\u0000.1\u0001\u000089\u0001\u0000*,\u0001\u0000sx\u0002"+
		"\u0000yz~~\u0001\u0000{}\u0002\u0000$$yz\u0002\u0000SS\u0084\u0084\u0003"+
		"\u0000*,pp\u0084\u0089\u0001\u0000\u008a\u008d\u042e\u0000\u00a0\u0001"+
		"\u0000\u0000\u0000\u0002\u00b0\u0001\u0000\u0000\u0000\u0004\u00b2\u0001"+
		"\u0000\u0000\u0000\u0006\u00b5\u0001\u0000\u0000\u0000\b\u00c7\u0001\u0000"+
		"\u0000\u0000\n\u00d8\u0001\u0000\u0000\u0000\f\u00da\u0001\u0000\u0000"+
		"\u0000\u000e\u00e0\u0001\u0000\u0000\u0000\u0010\u00e3\u0001\u0000\u0000"+
		"\u0000\u0012\u00f6\u0001\u0000\u0000\u0000\u0014\u00f9\u0001\u0000\u0000"+
		"\u0000\u0016\u0100\u0001\u0000\u0000\u0000\u0018\u0102\u0001\u0000\u0000"+
		"\u0000\u001a\u0112\u0001\u0000\u0000\u0000\u001c\u0114\u0001\u0000\u0000"+
		"\u0000\u001e\u013d\u0001\u0000\u0000\u0000 \u0144\u0001\u0000\u0000\u0000"+
		"\"\u0164\u0001\u0000\u0000\u0000$\u0166\u0001\u0000\u0000\u0000&\u0178"+
		"\u0001\u0000\u0000\u0000(\u017a\u0001\u0000\u0000\u0000*\u017e\u0001\u0000"+
		"\u0000\u0000,\u0186\u0001\u0000\u0000\u0000.\u0188\u0001\u0000\u0000\u0000"+
		"0\u0193\u0001\u0000\u0000\u00002\u01ae\u0001\u0000\u0000\u00004\u01bf"+
		"\u0001\u0000\u0000\u00006\u01d2\u0001\u0000\u0000\u00008\u01dc\u0001\u0000"+
		"\u0000\u0000:\u01ec\u0001\u0000\u0000\u0000<\u01ef\u0001\u0000\u0000\u0000"+
		">\u01f9\u0001\u0000\u0000\u0000@\u01fc\u0001\u0000\u0000\u0000B\u0206"+
		"\u0001\u0000\u0000\u0000D\u020a\u0001\u0000\u0000\u0000F\u020d\u0001\u0000"+
		"\u0000\u0000H\u0210\u0001\u0000\u0000\u0000J\u0220\u0001\u0000\u0000\u0000"+
		"L\u0228\u0001\u0000\u0000\u0000N\u0233\u0001\u0000\u0000\u0000P\u0241"+
		"\u0001\u0000\u0000\u0000R\u0245\u0001\u0000\u0000\u0000T\u024f\u0001\u0000"+
		"\u0000\u0000V\u0251\u0001\u0000\u0000\u0000X\u0268\u0001\u0000\u0000\u0000"+
		"Z\u026e\u0001\u0000\u0000\u0000\\\u027a\u0001\u0000\u0000\u0000^\u0295"+
		"\u0001\u0000\u0000\u0000`\u0298\u0001\u0000\u0000\u0000b\u02a2\u0001\u0000"+
		"\u0000\u0000d\u02af\u0001\u0000\u0000\u0000f\u02c2\u0001\u0000\u0000\u0000"+
		"h\u02c4\u0001\u0000\u0000\u0000j\u02c6\u0001\u0000\u0000\u0000l\u02d0"+
		"\u0001\u0000\u0000\u0000n\u02dd\u0001\u0000\u0000\u0000p\u02e4\u0001\u0000"+
		"\u0000\u0000r\u0309\u0001\u0000\u0000\u0000t\u030b\u0001\u0000\u0000\u0000"+
		"v\u0312\u0001\u0000\u0000\u0000x\u031a\u0001\u0000\u0000\u0000z\u0323"+
		"\u0001\u0000\u0000\u0000|\u0336\u0001\u0000\u0000\u0000~\u0338\u0001\u0000"+
		"\u0000\u0000\u0080\u0348\u0001\u0000\u0000\u0000\u0082\u035a\u0001\u0000"+
		"\u0000\u0000\u0084\u035c\u0001\u0000\u0000\u0000\u0086\u039c\u0001\u0000"+
		"\u0000\u0000\u0088\u039e\u0001\u0000\u0000\u0000\u008a\u03a3\u0001\u0000"+
		"\u0000\u0000\u008c\u03ac\u0001\u0000\u0000\u0000\u008e\u03ae\u0001\u0000"+
		"\u0000\u0000\u0090\u03b9\u0001\u0000\u0000\u0000\u0092\u03bd\u0001\u0000"+
		"\u0000\u0000\u0094\u03c1\u0001\u0000\u0000\u0000\u0096\u03c3\u0001\u0000"+
		"\u0000\u0000\u0098\u03c5\u0001\u0000\u0000\u0000\u009a\u009c\u0003\u0002"+
		"\u0001\u0000\u009b\u009d\u0005\u0083\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000"+
		"\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0000\u0000\u0001\u00a4\u0001\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b1\u0003\u0016\u000b\u0000\u00a6\u00b1\u0003,\u0016"+
		"\u0000\u00a7\u00b1\u0003\u0006\u0003\u0000\u00a8\u00b1\u0003\n\u0005\u0000"+
		"\u00a9\u00b1\u0003T*\u0000\u00aa\u00b1\u0003`0\u0000\u00ab\u00b1\u0003"+
		"b1\u0000\u00ac\u00b1\u0003d2\u0000\u00ad\u00b1\u0003f3\u0000\u00ae\u00b1"+
		"\u0003^/\u0000\u00af\u00b1\u0003\u0004\u0002\u0000\u00b0\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u0003\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005X\u0000"+
		"\u0000\u00b3\u00b4\u0003\u0096K\u0000\u00b4\u0005\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0005:\u0000\u0000\u00b6\u00b8\u0005l\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00be\u0003\b\u0004\u0000\u00ba\u00bb\u0005"+
		"\u0081\u0000\u0000\u00bb\u00bd\u0003\b\u0004\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003.\u0017"+
		"\u0000\u00c2\u00c6\u0003H$\u0000\u00c3\u00c6\u0003N\'\u0000\u00c4\u00c6"+
		"\u0003R)\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u0007\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003\u0096"+
		"K\u0000\u00c8\u00c9\u0005\u007f\u0000\u0000\u00c9\u00ca\u0003\u008eG\u0000"+
		"\u00ca\u00cb\u0005\u0080\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u00055\u0000\u0000\u00cf"+
		"\u00d0\u0005\u007f\u0000\u0000\u00d0\u00d1\u0003.\u0017\u0000\u00d1\u00d2"+
		"\u0005\u0080\u0000\u0000\u00d2\t\u0001\u0000\u0000\u0000\u00d3\u00d9\u0003"+
		"\f\u0006\u0000\u00d4\u00d9\u0003\u000e\u0007\u0000\u00d5\u00d9\u0003\u0010"+
		"\b\u0000\u00d6\u00d9\u0003\u0012\t\u0000\u00d7\u00d9\u0003\u0014\n\u0000"+
		"\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u000b\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005;\u0000\u0000\u00db\u00dc\u0003\u0096K\u0000\u00dc\u00dd"+
		"\u0005C\u0000\u0000\u00dd\u00de\u0005D\u0000\u0000\u00de\u00df\u0003."+
		"\u0017\u0000\u00df\r\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005E\u0000"+
		"\u0000\u00e1\u00e2\u0003\u0096K\u0000\u00e2\u000f\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005F\u0000\u0000\u00e4\u00e5\u0005G\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0005\u0000\u0000\u00e6\u00e7\u0003\u0096K\u0000\u00e7\u00ea\u0005"+
		"\r\u0000\u0000\u00e8\u00eb\u0003\u0098L\u0000\u00e9\u00eb\u0005p\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00f3\u0001\u0000\u0000\u0000\u00ec\u00ef\u0005\u0081\u0000"+
		"\u0000\u00ed\u00f0\u0003\u0098L\u0000\u00ee\u00f0\u0005p\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u0011\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005H\u0000\u0000\u00f7\u00f8"+
		"\u0003\u0096K\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"I\u0000\u0000\u00fa\u00fb\u0003\u0096K\u0000\u00fb\u0015\u0001\u0000\u0000"+
		"\u0000\u00fc\u0101\u0003\u0018\f\u0000\u00fd\u0101\u0003$\u0012\u0000"+
		"\u00fe\u0101\u0003(\u0014\u0000\u00ff\u0101\u0003*\u0015\u0000\u0100\u00fc"+
		"\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0017"+
		"\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0010\u0000\u0000\u0103\u0104"+
		"\u0005\u0014\u0000\u0000\u0104\u0105\u0003\u008aE\u0000\u0105\u0106\u0005"+
		"\u007f\u0000\u0000\u0106\u010b\u0003\u001a\r\u0000\u0107\u0108\u0005\u0081"+
		"\u0000\u0000\u0108\u010a\u0003\u001a\r\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0080\u0000"+
		"\u0000\u010f\u0019\u0001\u0000\u0000\u0000\u0110\u0113\u0003\u001c\u000e"+
		"\u0000\u0111\u0113\u0003 \u0010\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u001b\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0003\u008cF\u0000\u0115\u0119\u0003\u0086C\u0000\u0116\u0118"+
		"\u0003\u001e\u000f\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u001d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0005$\u0000\u0000\u011d\u013e\u0005"+
		"*\u0000\u0000\u011e\u013e\u0005*\u0000\u0000\u011f\u0120\u0005\u001a\u0000"+
		"\u0000\u0120\u0122\u0005\u001b\u0000\u0000\u0121\u0123\u0007\u0000\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u013e\u0001\u0000\u0000\u0000\u0124\u013e\u0005\u001e\u0000"+
		"\u0000\u0125\u012b\u0005Y\u0000\u0000\u0126\u0127\u0005\u007f\u0000\u0000"+
		"\u0127\u0128\u0005\u0084\u0000\u0000\u0128\u0129\u0005\u0081\u0000\u0000"+
		"\u0129\u012a\u0005\u0084\u0000\u0000\u012a\u012c\u0005\u0080\u0000\u0000"+
		"\u012b\u0126\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u013e\u0001\u0000\u0000\u0000\u012d\u012e\u0005 \u0000\u0000\u012e"+
		"\u013e\u0003h4\u0000\u012f\u0130\u0005\u001f\u0000\u0000\u0130\u0131\u0005"+
		"\u007f\u0000\u0000\u0131\u0132\u0003h4\u0000\u0132\u0133\u0005\u0080\u0000"+
		"\u0000\u0133\u013e\u0001\u0000\u0000\u0000\u0134\u013e\u0005!\u0000\u0000"+
		"\u0135\u0136\u0005\u001c\u0000\u0000\u0136\u0137\u0005\u001b\u0000\u0000"+
		"\u0137\u0138\u0005\u001d\u0000\u0000\u0138\u0139\u0003\u008aE\u0000\u0139"+
		"\u013a\u0005\u007f\u0000\u0000\u013a\u013b\u0003\u008cF\u0000\u013b\u013c"+
		"\u0005\u0080\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u011c"+
		"\u0001\u0000\u0000\u0000\u013d\u011e\u0001\u0000\u0000\u0000\u013d\u011f"+
		"\u0001\u0000\u0000\u0000\u013d\u0124\u0001\u0000\u0000\u0000\u013d\u0125"+
		"\u0001\u0000\u0000\u0000\u013d\u012d\u0001\u0000\u0000\u0000\u013d\u012f"+
		"\u0001\u0000\u0000\u0000\u013d\u0134\u0001\u0000\u0000\u0000\u013d\u0135"+
		"\u0001\u0000\u0000\u0000\u013e\u001f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u0019\u0000\u0000\u0140\u0141\u0003\u0096K\u0000\u0141\u0142\u0003"+
		"\"\u0011\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0145\u0003\""+
		"\u0011\u0000\u0144\u013f\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0145!\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u001a\u0000"+
		"\u0000\u0147\u0149\u0005\u001b\u0000\u0000\u0148\u014a\u0007\u0000\u0000"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u007f\u0000"+
		"\u0000\u014c\u014d\u0003\u008eG\u0000\u014d\u014e\u0005\u0080\u0000\u0000"+
		"\u014e\u0165\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u001e\u0000\u0000"+
		"\u0150\u0151\u0005\u007f\u0000\u0000\u0151\u0152\u0003\u008eG\u0000\u0152"+
		"\u0153\u0005\u0080\u0000\u0000\u0153\u0165\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0005\u001f\u0000\u0000\u0155\u0156\u0005\u007f\u0000\u0000\u0156"+
		"\u0157\u0003h4\u0000\u0157\u0158\u0005\u0080\u0000\u0000\u0158\u0165\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005\u001c\u0000\u0000\u015a\u015b\u0005"+
		"\u001b\u0000\u0000\u015b\u015c\u0005\u007f\u0000\u0000\u015c\u015d\u0003"+
		"\u008eG\u0000\u015d\u015e\u0005\u0080\u0000\u0000\u015e\u015f\u0005\u001d"+
		"\u0000\u0000\u015f\u0160\u0003\u008aE\u0000\u0160\u0161\u0005\u007f\u0000"+
		"\u0000\u0161\u0162\u0003\u008eG\u0000\u0162\u0163\u0005\u0080\u0000\u0000"+
		"\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0146\u0001\u0000\u0000\u0000"+
		"\u0164\u014f\u0001\u0000\u0000\u0000\u0164\u0154\u0001\u0000\u0000\u0000"+
		"\u0164\u0159\u0001\u0000\u0000\u0000\u0165#\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0005\u0011\u0000\u0000\u0167\u0168\u0005\u0014\u0000\u0000\u0168"+
		"\u0169\u0003\u008aE\u0000\u0169\u016a\u0003&\u0013\u0000\u016a%\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005\u0017\u0000\u0000\u016c\u0179\u0003"+
		"\u001c\u000e\u0000\u016d\u016e\u0005\u0017\u0000\u0000\u016e\u016f\u0005"+
		"\u0019\u0000\u0000\u016f\u0170\u0003\u0096K\u0000\u0170\u0171\u0003\""+
		"\u0011\u0000\u0171\u0179\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0012"+
		"\u0000\u0000\u0173\u0174\u0005\u0018\u0000\u0000\u0174\u0179\u0003\u008c"+
		"F\u0000\u0175\u0176\u0005\u0012\u0000\u0000\u0176\u0177\u0005\u0019\u0000"+
		"\u0000\u0177\u0179\u0003\u0096K\u0000\u0178\u016b\u0001\u0000\u0000\u0000"+
		"\u0178\u016d\u0001\u0000\u0000\u0000\u0178\u0172\u0001\u0000\u0000\u0000"+
		"\u0178\u0175\u0001\u0000\u0000\u0000\u0179\'\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0005\u0012\u0000\u0000\u017b\u017c\u0007\u0001\u0000\u0000\u017c"+
		"\u017d\u0003\u008aE\u0000\u017d)\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"\u0013\u0000\u0000\u017f\u0180\u0005\u0014\u0000\u0000\u0180\u0181\u0003"+
		"\u008aE\u0000\u0181+\u0001\u0000\u0000\u0000\u0182\u0187\u0003.\u0017"+
		"\u0000\u0183\u0187\u0003H$\u0000\u0184\u0187\u0003N\'\u0000\u0185\u0187"+
		"\u0003R)\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187-\u0001\u0000\u0000\u0000\u0188\u0190\u00030\u0018\u0000"+
		"\u0189\u018b\u0005m\u0000\u0000\u018a\u018c\u00057\u0000\u0000\u018b\u018a"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0001\u0000\u0000\u0000\u018d\u018f\u00030\u0018\u0000\u018e\u0189\u0001"+
		"\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191/\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u0195\u0005\u0001"+
		"\u0000\u0000\u0194\u0196\u0007\u0002\u0000\u0000\u0195\u0194\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u01ac\u00032\u0019\u0000\u0198\u0199\u0005\u0005\u0000"+
		"\u0000\u0199\u019b\u00036\u001b\u0000\u019a\u019c\u0003:\u001d\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u019f\u0003<\u001e\u0000\u019e\u019d"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003>\u001f\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0003@ \u0000\u01a4\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a8\u0003D\"\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0003F#\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u0198"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad1\u0001"+
		"\u0000\u0000\u0000\u01ae\u01b3\u00034\u001a\u0000\u01af\u01b0\u0005\u0081"+
		"\u0000\u0000\u01b0\u01b2\u00034\u001a\u0000\u01b1\u01af\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b43\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b6\u01bb\u0003h4\u0000\u01b7\u01b9"+
		"\u00055\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0003"+
		"\u0094J\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01c0\u0001\u0000\u0000\u0000\u01bd\u01c0\u0005{\u0000"+
		"\u0000\u01be\u01c0\u0005\u0084\u0000\u0000\u01bf\u01b6\u0001\u0000\u0000"+
		"\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01c05\u0001\u0000\u0000\u0000\u01c1\u01c2\u0006\u001b\uffff\uffff"+
		"\u0000\u01c2\u01c7\u0003\u008aE\u0000\u01c3\u01c5\u00055\u0000\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0003\u0092I\u0000\u01c7\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01d3"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u007f\u0000\u0000\u01ca\u01cb"+
		"\u0003.\u0017\u0000\u01cb\u01d0\u0005\u0080\u0000\u0000\u01cc\u01ce\u0005"+
		"5\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003\u0092"+
		"I\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01c1\u0001\u0000\u0000"+
		"\u0000\u01d2\u01c9\u0001\u0000\u0000\u0000\u01d3\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\n\u0001\u0000\u0000\u01d5\u01d7\u00038\u001c\u0000"+
		"\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d97\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db"+
		"\u01dd\u0007\u0003\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000\u0000\u01de"+
		"\u01e0\u00052\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0005-\u0000\u0000\u01e2\u01ea\u00036\u001b\u0000\u01e3\u01e4\u00053"+
		"\u0000\u0000\u01e4\u01eb\u0003h4\u0000\u01e5\u01e6\u00054\u0000\u0000"+
		"\u01e6\u01e7\u0005\u007f\u0000\u0000\u01e7\u01e8\u0003\u008eG\u0000\u01e8"+
		"\u01e9\u0005\u0080\u0000\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e3\u0001\u0000\u0000\u0000\u01ea\u01e5\u0001\u0000\u0000\u0000\u01eb"+
		"9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u0006\u0000\u0000\u01ed\u01ee"+
		"\u0003h4\u0000\u01ee;\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u0007"+
		"\u0000\u0000\u01f0\u01f1\u0005\b\u0000\u0000\u01f1\u01f6\u0003h4\u0000"+
		"\u01f2\u01f3\u0005\u0081\u0000\u0000\u01f3\u01f5\u0003h4\u0000\u01f4\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7=\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"\t\u0000\u0000\u01fa\u01fb\u0003h4\u0000\u01fb?\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0005\n\u0000\u0000\u01fd\u01fe\u0005\b\u0000\u0000\u01fe"+
		"\u0203\u0003B!\u0000\u01ff\u0200\u0005\u0081\u0000\u0000\u0200\u0202\u0003"+
		"B!\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000"+
		"\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204A\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0208\u0003h4\u0000\u0207\u0209\u0007\u0004\u0000\u0000\u0208\u0207"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209C\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0005\u000b\u0000\u0000\u020b\u020c\u0003"+
		"h4\u0000\u020cE\u0001\u0000\u0000\u0000\u020d\u020e\u0005\f\u0000\u0000"+
		"\u020e\u020f\u0003h4\u0000\u020fG\u0001\u0000\u0000\u0000\u0210\u0212"+
		"\u0005\u0002\u0000\u0000\u0211\u0213\u0005\r\u0000\u0000\u0212\u0211\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0219\u0003\u008aE\u0000\u0215\u0216\u0005\u007f"+
		"\u0000\u0000\u0216\u0217\u0003\u008eG\u0000\u0217\u0218\u0005\u0080\u0000"+
		"\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u0215\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021e\u0001\u0000\u0000"+
		"\u0000\u021b\u021c\u0005\u000e\u0000\u0000\u021c\u021f\u0003J%\u0000\u021d"+
		"\u021f\u0003.\u0017\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021d"+
		"\u0001\u0000\u0000\u0000\u021fI\u0001\u0000\u0000\u0000\u0220\u0225\u0003"+
		"L&\u0000\u0221\u0222\u0005\u0081\u0000\u0000\u0222\u0224\u0003L&\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226K\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005\u007f\u0000\u0000\u0229\u022e\u0003h4\u0000\u022a\u022b\u0005"+
		"\u0081\u0000\u0000\u022b\u022d\u0003h4\u0000\u022c\u022a\u0001\u0000\u0000"+
		"\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005\u0080\u0000"+
		"\u0000\u0232M\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0003\u0000\u0000"+
		"\u0234\u0235\u0003\u008aE\u0000\u0235\u0236\u0005\u000f\u0000\u0000\u0236"+
		"\u023b\u0003P(\u0000\u0237\u0238\u0005\u0081\u0000\u0000\u0238\u023a\u0003"+
		"P(\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0003:\u001d\u0000\u023f\u023e\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240O\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u0003\u008cF\u0000\u0242\u0243\u0005s\u0000\u0000\u0243\u0244\u0003"+
		"h4\u0000\u0244Q\u0001\u0000\u0000\u0000\u0245\u0246\u0005\u0004\u0000"+
		"\u0000\u0246\u0247\u0005\u0005\u0000\u0000\u0247\u0249\u0003\u008aE\u0000"+
		"\u0248\u024a\u0003:\u001d\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024aS\u0001\u0000\u0000\u0000\u024b\u0250"+
		"\u0003V+\u0000\u024c\u0250\u0003X,\u0000\u024d\u0250\u0003Z-\u0000\u024e"+
		"\u0250\u0003\\.\u0000\u024f\u024b\u0001\u0000\u0000\u0000\u024f\u024c"+
		"\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u024e"+
		"\u0001\u0000\u0000\u0000\u0250U\u0001\u0000\u0000\u0000\u0251\u0253\u0005"+
		">\u0000\u0000\u0252\u0254\u0005$\u0000\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u025b\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005)\u0000\u0000\u0256\u0257\u0005\u007f\u0000\u0000"+
		"\u0257\u0258\u0003.\u0017\u0000\u0258\u0259\u0005\u0080\u0000\u0000\u0259"+
		"\u025c\u0001\u0000\u0000\u0000\u025a\u025c\u0003h4\u0000\u025b\u0255\u0001"+
		"\u0000\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025c\u025f\u0001"+
		"\u0000\u0000\u0000\u025d\u0260\u0003\u0002\u0001\u0000\u025e\u0260\u0003"+
		"Z-\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u025e\u0001\u0000\u0000"+
		"\u0000\u0260\u0266\u0001\u0000\u0000\u0000\u0261\u0264\u0005?\u0000\u0000"+
		"\u0262\u0265\u0003\u0002\u0001\u0000\u0263\u0265\u0003Z-\u0000\u0264\u0262"+
		"\u0001\u0000\u0000\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0267"+
		"\u0001\u0000\u0000\u0000\u0266\u0261\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267W\u0001\u0000\u0000\u0000\u0268\u0269\u0005"+
		"n\u0000\u0000\u0269\u026c\u0003h4\u0000\u026a\u026d\u0003\u0002\u0001"+
		"\u0000\u026b\u026d\u0003Z-\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c"+
		"\u026b\u0001\u0000\u0000\u0000\u026dY\u0001\u0000\u0000\u0000\u026e\u0275"+
		"\u0005<\u0000\u0000\u026f\u0271\u0003\u0002\u0001\u0000\u0270\u0272\u0005"+
		"\u0083\u0000\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001"+
		"\u0000\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u026f\u0001"+
		"\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001"+
		"\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0001"+
		"\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u0279\u0005"+
		"=\u0000\u0000\u0279[\u0001\u0000\u0000\u0000\u027a\u027b\u0005<\u0000"+
		"\u0000\u027b\u0282\u0005@\u0000\u0000\u027c\u027e\u0003\u0002\u0001\u0000"+
		"\u027d\u027f\u0005\u0083\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0001\u0000\u0000\u0000"+
		"\u0280\u027c\u0001\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000"+
		"\u0283\u0285\u0001\u0000\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0005=\u0000\u0000\u0286\u0287\u0005@\u0000\u0000\u0287\u0288"+
		"\u0005<\u0000\u0000\u0288\u028f\u0005A\u0000\u0000\u0289\u028b\u0003\u0002"+
		"\u0001\u0000\u028a\u028c\u0005\u0083\u0000\u0000\u028b\u028a\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028e\u0001\u0000"+
		"\u0000\u0000\u028d\u0289\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000"+
		"\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000"+
		"\u0000\u0000\u0290\u0292\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000"+
		"\u0000\u0000\u0292\u0293\u0005=\u0000\u0000\u0293\u0294\u0005A\u0000\u0000"+
		"\u0294]\u0001\u0000\u0000\u0000\u0295\u0296\u0005o\u0000\u0000\u0296\u0297"+
		"\u0003h4\u0000\u0297_\u0001\u0000\u0000\u0000\u0298\u029b\u0005;\u0000"+
		"\u0000\u0299\u029c\u0003\u0098L\u0000\u029a\u029c\u0005p\u0000\u0000\u029b"+
		"\u0299\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0001\u0000\u0000\u0000\u029d\u02a0\u0003\u0086C\u0000\u029e\u029f"+
		"\u0005s\u0000\u0000\u029f\u02a1\u0003h4\u0000\u02a0\u029e\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1a\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a5\u0005\u000f\u0000\u0000\u02a3\u02a6\u0003\u0098L\u0000"+
		"\u02a4\u02a6\u0005p\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02aa\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a8\u0005y\u0000\u0000\u02a8\u02ab\u0005s\u0000\u0000\u02a9\u02ab\u0005"+
		"s\u0000\u0000\u02aa\u02a7\u0001\u0000\u0000\u0000\u02aa\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003h4\u0000"+
		"\u02adc\u0001\u0000\u0000\u0000\u02ae\u02b0\u0005J\u0000\u0000\u02af\u02ae"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003\u0096K\u0000\u02b2\u02b3\u0005"+
		"\u0082\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000\u0000\u02b4\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b9\u0005K\u0000\u0000\u02b7\u02b9\u0003\u0096"+
		"K\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bf\u0003h4\u0000\u02bb"+
		"\u02bc\u0005\u0081\u0000\u0000\u02bc\u02be\u0003h4\u0000\u02bd\u02bb\u0001"+
		"\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0e\u0001\u0000"+
		"\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005B\u0000"+
		"\u0000\u02c3g\u0001\u0000\u0000\u0000\u02c4\u02c5\u0003j5\u0000\u02c5"+
		"i\u0001\u0000\u0000\u0000\u02c6\u02cb\u0003l6\u0000\u02c7\u02c8\u0005"+
		"#\u0000\u0000\u02c8\u02ca\u0003l6\u0000\u02c9\u02c7\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cck\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d1\u0003p8\u0000\u02cf\u02d1"+
		"\u0003n7\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d9\u0001\u0000\u0000\u0000\u02d2\u02d5\u0005\"\u0000"+
		"\u0000\u02d3\u02d6\u0003p8\u0000\u02d4\u02d6\u0003n7\u0000\u02d5\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d8"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d2\u0001\u0000\u0000\u0000\u02d8\u02db"+
		"\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02dam\u0001\u0000\u0000\u0000\u02db\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dc\u02de\u0005$\u0000\u0000\u02dd\u02dc\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0005)\u0000\u0000\u02e0\u02e1\u0005\u007f\u0000"+
		"\u0000\u02e1\u02e2\u0003.\u0017\u0000\u02e2\u02e3\u0005\u0080\u0000\u0000"+
		"\u02e3o\u0001\u0000\u0000\u0000\u02e4\u0307\u0003v;\u0000\u02e5\u02e6"+
		"\u0003r9\u0000\u02e6\u02e7\u0003v;\u0000\u02e7\u0308\u0001\u0000\u0000"+
		"\u0000\u02e8\u02ea\u0005$\u0000\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0005%\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed"+
		"\u02f0\u0005\u007f\u0000\u0000\u02ee\u02f1\u0003\u0084B\u0000\u02ef\u02f1"+
		"\u0003.\u0017\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02ef\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005"+
		"\u0080\u0000\u0000\u02f3\u0308\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005"+
		"&\u0000\u0000\u02f5\u02f6\u0003v;\u0000\u02f6\u02f7\u0005\"\u0000\u0000"+
		"\u02f7\u02f8\u0003v;\u0000\u02f8\u0308\u0001\u0000\u0000\u0000\u02f9\u02fb"+
		"\u0005$\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005"+
		"\'\u0000\u0000\u02fd\u0300\u0003v;\u0000\u02fe\u02ff\u0005[\u0000\u0000"+
		"\u02ff\u0301\u0003v;\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0001\u0000\u0000\u0000\u0301\u0308\u0001\u0000\u0000\u0000\u0302\u0304"+
		"\u0005(\u0000\u0000\u0303\u0305\u0005$\u0000\u0000\u0304\u0303\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000"+
		"\u0000\u0000\u0306\u0308\u0007\u0005\u0000\u0000\u0307\u02e5\u0001\u0000"+
		"\u0000\u0000\u0307\u02e9\u0001\u0000\u0000\u0000\u0307\u02f4\u0001\u0000"+
		"\u0000\u0000\u0307\u02fa\u0001\u0000\u0000\u0000\u0307\u0302\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308q\u0001\u0000\u0000"+
		"\u0000\u0309\u030a\u0007\u0006\u0000\u0000\u030as\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0005V\u0000\u0000\u030c\u030d\u0005\u007f\u0000\u0000\u030d"+
		"\u030e\u0003h4\u0000\u030e\u030f\u00055\u0000\u0000\u030f\u0310\u0003"+
		"\u0086C\u0000\u0310\u0311\u0005\u0080\u0000\u0000\u0311u\u0001\u0000\u0000"+
		"\u0000\u0312\u0317\u0003x<\u0000\u0313\u0314\u0007\u0007\u0000\u0000\u0314"+
		"\u0316\u0003x<\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0316\u0319\u0001"+
		"\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318w\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000"+
		"\u0000\u0000\u031a\u031f\u0003z=\u0000\u031b\u031c\u0007\b\u0000\u0000"+
		"\u031c\u031e\u0003z=\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e\u0321"+
		"\u0001\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320"+
		"\u0001\u0000\u0000\u0000\u0320y\u0001\u0000\u0000\u0000\u0321\u031f\u0001"+
		"\u0000\u0000\u0000\u0322\u0324\u0007\t\u0000\u0000\u0323\u0322\u0001\u0000"+
		"\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0003|>\u0000\u0326{\u0001\u0000\u0000\u0000"+
		"\u0327\u0337\u0003\u0088D\u0000\u0328\u0337\u0003\u0090H\u0000\u0329\u0337"+
		"\u0003\u0098L\u0000\u032a\u0337\u0005p\u0000\u0000\u032b\u0337\u0003\u0080"+
		"@\u0000\u032c\u0337\u0003~?\u0000\u032d\u0337\u0003t:\u0000\u032e\u032f"+
		"\u0005\u007f\u0000\u0000\u032f\u0330\u0003h4\u0000\u0330\u0331\u0005\u0080"+
		"\u0000\u0000\u0331\u0337\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u007f"+
		"\u0000\u0000\u0333\u0334\u0003.\u0017\u0000\u0334\u0335\u0005\u0080\u0000"+
		"\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336\u0327\u0001\u0000\u0000"+
		"\u0000\u0336\u0328\u0001\u0000\u0000\u0000\u0336\u0329\u0001\u0000\u0000"+
		"\u0000\u0336\u032a\u0001\u0000\u0000\u0000\u0336\u032b\u0001\u0000\u0000"+
		"\u0000\u0336\u032c\u0001\u0000\u0000\u0000\u0336\u032d\u0001\u0000\u0000"+
		"\u0000\u0336\u032e\u0001\u0000\u0000\u0000\u0336\u0332\u0001\u0000\u0000"+
		"\u0000\u0337}\u0001\u0000\u0000\u0000\u0338\u033e\u0005L\u0000\u0000\u0339"+
		"\u033a\u0005M\u0000\u0000\u033a\u033b\u0003h4\u0000\u033b\u033c\u0005"+
		"N\u0000\u0000\u033c\u033d\u0003h4\u0000\u033d\u033f\u0001\u0000\u0000"+
		"\u0000\u033e\u0339\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000"+
		"\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000"+
		"\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0343\u0005?\u0000\u0000"+
		"\u0343\u0345\u0003h4\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0005=\u0000\u0000\u0347\u007f\u0001\u0000\u0000\u0000\u0348\u0349\u0003"+
		"\u0082A\u0000\u0349\u034c\u0005\u007f\u0000\u0000\u034a\u034d\u0003\u0084"+
		"B\u0000\u034b\u034d\u0005{\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000"+
		"\u034c\u034b\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000"+
		"\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0005\u0080\u0000\u0000"+
		"\u034f\u0081\u0001\u0000\u0000\u0000\u0350\u035b\u0003\u0096K\u0000\u0351"+
		"\u035b\u0005O\u0000\u0000\u0352\u035b\u0005P\u0000\u0000\u0353\u035b\u0005"+
		"Q\u0000\u0000\u0354\u035b\u0005R\u0000\u0000\u0355\u035b\u0005S\u0000"+
		"\u0000\u0356\u035b\u0005T\u0000\u0000\u0357\u035b\u0005U\u0000\u0000\u0358"+
		"\u035b\u0005W\u0000\u0000\u0359\u035b\u0005~\u0000\u0000\u035a\u0350\u0001"+
		"\u0000\u0000\u0000\u035a\u0351\u0001\u0000\u0000\u0000\u035a\u0352\u0001"+
		"\u0000\u0000\u0000\u035a\u0353\u0001\u0000\u0000\u0000\u035a\u0354\u0001"+
		"\u0000\u0000\u0000\u035a\u0355\u0001\u0000\u0000\u0000\u035a\u0356\u0001"+
		"\u0000\u0000\u0000\u035a\u0357\u0001\u0000\u0000\u0000\u035a\u0358\u0001"+
		"\u0000\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035b\u0083\u0001"+
		"\u0000\u0000\u0000\u035c\u0361\u0003h4\u0000\u035d\u035e\u0005\u0081\u0000"+
		"\u0000\u035e\u0360\u0003h4\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u0360"+
		"\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361"+
		"\u0362\u0001\u0000\u0000\u0000\u0362\u0085\u0001\u0000\u0000\u0000\u0363"+
		"\u0361\u0001\u0000\u0000\u0000\u0364\u039d\u0005]\u0000\u0000\u0365\u039d"+
		"\u0005\\\u0000\u0000\u0366\u039d\u0005^\u0000\u0000\u0367\u039d\u0005"+
		"_\u0000\u0000\u0368\u0370\u0005`\u0000\u0000\u0369\u036a\u0005\u007f\u0000"+
		"\u0000\u036a\u036d\u0005\u0084\u0000\u0000\u036b\u036c\u0005\u0081\u0000"+
		"\u0000\u036c\u036e\u0005\u0084\u0000\u0000\u036d\u036b\u0001\u0000\u0000"+
		"\u0000\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000"+
		"\u0000\u036f\u0371\u0005\u0080\u0000\u0000\u0370\u0369\u0001\u0000\u0000"+
		"\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u039d\u0001\u0000\u0000"+
		"\u0000\u0372\u037a\u0005a\u0000\u0000\u0373\u0374\u0005\u007f\u0000\u0000"+
		"\u0374\u0377\u0005\u0084\u0000\u0000\u0375\u0376\u0005\u0081\u0000\u0000"+
		"\u0376\u0378\u0005\u0084\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000"+
		"\u0379\u037b\u0005\u0080\u0000\u0000\u037a\u0373\u0001\u0000\u0000\u0000"+
		"\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u039d\u0001\u0000\u0000\u0000"+
		"\u037c\u0380\u0005b\u0000\u0000\u037d\u037e\u0005\u007f\u0000\u0000\u037e"+
		"\u037f\u0005\u0084\u0000\u0000\u037f\u0381\u0005\u0080\u0000\u0000\u0380"+
		"\u037d\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381"+
		"\u039d\u0001\u0000\u0000\u0000\u0382\u039d\u0005c\u0000\u0000\u0383\u039d"+
		"\u0005d\u0000\u0000\u0384\u0388\u0005e\u0000\u0000\u0385\u0386\u0005\u007f"+
		"\u0000\u0000\u0386\u0387\u0005\u0084\u0000\u0000\u0387\u0389\u0005\u0080"+
		"\u0000\u0000\u0388\u0385\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000"+
		"\u0000\u0000\u0389\u039d\u0001\u0000\u0000\u0000\u038a\u038e\u0005f\u0000"+
		"\u0000\u038b\u038c\u0005\u007f\u0000\u0000\u038c\u038d\u0007\n\u0000\u0000"+
		"\u038d\u038f\u0005\u0080\u0000\u0000\u038e\u038b\u0001\u0000\u0000\u0000"+
		"\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u039d\u0001\u0000\u0000\u0000"+
		"\u0390\u0394\u0005q\u0000\u0000\u0391\u0392\u0005\u007f\u0000\u0000\u0392"+
		"\u0393\u0007\n\u0000\u0000\u0393\u0395\u0005\u0080\u0000\u0000\u0394\u0391"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u039d"+
		"\u0001\u0000\u0000\u0000\u0396\u039d\u0005g\u0000\u0000\u0397\u039d\u0005"+
		"h\u0000\u0000\u0398\u039d\u0005i\u0000\u0000\u0399\u039d\u0005j\u0000"+
		"\u0000\u039a\u039d\u0005k\u0000\u0000\u039b\u039d\u0003\u0096K\u0000\u039c"+
		"\u0364\u0001\u0000\u0000\u0000\u039c\u0365\u0001\u0000\u0000\u0000\u039c"+
		"\u0366\u0001\u0000\u0000\u0000\u039c\u0367\u0001\u0000\u0000\u0000\u039c"+
		"\u0368\u0001\u0000\u0000\u0000\u039c\u0372\u0001\u0000\u0000\u0000\u039c"+
		"\u037c\u0001\u0000\u0000\u0000\u039c\u0382\u0001\u0000\u0000\u0000\u039c"+
		"\u0383\u0001\u0000\u0000\u0000\u039c\u0384\u0001\u0000\u0000\u0000\u039c"+
		"\u038a\u0001\u0000\u0000\u0000\u039c\u0390\u0001\u0000\u0000\u0000\u039c"+
		"\u0396\u0001\u0000\u0000\u0000\u039c\u0397\u0001\u0000\u0000\u0000\u039c"+
		"\u0398\u0001\u0000\u0000\u0000\u039c\u0399\u0001\u0000\u0000\u0000\u039c"+
		"\u039a\u0001\u0000\u0000\u0000\u039c\u039b\u0001\u0000\u0000\u0000\u039d"+
		"\u0087\u0001\u0000\u0000\u0000\u039e\u039f\u0007\u000b\u0000\u0000\u039f"+
		"\u0089\u0001\u0000\u0000\u0000\u03a0\u03a1\u0003\u0096K\u0000\u03a1\u03a2"+
		"\u0005\u0082\u0000\u0000\u03a2\u03a4\u0001\u0000\u0000\u0000\u03a3\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a8"+
		"\u0001\u0000\u0000\u0000\u03a5\u03a6\u0003\u0096K\u0000\u03a6\u03a7\u0005"+
		"\u0082\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000\u03a8\u03a5\u0001"+
		"\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0003\u0096K\u0000\u03ab\u008b\u0001\u0000"+
		"\u0000\u0000\u03ac\u03ad\u0003\u0096K\u0000\u03ad\u008d\u0001\u0000\u0000"+
		"\u0000\u03ae\u03b3\u0003\u008cF\u0000\u03af\u03b0\u0005\u0081\u0000\u0000"+
		"\u03b0\u03b2\u0003\u008cF\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b5\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b4\u008f\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b6\u03b7\u0003\u0092I\u0000\u03b7\u03b8"+
		"\u0005\u0082\u0000\u0000\u03b8\u03ba\u0001\u0000\u0000\u0000\u03b9\u03b6"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bb"+
		"\u0001\u0000\u0000\u0000\u03bb\u03bc\u0003\u008cF\u0000\u03bc\u0091\u0001"+
		"\u0000\u0000\u0000\u03bd\u03be\u0003\u0096K\u0000\u03be\u0093\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c2\u0003\u0096K\u0000\u03c0\u03c2\u0005\u0085\u0000"+
		"\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c2\u0095\u0001\u0000\u0000\u0000\u03c3\u03c4\u0007\f\u0000\u0000"+
		"\u03c4\u0097\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005\u008e\u0000\u0000"+
		"\u03c6\u0099\u0001\u0000\u0000\u0000p\u009c\u00a0\u00b0\u00b7\u00be\u00c5"+
		"\u00cc\u00d8\u00ea\u00ef\u00f3\u0100\u010b\u0112\u0119\u0122\u012b\u013d"+
		"\u0144\u0149\u0164\u0178\u0186\u018b\u0190\u0195\u019b\u019e\u01a1\u01a4"+
		"\u01a7\u01aa\u01ac\u01b3\u01b8\u01bb\u01bf\u01c4\u01c7\u01cd\u01d0\u01d2"+
		"\u01d8\u01dc\u01df\u01ea\u01f6\u0203\u0208\u0212\u0219\u021e\u0225\u022e"+
		"\u023b\u023f\u0249\u024f\u0253\u025b\u025f\u0264\u0266\u026c\u0271\u0275"+
		"\u027e\u0282\u028b\u028f\u029b\u02a0\u02a5\u02aa\u02af\u02b4\u02b8\u02bf"+
		"\u02cb\u02d0\u02d5\u02d9\u02dd\u02e9\u02f0\u02fa\u0300\u0304\u0307\u0317"+
		"\u031f\u0323\u0336\u0340\u0344\u034c\u035a\u0361\u036d\u0370\u0377\u037a"+
		"\u0380\u0388\u038e\u0394\u039c\u03a3\u03a8\u03b3\u03b9\u03c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}