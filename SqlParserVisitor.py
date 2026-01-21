# Generated from SqlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SqlParser import SqlParser
else:
    from SqlParser import SqlParser

# This class defines a complete generic visitor for a parse tree produced by SqlParser.

class SqlParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by SqlParser#sqlScript.
    def visitSqlScript(self, ctx:SqlParser.SqlScriptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#sqlStatement.
    def visitSqlStatement(self, ctx:SqlParser.SqlStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#useStatement.
    def visitUseStatement(self, ctx:SqlParser.UseStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#cteStatement.
    def visitCteStatement(self, ctx:SqlParser.CteStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#commonTableExpression.
    def visitCommonTableExpression(self, ctx:SqlParser.CommonTableExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#cursorStatement.
    def visitCursorStatement(self, ctx:SqlParser.CursorStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#declareCursor.
    def visitDeclareCursor(self, ctx:SqlParser.DeclareCursorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#openCursor.
    def visitOpenCursor(self, ctx:SqlParser.OpenCursorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#fetchCursor.
    def visitFetchCursor(self, ctx:SqlParser.FetchCursorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#closeCursor.
    def visitCloseCursor(self, ctx:SqlParser.CloseCursorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#deallocateCursor.
    def visitDeallocateCursor(self, ctx:SqlParser.DeallocateCursorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#ddlStatement.
    def visitDdlStatement(self, ctx:SqlParser.DdlStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#createTableStatement.
    def visitCreateTableStatement(self, ctx:SqlParser.CreateTableStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tableElement.
    def visitTableElement(self, ctx:SqlParser.TableElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnDefinition.
    def visitColumnDefinition(self, ctx:SqlParser.ColumnDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnConstraint.
    def visitColumnConstraint(self, ctx:SqlParser.ColumnConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tableConstraint.
    def visitTableConstraint(self, ctx:SqlParser.TableConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#constraintDefinition.
    def visitConstraintDefinition(self, ctx:SqlParser.ConstraintDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#alterTableStatement.
    def visitAlterTableStatement(self, ctx:SqlParser.AlterTableStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#alterTableAction.
    def visitAlterTableAction(self, ctx:SqlParser.AlterTableActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#dropStatement.
    def visitDropStatement(self, ctx:SqlParser.DropStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#truncateStatement.
    def visitTruncateStatement(self, ctx:SqlParser.TruncateStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#dmlStatement.
    def visitDmlStatement(self, ctx:SqlParser.DmlStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#selectStatement.
    def visitSelectStatement(self, ctx:SqlParser.SelectStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#querySpecification.
    def visitQuerySpecification(self, ctx:SqlParser.QuerySpecificationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#selectList.
    def visitSelectList(self, ctx:SqlParser.SelectListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#selectItem.
    def visitSelectItem(self, ctx:SqlParser.SelectItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tableSource.
    def visitTableSource(self, ctx:SqlParser.TableSourceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#joinClause.
    def visitJoinClause(self, ctx:SqlParser.JoinClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#whereClause.
    def visitWhereClause(self, ctx:SqlParser.WhereClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#groupByClause.
    def visitGroupByClause(self, ctx:SqlParser.GroupByClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#havingClause.
    def visitHavingClause(self, ctx:SqlParser.HavingClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#orderByClause.
    def visitOrderByClause(self, ctx:SqlParser.OrderByClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#orderByItem.
    def visitOrderByItem(self, ctx:SqlParser.OrderByItemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#limitClause.
    def visitLimitClause(self, ctx:SqlParser.LimitClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#offsetClause.
    def visitOffsetClause(self, ctx:SqlParser.OffsetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#insertStatement.
    def visitInsertStatement(self, ctx:SqlParser.InsertStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#valueList.
    def visitValueList(self, ctx:SqlParser.ValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#valueGroup.
    def visitValueGroup(self, ctx:SqlParser.ValueGroupContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#updateStatement.
    def visitUpdateStatement(self, ctx:SqlParser.UpdateStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#setClause.
    def visitSetClause(self, ctx:SqlParser.SetClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#deleteStatement.
    def visitDeleteStatement(self, ctx:SqlParser.DeleteStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#controlFlowStatement.
    def visitControlFlowStatement(self, ctx:SqlParser.ControlFlowStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#ifStatement.
    def visitIfStatement(self, ctx:SqlParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#whileStatement.
    def visitWhileStatement(self, ctx:SqlParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#beginEndBlock.
    def visitBeginEndBlock(self, ctx:SqlParser.BeginEndBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tryCatchBlock.
    def visitTryCatchBlock(self, ctx:SqlParser.TryCatchBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#printStatement.
    def visitPrintStatement(self, ctx:SqlParser.PrintStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:SqlParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#variableAssignment.
    def visitVariableAssignment(self, ctx:SqlParser.VariableAssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#execStatement.
    def visitExecStatement(self, ctx:SqlParser.ExecStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#goStatement.
    def visitGoStatement(self, ctx:SqlParser.GoStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#expression.
    def visitExpression(self, ctx:SqlParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#logicalOrExpression.
    def visitLogicalOrExpression(self, ctx:SqlParser.LogicalOrExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#logicalAndExpression.
    def visitLogicalAndExpression(self, ctx:SqlParser.LogicalAndExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#existsExpression.
    def visitExistsExpression(self, ctx:SqlParser.ExistsExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#comparisonExpression.
    def visitComparisonExpression(self, ctx:SqlParser.ComparisonExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#comparisonOperator.
    def visitComparisonOperator(self, ctx:SqlParser.ComparisonOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#castExpression.
    def visitCastExpression(self, ctx:SqlParser.CastExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#additiveExpression.
    def visitAdditiveExpression(self, ctx:SqlParser.AdditiveExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#multiplicativeExpression.
    def visitMultiplicativeExpression(self, ctx:SqlParser.MultiplicativeExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#unaryExpression.
    def visitUnaryExpression(self, ctx:SqlParser.UnaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#primaryExpression.
    def visitPrimaryExpression(self, ctx:SqlParser.PrimaryExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#caseExpression.
    def visitCaseExpression(self, ctx:SqlParser.CaseExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#functionCall.
    def visitFunctionCall(self, ctx:SqlParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#functionName.
    def visitFunctionName(self, ctx:SqlParser.FunctionNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#expressionList.
    def visitExpressionList(self, ctx:SqlParser.ExpressionListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#dataType.
    def visitDataType(self, ctx:SqlParser.DataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#literal.
    def visitLiteral(self, ctx:SqlParser.LiteralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tableName.
    def visitTableName(self, ctx:SqlParser.TableNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnName.
    def visitColumnName(self, ctx:SqlParser.ColumnNameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnNameList.
    def visitColumnNameList(self, ctx:SqlParser.ColumnNameListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnReference.
    def visitColumnReference(self, ctx:SqlParser.ColumnReferenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#tableAlias.
    def visitTableAlias(self, ctx:SqlParser.TableAliasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#columnAlias.
    def visitColumnAlias(self, ctx:SqlParser.ColumnAliasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#identifier.
    def visitIdentifier(self, ctx:SqlParser.IdentifierContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SqlParser#variableName.
    def visitVariableName(self, ctx:SqlParser.VariableNameContext):
        return self.visitChildren(ctx)



del SqlParser