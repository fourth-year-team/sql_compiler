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


SELECT      : S E L E C T;
INSERT      : I N S E R T;
UPDATE      : U P D A T E;
DELETE      : D E L E T E;
FROM        : F R O M;
WHERE       : W H E R E;
GROUP       : G R O U P;
BY          : B Y;
HAVING      : H A V I N G;
ORDER       : O R D E R;
LIMIT       : L I M I T;
OFFSET      : O F F S E T;
INTO        : I N T O;
VALUES      : V A L U E S;
SET         : S E T;


CREATE      : C R E A T E;
ALTER       : A L T E R;
DROP        : D R O P;
TRUNCATE    : T R U N C A T E;
TABLE       : T A B L E;
VIEW        : V I E W;
INDEX       : I N D E X;

ADD         : A D D;
COLUMN      : C O L U M N;
CONSTRAINT  : C O N S T R A I N T;

PRIMARY     : P R I M A R Y;
KEY         : K E Y;
FOREIGN     : F O R E I G N;
REFERENCES  : R E F E R E N C E S;
UNIQUE      : U N I Q U E;
CHECK       : C H E C K;
DEFAULT     : D E F A U L T;
AUTO_INCREMENT : A U T O '_' I N C R E M E N T;


AND         : A N D;
OR          : O R;
NOT         : N O T;
IN          : I N;
BETWEEN     : B E T W E E N;
LIKE        : L I K E;
IS          : I S;
EXISTS      : E X I S T S;
NULL        : N U L L;
TRUE        : T R U E;
FALSE       : F A L S E;


JOIN        : J O I N;
INNER       : I N N E R;
LEFT        : L E F T;
RIGHT       : R I G H T;
FULL        : F U L L;
OUTER       : O U T E R;
ON          : O N;
USING       : U S I N G;


AS          : A S;
DISTINCT   : D I S T I N C T;
ALL         : A L L;
ASC         : A S C;
DESC        : D E S C;


WITH        : W I T H;


DECLARE     : D E C L A R E;
BEGIN       : B E G I N;
END         : E N D;
IF          : I F;
ELSE        : E L S E;
TRY         : T R Y;
CATCH       : C A T C H;
GO          : G O;



CURSOR      : C U R S O R;
FOR         : F O R;
OPEN        : O P E N;
FETCH       : F E T C H;
NEXT        : N E X T;
CLOSE       : C L O S E;
DEALLOCATE  : D E A L L O C A T E;


EXEC        : E X E C;
SP_EXECUTESQL : S P '_' E X E C U T E S Q L;



CASE        : C A S E;
WHEN        : W H E N;
THEN        : T H E N;







COUNT       : C O U N T;
SUM         : S U M;
AVG         : A V G;
MIN         : M I N;
MAX         : M A X;
COALESCE    : C O A L E S C E;
NULLIF      : N U L L I F;
CAST        : C A S T;
CONVERT     : C O N V E R T;



USE          : U S E ;
IDENTITY     : I D E N T I T Y;
NONCLUSTERED : N O N C L U S T E R E D ;
ESCAPE        : E S C A P E ;




INT         : I N T;
INTEGER     : I N T E G E R;
SMALLINT    : S M A L L I N T;
BIGINT      : B I G I N T;
DECIMAL     : D E C I M A L;
NUMERIC     : N U M E R I C;
FLOAT       : F L O A T;
REAL        : R E A L;
DOUBLE      : D O U B L E;
CHAR        : C H A R;
VARCHAR     : V A R C H A R;
TEXT        : T E X T;
DATE        : D A T E;
TIME        : T I M E;
TIMESTAMP   : T I M E S T A M P;
BOOLEAN     : B O O L E A N;
RECURSIVE: R E C U R S I V E;
UNION: U N I O N;
WHILE: W H I L E;
PRINT: P R I N T;
GLOBAL_VARIABLE : '@@' [a-zA-Z_]+ ;
 

NVARCHAR  : N V A R C H A R;
CLUSTERED : C L U S T E R E D;


EQUALS      : '=';
NOTEQUALS   : '!=' | '<>';
LESSTHAN    : '<';
GREATERTHAN : '>';
LESSTHANOREQ: '<=';
GREATERTHANOREQ: '>=';

PLUS        : '+';
MINUS       : '-';
MULTIPLY   : '*';
DIVIDE     : '/';
MODULO     : '%';
CONCAT     : '||';





LPAREN      : '(';
RPAREN      : ')';
COMMA       : ',';
DOT         : '.';
SEMICOLON  : ';';





NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

STRING
    : '\'' (~'\'' | '\'\'')* '\''
    ;

NSTRING
    : N '\'' (~'\'' | '\'\'')* '\''
    ;

DATE_LITERAL
    : '\'' [0-9][0-9][0-9][0-9] '-' [0-9][0-9] '-' [0-9][0-9] '\''
    ;

HEX_STRING
    : '0' [xX] [0-9a-fA-F]+
    ;

BIT_STRING
    : '0' [bB] [01]+
    ;




BACKTICK_QUOTED_IDENTIFIER
    : '`' (~'`' | '``')* '`'
    ;

QUOTED_IDENTIFIER
    : '"' (~'"' | '""')* '"'
    ;

BRACKETED_IDENTIFIER
    : '[' (~']' | ']]')* ']'
    ;

IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

VARIABLE
    : '@' [a-zA-Z0-9_]+
    ;




LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

MULTILINE_COMMENT
    : '/*' ( . | MULTILINE_COMMENT )*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
