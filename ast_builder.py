from SqlParserVisitor import SqlParserVisitor
from ast_nodes import *

class ASTBuilderVisitor(SqlParserVisitor):
    """AST Builder Visitor that extends SqlParserVisitor to construct AST nodes."""

    # =========================================================================
    # ROOT AND SCRIPT
    # =========================================================================

    def visitSqlScript(self, ctx):
        """Visit sqlScript - root of the parse tree."""
        node = SqlScriptNode()
        for stmt_ctx in ctx.sqlStatement():  # Returns list of SqlStatementContext
            stmt_node = self.visit(stmt_ctx)
            if stmt_node:
                node.add_child(stmt_node)
        return node

    # =========================================================================
    # STATEMENTS
    # =========================================================================

    def visitSqlStatement(self, ctx):
        """Visit sqlStatement - dispatch to specific statement types."""
        if ctx.ddlStatement():
            return self.visit(ctx.ddlStatement())
        elif ctx.dmlStatement():
            return self.visit(ctx.dmlStatement())
        elif ctx.cteStatement():
            return self.visit(ctx.cteStatement())
        elif ctx.cursorStatement():
            return self.visit(ctx.cursorStatement())
        elif ctx.controlFlowStatement():
            return self.visit(ctx.controlFlowStatement())
        elif ctx.variableDeclaration():
            return self.visit(ctx.variableDeclaration())
        elif ctx.variableAssignment():
            return self.visit(ctx.variableAssignment())
        elif ctx.execStatement():
            return self.visit(ctx.execStatement())
        elif ctx.goStatement():
            return self.visit(ctx.goStatement())
        elif ctx.printStatement():
            return self.visit(ctx.printStatement())
        elif ctx.useStatement():
            return self.visit(ctx.useStatement())
        return None

    def visitUseStatement(self, ctx):
        """Visit useStatement."""
        node = UseStatementNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        return node

    # =========================================================================
    # CTE (Common Table Expression)
    # =========================================================================

    def visitCteStatement(self, ctx):
        """Visit cteStatement."""
        node = CteStatementNode()
        for cte in ctx.commonTableExpression():
            cte_node = self.visit(cte)
            node.add_child(cte_node)
        # Add the main statement (SELECT, INSERT, etc.)
        if ctx.selectStatement():
            main_node = self.visit(ctx.selectStatement())
            node.add_child(main_node)
        elif ctx.insertStatement():
            main_node = self.visit(ctx.insertStatement())
            node.add_child(main_node)
        elif ctx.updateStatement():
            main_node = self.visit(ctx.updateStatement())
            node.add_child(main_node)
        elif ctx.deleteStatement():
            main_node = self.visit(ctx.deleteStatement())
            node.add_child(main_node)
        return node

    def visitCommonTableExpression(self, ctx):
        """Visit commonTableExpression."""
        node = CommonTableExpressionNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        # Column name list (optional)
        if ctx.columnNameList():
            col_list_node = self.visit(ctx.columnNameList())
            node.add_child(col_list_node)
        # AS SELECT statement
        if ctx.selectStatement():
            select_node = self.visit(ctx.selectStatement())
            node.add_child(select_node)
        return node

    # =========================================================================
    # CURSOR STATEMENTS
    # =========================================================================

    def visitCursorStatement(self, ctx):
        """Visit cursorStatement - dispatch to specific cursor operations."""
        if ctx.declareCursor():
            return self.visit(ctx.declareCursor())
        elif ctx.openCursor():
            return self.visit(ctx.openCursor())
        elif ctx.fetchCursor():
            return self.visit(ctx.fetchCursor())
        elif ctx.closeCursor():
            return self.visit(ctx.closeCursor())
        elif ctx.deallocateCursor():
            return self.visit(ctx.deallocateCursor())
        return None

    def visitDeclareCursor(self, ctx):
        """Visit declareCursor."""
        node = DeclareCursorNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        if ctx.selectStatement():
            select_node = self.visit(ctx.selectStatement())
            node.add_child(select_node)
        return node

    def visitOpenCursor(self, ctx):
        """Visit openCursor."""
        node = OpenCursorNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        return node

    def visitFetchCursor(self, ctx):
        """Visit fetchCursor."""
        node = FetchCursorNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        # Variable list
        for var in ctx.variableName():
            var_node = self.visit(var)
            node.add_child(var_node)
        for global_var in ctx.GLOBAL_VARIABLE():
            var_node = GlobalVariableNode(global_var.getText())
            node.add_child(var_node)
        return node

    def visitCloseCursor(self, ctx):
        """Visit closeCursor."""
        node = CloseCursorNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        return node

    def visitDeallocateCursor(self, ctx):
        """Visit deallocateCursor."""
        node = DeallocateCursorNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        return node

    # =========================================================================
    # DDL STATEMENTS
    # =========================================================================

    def visitDdlStatement(self, ctx):
        """Visit ddlStatement - dispatch to specific DDL operations."""
        if ctx.createTableStatement():
            return self.visit(ctx.createTableStatement())
        elif ctx.alterTableStatement():
            return self.visit(ctx.alterTableStatement())
        elif ctx.dropStatement():
            return self.visit(ctx.dropStatement())
        elif ctx.truncateStatement():
            return self.visit(ctx.truncateStatement())
        return None

    def visitCreateTableStatement(self, ctx):
        """Visit createTableStatement."""
        node = CreateTableNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        # Table elements (columns and constraints)
        for elem in ctx.tableElement():
            elem_node = self.visit(elem)
            node.add_child(elem_node)
        return node

    def visitTableElement(self, ctx):
        """Visit tableElement."""
        if ctx.columnDefinition():
            return self.visit(ctx.columnDefinition())
        elif ctx.tableConstraint():
            return self.visit(ctx.tableConstraint())
        return None

    def visitColumnDefinition(self, ctx):
        """Visit columnDefinition."""
        node = ColumnDefinitionNode()
        if ctx.columnName():
            col_name_node = self.visit(ctx.columnName())
            node.add_child(col_name_node)
        if ctx.dataType():
            data_type_node = self.visit(ctx.dataType())
            node.add_child(data_type_node)
        # Column constraints
        for constraint in ctx.columnConstraint():
            constraint_node = self.visit(constraint)
            node.add_child(constraint_node)
        return node

    def visitColumnConstraint(self, ctx):
        """Visit columnConstraint."""
        constraint_type = ""
        if ctx.NOT() and ctx.NULL():
            constraint_type = "NOT NULL"
        elif ctx.NULL():
            constraint_type = "NULL"
        elif ctx.PRIMARY() and ctx.KEY():
            constraint_type = "PRIMARY KEY"
            # Check for CLUSTERED/NONCLUSTERED option
            clustered_option = ""
            if ctx.CLUSTERED():
                clustered_option = "CLUSTERED"
            elif ctx.NONCLUSTERED():
                clustered_option = "NONCLUSTERED"
        elif ctx.UNIQUE():
            constraint_type = "UNIQUE"
        elif ctx.IDENTITY():
            constraint_type = "IDENTITY"
        elif ctx.DEFAULT():
            constraint_type = "DEFAULT"
        elif ctx.CHECK():
            constraint_type = "CHECK"
        elif ctx.AUTO_INCREMENT():
            constraint_type = "AUTO_INCREMENT"
        elif ctx.FOREIGN() and ctx.KEY():
            constraint_type = "FOREIGN KEY"

        clustered_option = locals().get('clustered_option', "")
        node = ColumnConstraintNode(constraint_type, clustered_option)
        # Add expression for DEFAULT and CHECK constraints
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        # Add foreign key references
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        if ctx.columnName():
            col_node = self.visit(ctx.columnName())
            node.add_child(col_node)
        return node

    def visitTableConstraint(self, ctx):
        """Visit tableConstraint."""
        node = TableConstraintNode()
        if ctx.constraintDefinition():
            constraint_node = self.visit(ctx.constraintDefinition())
            node.add_child(constraint_node)
        return node

    def visitConstraintDefinition(self, ctx):
        """Visit constraintDefinition."""
        constraint_type = ""
        if ctx.PRIMARY() and ctx.KEY():
            constraint_type = "PRIMARY KEY"
            # Check for CLUSTERED/NONCLUSTERED option
            clustered_option = ""
            if ctx.CLUSTERED():
                clustered_option = "CLUSTERED"
            elif ctx.NONCLUSTERED():
                clustered_option = "NONCLUSTERED"
        elif ctx.UNIQUE():
            constraint_type = "UNIQUE"
        elif ctx.CHECK():
            constraint_type = "CHECK"
        elif ctx.FOREIGN() and ctx.KEY():
            constraint_type = "FOREIGN KEY"

        clustered_option = locals().get('clustered_option', "")
        node = ConstraintDefinitionNode(constraint_type, clustered_option)
        # Column name list for PRIMARY KEY, UNIQUE, and FOREIGN KEY
        col_lists = ctx.columnNameList()
        if col_lists:
            # First column list (for PRIMARY KEY, UNIQUE, or FOREIGN KEY source)
            col_list_node = self.visit(col_lists[0])
            node.add_child(col_list_node)

        # Expression for CHECK
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)

        # Foreign key references (table name and second column list)
        if ctx.REFERENCES():
            if ctx.tableName():
                table_node = self.visit(ctx.tableName())
                node.add_child(table_node)
            if len(col_lists) > 1:
                # Second column list for foreign key target columns
                col_list_node = self.visit(col_lists[1])
                node.add_child(col_list_node)
        return node

    def visitAlterTableStatement(self, ctx):
        """Visit alterTableStatement."""
        node = AlterTableNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        if ctx.alterTableAction():
            action_node = self.visit(ctx.alterTableAction())
            node.add_child(action_node)
        return node

    def visitAlterTableAction(self, ctx):
        """Visit alterTableAction."""
        action_type = ""
        if ctx.ADD() and ctx.columnDefinition():
            action_type = "ADD COLUMN"
        elif ctx.ADD() and ctx.CONSTRAINT():
            action_type = "ADD CONSTRAINT"
        elif ctx.DROP() and ctx.COLUMN():
            action_type = "DROP COLUMN"
        elif ctx.DROP() and ctx.CONSTRAINT():
            action_type = "DROP CONSTRAINT"

        node = AlterTableActionNode(action_type)
        if ctx.columnDefinition():
            col_def_node = self.visit(ctx.columnDefinition())
            node.add_child(col_def_node)
        elif ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        elif ctx.columnName():
            col_name_node = self.visit(ctx.columnName())
            node.add_child(col_name_node)
        return node

    def visitDropStatement(self, ctx):
        """Visit dropStatement."""
        node = DropStatementNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        return node

    def visitTruncateStatement(self, ctx):
        """Visit truncateStatement."""
        node = TruncateStatementNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        return node

    # =========================================================================
    # DML STATEMENTS
    # =========================================================================

    def visitDmlStatement(self, ctx):
        """Visit dmlStatement - dispatch to specific DML operations."""
        if ctx.selectStatement():
            return self.visit(ctx.selectStatement())
        elif ctx.insertStatement():
            return self.visit(ctx.insertStatement())
        elif ctx.updateStatement():
            return self.visit(ctx.updateStatement())
        elif ctx.deleteStatement():
            return self.visit(ctx.deleteStatement())
        return None

    def visitSelectStatement(self, ctx):
        """Visit selectStatement."""
        node = SelectStatementNode()
        # Handle all query specifications (including UNIONs)
        for query_spec in ctx.querySpecification():
            query_node = self.visit(query_spec)
            node.add_child(query_node)
        return node

    def visitQuerySpecification(self, ctx):
        """Visit querySpecification."""
        node = SelectStatementNode()  # Use SelectStatementNode for query spec too
        if ctx.selectList():
            select_list_node = self.visit(ctx.selectList())
            node.add_child(select_list_node)
        if ctx.tableSource():
            from_node = FromNode()
            table_source_node = self.visit(ctx.tableSource())
            from_node.add_child(table_source_node)
            node.add_child(from_node)
        if ctx.whereClause():
            where_node = self.visit(ctx.whereClause())
            node.add_child(where_node)
        if ctx.groupByClause():
            group_node = self.visit(ctx.groupByClause())
            node.add_child(group_node)
        if ctx.havingClause():
            having_node = self.visit(ctx.havingClause())
            node.add_child(having_node)
        if ctx.orderByClause():
            order_node = self.visit(ctx.orderByClause())
            node.add_child(order_node)
        if ctx.limitClause():
            limit_node = self.visit(ctx.limitClause())
            node.add_child(limit_node)
        if ctx.offsetClause():
            offset_node = self.visit(ctx.offsetClause())
            node.add_child(offset_node)
        return node

    def visitSelectList(self, ctx):
        """Visit selectList."""
        node = SelectListNode()
        for item in ctx.selectItem():
            item_node = self.visit(item)
            node.add_child(item_node)
        return node

    def visitSelectItem(self, ctx):
        """Visit selectItem."""
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            if ctx.columnAlias():
                alias_node = self.visit(ctx.columnAlias())
                expr_node.add_child(alias_node)
            return expr_node
        elif ctx.MULTIPLY():
            return IdentifierNode("*")
        elif ctx.NUMBER():
            return NumericLiteralNode(ctx.NUMBER().getText())
        return None

    def visitTableSource(self, ctx):
        """Visit tableSource."""
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            if ctx.tableAlias():
                alias_node = self.visit(ctx.tableAlias())
                table_node.add_child(alias_node)
            return table_node
        elif ctx.selectStatement():
            return self.visit(ctx.selectStatement())
        elif ctx.tableSource() and ctx.joinClause():
            # Handle joins
            left_table = self.visit(ctx.tableSource())
            join_node = self.visit(ctx.joinClause())
            join_node.add_child(left_table)
            return join_node
        return None

    def visitJoinClause(self, ctx):
        """Visit joinClause."""
        join_type = ""
        if ctx.INNER():
            join_type = "INNER"
        elif ctx.LEFT():
            join_type = "LEFT"
        elif ctx.RIGHT():
            join_type = "RIGHT"
        elif ctx.FULL():
            join_type = "FULL"
        elif ctx.CROSS():
            join_type = "CROSS"

        node = JoinNode(join_type)
        if ctx.tableSource():
            right_table = self.visit(ctx.tableSource())
            node.add_child(right_table)
        if ctx.expression():
            condition_node = self.visit(ctx.expression())
            node.add_child(condition_node)
        return node

    def visitWhereClause(self, ctx):
        """Visit whereClause."""
        node = WhereNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitGroupByClause(self, ctx):
        """Visit groupByClause."""
        node = GroupByNode()
        for expr in ctx.expression():
            expr_node = self.visit(expr)
            node.add_child(expr_node)
        return node

    def visitHavingClause(self, ctx):
        """Visit havingClause."""
        node = HavingNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitOrderByClause(self, ctx):
        """Visit orderByClause."""
        node = OrderByNode()
        for item in ctx.orderByItem():
            item_node = self.visit(item)
            node.add_child(item_node)
        return node

    def visitOrderByItem(self, ctx):
        """Visit orderByItem."""
        expr_node = self.visit(ctx.expression())
        if ctx.ASC() or ctx.DESC():
            # Could add ordering info to the expression node
            pass
        return expr_node

    def visitLimitClause(self, ctx):
        """Visit limitClause."""
        node = LimitNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitOffsetClause(self, ctx):
        """Visit offsetClause."""
        node = OffsetNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitInsertStatement(self, ctx):
        """Visit insertStatement."""
        node = InsertStatementNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        if ctx.columnNameList():
            col_list_node = self.visit(ctx.columnNameList())
            node.add_child(col_list_node)
        if ctx.valueList():
            values_node = self.visit(ctx.valueList())
            node.add_child(values_node)
        elif ctx.selectStatement():
            select_node = self.visit(ctx.selectStatement())
            node.add_child(select_node)
        return node

    def visitValueList(self, ctx):
        """Visit valueList."""
        node = ValueListNode()
        for group in ctx.valueGroup():
            group_node = self.visit(group)
            node.add_child(group_node)
        return node

    def visitValueGroup(self, ctx):
        """Visit valueGroup."""
        node = ValuesNode()
        for expr in ctx.expression():
            expr_node = self.visit(expr)
            node.add_child(expr_node)
        return node

    def visitUpdateStatement(self, ctx):
        """Visit updateStatement."""
        node = UpdateStatementNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        if ctx.setClause():
            set_node = SetNode()
            for set_clause in ctx.setClause():
                set_clause_node = self.visit(set_clause)
                set_node.add_child(set_clause_node)
            node.add_child(set_node)
        if ctx.whereClause():
            where_node = self.visit(ctx.whereClause())
            node.add_child(where_node)
        return node

    def visitSetClause(self, ctx):
        """Visit setClause."""
        node = AssignmentNode()
        if ctx.columnName():
            col_node = self.visit(ctx.columnName())
            node.add_child(col_node)
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitDeleteStatement(self, ctx):
        """Visit deleteStatement."""
        node = DeleteStatementNode()
        if ctx.tableName():
            table_node = self.visit(ctx.tableName())
            node.add_child(table_node)
        if ctx.whereClause():
            where_node = self.visit(ctx.whereClause())
            node.add_child(where_node)
        return node

    # =========================================================================
    # CONTROL FLOW STATEMENTS
    # =========================================================================

    def visitControlFlowStatement(self, ctx):
        """Visit controlFlowStatement - dispatch to specific control flow."""
        if ctx.ifStatement():
            return self.visit(ctx.ifStatement())
        elif ctx.whileStatement():
            return self.visit(ctx.whileStatement())
        elif ctx.beginEndBlock():
            return self.visit(ctx.beginEndBlock())
        elif ctx.tryCatchBlock():
            return self.visit(ctx.tryCatchBlock())
        return None

    def visitIfStatement(self, ctx):
        """Visit ifStatement."""
        node = IfStatementNode()
        # Condition
        condition_node = ConditionNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            condition_node.add_child(expr_node)
        elif ctx.EXISTS() and ctx.selectStatement():
            negated = ctx.NOT() is not None
            exists_node = ExistsNode(negated)
            select_node = self.visit(ctx.selectStatement())
            exists_node.add_child(select_node)
            condition_node.add_child(exists_node)
        node.add_child(condition_node)

        # Then block
        sql_stmts = ctx.sqlStatement()
        begin_end_blocks = ctx.beginEndBlock()
        if sql_stmts:
            # Visit the first sqlStatement (should be in THEN block)
            then_node = self.visit(sql_stmts[0])
            node.add_child(then_node)
        elif begin_end_blocks:
            # Visit the first beginEndBlock (should be in THEN block)
            then_node = self.visit(begin_end_blocks[0])
            node.add_child(then_node)

        # Else block (optional)
        if ctx.ELSE():
            if len(sql_stmts) > 1:
                # Second sqlStatement should be in ELSE block
                else_node = ElseNode()
                else_stmt = self.visit(sql_stmts[1])
                else_node.add_child(else_stmt)
                node.add_child(else_node)
            elif len(begin_end_blocks) > 1:
                # Second beginEndBlock should be in ELSE block
                else_node = ElseNode()
                else_block = self.visit(begin_end_blocks[1])
                else_node.add_child(else_block)
                node.add_child(else_node)

        return node

    def visitWhileStatement(self, ctx):
        """Visit whileStatement."""
        node = WhileStatementNode()
        # Condition
        condition_node = ConditionNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            condition_node.add_child(expr_node)
        node.add_child(condition_node)

        # Body
        if ctx.sqlStatement():
            body_node = self.visit(ctx.sqlStatement())
            node.add_child(body_node)
        elif ctx.beginEndBlock():
            body_node = self.visit(ctx.beginEndBlock())
            node.add_child(body_node)

        return node

    def visitBeginEndBlock(self, ctx):
        """Visit beginEndBlock."""
        node = BeginEndBlockNode()
        for stmt in ctx.sqlStatement():
            stmt_node = self.visit(stmt)
            if stmt_node:
                node.add_child(stmt_node)
        return node

    def visitTryCatchBlock(self, ctx):
        """Visit tryCatchBlock."""
        node = TryCatchNode()
        # For simplicity, treat all sqlStatement as part of try block
        # In a more complete implementation, we'd need to track BEGIN TRY/END TRY boundaries
        try_node = TryNode()
        for stmt in ctx.sqlStatement():
            stmt_node = self.visit(stmt)
            if stmt_node:
                try_node.add_child(stmt_node)
        node.add_child(try_node)

        # Empty catch block for now
        catch_node = CatchNode()
        node.add_child(catch_node)

        return node

    def visitPrintStatement(self, ctx):
        """Visit printStatement."""
        node = PrintStatementNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    # =========================================================================
    # VARIABLES
    # =========================================================================

    def visitVariableDeclaration(self, ctx):
        """Visit variableDeclaration."""
        node = VariableDeclarationNode()
        if ctx.variableName():
            var_node = self.visit(ctx.variableName())
            node.add_child(var_node)
        elif ctx.GLOBAL_VARIABLE():
            var_node = GlobalVariableNode(ctx.GLOBAL_VARIABLE().getText())
            node.add_child(var_node)
        if ctx.dataType():
            data_type_node = self.visit(ctx.dataType())
            node.add_child(data_type_node)
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    def visitVariableAssignment(self, ctx):
        """Visit variableAssignment."""
        node = VariableAssignmentNode()
        if ctx.variableName():
            var_node = self.visit(ctx.variableName())
            node.add_child(var_node)
        elif ctx.GLOBAL_VARIABLE():
            var_node = GlobalVariableNode(ctx.GLOBAL_VARIABLE().getText())
            node.add_child(var_node)
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        return node

    # =========================================================================
    # EXEC / GO
    # =========================================================================

    def visitExecStatement(self, ctx):
        """Visit execStatement."""
        node = ExecStatementNode()
        if ctx.identifier():
            ident_node = self.visit(ctx.identifier())
            node.add_child(ident_node)
        for expr in ctx.expression():
            expr_node = self.visit(expr)
            node.add_child(expr_node)
        return node

    def visitGoStatement(self, ctx):
        """Visit goStatement."""
        return GoStatementNode()

    # =========================================================================
    # EXPRESSIONS
    # =========================================================================

    def visitExpression(self, ctx):
        """Visit expression."""
        return self.visit(ctx.logicalOrExpression())

    def visitLogicalOrExpression(self, ctx):
        """Visit logicalOrExpression."""
        exprs = ctx.logicalAndExpression()
        if len(exprs) > 1:
            node = LogicalOrNode()
            for expr in exprs:
                expr_node = self.visit(expr)
                node.add_child(expr_node)
            return node
        else:
            return self.visit(exprs[0])

    def visitLogicalAndExpression(self, ctx):
        """Visit logicalAndExpression."""
        comparison_exprs = ctx.comparisonExpression()
        exists_exprs = ctx.existsExpression()
        all_exprs = comparison_exprs + exists_exprs

        if len(all_exprs) > 1:
            node = LogicalAndNode()
            for expr in all_exprs:
                expr_node = self.visit(expr)
                node.add_child(expr_node)
            return node
        else:
            return self.visit(all_exprs[0])

    def visitExistsExpression(self, ctx):
        """Visit existsExpression."""
        negated = ctx.NOT() is not None
        node = ExistsNode(negated)
        if ctx.selectStatement():
            select_node = self.visit(ctx.selectStatement())
            node.add_child(select_node)
        return node

    def visitComparisonExpression(self, ctx):
        """Visit comparisonExpression."""
        if ctx.comparisonOperator():
            op = ctx.comparisonOperator().getText()
            node = ComparisonNode(op)
            additive_exprs = ctx.additiveExpression()
            node.add_child(self.visit(additive_exprs[0]))
            node.add_child(self.visit(additive_exprs[1]))
            return node
        elif ctx.IN():
            node = InNode()
            additive_exprs = ctx.additiveExpression()
            node.add_child(self.visit(additive_exprs[0]))
            # Handle expression list or select statement
            if ctx.expressionList():
                expr_list_node = self.visit(ctx.expressionList())
                node.add_child(expr_list_node)
            elif ctx.selectStatement():
                select_node = self.visit(ctx.selectStatement())
                node.add_child(select_node)
            return node
        elif ctx.BETWEEN():
            node = BetweenNode()
            additive_exprs = ctx.additiveExpression()
            node.add_child(self.visit(additive_exprs[0]))
            node.add_child(self.visit(additive_exprs[1]))
            node.add_child(self.visit(additive_exprs[2]))
            return node
        elif ctx.LIKE():
            node = LikeNode()
            additive_exprs = ctx.additiveExpression()
            node.add_child(self.visit(additive_exprs[0]))
            node.add_child(self.visit(additive_exprs[1]))
            return node
        elif ctx.IS():
            node = IsNullNode()
            additive_exprs = ctx.additiveExpression()
            node.add_child(self.visit(additive_exprs[0]))
            return node
        else:
            additive_exprs = ctx.additiveExpression()
            return self.visit(additive_exprs[0])

    def visitComparisonOperator(self, ctx):
        """Visit comparisonOperator."""
        return ctx.getText()

    def visitCastExpression(self, ctx):
        """Visit castExpression."""
        node = CastExpressionNode()
        if ctx.expression():
            expr_node = self.visit(ctx.expression())
            node.add_child(expr_node)
        if ctx.dataType():
            data_type_node = self.visit(ctx.dataType())
            node.add_child(data_type_node)
        return node

    def visitAdditiveExpression(self, ctx):
        """Visit additiveExpression."""
        exprs = ctx.multiplicativeExpression()
        if len(exprs) > 1:
            # Find the operator (simplified - assumes all operators are the same)
            op = "+"
            if ctx.MINUS():
                op = "-"
            elif ctx.CONCAT():
                op = "||"

            node = AdditiveExpressionNode(op)
            for expr in exprs:
                expr_node = self.visit(expr)
                node.add_child(expr_node)
            return node
        else:
            return self.visit(exprs[0])

    def visitMultiplicativeExpression(self, ctx):
        """Visit multiplicativeExpression."""
        exprs = ctx.unaryExpression()
        if len(exprs) > 1:
            # Find the operator (simplified)
            op = "*"
            if ctx.DIVIDE():
                op = "/"
            elif ctx.MODULO():
                op = "%"

            node = MultiplicativeExpressionNode(op)
            for expr in exprs:
                expr_node = self.visit(expr)
                node.add_child(expr_node)
            return node
        else:
            return self.visit(exprs[0])

    def visitUnaryExpression(self, ctx):
        """Visit unaryExpression."""
        if ctx.PLUS() or ctx.MINUS() or ctx.NOT():
            op = ctx.PLUS().getText() if ctx.PLUS() else (ctx.MINUS().getText() if ctx.MINUS() else ctx.NOT().getText())
            node = UnaryExpressionNode(op)
            node.add_child(self.visit(ctx.primaryExpression()))
            return node
        else:
            return self.visit(ctx.primaryExpression())

    def visitPrimaryExpression(self, ctx):
        """Visit primaryExpression."""
        if ctx.literal():
            return self.visit(ctx.literal())
        elif ctx.columnReference():
            return self.visit(ctx.columnReference())
        elif ctx.variableName():
            return self.visit(ctx.variableName())
        elif ctx.GLOBAL_VARIABLE():
            return GlobalVariableNode(ctx.GLOBAL_VARIABLE().getText())
        elif ctx.functionCall():
            return self.visit(ctx.functionCall())
        elif ctx.caseExpression():
            return self.visit(ctx.caseExpression())
        elif ctx.castExpression():
            return self.visit(ctx.castExpression())
        elif ctx.expression():
            return self.visit(ctx.expression())
        elif ctx.selectStatement():
            return self.visit(ctx.selectStatement())
        return None

    def visitCaseExpression(self, ctx):
        """Visit caseExpression."""
        node = CaseExpressionNode()
        exprs = ctx.expression()
        # CASE expression WHEN expr THEN expr [WHEN expr THEN expr]* [ELSE expr] END
        # Skip the first expression (it's the CASE value), process WHEN/THEN pairs
        for i in range(1, len(exprs)):
            expr_node = self.visit(exprs[i])
            node.add_child(expr_node)
        return node

    def visitFunctionCall(self, ctx):
        """Visit functionCall."""
        node = FunctionCallNode()
        if ctx.functionName():
            func_name_node = self.visit(ctx.functionName())
            node.add_child(func_name_node)
        if ctx.expressionList():
            expr_list_node = self.visit(ctx.expressionList())
            node.add_child(expr_list_node)
        return node

    def visitFunctionName(self, ctx):
        """Visit functionName."""
        if ctx.identifier():
            return self.visit(ctx.identifier())
        elif ctx.COUNT() or ctx.SUM() or ctx.AVG() or ctx.MIN() or ctx.MAX():
            func_name = ctx.COUNT().getText() if ctx.COUNT() else \
                       (ctx.SUM().getText() if ctx.SUM() else \
                       (ctx.AVG().getText() if ctx.AVG() else \
                       (ctx.MIN().getText() if ctx.MIN() else ctx.MAX().getText())))
            return FunctionNameNode(func_name)
        elif ctx.COALESCE() or ctx.NULLIF() or ctx.CONVERT():
            func_name = ctx.COALESCE().getText() if ctx.COALESCE() else \
                       (ctx.NULLIF().getText() if ctx.NULLIF() else ctx.CONVERT().getText())
            return FunctionNameNode(func_name)
        return None

    def visitExpressionList(self, ctx):
        """Visit expressionList."""
        node = ValueListNode()  # Reuse ValueListNode for expression lists
        for expr in ctx.expression():
            expr_node = self.visit(expr)
            node.add_child(expr_node)
        return node

    # =========================================================================
    # DATA TYPES
    # =========================================================================

    def visitDataType(self, ctx):
        """Visit dataType."""
        type_name = ""
        if ctx.INT() or ctx.INTEGER():
            type_name = "INT"
        elif ctx.SMALLINT():
            type_name = "SMALLINT"
        elif ctx.BIGINT():
            type_name = "BIGINT"
        elif ctx.DECIMAL():
            type_name = "DECIMAL"
        elif ctx.NUMERIC():
            type_name = "NUMERIC"
        elif ctx.FLOAT():
            type_name = "FLOAT"
        elif ctx.REAL():
            type_name = "REAL"
        elif ctx.DOUBLE():
            type_name = "DOUBLE"
        elif ctx.CHAR():
            type_name = "CHAR"
        elif ctx.VARCHAR():
            type_name = "VARCHAR"
        elif ctx.NVARCHAR():
            type_name = "NVARCHAR"
        elif ctx.TEXT():
            type_name = "TEXT"
        elif ctx.DATE():
            type_name = "DATE"
        elif ctx.TIME():
            type_name = "TIME"
        elif ctx.TIMESTAMP():
            type_name = "TIMESTAMP"
        elif ctx.BOOLEAN():
            type_name = "BOOLEAN"
        elif ctx.identifier():
            type_name = ctx.identifier().getText()

        return DataTypeNode(type_name)

    # =========================================================================
    # LITERALS
    # =========================================================================

    def visitLiteral(self, ctx):
        """Visit literal."""
        if ctx.STRING():
            return StringLiteralNode(ctx.STRING().getText().strip("'"))
        elif ctx.NSTRING():
            return StringLiteralNode(ctx.NSTRING().getText().strip("N'").strip("'"))
        elif ctx.NUMBER():
            return NumericLiteralNode(ctx.NUMBER().getText())
        elif ctx.DATE_LITERAL():
            return DateLiteralNode(ctx.DATE_LITERAL().getText().strip("'"))
        elif ctx.TRUE():
            return BooleanLiteralNode(True)
        elif ctx.FALSE():
            return BooleanLiteralNode(False)
        elif ctx.NULL():
            return NullLiteralNode()
        elif ctx.HEX_STRING():
            return HexLiteralNode(ctx.HEX_STRING().getText())
        elif ctx.BIT_STRING():
            return BitLiteralNode(ctx.BIT_STRING().getText())
        elif ctx.GLOBAL_VARIABLE():
            return GlobalVariableNode(ctx.GLOBAL_VARIABLE().getText())
        return None

    # =========================================================================
    # IDENTIFIERS
    # =========================================================================

    def visitTableName(self, ctx):
        """Visit tableName."""
        # Handle qualified names (schema.table)
        if len(ctx.identifier()) > 1:
            # Multi-part identifier
            full_name = ".".join([ident.getText() for ident in ctx.identifier()])
            return TableNameNode(full_name)
        else:
            return TableNameNode(ctx.identifier(0).getText())

    def visitColumnName(self, ctx):
        """Visit columnName."""
        return ColumnNameNode(ctx.identifier().getText())

    def visitColumnNameList(self, ctx):
        """Visit columnNameList."""
        node = ValueListNode()  # Reuse for column lists
        for col in ctx.columnName():
            col_node = self.visit(col)
            node.add_child(col_node)
        return node

    def visitColumnReference(self, ctx):
        """Visit columnReference."""
        node = ColumnReferenceNode()
        if ctx.tableAlias():
            alias_node = self.visit(ctx.tableAlias())
            node.add_child(alias_node)
        if ctx.columnName():
            col_node = self.visit(ctx.columnName())
            node.add_child(col_node)
        return node

    def visitTableAlias(self, ctx):
        """Visit tableAlias."""
        return AliasNode(ctx.identifier().getText())

    def visitColumnAlias(self, ctx):
        """Visit columnAlias."""
        if ctx.identifier():
            return AliasNode(ctx.identifier().getText())
        elif ctx.STRING():
            return AliasNode(ctx.STRING().getText().strip("'"))

    def visitIdentifier(self, ctx):
        """Visit identifier."""
        return IdentifierNode(ctx.IDENTIFIER().getText())

    def visitVariableName(self, ctx):
        """Visit variableName."""
        return VariableNode(ctx.VARIABLE().getText())
