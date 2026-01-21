from abc import ABC, abstractmethod
from typing import List, Optional

class ASTNode(ABC):
    """Abstract base class for all AST nodes using the Composite Design Pattern."""

    def __init__(self):
        self.children: List['ASTNode'] = []

    def add_child(self, child: 'ASTNode') -> None:
        """Add a child node to this node."""
        if child is not None:
            self.children.append(child)

    def get_children(self) -> List['ASTNode']:
        """Get all child nodes."""
        return self.children

    def get_indent_string(self, indent_level: int) -> str:
        """Generate indentation string for the given level."""
        return "  " * indent_level

    @abstractmethod
    def print(self, indent_level: int = 0) -> None:
        """Print this node and its children with proper indentation."""
        pass

    def __str__(self) -> str:
        """String representation for debugging."""
        return f"{self.__class__.__name__}({len(self.children)} children)"

# =============================================================================
# STATEMENTS
# =============================================================================

class SqlScriptNode(ASTNode):
    """Root node representing a complete SQL script."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}SqlScript")
        for child in self.children:
            child.print(indent_level + 1)

class SelectStatementNode(ASTNode):
    """Node representing a SELECT statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}SelectStatement")
        for child in self.children:
            child.print(indent_level + 1)

class InsertStatementNode(ASTNode):
    """Node representing an INSERT statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}InsertStatement")
        for child in self.children:
            child.print(indent_level + 1)

class UpdateStatementNode(ASTNode):
    """Node representing an UPDATE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}UpdateStatement")
        for child in self.children:
            child.print(indent_level + 1)

class DeleteStatementNode(ASTNode):
    """Node representing a DELETE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}DeleteStatement")
        for child in self.children:
            child.print(indent_level + 1)

class CreateTableNode(ASTNode):
    """Node representing a CREATE TABLE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}CreateTable")
        for child in self.children:
            child.print(indent_level + 1)

class AlterTableNode(ASTNode):
    """Node representing an ALTER TABLE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}AlterTable")
        for child in self.children:
            child.print(indent_level + 1)

class DropStatementNode(ASTNode):
    """Node representing a DROP statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}DropStatement")
        for child in self.children:
            child.print(indent_level + 1)

class TruncateStatementNode(ASTNode):
    """Node representing a TRUNCATE TABLE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}TruncateStatement")
        for child in self.children:
            child.print(indent_level + 1)

class UseStatementNode(ASTNode):
    """Node representing a USE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}UseStatement")
        for child in self.children:
            child.print(indent_level + 1)

class ExecStatementNode(ASTNode):
    """Node representing an EXEC statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}ExecStatement")
        for child in self.children:
            child.print(indent_level + 1)

class GoStatementNode(ASTNode):
    """Node representing a GO statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}GoStatement")
        for child in self.children:
            child.print(indent_level + 1)

class PrintStatementNode(ASTNode):
    """Node representing a PRINT statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}PrintStatement")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# CONTROL FLOW
# =============================================================================

class IfStatementNode(ASTNode):
    """Node representing an IF statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}IfStatement")
        for child in self.children:
            child.print(indent_level + 1)

class WhileStatementNode(ASTNode):
    """Node representing a WHILE statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}WhileStatement")
        for child in self.children:
            child.print(indent_level + 1)

class BeginEndBlockNode(ASTNode):
    """Node representing a BEGIN...END block."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}BeginEndBlock")
        for child in self.children:
            child.print(indent_level + 1)

class TryCatchNode(ASTNode):
    """Node representing a TRY...CATCH block."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}TryCatch")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# CTE & CURSOR
# =============================================================================

class CteStatementNode(ASTNode):
    """Node representing a CTE (Common Table Expression) statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}CteStatement")
        for child in self.children:
            child.print(indent_level + 1)

class CommonTableExpressionNode(ASTNode):
    """Node representing a single Common Table Expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}CommonTableExpression")
        for child in self.children:
            child.print(indent_level + 1)

class DeclareCursorNode(ASTNode):
    """Node representing a DECLARE CURSOR statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}DeclareCursor")
        for child in self.children:
            child.print(indent_level + 1)

class OpenCursorNode(ASTNode):
    """Node representing an OPEN CURSOR statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}OpenCursor")
        for child in self.children:
            child.print(indent_level + 1)

class FetchCursorNode(ASTNode):
    """Node representing a FETCH CURSOR statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}FetchCursor")
        for child in self.children:
            child.print(indent_level + 1)

class CloseCursorNode(ASTNode):
    """Node representing a CLOSE CURSOR statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}CloseCursor")
        for child in self.children:
            child.print(indent_level + 1)

class DeallocateCursorNode(ASTNode):
    """Node representing a DEALLOCATE CURSOR statement."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}DeallocateCursor")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# EXPRESSIONS
# =============================================================================

class ExpressionNode(ASTNode, ABC):
    """Abstract base class for all expression nodes."""
    pass

class LogicalOrNode(ExpressionNode):
    """Node representing logical OR expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}LogicalOr")
        for child in self.children:
            child.print(indent_level + 1)

class LogicalAndNode(ExpressionNode):
    """Node representing logical AND expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}LogicalAnd")
        for child in self.children:
            child.print(indent_level + 1)

class ComparisonNode(ExpressionNode):
    """Node representing comparison expressions (=, !=, <, >, <=, >=)."""
    def __init__(self, operator: str):
        super().__init__()
        self.operator = operator

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Comparison({self.operator})")
        for child in self.children:
            child.print(indent_level + 1)

class BetweenNode(ExpressionNode):
    """Node representing BETWEEN expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Between")
        for child in self.children:
            child.print(indent_level + 1)

class LikeNode(ExpressionNode):
    """Node representing LIKE expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Like")
        for child in self.children:
            child.print(indent_level + 1)

class InNode(ExpressionNode):
    """Node representing IN expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}In")
        for child in self.children:
            child.print(indent_level + 1)

class ExistsNode(ExpressionNode):
    """Node representing EXISTS expression."""
    def __init__(self, negated: bool = False):
        super().__init__()
        self.negated = negated

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        exists_type = "NotExists" if self.negated else "Exists"
        print(f"{indent}{exists_type}")
        for child in self.children:
            child.print(indent_level + 1)

class IsNullNode(ExpressionNode):
    """Node representing IS NULL expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}IsNull")
        for child in self.children:
            child.print(indent_level + 1)

class AdditiveExpressionNode(ExpressionNode):
    """Node representing additive expressions (+, -)."""
    def __init__(self, operator: str):
        super().__init__()
        self.operator = operator

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Additive({self.operator})")
        for child in self.children:
            child.print(indent_level + 1)

class MultiplicativeExpressionNode(ExpressionNode):
    """Node representing multiplicative expressions (*, /, %)."""
    def __init__(self, operator: str):
        super().__init__()
        self.operator = operator

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Multiplicative({self.operator})")
        for child in self.children:
            child.print(indent_level + 1)

class UnaryExpressionNode(ExpressionNode):
    """Node representing unary expressions (+, -, NOT)."""
    def __init__(self, operator: str):
        super().__init__()
        self.operator = operator

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Unary({self.operator})")
        for child in self.children:
            child.print(indent_level + 1)

class CastExpressionNode(ExpressionNode):
    """Node representing CAST expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Cast")
        for child in self.children:
            child.print(indent_level + 1)

class CaseExpressionNode(ExpressionNode):
    """Node representing CASE expression."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Case")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# LITERALS
# =============================================================================

class StringLiteralNode(ExpressionNode):
    """Node representing string literals."""
    def __init__(self, value: str):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}String('{self.value}')")

class NumericLiteralNode(ExpressionNode):
    """Node representing numeric literals."""
    def __init__(self, value: str):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Number({self.value})")

class BooleanLiteralNode(ExpressionNode):
    """Node representing boolean literals (TRUE/FALSE)."""
    def __init__(self, value: bool):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Boolean({self.value})")

class NullLiteralNode(ExpressionNode):
    """Node representing NULL literal."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Null")

class DateLiteralNode(ExpressionNode):
    """Node representing date literals."""
    def __init__(self, value: str):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Date('{self.value}')")

class HexLiteralNode(ExpressionNode):
    """Node representing hexadecimal literals."""
    def __init__(self, value: str):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Hex('{self.value}')")

class BitLiteralNode(ExpressionNode):
    """Node representing bit literals."""
    def __init__(self, value: str):
        super().__init__()
        self.value = value

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Bit('{self.value}')")

# =============================================================================
# IDENTIFIERS
# =============================================================================

class IdentifierNode(ASTNode):
    """Node representing identifiers."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Identifier({self.name})")

class TableNameNode(ASTNode):
    """Node representing table names."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Table({self.name})")

class ColumnNameNode(ASTNode):
    """Node representing column names."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Column({self.name})")

class ColumnReferenceNode(ASTNode):
    """Node representing column references (potentially with table alias)."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}ColumnReference")
        for child in self.children:
            child.print(indent_level + 1)

class VariableNode(ASTNode):
    """Node representing variables (@variable)."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Variable({self.name})")

class GlobalVariableNode(ASTNode):
    """Node representing global variables (@@global_variable)."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}GlobalVariable({self.name})")

# =============================================================================
# FUNCTIONS
# =============================================================================

class FunctionCallNode(ExpressionNode):
    """Node representing function calls."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}FunctionCall")
        for child in self.children:
            child.print(indent_level + 1)

class FunctionNameNode(ASTNode):
    """Node representing function names."""
    def __init__(self, name: str):
        super().__init__()
        self.name = name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}FunctionName({self.name})")

# =============================================================================
# SELECT-RELATED NODES
# =============================================================================

class SelectListNode(ASTNode):
    """Node representing SELECT list."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}SelectList")
        for child in self.children:
            child.print(indent_level + 1)

class FromNode(ASTNode):
    """Node representing FROM clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}From")
        for child in self.children:
            child.print(indent_level + 1)

class WhereNode(ASTNode):
    """Node representing WHERE clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Where")
        for child in self.children:
            child.print(indent_level + 1)

class GroupByNode(ASTNode):
    """Node representing GROUP BY clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}GroupBy")
        for child in self.children:
            child.print(indent_level + 1)

class HavingNode(ASTNode):
    """Node representing HAVING clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Having")
        for child in self.children:
            child.print(indent_level + 1)

class OrderByNode(ASTNode):
    """Node representing ORDER BY clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}OrderBy")
        for child in self.children:
            child.print(indent_level + 1)

class LimitNode(ASTNode):
    """Node representing LIMIT clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Limit")
        for child in self.children:
            child.print(indent_level + 1)

class OffsetNode(ASTNode):
    """Node representing OFFSET clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Offset")
        for child in self.children:
            child.print(indent_level + 1)

class JoinNode(ASTNode):
    """Node representing JOIN clauses."""
    def __init__(self, join_type: str = ""):
        super().__init__()
        self.join_type = join_type

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        if self.join_type:
            print(f"{indent}Join({self.join_type})")
        else:
            print(f"{indent}Join")
        for child in self.children:
            child.print(indent_level + 1)

class AliasNode(ASTNode):
    """Node representing aliases (AS alias_name)."""
    def __init__(self, alias: str):
        super().__init__()
        self.alias = alias

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Alias({self.alias})")

# =============================================================================
# DDL NODES
# =============================================================================

class ColumnDefinitionNode(ASTNode):
    """Node representing column definitions in CREATE TABLE."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}ColumnDefinition")
        for child in self.children:
            child.print(indent_level + 1)

class DataTypeNode(ASTNode):
    """Node representing data types."""
    def __init__(self, type_name: str):
        super().__init__()
        self.type_name = type_name

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}DataType({self.type_name})")

class ColumnConstraintNode(ASTNode):
    """Node representing column constraints."""
    def __init__(self, constraint_type: str, clustered_option: str = ""):
        super().__init__()
        self.constraint_type = constraint_type
        self.clustered_option = clustered_option

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        constraint_display = self.constraint_type
        if self.clustered_option:
            constraint_display += f" {self.clustered_option}"
        print(f"{indent}ColumnConstraint({constraint_display})")
        for child in self.children:
            child.print(indent_level + 1)

class TableConstraintNode(ASTNode):
    """Node representing table constraints."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}TableConstraint")
        for child in self.children:
            child.print(indent_level + 1)

class ConstraintDefinitionNode(ASTNode):
    """Node representing constraint definitions."""
    def __init__(self, constraint_type: str, clustered_option: str = ""):
        super().__init__()
        self.constraint_type = constraint_type
        self.clustered_option = clustered_option

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        constraint_display = self.constraint_type
        if self.clustered_option:
            constraint_display += f" {self.clustered_option}"
        print(f"{indent}ConstraintDefinition({constraint_display})")
        for child in self.children:
            child.print(indent_level + 1)

class AlterTableActionNode(ASTNode):
    """Node representing ALTER TABLE actions."""
    def __init__(self, action_type: str):
        super().__init__()
        self.action_type = action_type

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}AlterTableAction({self.action_type})")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# DML NODES
# =============================================================================

class ValuesNode(ASTNode):
    """Node representing VALUES clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Values")
        for child in self.children:
            child.print(indent_level + 1)

class ValueListNode(ASTNode):
    """Node representing a list of values."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}ValueList")
        for child in self.children:
            child.print(indent_level + 1)

class SetNode(ASTNode):
    """Node representing SET clause in UPDATE."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Set")
        for child in self.children:
            child.print(indent_level + 1)

class AssignmentNode(ASTNode):
    """Node representing assignment operations (=, +=, etc.)."""
    def __init__(self, operator: str = "="):
        super().__init__()
        self.operator = operator

    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Assignment({self.operator})")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# CONTROL FLOW NODES
# =============================================================================

class ConditionNode(ASTNode):
    """Node representing conditions in control flow statements."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Condition")
        for child in self.children:
            child.print(indent_level + 1)

class ElseNode(ASTNode):
    """Node representing ELSE clause."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Else")
        for child in self.children:
            child.print(indent_level + 1)

class TryNode(ASTNode):
    """Node representing TRY block."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Try")
        for child in self.children:
            child.print(indent_level + 1)

class CatchNode(ASTNode):
    """Node representing CATCH block."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}Catch")
        for child in self.children:
            child.print(indent_level + 1)

# =============================================================================
# VARIABLE NODES
# =============================================================================

class VariableDeclarationNode(ASTNode):
    """Node representing variable declarations."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}VariableDeclaration")
        for child in self.children:
            child.print(indent_level + 1)

class VariableAssignmentNode(ASTNode):
    """Node representing variable assignments."""
    def print(self, indent_level: int = 0) -> None:
        indent = self.get_indent_string(indent_level)
        print(f"{indent}VariableAssignment")
        for child in self.children:
            child.print(indent_level + 1)
