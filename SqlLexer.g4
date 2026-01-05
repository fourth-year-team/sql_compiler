lexer grammar SqlLexer;

fragment A: [Aa];
fragment B: [Bb];
fragment C: [Cc];
fragment D: [Dd];
fragment E: [Ee];
fragment F: [Ff];
fragment G: [Gg];
fragment H: [Hh];
fragment I: [Ii];
fragment J: [Jj];
fragment K: [Kk];
fragment L: [Ll];
fragment M: [Mm];
fragment N: [Nn];
fragment O: [Oo];
fragment P: [Pp];
fragment Q: [Qq];
fragment R: [Rr];
fragment S: [Ss];
fragment T: [Tt];
fragment U: [Uu];
fragment V: [Vv];
fragment W: [Ww];
fragment X: [Xx];
fragment Y: [Yy];
fragment Z: [Zz];

CREATE: C R E A T E;
ALTER: A L T E R;
DROP: D R O P;
TRUNCATE: T R U N C A T E;
TABLE: T A B L E;
VIEW: V I E W;
INDEX: I N D E X;

SELECT: S E L E C T;
INSERT: I N S E R T;
UPDATE: U P D A T E;
DELETE: D E L E T E;
INTO: I N T O;
VALUES: V A L U E S;
SET: S E T;

FROM: F R O M;
WHERE: W H E R E;
GROUP: G R O U P;
BY: B Y;
HAVING: H A V I N G;
ORDER: O R D E R;
LIMIT: L I M I T;
OFFSET: O F F S E T;

JOIN: J O I N;
INNER: I N N E R;
LEFT: L E F T;
RIGHT: R I G H T;
FULL: F U L L;
OUTER: O U T E R;
ON: O N;
USING: U S I N G;

AND: A N D;
OR: O R;
NOT: N O T;

PRIMARY: P R I M A R Y;
KEY: K E Y;
FOREIGN: F O R E I G N;
REFERENCES: R E F E R E N C E S;
NULL: N U L L;
UNIQUE: U N I Q U E;
CHECK: C H E C K;
DEFAULT: D E F A U L T;
AUTO_INCREMENT: A U T O '_' I N C R E M E N T;

INTEGER: I N T E G E R;
INT: I N T;
SMALLINT: S M A L L I N T;
BIGINT: B I G I N T;
DECIMAL: D E C I M A L;
NUMERIC: N U M E R I C;
FLOAT: F L O A T;
REAL: R E A L;
DOUBLE: D O U B L E;
CHAR: C H A R;
VARCHAR: V A R C H A R;
TEXT: T E X T;
DATE: D A T E;
TIME: T I M E;
TIMESTAMP: T I M E S T A M P;
BOOLEAN: B O O L E A N;

AS: A S;
DISTINCT: D I S T I N C T;
ALL: A L L;
ANY: A N Y;
SOME: S O M E;
EXISTS: E X I S T S;
IN: I N;
BETWEEN: B E T W E E N;
LIKE: L I K E;
IS: I S;

CASE: C A S E;
WHEN: W H E N;
THEN: T H E N;
ELSE: E L S E;
END: E N D;
TRUE: T R U E;
FALSE: F A L S E;

COUNT: C O U N T;
SUM: S U M;
AVG: A V G;
MIN: M I N;
MAX: M A X;
COALESCE: C O A L E S C E;
NULLIF: N U L L I F;
CAST: C A S T;
CONVERT: C O N V E R T;
CUME_DIST: C U M E '_' D I S T;
PERCENT_RANK: P E R C E N T '_' R A N K;

UNION: U N I O N;
INTERSECT: I N T E R S E C T;
EXCEPT: E X C E P T;

ASC: A S C;
DESC: D E S C;
COLLATE: C O L L A T E;

WITH: W I T H;

OVER: O V E R;
PARTITION: P A R T I T I O N;
WINDOW: W I N D O W;

ROW_NUMBER: R O W '_' N U M B E R;
RANK: R A N K;
DENSE_RANK: D E N S E '_' R A N K;
NTILE: N T I L E;
LAG: L A G;
LEAD: L E A D;
FIRST_VALUE: F I R S T '_' V A L U E;
LAST_VALUE: L A S T '_' V A L U E;

DECLARE: D E C L A R E;
BEGIN: B E G I N;
IF: I F;
TRY: T R Y;
CATCH: C A T C H;
ADD: A D D;
CONSTRAINT: C O N S T R A I N T;
GO: G O;

OBJECT_ID: O B J E C T '_' I D;
OBJECT_NAME: O B J E C T '_' N A M E;
OBJECT_SCHEMA_NAME: O B J E C T '_' S C H E M A '_' N A M E;
QUOTENAME: Q U O T E N A M E;
INFORMATION_SCHEMA: I N F O R M A T I O N '_' S C H E M A;
TABLES: T A B L E S;
SP_EXECUTESQL: S P '_' E X E C U T E S Q L;

VARIABLE: '@' [a-zA-Z0-9_]*;

IDENTIFIER: [a-zA-Z_] [a-zA-Z0-9_]*;
QUOTED_IDENTIFIER: '"' (~'"' | '""')* '"';
BACKTICK_QUOTED_IDENTIFIER: '' (~'' | '``')* '`';
NUMBER: [0-9]+ ('.' [0-9]+)? ([eE][+-]? [0-9]+)?;
STRING: '\'' (~'\'' | '\'\'')* '\'';
DATE_LITERAL: '\'' [0-9][0-9][0-9][0-9] '-' [0-9][0-9] '-' [0-9][0-9] '\'';

EQUALS: '=';
NOTEQUALS: '!=' | '<>';
LESSTHAN: '<';
GREATERTHAN: '>';
LESSTHANOREQ: '<=';
GREATERTHANOREQ: '>=';
MULTIPLY: '*';
PLUS: '+';
MINUS: '-';
DIVIDE: '/';
MODULO: '%';
CONCAT: '||';
ARROW: '->';

LPAREN: '(';
RPAREN: ')';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
BRACKETED_IDENTIFIER
    : '[' ( ~']' | ']]' )* ']';
    


WS: [ \t\r\n]+ ;
COMMENT: '--' ~[\r\n]* ;

MULTILINE_COMMENT
    : '/*' ( ~[*/] | '/' ~[*/] | '*' ~[*/] | MULTILINE_COMMENT )* '*/' 
    ;