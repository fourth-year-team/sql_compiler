parser grammar SqlParser;

options { tokenVocab=SqlLexer; } // <-- This is CRITICAL. It links to SqlLexer.g4

// The top-level rule: a program is one or more statements
prog: statement+ EOF;

// A statement can be one of the following (we'll add more later)
statement
    : selectStatement ';'
    ;

// Define the structure of a SELECT statement
selectStatement
    : SELECT expression FROM IDENTIFIER (WHERE expression)?
    ;

// A very basic definition for an expression for now
expression
    : IDENTIFIER
    | NUMBER
    | STRING
    | MULTIPLY // For COUNT(*)
    | variable
    | functionCall
    ;

variable
    : VARIABLE
    ;

functionCall
    : IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN
    ;
    