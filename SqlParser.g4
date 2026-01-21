parser grammar SqlParser;

options {
    tokenVocab = SqlLexer;
}

/* =========================
   Root
   ========================= */
sqlScript
    : (sqlStatement SEMICOLON?)* EOF
    ;

sqlStatement
    : ddlStatement
    | dmlStatement
    | cteStatement
    | cursorStatement
    | controlFlowStatement
    | variableDeclaration
    | variableAssignment
    | execStatement
    | goStatement
    | printStatement
    | useStatement
    ;

/* =========================
   USE
   ========================= */
useStatement
    : USE identifier
    ;

/* =========================
   CTE
   ========================= */
cteStatement
    : WITH RECURSIVE? commonTableExpression (COMMA commonTableExpression)*
      (selectStatement | insertStatement | updateStatement | deleteStatement)
    ;

commonTableExpression
    : identifier (LPAREN columnNameList RPAREN)? AS LPAREN selectStatement RPAREN
    ;

/* =========================
   Cursor
   ========================= */
cursorStatement
    : declareCursor
    | openCursor
    | fetchCursor
    | closeCursor
    | deallocateCursor
    ;

declareCursor
    : DECLARE identifier CURSOR FOR selectStatement
    ;

openCursor
    : OPEN identifier
    ;

fetchCursor
    : FETCH NEXT FROM identifier INTO (variableName | GLOBAL_VARIABLE)
      (COMMA (variableName | GLOBAL_VARIABLE))*
    ;

closeCursor
    : CLOSE identifier
    ;

deallocateCursor
    : DEALLOCATE identifier
    ;

/* =========================
   DDL
   ========================= */
ddlStatement
    : createTableStatement
    | alterTableStatement
    | dropStatement
    | truncateStatement
    ;

createTableStatement
    : CREATE TABLE tableName
      LPAREN tableElement (COMMA tableElement)* RPAREN
    ;

tableElement
    : columnDefinition
    | tableConstraint
    ;

columnDefinition
    : columnName dataType columnConstraint*
    ;

columnConstraint
    : NOT NULL
    | NULL
    | PRIMARY KEY (CLUSTERED | NONCLUSTERED)?
    | UNIQUE
    | IDENTITY (LPAREN NUMBER COMMA NUMBER RPAREN)?
    | DEFAULT expression
    | CHECK LPAREN expression RPAREN
    | AUTO_INCREMENT
    | FOREIGN KEY REFERENCES tableName LPAREN columnName RPAREN
    ;

tableConstraint
    : CONSTRAINT identifier constraintDefinition
    | constraintDefinition
    ;

constraintDefinition
    : PRIMARY KEY (CLUSTERED | NONCLUSTERED)? LPAREN columnNameList RPAREN
    | UNIQUE LPAREN columnNameList RPAREN
    | CHECK LPAREN expression RPAREN
    | FOREIGN KEY LPAREN columnNameList RPAREN
      REFERENCES tableName LPAREN columnNameList RPAREN
    ;

alterTableStatement
    : ALTER TABLE tableName alterTableAction
    ;

alterTableAction
    : ADD columnDefinition
    | ADD CONSTRAINT identifier constraintDefinition
    | DROP COLUMN columnName
    | DROP CONSTRAINT identifier
    ;

dropStatement
    : DROP (TABLE | VIEW | INDEX) tableName
    ;

truncateStatement
    : TRUNCATE TABLE tableName
    ;

/* =========================
   DML
   ========================= */
dmlStatement
    : selectStatement
    | insertStatement
    | updateStatement
    | deleteStatement
    ;

selectStatement
    : querySpecification (UNION ALL? querySpecification)*
    ;

querySpecification
    : SELECT (DISTINCT | ALL)? selectList
      (FROM tableSource
        whereClause?
        groupByClause?
        havingClause?
        orderByClause?
        limitClause?
        offsetClause?
      )?
    ;

selectList
    : selectItem (COMMA selectItem)*
    ;

selectItem
    : expression (AS? columnAlias)?
    | MULTIPLY
    | NUMBER
    ;

tableSource
    : tableName (AS? tableAlias)?
    | LPAREN selectStatement RPAREN (AS? tableAlias)?
    | tableSource joinClause
    ;

joinClause
    : (INNER | LEFT | RIGHT | FULL)? OUTER?
      JOIN tableSource
      (ON expression | USING LPAREN columnNameList RPAREN)
    ;

whereClause
    : WHERE expression
    ;

groupByClause
    : GROUP BY expression (COMMA expression)*
    ;

havingClause
    : HAVING expression
    ;

orderByClause
    : ORDER BY orderByItem (COMMA orderByItem)*
    ;

orderByItem
    : expression (ASC | DESC)?
    ;

limitClause
    : LIMIT expression
    ;

offsetClause
    : OFFSET expression
    ;

insertStatement
    : INSERT INTO? tableName
      (LPAREN columnNameList RPAREN)?
      (VALUES valueList | selectStatement)
    ;

valueList
    : valueGroup (COMMA valueGroup)*
    ;

valueGroup
    : LPAREN expression (COMMA expression)* RPAREN
    ;

updateStatement
    : UPDATE tableName
      SET setClause (COMMA setClause)*
      whereClause?
    ;

setClause
    : columnName EQUALS expression
    ;

deleteStatement
    : DELETE FROM tableName whereClause?
    ;

/* =========================
   Control Flow
   ========================= */
controlFlowStatement
    : ifStatement
    | whileStatement
    | beginEndBlock
    | tryCatchBlock
    ;

ifStatement
    : IF NOT? (EXISTS LPAREN selectStatement RPAREN | expression)
      (sqlStatement | beginEndBlock)
      (ELSE (sqlStatement | beginEndBlock))?
    ;

whileStatement
    : WHILE expression (sqlStatement | beginEndBlock)
    ;

beginEndBlock
    : BEGIN (sqlStatement SEMICOLON?)* END
    ;

tryCatchBlock
    : BEGIN TRY (sqlStatement SEMICOLON?)* END TRY
      BEGIN CATCH (sqlStatement SEMICOLON?)* END CATCH
    ;

printStatement
    : PRINT expression
    ;

/* =========================
   Variables
   ========================= */
variableDeclaration
    : DECLARE (variableName | GLOBAL_VARIABLE) dataType (EQUALS expression)?
    ;

variableAssignment
    : SET (variableName | GLOBAL_VARIABLE) (PLUS EQUALS | EQUALS) expression
    ;

/* =========================
   EXEC / GO
   ========================= */
execStatement
    : EXEC? (identifier DOT)? (SP_EXECUTESQL | identifier)
      expression (COMMA expression)*
    ;

goStatement
    : GO
    ;

/* =========================
   Expressions
   ========================= */
expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : (comparisonExpression | existsExpression)
      (AND (comparisonExpression | existsExpression))*
    ;

existsExpression
    : NOT? EXISTS LPAREN selectStatement RPAREN
    ;
comparisonExpression
    : additiveExpression
      (
        comparisonOperator additiveExpression
      | (NOT? IN) LPAREN (expressionList | selectStatement) RPAREN
      | BETWEEN additiveExpression AND additiveExpression
      | (NOT)? LIKE additiveExpression (ESCAPE additiveExpression)?
      | IS NOT? (NULL | TRUE | FALSE)
      )?
    ;
comparisonOperator
    : EQUALS
    | NOTEQUALS
    | LESSTHAN
    | GREATERTHAN
    | LESSTHANOREQ
    | GREATERTHANOREQ
    ;

castExpression
    : CAST LPAREN expression AS dataType RPAREN
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS | CONCAT) multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression ((MULTIPLY | DIVIDE | MODULO) unaryExpression)*
    ;

unaryExpression
    : (PLUS | MINUS | NOT)? primaryExpression
    ;

primaryExpression
    : literal
    | columnReference
    | variableName
    | GLOBAL_VARIABLE
    | functionCall
    | caseExpression
    |  castExpression
    | LPAREN expression RPAREN
    | LPAREN selectStatement RPAREN
    ;

caseExpression
    : CASE (WHEN expression THEN expression)+ (ELSE expression)? END
    ;

functionCall
    : functionName LPAREN (expressionList | MULTIPLY)? RPAREN
    ;

functionName
    : identifier
    | COUNT | SUM | AVG | MIN | MAX
    | COALESCE | NULLIF | CONVERT | CONCAT
    ;

expressionList
    : expression (COMMA expression)*
    ;

/* =========================
   Data Types
   ========================= */
dataType
    : INTEGER | INT | SMALLINT | BIGINT
    | DECIMAL (LPAREN NUMBER (COMMA NUMBER)? RPAREN)?
    | NUMERIC (LPAREN NUMBER (COMMA NUMBER)? RPAREN)?
    | FLOAT (LPAREN NUMBER RPAREN)?
    | REAL | DOUBLE
    | CHAR (LPAREN NUMBER RPAREN)?
    | VARCHAR (LPAREN (NUMBER | MAX) RPAREN)?
    | NVARCHAR (LPAREN (NUMBER | MAX) RPAREN)?
    | TEXT | DATE | TIME | TIMESTAMP | BOOLEAN
    | identifier
    ;

/* =========================
   Literals
   ========================= */
literal
    : STRING | NSTRING | NUMBER | DATE_LITERAL
    | TRUE | FALSE | NULL
    | HEX_STRING | BIT_STRING
    | GLOBAL_VARIABLE
    ;

/* =========================
   Identifiers
   ========================= */
tableName
    : (identifier DOT)? (identifier DOT)? identifier
    ;

columnName
    : identifier
    ;

columnNameList
    : columnName (COMMA columnName)*
    ;

columnReference
    : (tableAlias DOT)? columnName
    ;

tableAlias
    : identifier
    ;

columnAlias
    : identifier | STRING
    ;

identifier
    : IDENTIFIER
    | QUOTED_IDENTIFIER
    | BACKTICK_QUOTED_IDENTIFIER
    | BRACKETED_IDENTIFIER
    ;

variableName
    : VARIABLE
    ;
