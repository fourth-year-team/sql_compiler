from antlr4 import *
from SqlLexer import SqlLexer

def test_sql(input_sql):
    input_stream = InputStream(input_sql)
    
    lexer = SqlLexer(input_stream)
    
    token_stream = CommonTokenStream(lexer)
    
    token_stream.fill()
    
    print(f"--- Analyzing SQL: '{input_sql}' ---")
    for token in token_stream.tokens:
        if token.type == Token.EOF:
            print(f"Token Type: {'EOF':<15} | Value: '{token.text}'")
        else:
            print(f"Token Type: {lexer.symbolicNames[token.type]:<15} | Value: '{token.text}'")
    print("-" * 30 + "\n")
   

sql1 ="""SELECT G , O FROM table"""

sql2 = """
SELECT 
    productid, productname, unitprice
FROM
    products
WHERE
    unitprice > 28.8663;



	SELECT CompanyName, city
  FROM Suppliers  
  WHERE Country = 'USA'  
  ORDER BY CompanyName; 
"""
sql3 = """UPDATE FACT1
SET [KEY1'S] =
    CASE 
        WHEN KEY2 = 4 OR KEY3 IN (1,7) THEN 1
        WHEN KEY5 = 2 THEN 2
        ELSE 0
    END
WHERE [KEY1'S] IS NULL;
GO"""
sql4 = """IF NOT EXISTS (
    SELECT 1 FROM sys.columns 
    WHERE Name = 'HASH2' 
      AND Object_ID = Object_ID('FACT_2')
)
BEGIN
    ALTER TABLE FACT_2 
    ADD HASH2 BIGINT NULL;
END
GO"""
sql5 = """
IF NOT EXISTS (
    SELECT 1 FROM sys.columns 
    WHERE Name = 'DIAGNOSIS_KEY''1' 
      AND Object_ID = Object_ID('FACT_2')
)
BEGIN
    ALTER TABLE FACT_2 
    ADD [DIAGNOSIS_KEY'1] INT NULL;
END
GO
"""
sql6 = """DECLARE @ErrorMessage         NVARCHAR(4000) """
sql7 = """DECLARE @ErrorState           INT  """
sql8 = """DECLARE @ErrorSeverity        INT """

sql9 = """declare @sql_drop_constarints nvarchar(max)
set @sql_drop_constarints = ''"""
sql10 = """SELECT @sql_drop_constarints += N'
ALTER TABLE ' + QUOTENAME(OBJECT_SCHEMA_NAME(parent_object_id))
    + '.' + QUOTENAME(OBJECT_NAME(parent_object_id)) + 
    ' DROP CONSTRAINT ' + QUOTENAME(name) + ';' 
FROM sys.foreign_keys;"""

sql11 = """BEGIN TRY
EXEC sp_executesql @sql_drop_constarints;
END TRY
BEGIN CATCH

    --Obtain the error message, severity and state      
    SELECT @ErrorMessage = ERROR_MESSAGE(), @ErrorSeverity = ERROR_SEVERITY(), @ErrorState = ERROR_STATE()      
    --RAISERROR (@ErrorMessage, @ErrorSeverity, @ErrorState)         
END CATCH
"""

sql12 = """DECLARE @sql_drop_tables NVARCHAR(max)=''

SELECT @sql_drop_tables += ' Drop table ' + QUOTENAME(TABLE_SCHEMA) + '.'+ QUOTENAME(TABLE_NAME) + '; '
FROM   INFORMATION_SCHEMA.TABLES
WHERE  TABLE_TYPE = 'BASE TABLE'
AND TABLE_NAME NOT IN ('FACT1', 'fact2', 'Fact3' )

Exec Sp_executesql @sql_drop_tables

BEGIN TRY
EXEC sp_executesql @sql_drop_tables;
END TRY
BEGIN CATCH
    --Obtain the error message, severity and state      
    SELECT @ErrorMessage = ERROR_MESSAGE(), @ErrorSeverity = ERROR_SEVERITY(), @ErrorState = ERROR_STATE()      
    --RAISERROR (@ErrorMessage, @ErrorSeverity, @ErrorState)         
END CATCH
"""

test_sql(sql1)
test_sql(sql2)
# test_sql(sql3)
# test_sql(sql4)
# test_sql(sql5)
# test_sql(sql6)
# test_sql(sql7)
# test_sql(sql8)
# test_sql(sql9)
# test_sql(sql10)
# test_sql(sql11)
# test_sql(sql12)



