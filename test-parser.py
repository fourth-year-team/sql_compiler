from antlr4 import *
from antlr4.error.ErrorListener import ErrorListener
from SqlLexer import SqlLexer
from SqlParser import SqlParser
import sys

# Global lexer for tree printing
lexer = None

class MyErrorListener(ErrorListener):
    def __init__(self):
        self.errors = []
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"line {line}:{column} {msg}")

def print_parse_tree_simple(tree, parser, indent=0):
    """Simpler tree format with better indentation"""
    indent_str = "  " * indent
    if tree.getChildCount() == 0:
        if hasattr(tree, 'getSymbol') and tree.getSymbol():
            token_type = tree.getSymbol().type
            token_name = lexer.symbolicNames[token_type] if lexer and token_type < len(lexer.symbolicNames) else str(token_type)
            text = tree.getText()
            if text.strip() and text != '<EOF>':
                print(f"{indent_str}+- [{token_name}] '{text}'")
    else:
        rule_name = parser.ruleNames[tree.getRuleIndex()] if tree.getRuleIndex() >= 0 else "ROOT"
        print(f"{indent_str}+- {rule_name}")
        for i in range(tree.getChildCount()):
            print_parse_tree_simple(tree.getChild(i), parser, indent + 1)

def run_test(test_name, sql_text, quiet=False):
    """Core function to test a single SQL string"""
    global lexer
    if not quiet:
        print(f"\n>>> RUNNING TEST: {test_name}")
        print("-" * 40)
    
    input_stream = InputStream(sql_text)
    lexer = SqlLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = SqlParser(token_stream)
    
    error_listener = MyErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(error_listener)
    
    tree = parser.sqlScript()
    
    if error_listener.errors:
        if not quiet:
            for err in error_listener.errors:
                print(f"[SYNTAX ERROR] {err}")
        return False, error_listener.errors
    
    if not quiet:
        print_parse_tree_simple(tree, parser)
    return True, []

# ===========================================================
# TEST CASES
# ===========================================================
TEST_SUITE = {
    "Subquery in WHERE": """
    SELECT
    EmployeeCode,
    EmployeeName,
    CASE
        WHEN salary > 5000 THEN 'HIGH'
        WHEN salary BETWEEN 3000 AND 5000 THEN
            CONCAT('MED-', CAST(salary AS VARCHAR))
        ELSE
            COALESCE(NULLIF(EmployeeName, ''), 'UNKNOWN')
    END AS SalaryCategory
FROM EmployeeMaster;

    """,
    
    "Group By & Having": """
    SELECT
    t.admission_no,
    t.first_name,
    f.course,
    s.sem_name
FROM trainee t
LEFT OUTER JOIN fee f
    ON t.admission_no = f.admission_no
   AND f.amount > 0
RIGHT OUTER JOIN semester s
    ON s.sem_no = f.sem_no
   AND (s.sem_name LIKE 'Sem%' OR s.sem_name IS NULL);



    """,
    
    "Complex DDL (Foreign Keys)": """
   SELECT *
FROM EmployeeMaster e
WHERE e.EmployeeCode IN (
    SELECT x.EmployeeCode
    FROM EmployeeMaster x
    WHERE x.salary NOT IN (
        SELECT DISTINCT y.salary
        FROM EmployeeMaster y
        WHERE y.salary IS NULL
           OR y.salary < 2000
    )
)
AND NOT EXISTS (
    SELECT 1
    FROM EmployeeMaster z
    WHERE z.EmployeeName = e.EmployeeName
      AND z.Id <> e.Id
);

    """,
    
    "Stored Procedure Call": """
     SELECT *
FROM EmployeeMaster
WHERE NOT (
      salary > 3000
  AND (DepartmentCode = 'IT' OR LocationCode = 'TVM')
)
OR (salary BETWEEN 1000 AND 2000 AND NOT salary = 1500);

    """,
    
    "Multiple Statements & GO": """
   SELECT *
FROM EmployeeMaster
WHERE EmployeeName LIKE 'A\_%' ESCAPE '\'
  OR EmployeeName LIKE '%[_]%';

    """,
    
    "Advanced Literals": """
SELECT CONCAT(LastName,', ',FirstName) AS fullname
FROM employees

use employee_db
go
CREATE TABLE EmployeeMaster
(
	  Id INT IDENTITY PRIMARY KEY,      
	  EmployeeCode varchar(10),
	  EmployeeName varchar(25),
      DepartmentCode varchar(10),
      LocationCode varchar(10),
      salary int
)

TRUNCATE TABLE EmployeeMaster;
GO;



INSERT into EmployeeMaster(EmployeeCode, EmployeeName, DepartmentCode, LocationCode ,salary)
VALUES
('E0001', 'Hulk', 'IT','TVM', 4000),
('E0002', 'Spiderman', 'IT','TVM',  4000),
('E0003', 'Ironman', 'QA','KLM', 3000),
('E0004', 'Superman', 'QA','KLM', 3000),
('E0005', 'Batman', 'HR','TVM', 5000),
('E0005', 'Raju', 'HR','KTM', 5000),
('E0005', 'Radha', 'HR','KTM', 5000)



SELECT * from EmployeeMaster WHERE salary IS NOT NULL

SELECT * from EmployeeMaster WHERE salary IS NULL

SELECT * from EmployeeMaster WHERE employeename LIKE 'super'

SELECT * from EmployeeMaster WHERE employeename LIKE 'super''\\\\AZ\
c'

SELECT * from EmployeeMaster WHERE employeename LIKE 'super''\\\\AZ
c'

SELECT * from EmployeeMaster WHERE employeename LIKE 'sup%'

SELECT * from EmployeeMaster WHERE employeename LIKE '%man'

SELECT * from EmployeeMaster WHERE employeename NOT LIKE '%ra%'

/*will return 8 letter names starting with Su, containing p or j in between and ending in erman*/
SELECT * from EmployeeMaster WHERE employeename LIKE 'Su[pj]erman%'

/*will return 4 letter names starting with ra, containing n or j in between and ending in u*/
SELECT * from EmployeeMaster WHERE employeename LIKE 'ra[nj]u%'

/*will return 4 letter names starting with ra, NOT containing n or j in between and ending in u*/
SELECT * from EmployeeMaster WHERE employeename LIKE 'ra[^nj]u%'

SELECT * from EmployeeMaster WHERE employeename NOT LIKE 'raj%'

select * from EmployeeMaster WHERE EXISTS
(select * from EmployeeMaster where EmployeeName  LIKE 'superman')



SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
FROM trainee  
INNER JOIN fee ON trainee.admission_no = fee.admission_no; 

SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount, semester.sem_name 
FROM trainee  
INNER JOIN fee ON trainee.admission_no = fee.admission_no
INNER JOIN semester ON semester.sem_no = fee.sem_no  

SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
FROM trainee  
LEFT OUTER JOIN fee ON trainee.admission_no = fee.admission_no; 

SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
FROM trainee  
RIGHT OUTER JOIN fee ON trainee.admission_no = fee.admission_no;

SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
FROM trainee  
FULL OUTER JOIN fee ON trainee.admission_no = fee.admission_no;
    """
}

if __name__ == "__main__":
    print("=" * 70)
    print("SQL COMPILER FRONTEND: PHASE 1 & 2 TEST SUITE")
    print("=" * 70)
    
    passed_count = 0
    total_tests = len(TEST_SUITE)

    for name, code in TEST_SUITE.items():
        success, errs = run_test(name, code)
        
        # Logic check: "Deliberate Failure" is successful if it actually fails.
        if "Should Fail" in name:
            if not success:
                print(f"\n[PASS] '{name}' failed as expected.")
                passed_count += 1
            else:
                print(f"\n[FAIL] '{name}' was supposed to have errors but passed!")
        else:
            if success:
                print(f"\n[PASS] '{name}' parsed successfully.")
                passed_count += 1
            else:
                print(f"\n[FAIL] '{name}' failed to parse.")

    print("\n" + "=" * 70)
    print(f"FINAL RESULTS: {passed_count}/{total_tests} Tests Passed")
    print("=" * 70)
    
    sys.exit(0 if passed_count == total_tests else 1)