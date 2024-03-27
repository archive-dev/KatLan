grammar KatLan;


class: package? importBlock (classDef | interfaceDef | unnamedClassDef);

package: 'package' NAME ENDLINE+;
importBlock: (importStatement)*;
importStatement: 'import' NAME ('as' NAME)? ENDLINE+;

unnamedClassDef: ('extends' NAME (',' NAME)* ENDLINE+)? classBlock? block?;

classDef: access ((ABSTRACT_KEYWORD? CLASS_KEYWORD) | ENUM_KEYWORD) NAME (':' NAME (',' NAME)*)?
        '{'ENDLINE* classBlock? ENDLINE* '}';
interfaceDef: access INTERFACE_KEYWORD NAME (':' NAME (',' NAME)*)?
        '{' ENDLINE* classBlock? ENDLINE* '}';

classBlock: (
    (var |
    methodDef)
    ENDLINE+
    )+
;

block: ((varDef | constDef | varAssignment | methodCall | statement) (ENDLINE+ | EOF))*;
lineBlock: ((varDef | constDef | varAssignment | methodCall | statement) (ENDLINE+ | EOF));

value: bool | expression | arithmeticExpression | NAME | STRING_VAL | ('@' NAME);
bool: TRUE | FALSE;

varAssignment: (NAME '=' value) | incrExpression;

methodDef: access ABSTRACT_KEYWORD? 'def' NAME '(' parameters? ')' ':' type '{' ENDLINE* block ENDLINE* '}';
parameters: (parameter) (',' parameter)*;
parameter: NAME ':' type ('=' value)?;

var: varDef | constDef;

constDef: access (constDef0 | constDef1);
constDef0: 'const' NAME ':' type '=' value;
constDef1: 'const' (NAME '=' value) (',' NAME '=' value)+ ':' type;

varDef: access (varDef0 | varDef1);
varDef0: 'var' NAME ':' type ('=' value)? ;
varDef1: 'var' NAME (',' NAME)+ ':' type  ;

statement: ifStatement | switchStatement | foriLoop | foriLoop0;

switchStatement: 'switch' '(' expression ')' ENDLINE*
    '{' ENDLINE*
        ((expression | 'default') '->' (('{' block '}') | lineBlock) ENDLINE*)+
    '}';

ifStatement: 'if' '(' expression ')' ENDLINE* (('{' block '}') | lineBlock);

foriLoop: 'for' '(' varDef ENDLINE+ expression ENDLINE+ varAssignment')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);
foriLoop0: 'for' '(' NAME ':' type ',' value '..' value ')' ENDLINE* (('{' ENDLINE* block '}') | lineBlock);

access: (PUBLIC | PROTECTED | PRIVATE)? STATIC? FINAL?;

type: anyType | linkType;
anyType: DOT_NAME | NAME | primitiveType;
linkType: '@' (
    anyType |
    CLASS_KEYWORD |
    INTERFACE_KEYWORD |
    ENUM_KEYWORD
);
primitiveType:
    'str'      ('['']')* |
    'bool'     ('['']')* |
    'int'      ('['']')* |
    'float'    ('['']')* |
    'double'   ('['']')* |
    'long'     ('['']')* |
    'short'    ('['']')* |
    'byte'     ('['']')* |
    'obj'      ('['']')* |
    'void'               |
    'null'
    ;

arguments: (NAME | value) ((',' (NAME)) | (',' value))*;

methodCall0: NAME '(' arguments? ')';
methodCall : methodCall0 ('.' methodCall0)*;

expression       : logicalOr | primaryExpresion                                ;
logicalOr        : logicalAnd (OR  (logicalAnd | logicalOr)) ?                 ;
logicalAnd       : logicalXor (AND (logicalXor | logicalAnd))?                 ;
logicalXor       : logicalNot (XOR (logicalNot | logicalXor))?                 ;
logicalNot       : NOT? primaryExpresion                                       ;
primaryExpresion : bool | methodCall | NAME | ( '(' expression ')' )           ;


arithmeticExpression: addSubExpression;
addSubExpression : modDivExpression ((PLUS | MINUS)      (numberExpression | addSubExpression))?                      ;
modDivExpression : mulDivExpression ((MOD | DIV)         (numberExpression | modDivExpression))?                      ;
mulDivExpression : powerExpression  ((MULTIPLY | DIVIDE) (numberExpression | mulDivExpression))?                      ;
powerExpression  : numberExpression (POWER               (numberExpression | powerExpression)) ?                      ;
numberExpression : (MINUS|PLUS)? (methodCall | NAME | NUMERIC_VALUE | ('(' arithmeticExpression ')')) | incrExpression;

incrExpression   : ((PLUS PLUS) | (MINUS MINUS)) NAME |
                   NAME ((PLUS PLUS) | (MINUS MINUS))
                 ;

AS_KEYWORD    : 'as'    ;
FOR_KEYWORD   : 'for'   ;
IF_KEYWORD    : 'if'    ;
SWITCH_KEYWORD: 'switch';

STR:    'str'    ;
BOOL:   'bool'   ;
INT:    'int'    ;
FLOAT:  'float'  ;
DOUBLE: 'double' ;
LONG:   'long'   ;
SHORT:  'short'  ;
BYTE:   'byte'   ;
OBJ:    'obj'    ;
VOID:   'void'   ;
NULL:   'null'   ;

DIV     : 'div';
MOD     : '%'  ;
PLUS    : '+'  ;
MINUS   : '-'  ;
MULTIPLY: '*'  ;
DIVIDE  : '/'  ;
POWER   : '**' ;

PUBLIC     : 'pub'    | 'public'   ;
PRIVATE    : 'priv'   | 'private'  ;
PROTECTED  : 'prot'   | 'protected';
STATIC     : 'static'              ;
FINAL      : 'fin'    | 'final'    ;

TRUE : 'true'    ;
FALSE: 'false'   ;

AND: 'and' | '&&';
OR:  'or'  | '||';
NOT: 'not' | '!' ;
XOR: 'xor' | '^^';

CLASS_KEYWORD     : 'class'    ;
ABSTRACT_KEYWORD  : 'abstract' ;
INTERFACE_KEYWORD : 'interface';
ENUM_KEYWORD      : 'enum'     ;

NUMERIC_VALUE: FLOAT_VAL | INT_VAL            ;
INT_VAL   : [0-9]+                            ;
FLOAT_VAL : INT_VAL('.'INT_VAL)? ('f' | 'd')? ;
NAME      : DOT_NAME | NAME0                  ;
DOT_NAME  : NAME0 ('.' NAME0)+                ;
NAME0      : ([a-zA-Z]+ [0-9]*)+              ;
STRING_VAL: ('"' .*? '"') | ('\'' .*? '\'')   ;

ENDLINE: [\n;]                                      ;
WS: [ \t\r] -> skip                                 ;
COMMENT: (('//' .*? '\n') | ('/*' .*? '*/')) -> skip;
