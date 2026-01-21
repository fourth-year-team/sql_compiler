# Generated from SqlParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SqlParser import SqlParser
else:
    from SqlParser import SqlParser

# This class defines a complete listener for a parse tree produced by SqlParser.
class SqlParserListener(ParseTreeListener):

    # Enter a parse tree produced by SqlParser#sqlScript.
    def enterSqlScript(self, ctx:SqlParser.SqlScriptContext):
        pass

    # Exit a parse tree produced by SqlParser#sqlScript.
    def exitSqlScript(self, ctx:SqlParser.SqlScriptContext):
        pass


    # Enter a parse tree produced by SqlParser#sqlStatement.
    def enterSqlStatement(self, ctx:SqlParser.SqlStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#sqlStatement.
    def exitSqlStatement(self, ctx:SqlParser.SqlStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#useStatement.
    def enterUseStatement(self, ctx:SqlParser.UseStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#useStatement.
    def exitUseStatement(self, ctx:SqlParser.UseStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#cteStatement.
    def enterCteStatement(self, ctx:SqlParser.CteStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#cteStatement.
    def exitCteStatement(self, ctx:SqlParser.CteStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#commonTableExpression.
    def enterCommonTableExpression(self, ctx:SqlParser.CommonTableExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#commonTableExpression.
    def exitCommonTableExpression(self, ctx:SqlParser.CommonTableExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#cursorStatement.
    def enterCursorStatement(self, ctx:SqlParser.CursorStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#cursorStatement.
    def exitCursorStatement(self, ctx:SqlParser.CursorStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#declareCursor.
    def enterDeclareCursor(self, ctx:SqlParser.DeclareCursorContext):
        pass

    # Exit a parse tree produced by SqlParser#declareCursor.
    def exitDeclareCursor(self, ctx:SqlParser.DeclareCursorContext):
        pass


    # Enter a parse tree produced by SqlParser#openCursor.
    def enterOpenCursor(self, ctx:SqlParser.OpenCursorContext):
        pass

    # Exit a parse tree produced by SqlParser#openCursor.
    def exitOpenCursor(self, ctx:SqlParser.OpenCursorContext):
        pass


    # Enter a parse tree produced by SqlParser#fetchCursor.
    def enterFetchCursor(self, ctx:SqlParser.FetchCursorContext):
        pass

    # Exit a parse tree produced by SqlParser#fetchCursor.
    def exitFetchCursor(self, ctx:SqlParser.FetchCursorContext):
        pass


    # Enter a parse tree produced by SqlParser#closeCursor.
    def enterCloseCursor(self, ctx:SqlParser.CloseCursorContext):
        pass

    # Exit a parse tree produced by SqlParser#closeCursor.
    def exitCloseCursor(self, ctx:SqlParser.CloseCursorContext):
        pass


    # Enter a parse tree produced by SqlParser#deallocateCursor.
    def enterDeallocateCursor(self, ctx:SqlParser.DeallocateCursorContext):
        pass

    # Exit a parse tree produced by SqlParser#deallocateCursor.
    def exitDeallocateCursor(self, ctx:SqlParser.DeallocateCursorContext):
        pass


    # Enter a parse tree produced by SqlParser#ddlStatement.
    def enterDdlStatement(self, ctx:SqlParser.DdlStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#ddlStatement.
    def exitDdlStatement(self, ctx:SqlParser.DdlStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#createTableStatement.
    def enterCreateTableStatement(self, ctx:SqlParser.CreateTableStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#createTableStatement.
    def exitCreateTableStatement(self, ctx:SqlParser.CreateTableStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#tableElement.
    def enterTableElement(self, ctx:SqlParser.TableElementContext):
        pass

    # Exit a parse tree produced by SqlParser#tableElement.
    def exitTableElement(self, ctx:SqlParser.TableElementContext):
        pass


    # Enter a parse tree produced by SqlParser#columnDefinition.
    def enterColumnDefinition(self, ctx:SqlParser.ColumnDefinitionContext):
        pass

    # Exit a parse tree produced by SqlParser#columnDefinition.
    def exitColumnDefinition(self, ctx:SqlParser.ColumnDefinitionContext):
        pass


    # Enter a parse tree produced by SqlParser#columnConstraint.
    def enterColumnConstraint(self, ctx:SqlParser.ColumnConstraintContext):
        pass

    # Exit a parse tree produced by SqlParser#columnConstraint.
    def exitColumnConstraint(self, ctx:SqlParser.ColumnConstraintContext):
        pass


    # Enter a parse tree produced by SqlParser#tableConstraint.
    def enterTableConstraint(self, ctx:SqlParser.TableConstraintContext):
        pass

    # Exit a parse tree produced by SqlParser#tableConstraint.
    def exitTableConstraint(self, ctx:SqlParser.TableConstraintContext):
        pass


    # Enter a parse tree produced by SqlParser#constraintDefinition.
    def enterConstraintDefinition(self, ctx:SqlParser.ConstraintDefinitionContext):
        pass

    # Exit a parse tree produced by SqlParser#constraintDefinition.
    def exitConstraintDefinition(self, ctx:SqlParser.ConstraintDefinitionContext):
        pass


    # Enter a parse tree produced by SqlParser#alterTableStatement.
    def enterAlterTableStatement(self, ctx:SqlParser.AlterTableStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#alterTableStatement.
    def exitAlterTableStatement(self, ctx:SqlParser.AlterTableStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#alterTableAction.
    def enterAlterTableAction(self, ctx:SqlParser.AlterTableActionContext):
        pass

    # Exit a parse tree produced by SqlParser#alterTableAction.
    def exitAlterTableAction(self, ctx:SqlParser.AlterTableActionContext):
        pass


    # Enter a parse tree produced by SqlParser#dropStatement.
    def enterDropStatement(self, ctx:SqlParser.DropStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#dropStatement.
    def exitDropStatement(self, ctx:SqlParser.DropStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#truncateStatement.
    def enterTruncateStatement(self, ctx:SqlParser.TruncateStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#truncateStatement.
    def exitTruncateStatement(self, ctx:SqlParser.TruncateStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#dmlStatement.
    def enterDmlStatement(self, ctx:SqlParser.DmlStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#dmlStatement.
    def exitDmlStatement(self, ctx:SqlParser.DmlStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#selectStatement.
    def enterSelectStatement(self, ctx:SqlParser.SelectStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#selectStatement.
    def exitSelectStatement(self, ctx:SqlParser.SelectStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#querySpecification.
    def enterQuerySpecification(self, ctx:SqlParser.QuerySpecificationContext):
        pass

    # Exit a parse tree produced by SqlParser#querySpecification.
    def exitQuerySpecification(self, ctx:SqlParser.QuerySpecificationContext):
        pass


    # Enter a parse tree produced by SqlParser#selectList.
    def enterSelectList(self, ctx:SqlParser.SelectListContext):
        pass

    # Exit a parse tree produced by SqlParser#selectList.
    def exitSelectList(self, ctx:SqlParser.SelectListContext):
        pass


    # Enter a parse tree produced by SqlParser#selectItem.
    def enterSelectItem(self, ctx:SqlParser.SelectItemContext):
        pass

    # Exit a parse tree produced by SqlParser#selectItem.
    def exitSelectItem(self, ctx:SqlParser.SelectItemContext):
        pass


    # Enter a parse tree produced by SqlParser#tableSource.
    def enterTableSource(self, ctx:SqlParser.TableSourceContext):
        pass

    # Exit a parse tree produced by SqlParser#tableSource.
    def exitTableSource(self, ctx:SqlParser.TableSourceContext):
        pass


    # Enter a parse tree produced by SqlParser#joinClause.
    def enterJoinClause(self, ctx:SqlParser.JoinClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#joinClause.
    def exitJoinClause(self, ctx:SqlParser.JoinClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#whereClause.
    def enterWhereClause(self, ctx:SqlParser.WhereClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#whereClause.
    def exitWhereClause(self, ctx:SqlParser.WhereClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#groupByClause.
    def enterGroupByClause(self, ctx:SqlParser.GroupByClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#groupByClause.
    def exitGroupByClause(self, ctx:SqlParser.GroupByClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#havingClause.
    def enterHavingClause(self, ctx:SqlParser.HavingClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#havingClause.
    def exitHavingClause(self, ctx:SqlParser.HavingClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#orderByClause.
    def enterOrderByClause(self, ctx:SqlParser.OrderByClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#orderByClause.
    def exitOrderByClause(self, ctx:SqlParser.OrderByClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#orderByItem.
    def enterOrderByItem(self, ctx:SqlParser.OrderByItemContext):
        pass

    # Exit a parse tree produced by SqlParser#orderByItem.
    def exitOrderByItem(self, ctx:SqlParser.OrderByItemContext):
        pass


    # Enter a parse tree produced by SqlParser#limitClause.
    def enterLimitClause(self, ctx:SqlParser.LimitClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#limitClause.
    def exitLimitClause(self, ctx:SqlParser.LimitClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#offsetClause.
    def enterOffsetClause(self, ctx:SqlParser.OffsetClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#offsetClause.
    def exitOffsetClause(self, ctx:SqlParser.OffsetClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#insertStatement.
    def enterInsertStatement(self, ctx:SqlParser.InsertStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#insertStatement.
    def exitInsertStatement(self, ctx:SqlParser.InsertStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#valueList.
    def enterValueList(self, ctx:SqlParser.ValueListContext):
        pass

    # Exit a parse tree produced by SqlParser#valueList.
    def exitValueList(self, ctx:SqlParser.ValueListContext):
        pass


    # Enter a parse tree produced by SqlParser#valueGroup.
    def enterValueGroup(self, ctx:SqlParser.ValueGroupContext):
        pass

    # Exit a parse tree produced by SqlParser#valueGroup.
    def exitValueGroup(self, ctx:SqlParser.ValueGroupContext):
        pass


    # Enter a parse tree produced by SqlParser#updateStatement.
    def enterUpdateStatement(self, ctx:SqlParser.UpdateStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#updateStatement.
    def exitUpdateStatement(self, ctx:SqlParser.UpdateStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#setClause.
    def enterSetClause(self, ctx:SqlParser.SetClauseContext):
        pass

    # Exit a parse tree produced by SqlParser#setClause.
    def exitSetClause(self, ctx:SqlParser.SetClauseContext):
        pass


    # Enter a parse tree produced by SqlParser#deleteStatement.
    def enterDeleteStatement(self, ctx:SqlParser.DeleteStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#deleteStatement.
    def exitDeleteStatement(self, ctx:SqlParser.DeleteStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#controlFlowStatement.
    def enterControlFlowStatement(self, ctx:SqlParser.ControlFlowStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#controlFlowStatement.
    def exitControlFlowStatement(self, ctx:SqlParser.ControlFlowStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#ifStatement.
    def enterIfStatement(self, ctx:SqlParser.IfStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#ifStatement.
    def exitIfStatement(self, ctx:SqlParser.IfStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#whileStatement.
    def enterWhileStatement(self, ctx:SqlParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#whileStatement.
    def exitWhileStatement(self, ctx:SqlParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#beginEndBlock.
    def enterBeginEndBlock(self, ctx:SqlParser.BeginEndBlockContext):
        pass

    # Exit a parse tree produced by SqlParser#beginEndBlock.
    def exitBeginEndBlock(self, ctx:SqlParser.BeginEndBlockContext):
        pass


    # Enter a parse tree produced by SqlParser#tryCatchBlock.
    def enterTryCatchBlock(self, ctx:SqlParser.TryCatchBlockContext):
        pass

    # Exit a parse tree produced by SqlParser#tryCatchBlock.
    def exitTryCatchBlock(self, ctx:SqlParser.TryCatchBlockContext):
        pass


    # Enter a parse tree produced by SqlParser#printStatement.
    def enterPrintStatement(self, ctx:SqlParser.PrintStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#printStatement.
    def exitPrintStatement(self, ctx:SqlParser.PrintStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:SqlParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by SqlParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:SqlParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by SqlParser#variableAssignment.
    def enterVariableAssignment(self, ctx:SqlParser.VariableAssignmentContext):
        pass

    # Exit a parse tree produced by SqlParser#variableAssignment.
    def exitVariableAssignment(self, ctx:SqlParser.VariableAssignmentContext):
        pass


    # Enter a parse tree produced by SqlParser#execStatement.
    def enterExecStatement(self, ctx:SqlParser.ExecStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#execStatement.
    def exitExecStatement(self, ctx:SqlParser.ExecStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#goStatement.
    def enterGoStatement(self, ctx:SqlParser.GoStatementContext):
        pass

    # Exit a parse tree produced by SqlParser#goStatement.
    def exitGoStatement(self, ctx:SqlParser.GoStatementContext):
        pass


    # Enter a parse tree produced by SqlParser#expression.
    def enterExpression(self, ctx:SqlParser.ExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#expression.
    def exitExpression(self, ctx:SqlParser.ExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#logicalOrExpression.
    def enterLogicalOrExpression(self, ctx:SqlParser.LogicalOrExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#logicalOrExpression.
    def exitLogicalOrExpression(self, ctx:SqlParser.LogicalOrExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#logicalAndExpression.
    def enterLogicalAndExpression(self, ctx:SqlParser.LogicalAndExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#logicalAndExpression.
    def exitLogicalAndExpression(self, ctx:SqlParser.LogicalAndExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#existsExpression.
    def enterExistsExpression(self, ctx:SqlParser.ExistsExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#existsExpression.
    def exitExistsExpression(self, ctx:SqlParser.ExistsExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#comparisonExpression.
    def enterComparisonExpression(self, ctx:SqlParser.ComparisonExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#comparisonExpression.
    def exitComparisonExpression(self, ctx:SqlParser.ComparisonExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#comparisonOperator.
    def enterComparisonOperator(self, ctx:SqlParser.ComparisonOperatorContext):
        pass

    # Exit a parse tree produced by SqlParser#comparisonOperator.
    def exitComparisonOperator(self, ctx:SqlParser.ComparisonOperatorContext):
        pass


    # Enter a parse tree produced by SqlParser#castExpression.
    def enterCastExpression(self, ctx:SqlParser.CastExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#castExpression.
    def exitCastExpression(self, ctx:SqlParser.CastExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#additiveExpression.
    def enterAdditiveExpression(self, ctx:SqlParser.AdditiveExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#additiveExpression.
    def exitAdditiveExpression(self, ctx:SqlParser.AdditiveExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#multiplicativeExpression.
    def enterMultiplicativeExpression(self, ctx:SqlParser.MultiplicativeExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#multiplicativeExpression.
    def exitMultiplicativeExpression(self, ctx:SqlParser.MultiplicativeExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#unaryExpression.
    def enterUnaryExpression(self, ctx:SqlParser.UnaryExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#unaryExpression.
    def exitUnaryExpression(self, ctx:SqlParser.UnaryExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:SqlParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:SqlParser.PrimaryExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#caseExpression.
    def enterCaseExpression(self, ctx:SqlParser.CaseExpressionContext):
        pass

    # Exit a parse tree produced by SqlParser#caseExpression.
    def exitCaseExpression(self, ctx:SqlParser.CaseExpressionContext):
        pass


    # Enter a parse tree produced by SqlParser#functionCall.
    def enterFunctionCall(self, ctx:SqlParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by SqlParser#functionCall.
    def exitFunctionCall(self, ctx:SqlParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by SqlParser#functionName.
    def enterFunctionName(self, ctx:SqlParser.FunctionNameContext):
        pass

    # Exit a parse tree produced by SqlParser#functionName.
    def exitFunctionName(self, ctx:SqlParser.FunctionNameContext):
        pass


    # Enter a parse tree produced by SqlParser#expressionList.
    def enterExpressionList(self, ctx:SqlParser.ExpressionListContext):
        pass

    # Exit a parse tree produced by SqlParser#expressionList.
    def exitExpressionList(self, ctx:SqlParser.ExpressionListContext):
        pass


    # Enter a parse tree produced by SqlParser#dataType.
    def enterDataType(self, ctx:SqlParser.DataTypeContext):
        pass

    # Exit a parse tree produced by SqlParser#dataType.
    def exitDataType(self, ctx:SqlParser.DataTypeContext):
        pass


    # Enter a parse tree produced by SqlParser#literal.
    def enterLiteral(self, ctx:SqlParser.LiteralContext):
        pass

    # Exit a parse tree produced by SqlParser#literal.
    def exitLiteral(self, ctx:SqlParser.LiteralContext):
        pass


    # Enter a parse tree produced by SqlParser#tableName.
    def enterTableName(self, ctx:SqlParser.TableNameContext):
        pass

    # Exit a parse tree produced by SqlParser#tableName.
    def exitTableName(self, ctx:SqlParser.TableNameContext):
        pass


    # Enter a parse tree produced by SqlParser#columnName.
    def enterColumnName(self, ctx:SqlParser.ColumnNameContext):
        pass

    # Exit a parse tree produced by SqlParser#columnName.
    def exitColumnName(self, ctx:SqlParser.ColumnNameContext):
        pass


    # Enter a parse tree produced by SqlParser#columnNameList.
    def enterColumnNameList(self, ctx:SqlParser.ColumnNameListContext):
        pass

    # Exit a parse tree produced by SqlParser#columnNameList.
    def exitColumnNameList(self, ctx:SqlParser.ColumnNameListContext):
        pass


    # Enter a parse tree produced by SqlParser#columnReference.
    def enterColumnReference(self, ctx:SqlParser.ColumnReferenceContext):
        pass

    # Exit a parse tree produced by SqlParser#columnReference.
    def exitColumnReference(self, ctx:SqlParser.ColumnReferenceContext):
        pass


    # Enter a parse tree produced by SqlParser#tableAlias.
    def enterTableAlias(self, ctx:SqlParser.TableAliasContext):
        pass

    # Exit a parse tree produced by SqlParser#tableAlias.
    def exitTableAlias(self, ctx:SqlParser.TableAliasContext):
        pass


    # Enter a parse tree produced by SqlParser#columnAlias.
    def enterColumnAlias(self, ctx:SqlParser.ColumnAliasContext):
        pass

    # Exit a parse tree produced by SqlParser#columnAlias.
    def exitColumnAlias(self, ctx:SqlParser.ColumnAliasContext):
        pass


    # Enter a parse tree produced by SqlParser#identifier.
    def enterIdentifier(self, ctx:SqlParser.IdentifierContext):
        pass

    # Exit a parse tree produced by SqlParser#identifier.
    def exitIdentifier(self, ctx:SqlParser.IdentifierContext):
        pass


    # Enter a parse tree produced by SqlParser#variableName.
    def enterVariableName(self, ctx:SqlParser.VariableNameContext):
        pass

    # Exit a parse tree produced by SqlParser#variableName.
    def exitVariableName(self, ctx:SqlParser.VariableNameContext):
        pass



del SqlParser