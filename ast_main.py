#!/usr/bin/env python3
"""
AST Phase Main Entry Point

This program demonstrates the complete Abstract Syntax Tree (AST) construction phase
for the T-SQL compiler. It reads SQL input, performs lexical analysis, parsing,
and AST construction, then prints the resulting AST.

Usage:
    python ast_main.py

The program will process a sample SQL statement and display the AST.
"""

from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from SqlLexer import SqlLexer
from SqlParser import SqlParser
from ast_builder import ASTBuilderVisitor
import sys

class MyErrorListener(ErrorListener):
    """Custom error listener for parsing errors."""
    def __init__(self):
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"line {line}:{column} {msg}")

def process_sql(sql_input: str, quiet: bool = False) -> bool:
    """
    Process SQL input through the complete compiler pipeline.

    Args:
        sql_input: The SQL string to process
        quiet: If True, suppress detailed output

    Returns:
        bool: True if processing succeeded, False otherwise
    """
    if not quiet:
        print(f"=== PROCESSING SQL INPUT ===")
        print(f"SQL: {sql_input}")
        print("-" * 50)

    # Phase 1: Lexical Analysis
    input_stream = InputStream(sql_input)
    lexer = SqlLexer(input_stream)

    if not quiet:
        print("PHASE 1: LEXICAL ANALYSIS")
        token_stream = CommonTokenStream(lexer)
        token_stream.fill()
        for token in token_stream.tokens:
            if token.type != Token.EOF:
                token_name = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else str(token.type)
                print(f"  {token_name:<20} | '{token.text}'")
        print()

    # Reset lexer for parsing
    input_stream = InputStream(sql_input)
    lexer = SqlLexer(input_stream)
    token_stream = CommonTokenStream(lexer)

    # Phase 2: Parsing
    parser = SqlParser(token_stream)
    error_listener = MyErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)

    if not quiet:
        print("PHASE 2: PARSING")
    tree = parser.sqlScript()

    if error_listener.errors:
        if not quiet:
            print("  PARSING ERRORS:")
            for err in error_listener.errors:
                print(f"    [ERROR] {err}")
        return False

    if not quiet:
        print("  Parse tree generated successfully.")
        print()

    # Phase 3: AST Construction
    if not quiet:
        print("PHASE 3: AST CONSTRUCTION")

    visitor = ASTBuilderVisitor()
    ast = visitor.visit(tree)

    if ast is None:
        if not quiet:
            print("  [ERROR] AST construction failed - returned None")
        return False

    if not quiet:
        print("  AST constructed successfully.")
        print()
        print("PHASE 4: AST OUTPUT")
        print("=" * 50)

    # Print the AST
    ast.print()

    if not quiet:
        print()
        print("=" * 50)
        print("AST PROCESSING COMPLETE")

    return True

def main():
    """Main entry point for the AST demonstration."""

    print("T-SQL COMPILER - AST PHASE DEMONSTRATION")
    print("=" * 60)
    print()

    # Test cases demonstrating various SQL constructs
    test_cases = [
        # Basic SELECT
        "SELECT name, age FROM users WHERE age > 18;",

        # Complex SELECT with JOIN
        """
        SELECT u.name, p.title
        FROM users u
        INNER JOIN posts p ON u.id = p.user_id
        WHERE u.active = 1;
        """,

        # CTE and subquery
        """
        WITH RecentUsers AS (
            SELECT id, name FROM users WHERE created_date > '2023-01-01'
        )
        SELECT * FROM RecentUsers WHERE id IN (
            SELECT user_id FROM orders WHERE total > 100
        );
        """,

        # DDL statements
        """
        CREATE TABLE employees (
            id INT PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            salary DECIMAL(10,2),
            department_id INT,
            FOREIGN KEY (department_id) REFERENCES departments(id)
        );
        """,

        # Control flow
        """
        IF NOT EXISTS (SELECT 1 FROM users WHERE active = 0)
        BEGIN
            UPDATE users SET active = 1 WHERE last_login > '2023-01-01';
        END
        ELSE
        BEGIN
            PRINT 'No inactive users found';
        END
        """,

        # Variables and assignments
        """
        DECLARE @user_count INT;
        SET @user_count = (SELECT COUNT(*) FROM users);
        SELECT @user_count AS total_users;
        """,

        # Complex expressions
        """
        SELECT
            name,
            CASE
                WHEN salary > 100000 THEN 'High'
                WHEN salary BETWEEN 50000 AND 100000 THEN 'Medium'
                ELSE 'Low'
            END AS salary_category,
            COALESCE(manager_id, 0) as mgr_id
        FROM employees
        WHERE department_id IS NOT NULL
          AND (salary > 60000 OR EXISTS (
              SELECT 1 FROM departments d
              WHERE d.id = employees.department_id
                AND d.budget > 1000000
          ));
        """
    ]

    success_count = 0
    total_tests = len(test_cases)

    for i, sql in enumerate(test_cases, 1):
        print(f"\nTEST CASE {i}/{total_tests}")
        print("-" * 30)

        try:
            if process_sql(sql.strip(), quiet=True):
                success_count += 1
                print("✓ SUCCESS")
            else:
                print("✗ FAILED")
        except Exception as e:
            print(f"✗ ERROR: {e}")

    print(f"\n{'='*60}")
    print(f"SUMMARY: {success_count}/{total_tests} test cases passed")

    if success_count == total_tests:
        print("🎉 ALL TESTS PASSED! AST implementation is working correctly.")
        return 0
    else:
        print("⚠️  Some tests failed. Please check the implementation.")
        return 1

if __name__ == "__main__":
    sys.exit(main())
